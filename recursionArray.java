package newthings.practice;

import java.util.ArrayList;

public class recursionArray{
    static boolean findNum(int[]array,int index,int target){
        if(index>=array.length){
            return false;
        }
        if(array[index]==target){
        return true;
        }
        return findNum(array, index+1, target);
        
    }
    static boolean findNum2(int[] array,int index,int target){
        if(index>=array.length){
            return false;
        }
        return array[index]==target|| findNum(array, index+1, target);
    }
    static boolean helper(int[] array,int target){
        return findNum2(array, 0, target);
    }
    static boolean check(int a,int b){
        return a>b || true;
    }
    static boolean checkEqual(int[] array,int index){
        if(index>=array.length-1){
            return true;
        }
        if(array[index]>array[index+1]){
            return false;
        }
        return checkEqual(array, index+1);
    }
    static void findPosition(ArrayList a,int[] array,int target,int index){
        if(index>array.length-1){
            return;
        }
        if(array[index]==target){
            a.add(index);
        }
        findPosition(a, array, target, index+1);
    }   
    //take an array list without an argument    
    static ArrayList findposition0Array(int[]array,int index,int target){
        ArrayList<Integer> list=new ArrayList<>();
        if(index>array.length-1){
            return list;
        }
        //contain the index of the array
        if(array[index]==target){
            list.add(index);
        }
        //call another arraylist to take the index of the bellow function 
        ArrayList<Integer> bellow=findposition0Array(array, index+1, target);
        list.addAll(bellow);
        return list;
    }
    //tim kiem nhi phan
    static int binarySearch(int[] array,int target){
        int position=-1;
        int midle=(array.length)/2;
        if(array[midle]==target){
            return midle;
        }else if(array[midle]>target){
            for(int i=0;i<midle;i++){
                if(array[i]==target){
                    return i;
                }
            }
        }else{
            for(int i=midle+1;i<array.length-1;i++){
                if(array[i]==target){
                    return i;
                }
            }
        }

        return position;
    }
    static int[] orderNumber(int[]array,int index){
        if(index==array.length-1){
            return array;
        }
        if(array[index]>array[index+1]){
            int temp=array[index];
            array[index]=array[index+1];
            array[index+1]=temp;
        }
        return orderNumber(array,index+1);
    }
    static int search(int[]array,int s, int e,int target){
        int mid=(e-s)/2;
        if(array[mid]==target){
            return mid;
        }else if(target>array[mid]){
            return search(array, mid+1, e, target);
        }else{
            return search(array,s,mid-1,target);
        }
    }
    static int  search2(int[]array,int s,int end,int target){
        int mid=0;
        while(s<end){
            mid =(end-s)/2;
            if(array[mid]==target){
                return mid;
            }else if(array[mid]<target){
                s=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    //triangle
    static void printRecursion(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            printRecursion(r, c+1);
            System.out.print("*");
        }else{
            printRecursion(r-1, 0);
            System.out.println("1");
        }
    }
    //buble sort
    static void  bubleSort(int[] array,int row, int control){
        if(row==0){
            return ;
        }
        //control
        if(control<row){
            if(array[control]>array[control+1]){
                int temp=array[control];
                array[control]=array[control+1];
                array[control+1]=temp;
            }
            bubleSort(array, row-1, control+1);
            //times
        }else{
            bubleSort(array, row-1, 0);
        }

    }
    
        
  static void selectionSort(int[]array,int select,int r){
    if(r==0){
        return;
    }
    if(select<r){
        if(array[r]<array[select]){
            //swap
            int temp=array[r];
            array[r]=array[select];
            array[select]=temp;
        }
        selectionSort(array,select+1,r);
    }else{
        selectionSort(array, 0, r-1);
    }
  }
    static void printArray(int[] array){
        for(int i=0;i<array.length-1;i++){
            System.out.print(array[i]);
        }
    }
    //buble sort2
    static void bubleSort2(int[] array,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(array[c]<array[c+1]){
                int temp=array[c];
                array[c]=array[c+1];
                array[c+1]=temp;
            }
            bubleSort2(array, r, c+1);
        }else{
            bubleSort2(array, r-1, 0);
        }
    }
    static void selection2(int [] array,int c, int r,int max){
        //xu ly du lieu dau vao
        if(r==0){
            return ;
        }
        //bai toan de quy
        //dieu kien de vao bai toan
        if(c<r){
            if(array[c]>array[max]){
                selection2(array, c+1, r, c);
            }else{
                selection2(array, c+1, r, max);
            }
        }else{
            System.out.println(array[max]);
            int temp=array[max];
            array[max]=array[r-1];
            array[r-1]=temp;
            selection2(array, 0, r-1, 0);
        }
    }
    public static void main(String[] args) {
        int[] array={1,3,2,4,7,6,5};
        // System.out.println(findNum(array, 0, 4));
        // System.out.println(helper(array, 3));
        System.out.println(check(2, 3));
        // System.out.println(checkEqual(array, 0));
        ArrayList<Integer> a=new ArrayList<>();
        // findPosition(a, array, 3, 0);
        // int i=0;
        // while(i<=a.size()-1){
        //     System.out.println(a.get(i));
        //     i=i+1;
        // }   
        // 
        // System.out.println(findposition0Array(array, 0, 1));
        // System.out.println(binarySearch(array, 3));
        // for(int i=0;i<=array.length-1;i++){
        //     System.out.print(array[i]);
        // }
        // System.out.println("");
        // array=orderNumber(array, 0);
        // for(int i=0;i<=array.length-1;i++){
        //     System.out.print(array[i]);
        // }
        // System.out.println(search(array, 0, array.length-1, 3 ));
        // System.out.println(search2(array, 0, array.length-1, 3));
        // printRecursion(4, 0);
        // bubleSort(array, array.length-1, 0);
        // selectionSort(array, 0, array.length-1);
        printArray(array);
        System.out.println();
        selection2(array, 0, array.length-1, array.length-1);
        printArray(array);
    }

}

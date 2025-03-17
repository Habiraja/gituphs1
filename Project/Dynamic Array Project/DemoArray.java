import java.util.*;
public class DemoArray {
    private int arr[];
    private int size;
    private int capacity;
    static final int initialCapacity = 4;
    public DemoArray(){
        arr = new int[initialCapacity];
        size =0;
        capacity=initialCapacity;
    }
    public void insertAtBegining(int val){
        if(size == capacity){
            expendArray();
        } 
        for(int i=size-1; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = val;
        size++;
        System.out.println("Number have added from begining");
    }
    public void insertAtEnd(int val){ 
        if(size == capacity){
            expendArray();
        }  
        arr[size++] = val;
        System.out.println("Number have added from ending");
    }

    private void expendArray(){
        capacity = capacity*2;
        arr = java.util.Arrays.copyOf(arr, capacity);
    }

    public void insertAtPosition(int val, int pos){ 
        if(size == capacity){
            expendArray();
        }
        if(pos < 0){
            System.out.println("Enter the proper position");
            return;
        }
        else if(pos > size){
            System.out.println("Position is larger than size");
            return;
        }
        for(int i=size-1; i>=pos; i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = val;
        size++;
        System.out.println("Number have inserted by given position");
    }
    
    public void deleteAtBegining(){
        if(capacity > initialCapacity && size <= capacity/3){
            shirnkArray();
        }
        for(int i=1; i<size; i++){
            arr[i-1] = arr[i];
        }
        if(size == 0){
            System.out.println("Array doesn't have any number");
            return;
        } 
        size--;
        System.out.println("Deleted the begining number");
    }
    private void shirnkArray(){
        capacity = capacity/2;
        arr = java.util.Arrays.copyOf(arr, capacity);
    }

    public void deleteAtEnd(){
        if(size == 0){
            System.out.println("Array has no number to delete");
            return;
        }
        size--;
        System.out.println("Deleted the ending number");
    }

    public void deleteAtPosition(int pos){
        if(capacity > initialCapacity && size <= capacity/3){
            shirnkArray();
        }
        if(size == 0){
            System.out.println("Array has no numbers");
            return;
        }
        if(pos > size){
            System.out.println("Enter the proper position");
            return;
        }
        for(int i=pos+1; i<size; i++){
            arr[i-1] = arr[i];
        }
        size--;
        System.out.println("Deleted by given index");
    }

    public void display(){
        for(int i=0; i<size; i++){
            System.out.print(arr[i] +" ");
        }   
        if(size == 0){
            System.out.println("Array has no numbers");
            return;
        }
    }
    public void  length(){
        System.out.println("Length of the array is "+size);
    }
    public void getIndex(int val){
        if(size == 0){
            System.out.println("Array has no numbers");
            return;
        }
        for(int i=0; i<size; i++){
            if(val == arr[i]){
                System.out.println(val + " value --> index is " +i);
                return;
            }
        }
        System.out.println("Array doesn't have the given number");
    }

    public void searchTheValue(int pos){
        if(size == 0){
            System.out.println("Array has no numbers");
            return;
        }
        else if(pos<size){
            System.out.println(pos +" index --> value is " +arr[pos]);
            return;
        }
        System.out.println("Enter the correct position");
    }
    public void allClear(){
        size =0;
        System.out.println("Array have cleared");
    }
    public void contains(int val){
        if(size == 0){
            System.out.println("Array has no numbers");
            return;
        }
        for(int i=0; i<size; i++){
            if(val == arr[i]){
                System.out.println("Number is contains in the array");
                return;
            }
        }
        System.out.println("Number is not contains in the array");
    }
}


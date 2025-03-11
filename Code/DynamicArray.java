class DynamicArray{
	private static final int initialCapacity =3;
	private int arr[];
	private int size;
	private int capacity;
	public DynamicArray(){
		arr = new int[initialCapacity];
		size =0;
		capacity = initialCapacity;
	}
	public void add(int value){
		if(size == capacity){
			expendArray();
		}
		arr[size++] = value;
	}
	private void expendArray(){
		capacity = capacity*2;
		arr = java.util.Arrays.copyOf(arr, capacity);
	}
	public void display(){
		for(int i=0; i<size; i++){
			System.out.print(arr[i] + " ");
		}
	}
	public void insertAtPos(int position, int value){
		if(size == capacity){
			expendArray();
		}
		for(int i=size-1 ; i>=position; i--){
			arr[i+1] = arr[i]; 
		}
		arr[position] = value;
		size++;
	}
	public void deleteAtPos(int position){
		for(int i=position+1; i<size; i++){
			arr[i-1] = arr[i];
		} 
		size--;
		if(capacity > initialCapacity && capacity > 3*size){
			shrinkArray();
		}	
	}
	private void shrinkArray(){
			capacity = capacity/2;
			arr = java.util.Arrays.copyOf(arr, capacity);
	}
	public int length(){
		return size;
	}
}
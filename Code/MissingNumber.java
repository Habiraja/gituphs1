import java.util.HashSet;
class MissingNumber{
	public static void main(String[] args){
		int [] arr1 = {1,2,3,4,5,6,7,8};
		int [] arr2 = {1,2,3,4,6,7,8};
		int right = arr1.length-1;
		int left = 0, mid =0;
		while(left <= right){
			mid = (left + right)/2;
			if(arr1[mid] == arr2[mid]){
				left = mid+1;
			}
			else{
				right = mid -1;
			}
		}
		System.out.println(mid);
	}
}
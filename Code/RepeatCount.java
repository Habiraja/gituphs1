import java.util.*;
class RepeatCount{
	public static void main(String [] args){
		int [] arr = {1,1,1,2,2,3};
		int num  =0, numOfCount=0, count =1, k=2;
		TreeMap <Integer, Integer>map = new TreeMap<>();

		for(int i=0; i<arr.length; i++){		
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] == 0){
					break;
				}
				if(arr[i] == arr[j]){
					arr[j] = 0;
					count ++;
				}
			}
			if(arr[i] !=0){
				num = arr[i];
				numOfCount = count;
				map.put(numOfCount,num);
			}
			count =1;
		}
		//System.out.println(map.entrySet());
		for(int i=map.size(); i>0; i--){
			System.out.print(map.get(i)+" ");
			k--;
			if(k<=0){
				break;
			}
		}
	}
}
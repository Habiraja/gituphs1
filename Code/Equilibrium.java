class Equilibrium{
	public static int EquilibriumPoint(int [] arr){

		int left=0, right=arr.length-1, ans =0;

		int addleft =arr[left], addright=arr[arr.length-1];

		while(left<=right){

			if(left == right){
				ans = left;
				break;
			}
			else if(addleft<addright){
				addleft = addleft + arr[++left];
			}
			else if(addleft>addright){
				addright = addright + arr[--right];
			}
			else{
				left++;
				addleft = addleft + arr[left];
			}
		}
		if(addleft == addright){
			return arr[ans];	
		}
		else{
			return -1;
		}
		
	}
	public static void main(String [] args){
		int arr[] = {1,2,3,4,5,3,15};
		int result = EquilibriumPoint(arr);
		if (result != -1) {
            		System.out.println("Equilibrium index: " + result);
			System.out.println("Equilibrium element: " + arr[result]);
        	} else {
            		System.out.println("No equilibrium index found");
        	}
	}
}
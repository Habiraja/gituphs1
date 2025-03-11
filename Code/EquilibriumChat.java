class EquilibriumChat {
    public static int EquilibriumPoint(int arr[]) {
        int totalSum = 0, leftSum = 0;

        // Compute total sum of the array
        for (int num : arr) {
            totalSum += num;
	
        }

        // Iterate and check equilibrium condition
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // Right sum (excluding current element)

            if (leftSum == totalSum) { // If left sum equals right sum
                return i; // Return equilibrium index
            }

            leftSum += arr[i]; // Update left sum
        }

        return -1; // No equilibrium index found
    }

    public static void main(String[] args) {
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

class Sqrt{
    public static void main(String [] args) {
	int x =8;        
        int left = 0, right = x;
        while (left <= right) {
            int mid = (right +left) / 2;
	System.out.println(mid);
            if (x == mid *mid) {
                //System.out.println(mid);
		break;
            } else if (x < mid*mid) {
                right = mid;
            } else {
                left = mid;
            }
        }

    }
}

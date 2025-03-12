class Sum24{
    public static boolean check(String s){
        int [] arr = new int [26];
        for(int i=0; i<s.length(); i++){
            int index = (int)s.charAt(i) - 97;
            arr[index] = arr[index]+1;
        }
        for(int i=0; i<s.length(); i++){
            int index = (int)s.charAt(i)- 97;
            if(arr[index] != index+1){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        String s = "sbba";
        System.out.println(check(s));
    }
}
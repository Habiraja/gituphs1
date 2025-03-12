class Sum21{
    public static void main(String [] args){
        int remainder;
        int add=0;
        int n=1005;
        while(n>0){
            remainder = n%10;
            if(remainder == 0){
                remainder =5;
            }
            n=n/10;
            add =add*10+remainder;
        }
        System.out.println(add);
    }
}
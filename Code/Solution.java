class Solution {
    public static void main(String [] args){
        int i=0, j=0;
	String haystack = "hahabi";
	String needle ="habi";
        while(i<haystack.length()){
            while(j<needle.length()){
                if(haystack.charAt(i) == needle.charAt(j)){
                    j++;
		    break;
                }
                else{
                    j=0;
		     if(haystack.charAt(i) == needle.charAt(j)){
		         j++;
			 break;
		     }
		    break;	
                }
            }
	    i++;
        }
        if(j == needle.length()){
            System.out.println("found");
        }else{
            System.out.println("Not found");
        }
    }
}
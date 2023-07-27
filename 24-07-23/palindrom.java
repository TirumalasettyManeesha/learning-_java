class palindrome{
    public static void main(String[] args){
        int n=12391,last;
        int num=n;
        int rev=0;
        while(n>0){
            last=n%10;
            rev=rev*10+last;
            n=n/10;
        }
        System.out.println("rev:"+rev);
        if(num==rev){
             System.out.println("palindrome");
         }else{
             System.out.println("not a palindrome");
         }
    }
}
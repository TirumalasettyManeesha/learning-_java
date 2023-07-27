class sumofdigits{
    public static void main(String[] args){
        int n=82,last,sum=0;
        while(n>0){
            last=n%10;
            sum=sum+last;
            n=n/10;
        }
        System.out.println(sum);
       
    }
}
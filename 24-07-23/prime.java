class prime{
    public static void main(String[] args){
        int n=2,i,c=0;
        for(i=2;i<2;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c>1){
            System.out.println("not a prime number");
        }else
            System.out.println(" prime number");
    }
}
class perfect{
    public static void main(String[] args){
        int n=28,i,c=0;
        for(i=1;i<n;i++){
            if(n%i==0){
                c=c+i;
            }
        }
        if(c==n){
            System.out.println("perfect number");
        }else
            System.out.println(" not a perfect number");
    }
}
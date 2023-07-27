class reversediamond{
    public static void main(String[] args){
        int i,j,k;
        int n=5;
        for(i=1;i<=n;i++){
            for( j = i; j<=n; j++) {
                 System.out.print("*");
             }
            for(k=1;k<=2*i-1;k++){
                System.out.print(" ");
            }
            for(int l=i; l <= n; l++) {
                System.out.print("*");
             }
            System.out.println();
        }
        for(i=n-1;i>=1;i--){
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.print(" "); 
            }
            for(int l=n;l>=i;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
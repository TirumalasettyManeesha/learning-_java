import java.util.Arrays;
class bubblesort{
    public static void main(String[] args){
        int[] a={30,89,60,1};
        
        int temp;
        int i,j;
        for(i=0;i<a.length-1;i++){
            for(j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
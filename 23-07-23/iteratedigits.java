class iteratedigits{
    public static void main(String[] args){
        int num=793;
        if(num<0){
            num*=-1;

        }
        while (num != 0) {
            int remainder = num % 10;
            System.out.print(remainder + " ");
            num = num / 10;
         }
            
    }
}
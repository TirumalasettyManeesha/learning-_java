class swap{
    public static void main(String[] args){
        int a=3,b=4;
        System.out.println("a value:"+a+" b value:"+b);
        /*int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a value:"+a+" b value:"+b);*/
        int c;
        c=a+b;
        a=c-a;
        b=c-b;
        System.out.println("a value:"+a+" b value:"+b);
    }
}
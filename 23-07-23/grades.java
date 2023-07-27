class grades{
    public static void main(String[] args){
        int score=79;
        String grade=null;
        switch(score/10){
            case 10:
                grade="A+";
                break;
            case 9:
                grade="A";
                break;
            case 8:
                grade="B";
                break;
            case 7:
                grade="C";
                break;
            case 6:
                grade="D";
                break;
            default:
                grade="Fail";
                break;

        }
        System.out.println("grade: "+grade);
    }
}
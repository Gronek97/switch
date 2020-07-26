public class switchProgram {
    public static void main(String[] args) {
//        int val = 1;
//        if (val == 1) System.out.println("Value was 1");
//        else if (val == 2) System.out.println("value was 2");
//        else System.out.println("Value was neither 1 or 2");
        int switchval = 1;
        switch (switchval) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }
        char znak = 'o';
        switch(znak){
            case 'A': case'B': case'C': case'D': case'E':
                System.out.println(znak);
                break;
            default:
                System.out.println("Yo nigga");
        }

    }


}


public class ArrayPattern {
    public static void main(String[] args) {
       
        for (int i = 5; i >0 ; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <i+1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}

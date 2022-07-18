public class Triangle {
    public static void main(String[] args) {
        for (int i = 0; i<=8; i+=2){
            if (i == 0){
                System.out.println("*");
            }
            else {
                for (int j = i ; j<=i; j+=2){
                    System.out.print("*");
                }
            }
        }
    }
}

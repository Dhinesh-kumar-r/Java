package Task;
public class Square {
    public static void main(String[] args) {
        int sideLength = 5; // You can adjust the side length as needed

       
        for (int i = 0; i < sideLength; i++) {
         
            for (int j = 0; j < sideLength; j++) {
               
                if (i == 0 || i == sideLength - 1 || j == 0 || j == sideLength - 1) {
                    System.out.print("* ");
                } else {
                   
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
    }
}

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];

        for (int i = 0; i <array.length ; i++) {
            array[i] = random.nextInt(100);



        }

        for (int i = array.length-1; i>=0; i--){
            System.out.print(array[array.length-1-i] +" " + array[i] + " " );



        }







    }
}

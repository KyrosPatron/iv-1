import java.util.Random;
import java.util.stream.IntStream;

public class Starter {
    public static void main(String[] args) {
        RandomSort randomSort = new RandomSort();

        int[] array = IntStream.generate(() -> new Random().nextInt(100)).limit(10).toArray();

        //Stampa dell'array
        for (int  a : array) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("------------------------");
        int counter = randomSort.sort(array);
        //Stampa dell'array dopo l'ordinamento
        for (int  a : array) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("-> Array shuffled for "+counter+" times");



    }
}
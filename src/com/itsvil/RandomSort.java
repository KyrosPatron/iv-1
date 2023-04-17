import java.util.Random;

public class RandomSort {

    private Random random = new Random();

    public RandomSort(){
        //it's ok
    }

    public int sort(int[] array){
        int counter=0;
        while (!isSorted(array)){
            shuffle(array);
            counter++;
        }

        return counter;
    }

    private boolean isSorted(int[] array){
        for (int i=0; i<array.length-1; ++i){
            if (array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }

    public void shuffle(int[] array){
        for (int i=0; i< array.length-1;++i){
            var index1 = random.nextInt() * array.length;
            var index2 = random.nextInt() * array.length;

            int tmp = array[index1];
            array[index1] = array[index2];
            array[index2] = tmp;

        }


    }


}

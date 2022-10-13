import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] numbers =  {7,4,3,2,1};

        int a = 7;

//        boolean search = IntStream.of(numbers).anyMatch(x -> x == a);

        System.out.println(search(numbers, a) );

    }


    private static boolean search(int[] numbers, int x){

        for ( int i=0; i< numbers.length; i++){
            if (numbers[i] == x){
                return true;
            }
        }
        return false;

    }

}

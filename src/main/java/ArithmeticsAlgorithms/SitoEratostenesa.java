package ArithmeticsAlgorithms;


public class SitoEratostenesa {

    public static int[] doErastotenes(int[] array) {

        double factor = Math.sqrt(array.length);

        for (int i = 0; i < factor; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] != 0 && array[j] != 0 && array[j] % array[i] == 0) {
                    array[j] = 0;
                }
            }

        }
        System.out.println("Posortowane:");
        for (int result : array
                ) {
            System.out.print(result + ", ");
        }
        return array;
    }

    public static void printArray(int[] array) {

        System.out.println("Nieposortowane:");

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = i + 2;
            System.out.print(array[i] + ", ");
        }
    }


    public static void main(String[] args) {


        int[] array = new int[100];

//        for (int i = 0; i < array.length-1; i++) {
//            array[i] = i+2;
//        }
        printArray(array);
        System.out.println();
        doErastotenes(array);


    }
}

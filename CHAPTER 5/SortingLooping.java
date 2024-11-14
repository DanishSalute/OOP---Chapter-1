public class SortingLooping {
    public static void main(String[] args) {
        int[] array = { 11, 33, 44, 22, 55, 66, 77, 88, 99};

        System.out.print("Unsorted Array = ");
        for (int i : array){
            System.out.print(i + " ");
        }

        for (int i = 0;i < array.length - 1;i++){
            for (int j = 0;j < array.length - 1 - i;j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("\nSorted Array = ");
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}

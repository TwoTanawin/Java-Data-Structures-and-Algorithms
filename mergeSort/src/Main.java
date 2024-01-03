
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(array);

        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if(length <= 1) return;

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];

        int i = 0; // left array
        int j = 0; // right array

        for (;i<length;i++){
            if(i < middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray, rightArray, array);
    }


    private static void merge(int[] leftArry, int[] rightArray, int[] array){
        int leftSize = leftArry.length;
        int rightSize = rightArray.length;
        int i = 0, l = 0, r = 0;

        // check the condition for merging
        while (l < leftSize && r < rightSize){
            if(leftArry[l] < rightArray[r]){
                array[i] = leftArry[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize){
            array[i] = leftArry[l];
            i++;
            l++;
        }

        while (r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
package testprogram;

import java.util.*;

/**
 *
 * @author James
 */
public class TestProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userSelection = 0;
        int[] list = {4,5,8,2,3,9,1,0};
        
        System.out.println("Choose how you would like to sort. Enter number.");
        System.out.println("1:Bubble Sort");
        System.out.println("2:Merge Sort");
        userSelection = input.nextInt();
        if (userSelection == 1) {
            bubbleSort(list);
        } else if (userSelection == 2) {
            mergeSort(list);
        } else {
            System.out.println("Input Error.");
        }
        System.out.print("List: [");
        for(int i = 0;i<list.length-1;i++){
            System.out.print(list[i]+",");
        }
        System.out.println(list[list.length-1]+"]");
    }
    
    /**
     * Bubble Sort
     */
    public static void bubbleSort(int[] numberSet){
        boolean needNextPass = true;
        for(int i = 1;i < numberSet.length && needNextPass; i++){
            needNextPass = false;
            for(int j = 0;j < (numberSet.length - i);j++){
                if(numberSet[j]>numberSet[j+1]){
                    int temp = numberSet[j];
                    numberSet[j]=numberSet[j+1];
                    numberSet[j+1]=temp;
                    needNextPass=true;
                }
            }
        }
    }
    
    /**
     * Merge Sort
     */
    public static void mergeSort(int[] numberSet){
        if(numberSet.length > 1){
            // Merge sort the first half
            int firstHalfLength = numberSet.length/2;
            int[] firstHalf = new int[numberSet.length/2];
            System.arraycopy(numberSet, 0, firstHalf, 0, firstHalfLength);
            mergeSort(firstHalf);
            
            // Merge sort the second half
            int secondHalfLength = numberSet.length - numberSet.length/2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(numberSet, numberSet.length/2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);
            
            // Merge firstHalf with secondHalf
            int[] temp = merge(firstHalf, secondHalf);
            System.arraycopy(temp, 0, numberSet, 0, temp.length);
        }
    }
    
    /** Merge two sorted lists */
    private static int[] merge(int[] numberSet1, int[] numberSet2) {
        int[] temp = new int[numberSet1.length + numberSet2.length];
        
        int current1 = 0; // Current index in numberSet1
        int current2 = 0; // Current index in numberSet2
        int current3 = 0; // Current index in temp
        
        while(current1 < numberSet1.length && current2 < numberSet2.length){
            if(numberSet1[current1] < numberSet2[current2]){
                temp[current3++] = numberSet1[current1++];
            } else {
                temp[current3++] = numberSet2[current2++];
            }
        }
        
        while (current1 < numberSet1.length) {
            temp[current3++] = numberSet1[current1++];
        }
        
        while (current2 < numberSet2.length) {
            temp[current3++] = numberSet2[current2++];
        }
        
        return temp;
    }
    
    /**
     * Quick Sort
     */
    public static void quickSort(int[] numberSet){
        
    }
    
    /**
     * Heap Sort
     */
    public static void heapSort(int[] numberSet){
        
    }
    
    /**
     * Insertion Sort
     */
    public static void insertionSort(int[] numberSet){
        
    }
}

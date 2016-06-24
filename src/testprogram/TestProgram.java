package testprogram;

import java.util.*;

/**
 *
 * @author James
 */
public class TestProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /**
        double radius;
        double area;
        
        System.out.println("Radius: ");
        radius = input.nextDouble();
        area= radius*3.14;
        
        System.out.println("The area of the circle of radius " + radius + " is "
                + area);
        
        
        List numberSet = new ArrayList();
        System.out.println("Enter in a set of intergers (Press space after each "
                + "number): ");
        for(int i=0;i<10;i++){
            int userInput = input.nextInt();
            numberSet.add(userInput);
        }
        System.out.println("The number set you have inputed:");
        System.out.println(numberSet);
        **/
        int[] list = {4,5,8,2,3,9,1,0};
        bubbleSort(list);
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

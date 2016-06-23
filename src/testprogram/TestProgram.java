package testprogram;

import java.util.*;

/**
 *
 * @author James
 */
public class TestProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
    }
    
    /**
     * Bubble Sort
     */
    public void bubbleSort(ArrayList numberSet){
        
    }
    
    /**
     * Merge Sort
     */
    public void mergeSort(ArrayList numberSet){
        
    }
    
    /**
     * Quick Sort
     */
    public void quickSort(ArrayList numberSet){
        
    }
    
    /**
     * Heap Sort
     */
    public void heapSort(ArrayList numberSet){
        
    }
    
    /**
     * Insertion Sort
     */
    public void insertionSort(ArrayList numberSet){
        
    }
}

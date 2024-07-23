/*
Write a Java program to sort an array of integers in ascending order using a sorting algorithm of your choice
 */
import java.util.Arrays;
public class ArrayTask {
    public static void main(String[] args) {
        //Sorting array by using sort() method
        int[] Array = {2,5,1,3,7,6,9};
        System.out.println("Actual order of Array elements: ");
        for(int element : Array){
            System.out.println(element);
        }
        System.out.println("After sorting Array in ascending order: ");
        Arrays.sort(Array);
        for(int element : Array){
            System.out.println(element);
        }
        //sorting arrays by using bubble sort algorithm
        int[] Array1 = {2,4,1,8,5,9,6,7,10};
        System.out.println("Actual order of Array1 elements: ");
        for(int element : Array1){
            System.out.println(element);
        }
        for(int i=1; i < Array1.length; i++ ){
            for(int j=0; j < Array1.length - i - 1; j++){
                if(Array1[j] > Array1[j+1]){
                    int temp = Array1[j+1];
                    Array1[j+1] = Array1[j];
                    Array1[j] = temp;
                }
            }
        }
        System.out.println("After sorting Array1 in ascending order: ");
        for(int element : Array1){
            System.out.println(element);
        }
    }
}

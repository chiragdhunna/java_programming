/*
 * 1. Find sum of all elements
 * 2. Searching an Element
 * 3. Finding Maximum Element
 * 4. Finding Second Largest Element
 * 
 */

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {3,9,7,8,12,6,15,5,4,10};

        // Sum
        int sum = 0;
        for(int x : arr){
            sum += x++;
        }

        System.out.println("Sum is : "+sum);

        // Searching an element
        int ele = 10;
        int elementIndex = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ele) elementIndex = i;
        }

        System.out.println("Element found at index : "+elementIndex);

        // Find Maximum Element
        int maxi = Integer.MIN_VALUE;
        for(int x : arr){
            if(x > maxi) maxi = x;
            x++;
        }

        System.out.println("Maximum element is : "+maxi);

        // Second Largest Element
        int secondLarget = Integer.MIN_VALUE;
        for(int x : arr){
            if(x>secondLarget && x!=maxi) secondLarget = x;
            x++;
        }

        System.out.println("Second Largest is : "+secondLarget);
    }
}

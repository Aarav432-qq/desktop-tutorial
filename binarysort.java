import java.util.*;

class binarysort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        
        System.out.println("Enter sorted elements in ascending order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
        
        int low = 0;
        int high = n - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == target) {
                result = mid;
                break;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        
        if (result == -1) {
            System.out.println("Element not found in the array");
        }
        else {
            System.out.println("Element found at index: " + result);
        }
        
        sc.close();
    }
}
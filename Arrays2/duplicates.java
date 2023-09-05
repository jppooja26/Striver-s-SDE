import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class duplicates {
    public static int findDuplicate(int[] arr, int n) {
        //Time complexity - O(n)
        //Space complexity - O(n)
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        int element = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue()>1)
                element = entry.getKey();
        }
        return element;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int val = findDuplicate(arr,n);
        System.out.println("Duplicate element: "+val);
        sc.close();
    }
}

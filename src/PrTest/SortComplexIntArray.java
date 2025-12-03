package PrTest;
import java.util.*;

public class SortComplexIntArray 
{
    public static void main(String[] args) 
    {
        int[] a = {10, 20, 30, 40, 50, 60, 10, 20};

        // Step 1: Remove duplicates using HashSet
        Set<Integer> uniqueValues = new HashSet<>();
        for (int num : a) {
            uniqueValues.add(num);
        }

        // Step 2: Filter values >= 30
        List<Integer> filteredList = new ArrayList<>();
        for (int num : uniqueValues) {
            if (num >= 30) {
                filteredList.add(num);
            }
        }

        // Step 3: Sort the filtered list in descending order
        Collections.sort(filteredList, Collections.reverseOrder());

        // Step 4: Display output
        System.out.println("Output: " + filteredList);
    }
}

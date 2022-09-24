/*You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers except
for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

Examples:

[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindOutlier{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sequenceOfNumbers = sc.nextLine();
        String[] stringNumbers = sequenceOfNumbers.split(", ");
        int[] integers = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length;i++) {
            integers[i] = Integer.parseInt(stringNumbers[i]);
        }
        int outlier = find(integers);
        System.out.println(outlier);

    }


    static int find(int[] integers){
        // nt[] list = new int[];
        int pairNumber = 0;
        int oddNumber = 0;

        List <Integer> pairNumberList = new ArrayList<>();
        List <Integer> oddNumberList = new ArrayList<>();

        for (int i = 0; i < integers.length; i++){
            if (integers[i] % 2 == 0){
                pairNumber++;
                int pair = integers[i];
                pairNumberList.add(pair);
            } else {
                oddNumber++;
                int odd = integers[i];
                oddNumberList.add(odd);
            }
        }

        if (pairNumber > oddNumber) return oddNumberList.get(0);
        else return pairNumberList.get(0);

    }
}
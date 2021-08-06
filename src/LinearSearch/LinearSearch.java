/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearSearch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LinearSearch {

    public static void main(String[] args) {
        int length, search, found;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of array: ");
        length = sc.nextInt();
        System.out.println("Input search value:");
        search = sc.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {

            array[i] = new Random().nextInt(length);
        }
        LinearSearch searcher = new LinearSearch();
        System.out.print("The array: ");
        searcher.displayArray(array);

        found = searcher.linerSearch(array, search);
        if (found == -1) {
            System.out.println("Not found.");
        } else {
            System.out.println("\n Found " + search + " at index: " + found);
        }
    }

    public void displayArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public int linerSearch(int[] arr, int key) {

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

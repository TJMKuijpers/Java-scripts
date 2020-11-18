package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    // command line interface to perform binary search
        // Array can be any input from user and will be sorted
        askAndSortUserArray getarray = new askAndSortUserArray();
        int[] array=getarray.AskUserForarray();
        Arrays.sort(array);
        System.out.println(array);
        BinarySearch binsearch = new BinarySearch();
        Scanner getX = new Scanner(System.in);
        System.out.println("Which value do you want to find?:");
        int x = getX.nextInt();
        int leftside =0;
        int rightside = array.length;
        int resultbinsearch = binsearch.binarySearch(array,leftside,rightside,x);
        System.out.println("If there is a value the index will be returned below");
        if(resultbinsearch>-1){
            System.out.println("value of "+x+" is in your array");
        }else{
            System.out.println("Your value is not in your array");
        }

    }


}
class BinarySearch{
    // Return index of x if present in array
    // if not present it will return -1

    int binarySearch(int arr[], int l, int r, int x){
        // int l is to define the left side of the array(index at 0)
        // int r is to define the right side of the array (index length of arr)
        // int x is the value we want to find
        if(r>=l){
            // if r >=l the array is not empty
            int mid = l + (r-l)/2;
            if(arr[mid]==x){
                // the value is in our array and now we return the index
                return mid;
            }
            if(arr[mid]<x){
                // the value should be on the right side of the array
                l=mid+1;
                return binarySearch(arr,l,r,x);
            }
            if(arr[mid]>x){
                r=mid-1;
                return binarySearch(arr,l,r,x);
            }
        }
        // array is empty and we did not find the value in our array
        return -1;
    }
};

class askAndSortUserArray{
    // class with function to first ask a user to give an array
    // after the user is finished the array will be sorted to be used in binary search
    public static int[] AskUserForarray(){
        Scanner scanner = new Scanner(System.in);

        // ask the user to give an array size
        System.out.print("How many items do you want to add to your arary?: ");
        int arraysize = scanner.nextInt();
        int[] arrayWithNumbers = new int[(arraysize+1)];
        for (int i = 0; i < arraysize; i++) {
            System.out.println("Enter a number:");
            arrayWithNumbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrayWithNumbers));
        return arrayWithNumbers;
    };

};

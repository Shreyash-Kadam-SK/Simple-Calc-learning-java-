package Arrays;
import java.util.Arrays;

public class Creating_array
 {
    public static void main(String[]args)
    {// Creating a array named vowels and numbers
        char vowels[] = new char[5];

        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        int numbers[] = {1,2,3,4,5};

    // A way to print array cannot just print it by calling the variable
        System.out.println(Arrays.toString(vowels));
        System.out.println(Arrays.toString(numbers));
    
    //checking length of the array
        System.out.println(vowels.length);

    //Sorting A array    
        char unsorted_array[] = {'e','o','u','a','i'};//unsorted array
        System.out.println(Arrays.toString(unsorted_array));//Printing the unsorted array
        Arrays.sort(unsorted_array);//sorting the array 
        System.out.println(Arrays.toString(unsorted_array));//Printing the sorted array
        // you can also sort the array and have parameters for the starting index and ending index use case would be as followed
        Arrays.sort(unsorted_array,1,4); // it will sort the values according to the index also the ending index is not inclusive so to considering 4 will result in 3 as 4 will not get counted
    
    //Finding Index values using binarysearch
        Arrays.binarySearch(vowels,'o');// syntax to search for 'o' in the array
        //you can also have starting and ending index parameters such the syntax is 
        int value = Arrays.binarySearch(unsorted_array,1,4,'o');//gives the index value and it is stored
        System.out.println(value);// prints the index that is stored in ''value''
    
    //fill array's
        Arrays.fill(numbers,1,4,1);//can also use the syntax without the starting and ending index parameters 
        System.out.println(Arrays.toString(numbers));

    //copying Arrays such that it dosent affect each other
        int num[] = {1,2,3,4,5};  
        int copyofnum[] = Arrays.copyOf(num,num.length);//length can be manually stated or can be clever while copying and use array_name.length
        //int copyofnum[] = Arrays.copyOf(num,starting index,ending index);
        //can use the above one dosent need length now as we did define index's
        System.out.println(Arrays.equals(num,copyofnum));
        //Syntax to check if arrays is equal to another array gives boolean output
        
    }
    
}

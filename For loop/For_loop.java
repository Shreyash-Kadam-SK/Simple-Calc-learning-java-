

class For_loop {
    public static void main(String args[])
    {
        //normal increment for loop
        for(int number = 1;number <= 10;number++)
        {
            System.out.println(number);
        }

        //adding all elements of the array
        int arr[] = {1,2,3,4};
        int sum = 0;
        for(int index = 0;index < arr.length;index++)
        {
            sum += arr[index];//adding all elements of the array
        }
        System.out.println(sum);//printing the sum

        //nested for loops a loop inside a loop
        for(int number = 1;number <= 10;number++)
        {
        for(int multiplier = 1;multiplier <= 10;multiplier++)
        {
            System.out.printf("%d X %d = %d\n",number,multiplier,number*multiplier);
        }
        }
        
        //Iterating over a array
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        for(int number:numbers)
        {
            System.out.println(number);
        }

    }
    
}

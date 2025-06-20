class Array3
 {
    public static int findIndex(int[] arr, int value)
 {
        for (int i = 0; i < arr.length; i++) 
{
            if (arr[i] == value) return i;
        }
        return -1;
    }

    public static void main(String[] args) 
{
        int[] numbers = {5, 7, 3, 1, 6};
        int value = 3;
        int index = findIndex(numbers, value);
        if(index != -1)
{
            System.out.println("Index of " + value + ": " + index);
}
        else{
            System.out.println(value + " not found in array.");
}
    }
}
 class Array
{
    public static int sumArray(int[] arr)
{
        int sum = 0;
        for (int num : arr)
{
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) 
{
        int[] numbers = {5, 3, 9, 1, 6};
        System.out.println("Sum: " + sumArray(numbers));
    }
}
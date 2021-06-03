class InsertionSort {
    public static void Sort(int[] array)
    {
        for(int i=1;i<array.length;i++)
        {

            int temp=array[i];
            int j=i-1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
           
        }
    }
    public static void printArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args)
    {
        int[] array={5,1,4,3,10,12};
        Sort(array);
        printArray(array);
    }
    
}

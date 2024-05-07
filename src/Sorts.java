class Sorts
{
    // Bubble sort
    public static void bubbleSort(int[] A)
    {
        int pass = 0;
        boolean sorted = false, swapped = false;
        int temp = 0;
      
        do
        {
            sorted = true;  // Assume sorted and change if not true
          
            for( int i = 0; i < ( A.length - 1 ) - pass ; i++ )
            {
                if( A[i] > A[i + 1] )
                {
                    // Then swap
                    temp = A[i];  // Temporarily store in variable
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    sorted = false;
                    // To continue sorting
                }
            }
            pass++;  // Increment to next pass
          
        } while(!sorted);
    }


  
    // Selection sort
    public static void selectionSort(int[] A)
    {
        int minIdx = 0;
        int temp = 0;
      
        for(int i = 0; i < A.length; i++)
        {
            minIdx = i;
          
            for( int j = i + 1; j <= A.length - 1; j++ )
            {
                if( A[j] < A[minIdx] )
                {
                    minIdx = j;
                }
            }
          
            temp = A[minIdx];
            A[minIdx] = A[i];
            A[i] = temp;
        }
    }

  

    // Insertion sort
    public static void insertionSort(int[] A)
    {
        int temp = 0;
      
        for( int i = 1; i <= A.length - 1; i++ )
        {
            int j = i;
            temp = A[j];
            while( ( j > 0 ) && ( A[j - 1] > temp ) )
            {
                A[j] = A[j - 1];
                j--;
            }
            A[j] = temp;
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class IntergerArrayDemo {

	public static void main(String[] args) {
		
		
		
		//get longest sequence of integer sub array
		
		int arr[]={1,2,3,8,2,4,5,8,9,7,6,3};
		int n = arr.length;
		getLongestSeq(arr, n);
		
		
	}

	
	static void getLongestSeq(int a[], int n)
    {
        // Variables to keep track of maximum
        // length and  starting point of 
        // maximum length. And same for current
        // length.
        int maxIdx = 0, maxLen = 0, currLen = 0, currIdx = 0;
        int currEle=a[0];
      
        for (int k = 1; k < n; k++) 
        {
            if (a[k] > 0 && a[k]>currEle)
            {
                currLen++;
                currEle=a[k];
                // New sequence, store
                // beginning index.
                if (currLen == 1) 
                    currIdx = k;         
            }
            else
            {
                if (currLen > maxLen) 
                {
                    maxLen = currLen;
                    maxIdx = currIdx;
                }
                currLen = 0;
                currEle=a[k];
            }
        }
      
        if (maxLen > 0) 
        {
            System.out.print( "Length " + maxLen) ; 
            System.out.print( ",starting index " + maxIdx );
        }
        else
            System.out.println("No positive sequence detected.") ;
          
        return;
    }
}

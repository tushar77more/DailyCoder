package com.dailycoder.examples;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'balancedSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int balancedSum(List<Integer> arr) {
    // Write your code here
    	//3,1,2,1
            int sum1=arr.get(0);
            int sum2=arr.get(arr.size()-1);
            int mid= arr.size()/2;
            
            for(int i=1,j=arr.size()-2;i<arr.size() && j>=0;){
                if(sum1<sum2){
                    sum1=sum1+arr.get(i);  
                    i++;  
                }
                if(sum1>sum2){
                    sum2=sum2+arr.get(j);    
                    j--;
                }
                if(sum1==sum2){
                    return i;
                }
              
            }
            
            
            return 0;
            
    }

}

public class BalanceArrayDemo {
    public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
		 * 
		 * List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> { try { return
		 * bufferedReader.readLine().replaceAll("\\s+$", ""); } catch (IOException ex) {
		 * throw new RuntimeException(ex); } }) .map(String::trim)
		 * .map(Integer::parseInt) .collect(toList());
		 */
    	
    	List<Integer> arr = new ArrayList<Integer>();
    	arr.add(3);
    	arr.add(1);
    	arr.add(2);
    	arr.add(1);
        int result = Result.balancedSum(arr);

       
    }
}

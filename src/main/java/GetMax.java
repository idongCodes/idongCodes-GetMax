public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        // Variable to set first num in array as current largest number 
        int maxNum = arr[0];

        // Loop thru array
        // Any number greater than  maxNum, set as new maxNum
        for (int num : arr) {
            if (num > maxNum)
                maxNum = num;
        }

        // Return current largest number
        return maxNum;
    }
}

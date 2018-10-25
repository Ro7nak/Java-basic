package sorting;

public class Max_Count_Per_Array {

	static int maximumToys(int[] prices, int k) {
        long sum = 0;
        int toys = 0;

        int minPointer;
        while (sum < k ) {
            minPointer = 0;
            for(int i = 0; i < prices.length; i++) {
                if (prices[minPointer] >prices[i]) {
                    minPointer = i;
                } 
            }
            sum += prices[minPointer];
            if (sum <= k) {
                toys++;
            }
           prices[minPointer] = Integer.MAX_VALUE;
           // System.out.println(prices[minPointer]);
     }
        return toys;
    }
	
	/*  static int maximumToys(int[] prices, int k) {
		      int count= -1;
		        int p = 0;
		        //int[] a = new int[price.length];
		        for (int i =0 ; i <prices.length; i++){
		        for(int j=0; j<prices.length-1; j++){
		            if(prices[j]>prices[j+1]){
		                int temp = prices[j];
		                prices[j] = prices[j+1];
		                prices[j+1]= temp;
		            }
		        }    
		        }
		        for (int i = 0; i<prices.length; i++){
		            if(p<=k){    
		            p = p+prices[i];   
		                count++;
		            }
		      }
		       return count;  
		    }*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {100,50, 63, 54, 30, 90,45, 30, 55,10, 250};
		int k = 90;
		
		System.out.println(maximumToys(prices, k));

	}

}

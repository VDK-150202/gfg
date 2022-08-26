class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long ans[]= new long[n];
        Stack<Long> s= new Stack<>();
        
        for(int i= n-1; i>=0; i--){
            if(s.isEmpty()){
                ans[i]=-1;
            }
            else if(!s.isEmpty() && s.peek()>arr[i]){
                ans[i]= s.peek();
            }
            else if(!s.isEmpty() && s.peek()<=arr[i]){
                while(!s.isEmpty() && s.peek()<=arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i]=-1;
                }else{
                    ans[i]= s.peek();
                }
            }
            s.push(arr[i]);
        }
     return ans;   
    } 
}

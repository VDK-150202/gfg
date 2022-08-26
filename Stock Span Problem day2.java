class Solution
{   
    
    
     class Pair{
    
    int key;
    int value;
    
    public Pair(int key,int value){
        this.key = key;
        this.value = value;
    }
    
}
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        
        int ans[]= new int[n];
        int index_ans[]= new int[n];
        Stack<Pair> s= new Stack<>();
         for(int i=0; i<n; i++){
             Pair p = s.peek();
            if(s.isEmpty()){
                index_ans[i]=-1;
            }
            else if(!s.isEmpty() && p.key >price[i]){
                index_ans[i]= p.value;
            }
            else if(!s.isEmpty() && p.key <=price[i]){
                while(!s.isEmpty() && p.key <=price[i]){
                    s.pop();
                   p = s.peek();
                }
                if(s.isEmpty()){
                    index_ans[i]= -1;
                }else{
                    p = s.peek();
                    index_ans[i]= p.value;
                }
            }
             p = s.peek();
           // s.push( Pair(price[i],i));
            s.push(new Pair(price[i],i));
         }
         for(int i=0 ; i< n; i++){
             ans[i]= i-index_ans[i];
         }
         return ans;
    }
    
}

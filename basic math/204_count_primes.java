class Solution {
    public int countPrimes(int n) {
        int totalprimes = 0;
        for(int i=2;i<n;i++){
            int isprime = 1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isprime = 0;
                    break;
                }
            }
            totalprimes+=isprime;
        }
        return totalprimes;
    }
}

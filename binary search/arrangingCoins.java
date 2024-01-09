public class arrangingCoins {
    public static void main(String[] args){
        int n=2;

        int ans = binarySearch(n);
        System.out.println(ans);
    }
    public static  int  binarySearch(int n){
        int s=1,e=n;

        if(n==1 || n==2) return 1;
        while(s<e){
            int mid = s+(e-s)/2;
            int coinsRequired = (mid*(mid+1))/2;

            if(coinsRequired>n) e=mid-1;
            else if(coinsRequired<n) s=mid+1;
            else return mid;
        }
        return e;
    }
}

import java.util.Arrays;

public class fairCandiSwap {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};

        int[] res = candySwap(aliceSizes,bobSizes);
        System.out.println(Arrays.toString(res));
    }

    private static int[] candySwap(int[] alice, int[] bob) {
        int[] res = new int[2];
        int sz1=0,sz2=0;
        for(int i=0;i<alice.length;i++){
            sz1 = sz1+alice[i];
        }
        for(int i=0;i<bob.length;i++){
            sz2 = sz2+bob[i];
        }

        System.out.println("Alice "+sz1 +"  Bob "+sz2);


 // alice candi share
        if(sz1>sz2){
        //    System.out.println("sz1 > sz2");
            if(bob.length==1){
                res[1]=bob[0];
                sz1=sz1+bob[0]; // alice got all the candies, so he will give half to alice

                int aliceShare = sz1/2;
                for(int i=0;i<alice.length;i++){
                    if(aliceShare==alice[i]) {
                        res[0]=alice[i];
                        break;
                    }
                    else continue;
                }
            }else {
                int exCan = sz1 - sz2;
                for (int i = 0; i < alice.length; i++) {
                    if (exCan == alice[i]) {
                        res[0] = exCan;
                        break;
                    } else continue;
                }
                for (int i = 0; i < bob.length; i++) {
                    if (exCan / 2 == bob[i]) {
                        res[1] = bob[i];
                        break;
                    } else continue;
                }
            }
        }
  // bob candi share
        if(sz1<sz2){
        //    System.out.println("sz1 < sz2");
            if(alice.length==1){
                System.out.println("alice");
                res[0]=alice[0];
                sz2=sz2+alice[0];   // bob got all the candies, so she will give half to bob

                int bobShare = sz2/2;
                for(int i=0;i<bob.length;i++){
                    if(bobShare==bob[i]) {
                        res[1]=bob[i];
                        break;
                    }
                    else continue;
                }
            }else {
                int exCan = sz2 - sz1;
                for (int i = 0; i < alice.length; i++) {
                    if (exCan / 2 == alice[i]) {
                        res[0] = alice[i];
                        break;
                    } else continue;
                }
                for (int i = 0; i < bob.length; i++) {
                    if (exCan == bob[i]) {
                        res[1] = bob[i];
                        break;
                    } else continue;
                }
            }
        }
        return res;
    }
}

package DataStructureAlgorithm.LEETCODE;

public class FindPivot {

        public int pivotInteger(int n) {

            if(n==1)
            {return 1;}
            for(int i =1;i<n;i++)
            {
                int m =i*i;
                int ans =(n*(n+1)/2) ;

                if(m == ans)
                {return i;}
            }

            return -1;}

    public int pivotInteger2(int n) {
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum1 += j;
            }
            for (int z = i; z <= n; z++) {
                sum2 += z;
            }

            if (sum2 == sum1) {
                return i;
            } else {
                sum2 = 0;
                sum1 = 0;

            }


        }

        return -1;

    }
}

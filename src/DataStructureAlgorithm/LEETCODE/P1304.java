package DataStructureAlgorithm.LEETCODE;

public class P1304 {

        public int[] sumZero(int n) {

            int z=n-1,i=0,c=1;
            int[] j=new int[n];
            if(n%2==0){
                j[0]=0;
                while(i<z){
                    j[i]=-c;
                    j[z]=c;
                    i++;
                    z--;
                    c++;}
            }

            else{
                while(i<z)
                {j[i]=-c;
                    j[z]=c;
                    i++;
                    z--;
                    c++;
                }}


            return j;





    }
}

class Solution {
    public int captureForts(int[] forts) {
        int max=0;
        for(int i=0;i<forts.length;i++){
            if(forts[i]==1 || forts[i]==-1){
                for(int j=i+1;j<forts.length;j++){
                    if(forts[i]==forts[j]){
                        i=j-1;
                        break;
                    }else if(forts[j]!=0 && forts[i]!=forts[j]){
                       int t=j-i-1;
                         if(t>max){
                            max=t;
                        }
                        break;
                    }
                }
            }
        }
        return max;
    }
}

//https://leetcode.com/problems/maximum-enemy-forts-that-can-be-captured/

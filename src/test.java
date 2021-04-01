public class test {
    public static int maxSum(int[] a){
        int maxSum = 0;
        for(int i = 0; i < a.length; i ++){
            int thisSum = 0;
            for(int j = i; j < a.length; j ++){
                thisSum += a[j];
                if(thisSum > maxSum){
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }
}

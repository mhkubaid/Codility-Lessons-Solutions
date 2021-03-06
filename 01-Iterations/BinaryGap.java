// Binary Gap: Find max binary gap (of zeros) in a binary format of a given integer
// https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
class BinaryGap {
   public int solution(int N) {  
        int zeroCount = 0;
        int maxCount = 0;
        String str = Integer.toString(N,2); //converts to binary format
        
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i+1) == '0'){
                zeroCount++;
            } else {
                if(str.charAt(i) == '0' && zeroCount > maxCount) {
                    maxCount = zeroCount;
                }
                zeroCount = 0;
            }
            
        }
        
        return maxCount;
    }
}

class Solution {
    public void duplicateZeros(int[] arr) {
        int count=0;
        int length=arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;  
            }
        }
       int lastIndex = length - 1;
        int newIndex = length - 1 + count;

        while (lastIndex >= 0) {
            if (newIndex < length) {
                arr[newIndex] = arr[lastIndex];
            }

            if (arr[lastIndex] == 0) {
                newIndex--;

                if (newIndex < length) {
                    arr[newIndex] = 0;
                }
            }

            lastIndex--;
            newIndex--;
        }
    }
}
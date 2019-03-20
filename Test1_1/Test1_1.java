package com.hc.Test1_1;

public class Test1_1 {
    public static void main(String[] args) {
        int[] arr={10,25,11,23,10,9,9,2,3,11,31};
        deleteRepeat(arr);
    }

    /**
     * 先输出第一个数arr[0]，然后从第二个数开始，后面有和它值相同的数就赋成arr[0]的值
     * 最后输出与arr[0]值不同的数
     * @param arr
     */
    static void deleteRepeat(int[] arr){
        System.out.print(arr[0]+" ");
        for(int i=1;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=arr[0];
                }
            }
            if(arr[i]!=arr[0])
                System.out.print(arr[i]+" ");
        }
    }


}

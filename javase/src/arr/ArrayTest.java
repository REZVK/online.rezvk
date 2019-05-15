package arr;

import java.util.Arrays;

/*
 * FileName:  ArrayTest
 * Author:    REZ_VK
 * Date  :   2019-5-11 16:59
 * info :    这个是..数组练习
 * */
public class ArrayTest {

    public static void main(String[] args){

        int[] arr = {-4,0,2,7,11,18,23,45,99};

        //数组复制
        int[] arrTemp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arrTemp[i] = arr[i];
            System.out.println(arrTemp[i]);
        }
        //数组反转
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i : arr) {
            System.out.print(i+",");
        }
        //数组查找（线性，二分法）
        int a = 17;
        boolean flag = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(a==arr[i]){
                System.out.println("找到了,下标第"+i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("没有找到");
        }
        //二分法
        int sn = 17;
        int sindex = 0;
        int eindex = arr.length-1;
        boolean isFlag = false;
        while(sindex<=eindex){
            int middle = (sindex+eindex)/2;
            if(arr[middle]==sn){
                System.out.println("找到了,下标为"+middle);
                isFlag = true;
                break;
            }else if(arr[middle]<sn){
                sindex = middle+1;
            }else{
                eindex = middle -1;
            }
        }
        if(!isFlag){
            System.out.println("没找到");
        }


        int[] arrs = {1,99,-41,25,0,-1,33,10,25,6};
        //数组排序（冒泡 快排）
        //冒泡
        for(int i=0 ;i<arrs.length-1;i++){
            for(int j=0;j<arrs.length-1-i;j++){
                if(arrs[j]>arrs[j+1]){
                    int temp = arrs[j];
                    arrs[j] = arrs[j+1];
                    arrs[j+1] = temp;
                }
            }
        }
        for (int i : arrs) {
            System.out.print(i+",");
        }
        System.out.println();

        //快排
        int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30 };
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));


        //Arrays 工具类使用
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,4,3,2};
        //Arrays.equals判断数组是否相等
        System.out.println(Arrays.equals(arr1,arr2));
        //输出数组信息
        System.out.println(Arrays.toString(arr1));
        //将指定数填充到数组
        Arrays.fill(arr1,2);
        System.out.println(Arrays.toString(arr1));
        //对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //查找
        int index = Arrays.binarySearch(arr2, 2);
        if(index>=0){
            System.out.println("找到了，下标为"+index);
        }else{
            System.out.println("没找到");
        }

    }


    //交换数组指定位置
    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    //快排
    public static void quickSort(int[] data){
        subSort(data,0,data.length-1);
    }
    private static void subSort(int[] data, int start, int end) {
        if (start < end) {
            int base = data[start];
            int low = start;
            int high = end + 1;
            while (true) {
                while (low < end && data[++low] - base <= 0)
                    ;
                while (high > start && data[--high] - base >= 0)
                    ;
                if (low < high) {
                    swap(data, low, high);
                } else {
                    break;
                }
            }
            swap(data, start, high);

            subSort(data, start, high - 1);//递归调用
            subSort(data, high + 1, end);
        }
    }

}

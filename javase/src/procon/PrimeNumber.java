package procon;


/*
 * FileName:  PrimeNumber
 * Author:    REZ_VK
 * Date  :   2019-5-11 11:08
 * info :    这个是..质数练习
 * */
public class PrimeNumber {
    public static void main(String[] args){

        long start = System.currentTimeMillis();
        int count = 0;
        out: for (int i=2;i<=100000;i++){

            for(int j=2;j<Math.sqrt(i);j++){

                if(i % j==0){
                    continue out;
                }

            }
            count++;
        }
        Long end = System.currentTimeMillis();
        System.out.println("所耗时间："+(end-start));
        System.out.println("质数个数："+count);
    }
}

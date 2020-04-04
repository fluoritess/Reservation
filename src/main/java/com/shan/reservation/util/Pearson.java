package com.shan.reservation.util;
/**
 * @author wsw
 * @Package
 * @Description:皮尔逊相关系数
 * @date 2020年3月11日 21:19:29
 */
public class Pearson {
    public static void main(String[] args) {
        double[] arr={5,4.8,4,4,5,5,4.5};
        double[] arr2={5,5,5,4,5,4.5,4};
        System.out.print(Pearson.getPearson(arr,arr2));
    }
    //获取数组平均数
    public static double getAverage(double arr[]){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double average=sum/arr.length;
      return average;
    }
    //获取皮尔逊系数的分子,a 和 b的数组长度要一样
    public static double getPearsonSon(double a[],double b[]){
        //分别计算a和b的平均值
        double averageA=Pearson.getAverage(a);
        double averageB=Pearson.getAverage(b);

        int length=a.length;
        double sum=0;
        if(length==b.length){
            for(int i=0;i<length;i++){
                    double count=(a[i]-averageA)*(b[i]-averageB);
                    sum+=count;
            }
        }
        return sum;
    }
    //计算标准差
    public static double getStandardDeviation(double arr[]){
        //计算数组的平均值
        double average=Pearson.getAverage(arr);
        double sum=0;
        //计算方差
        for(int i=0;i<arr.length;i++){
            double count=Math.pow(arr[i]-average,2);
            sum+=count;
        }
        return Math.sqrt(sum);
    }
    //计算皮尔逊相关系数
    public static double getPearson(double a[],double b[]){
        double son=Pearson.getPearsonSon(a,b);
        double aD=Pearson.getStandardDeviation(a);
        double bD=Pearson.getStandardDeviation(b);
        double Pearson=son/(aD*bD);
        return Pearson;
    }
}

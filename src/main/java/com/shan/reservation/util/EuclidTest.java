package com.shan.reservation.util;


import java.util.*;

/**
 * 描述：对电影打星1~5，最低打1星，0代表没打星过。大于平均推荐度代表喜欢。
 * 给目标用户推荐相似度最高用户喜欢的电影
 */
public class EuclidTest {

    //系统用户
    private static String[] users={"小明","小花"};
    //和这些用户相关的电影
    private static String[] movies={"电影1","电影2","电影3","电影4","电影5","电影6","电影7"};
    //用户点评电影打星数据,是users对应用户针对movies对应电影的评分
    private static int[][] allUserMovieStarList={
            {5,4,4,4,5},
            {4,5,5,4,4},

    };

    public static void main(String[] args) {
        double a=calcTwoUserSimilarity(allUserMovieStarList[0],allUserMovieStarList[1]);
        System.out.print(a);
    }
    /**
     * 根据用户数据，计算用户相似度
     * @param user1Stars
     * @param user2Starts
     * @return
     */
    private static double calcTwoUserSimilarity(int[] user1Stars,int[] user2Starts){
        float sum=0;
        for(int i=0;i<5;i++){
            sum+=Math.pow(user1Stars[i]-user2Starts[i],2);
        }
        return Math.sqrt(sum);
    }

}


package com.剑指Offer;

/**
 * @description: 二维数组的查找
 * @author: KimJun
 * @date: 19/1/20 13:34
 */
public class Page47 {

    public boolean Find(int target, int [][] array) {
        boolean find = false;
        //二维数组的行列数
        int rows = array.length;
        int columns = array[0].length;

        if(rows > 0 && columns > 0) {
            int row = 0;
            int column = columns - 1;
            while(row < rows && column >= 0) {
                if(array[row][column] == target) {
                    find = true;
                    System.out.println("找到");
                    break;
                }else if(array[row][column] < target){
                    --column;
                }else{
                    ++row;
                }
            }
        }
        return find;
    }

    public static void main(String[] args) {
        Page47 page47 = new Page47();
        int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(page47.Find(7,array));
    }
}

package com.ohgiraffers.section03.sort;

public class practice3 {
    public static void main(String[] args) {
//        길이가 10인 배열을 선언하고  1부터 10까값을 반복문을 이용하여
//        역순으로 배열 인덱스에 넣은 후 출력
//        출력결과) 10 9 8 7 6 5 4 3 2 1
        int [] arr = new int[10];
        
//        int num = 10;
//        int result = 0;
//        for (int i = 0; i < arr.length; i++) {
//
//           result = num-i;
//            System.out.print(result + " ");
//        }

        int num = 10;
        for(int i= 0; i<arr.length; i++){
            arr[i]=num;
            --num;
            System.out.print(arr[i] + " ");
        }


        
    }
}

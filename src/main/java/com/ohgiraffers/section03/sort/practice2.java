package com.ohgiraffers.section03.sort;

public class practice2 {
    public static void main(String[] args) {
        // 배열을 이용하여
        // 배열 인덱스 범위의 난수를 발생시켜 랜덤한 과일과 가격을 뽑고
        // 인덱스를 이용해서 출력하는 함수를 작성하세요
        // ex) 당신이 선택한 과일인 바나나의 가격은 2000원 입니다.

        String[] fruit = {"사과" ,"바나나", "포도","레몬","자두"};
        int [] price = {2000, 1000, 3000, 5000, 4000};

        int randomFruit =(int) (Math.random() *fruit.length);
        int randomPrice = (int) (Math.random() * price.length);

        System.out.println("당신이 선택한 과일인 " + fruit[randomFruit] +"의 가격은 "+ price[randomPrice] + "원 입니다.");
    }
}


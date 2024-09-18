package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받기 위한 준비
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 입력할 숫자의 개수를 입력 받기
        System.out.print("입력할 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        // 숫자들을 저장할 배열 생성
        int[] numbers = new int[count];

        // 사용자에게 숫자를 입력 받기
        for (int i = 0; i < count; i++) {
            System.out.print("숫자 " + (i + 1) + " 입력하세요: ");
            numbers[i] = scanner.nextInt();
        }

        // 숫자들의 합과 평균 계산
        int sum = 0;
        for (int num : numbers) { //넘버스 배열의 안에있는 숫자가 한개씩 넘에 삽입된다.
            sum += num;
        }
        double average = (double) sum / count;

        // 결과 출력
        System.out.println("입력한 숫자들의 합: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);

        // Scanner 객체를 닫아줍니다.
        scanner.close();
    }
}


package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec04 {
	Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<GradeVO> gradeList = new ArrayList();

		for (int i = 0; i < 5; i++) {
			GradeVO vo = new GradeVO();
			makeScore(vo);
			gradeList.add(vo);
		}

		System.out.println("==================================");
		System.out.println("학번\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균");
		System.out.println("----------------------------------------------------");

		for (GradeVO vo : gradeList) {
			viewScore(vo);
		}
		System.out.println("==================================");

	} // main end

	public static void makeScore(GradeVO vo) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("학번 >> ");
		String strNum = scanner.nextLine();
		vo.setStrNum(strNum);

		System.out.print("국어 >> ");
		String strKor = scanner.nextLine();
		int intKor = Integer.valueOf(strKor);
		vo.setIntKor(intKor);

		System.out.print("영어 >> ");
		String strEng = scanner.nextLine();
		int intEng = Integer.valueOf(strEng);
		vo.setIntEng(intEng);

		System.out.print("수학 >> ");
		String strMath = scanner.nextLine();
		int intMath = Integer.valueOf(strMath);
		vo.setIntMath(intMath);

		int intSum = vo.getIntKor();
		intSum += vo.getIntEng();
		intSum += vo.getIntMath();
		vo.setIntSum(intSum);

		float floatAvg = (float) intSum / 3;
		vo.setFloatAvg(floatAvg);
	}

	public static void viewScore(GradeVO v) {
		System.out.print(v.getStrNum() + "\t\t");
		System.out.print(v.getIntKor() + "\t\t");
		System.out.print(v.getIntEng() + "\t\t");
		System.out.print(v.getIntMath() + "\t\t");
		System.out.print(v.getIntSum() + "\t\t");
		System.out.print(v.getFloatAvg() + "\n");
	}
}
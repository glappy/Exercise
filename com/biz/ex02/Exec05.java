package com.biz.ex02;

import com.biz.ex02.vo.TestVO;

public class Exec05 {

	public static void main(String[] args) {
		TestVO testVO = new TestVO() ;
		int intNum = 100 ;
		numRet(intNum) ;
		System.out.println(intNum);
		intNum = numRet(intNum) ;
		System.out.println(intNum);
		
		testVO = new TestVO() ;
		System.out.println("strTest1 : " + testVO.strTest1);
		testRet(testVO) ;
		System.out.println("strTest1 : " + testVO.strTest1);
		testVO = tRet(testVO) ;
	}
	
	public static TestVO tRet(TestVO testVO) {
		testVO.strTest1 = "korea" ;
		testVO.strTest2 = "우리나라" ;
		return testVO ;
	}
	
	public static void testRet(TestVO testVO) {
		testVO.strTest1 = "korea" ;
		testVO.strTest2 = "대한민국" ;
	}
	public static int numRet(int intNum) {
		intNum = 200 ;
		return intNum ;
	}
}

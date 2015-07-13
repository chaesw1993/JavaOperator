package controller;

import condition.ArithmeticCalc;
import condition.CalcAvg_class;
import condition.ManOrWoman;
import condition.SwitchAvg;
import loop.EvenOddSum;
/*
 * @ Date : 2015.07.09
 * @ Author : Chae S W
 * @ Story : 실행기
 */
public class OperatorController {
	public static void main(String[] args) {
		
		// 2015.07.09 성적계산기
		CalcAvg_class avg = new CalcAvg_class();
//		avg.calcAvg();
		
		
		// 2015.07.09 사칙연산계산기
		ArithmeticCalc ariCalc = new ArithmeticCalc();
//		ariCalc.simpleCalc();
		
		
		// 2015.07.10 성적계산기(switch)
		SwitchAvg switchAvg = new SwitchAvg();
//		switchAvg.calc();
		
		
		// 2015.07.10 주민번호(switch)
		ManOrWoman mow = new ManOrWoman();
//		mow.ssn();
		
		
		// 2105.07.13 홀짝 합 계산기(for, if)
		EvenOddSum evenOddSum = new EvenOddSum();
//		evenOddSum.calc();
	}
}

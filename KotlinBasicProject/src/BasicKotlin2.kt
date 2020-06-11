/*
 		코틀린 특성
 		=================================
 		1) 정적 타입 지정 언어 var a:Int=10, var a=10
 		2) 간결함, 실용적임, 안전함 ==> 자바(JVM)
 		3)  상호운영성 (=호환성 좋음)
 */
import java.util.*
// if, when(=switch case), for, while
fun main(args:Array<String>)
{
	var score=85
	var jumsu=hakjum(score)
	println("score=$score,  jumsu=$jumsu 학점")
}
/*
 		fun 함수명(매개변수...) 					===> void 함수명(매개변수)
 		fun 함수명(매개변수...) : 데이터형 ===> 리턴형이 존재하는 함수
 	
 		if 조건문
 		= if(조건)
 		= if(조건) else
 		= if(조건) else if(조건2) else 
 */
fun max(a:Int,b:Int):Int // (매개변수1, 매개변수2) : 리턴형 
{
	var c:Int 								// 선언
	if(a>b)
		c=a
	else
		c=b
	return c
}
// 리턴형이 있는 함수의 두가지 생성방법
fun max1(a:Int,b:Int):Int=if(a>b) a else b
fun max2(a:Int,b:Int)=if(a>b) a else b
// 함수를 변수와 같은 역할을 수행하게 하는 역할

fun hakjum(a:Int):Char
{
	var c:Char='a'  // 지역변수니까 초기값을 설정해 주어야 한다
	if(a>90)
		c='A'
	else if(a>80)
		c='B'
	else if(a>70)
		c='C'
	else if(a>60)
		c='D'
	else
		c='F'
  	
	return c
}

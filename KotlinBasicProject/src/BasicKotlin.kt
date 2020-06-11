/*
    Kotlin 
 	=========
 
 	데이터형
 		1) 숫자형
 			정수
 				Byte = 1byte = 8bit
 				Short = 2byte = 16bit
 				Int	= 4byte = 32bit
 				Long = 8byte = 64bit
 			실수
 				Double = 64bit
 				Float = 32bit
 		2) 문자형
 			문자:Char => '' 
 			문자열:String => ""
 		3) 논리형
 				Boolean : true / false
 		
 	변수 설정
 		=> 상수 : val
 		=> 변수 : var
 					ex) 자바   int a=10;
   						     final int b=20 ;
       				    코틀린    var a=10 | var a:Int=10
 							 val b=20 | val b:Int=20    --> var a =10.5  (Double) var b=false (Boolean)
 		#배열 ★★★★★
 			String[] names={"","",""};
 			val numbers:Array<Int>=arrayOf(1,2,3,4,5)
 			=> number[0]... 
 	연산자
 		= 산술연산자 (+ _ * / %)
 		= 비교연산자 ( == != < > <= >=)
 	 	= 논리연산자 ( && ||)
 		= 대입연산자 ( = )
 	
 	제어문 kotlin 3~5   - if / for / when  (조건문 / 반복문)
 	함수   kotlin 7  
 	클래스 kotlin 8  - ( 오버라이드 / 상속 )
 	인터페이스 kotlin 9
 */
// 함수
// public static void main(String[] args)
fun main(args:Array<String>)
{
	val a:Int=100
	var b=200
	var c:Int 
	c=300
	// "a="+a.... 
	println("a=$a,b=$b,c=$c")
	
	var s:String="Hello Kotlin"
	var cc='A'
	var d=10.5
	var bb=true
	var f:Float=10.5f
	
	println("s=$s,cc=$cc,d=$d,bb=$bb,f=$f")
}

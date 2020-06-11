/*
 	[ 함수 만들 때 주의 ]
  	= 리턴형 X
 		fun 함수명(매개변수){} -> void
    = 리턴형
 		fun 함수명(매개변수):데이터형{}  
 
 */
 import java.util.*
fun main(args:Array<String>)
{
	//whileTest2()
	 doWhileTest()
}
fun whileTest()
{
	var i=1
	while(i<=10)
		{
			println("i=$i")
			i++
		}
}
fun whileTest2()
{
	var scan=Scanner(System.`in`)   // ESC 아래 버튼 (`)
	print("정수 입력:")
	var j=scan.nextInt()
	var i=1
	while(i<10)
		{
			println("$j * $i ="+(i*j))
			i++
		}
}
 
 fun doWhileTest()
 {
	 var i=1
	 do
	 {
		 println("i=$i")
		 i++
	}while(i<=10)
}
/*
 	[ �Լ� ���� �� ���� ]
  	= ������ X
 		fun �Լ���(�Ű�����){} -> void
    = ������
 		fun �Լ���(�Ű�����):��������{}  
 
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
	var scan=Scanner(System.`in`)   // ESC �Ʒ� ��ư (`)
	print("���� �Է�:")
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
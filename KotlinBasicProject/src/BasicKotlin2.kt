/*
 		��Ʋ�� Ư��
 		=================================
 		1) ���� Ÿ�� ���� ��� var a:Int=10, var a=10
 		2) ������, �ǿ�����, ������ ==> �ڹ�(JVM)
 		3)  ��ȣ��� (=ȣȯ�� ����)
 */
import java.util.*
// if, when(=switch case), for, while
fun main(args:Array<String>)
{
	var score=85
	var jumsu=hakjum(score)
	println("score=$score,  jumsu=$jumsu ����")
}
/*
 		fun �Լ���(�Ű�����...) 					===> void �Լ���(�Ű�����)
 		fun �Լ���(�Ű�����...) : �������� ===> �������� �����ϴ� �Լ�
 	
 		if ���ǹ�
 		= if(����)
 		= if(����) else
 		= if(����) else if(����2) else 
 */
fun max(a:Int,b:Int):Int // (�Ű�����1, �Ű�����2) : ������ 
{
	var c:Int 								// ����
	if(a>b)
		c=a
	else
		c=b
	return c
}
// �������� �ִ� �Լ��� �ΰ��� �������
fun max1(a:Int,b:Int):Int=if(a>b) a else b
fun max2(a:Int,b:Int)=if(a>b) a else b
// �Լ��� ������ ���� ������ �����ϰ� �ϴ� ����

fun hakjum(a:Int):Char
{
	var c:Char='a'  // ���������ϱ� �ʱⰪ�� ������ �־�� �Ѵ�
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

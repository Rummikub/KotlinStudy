//when  <== switch case
fun main(args:Array<String>)
{
//	var sex=3
//	var s=sexCheck(sex)
//	println("sex=$s")
	var i=3
   numberSelect(i)
}

fun sexCheck(sex:Int):String
{
	var s:String=""
	when(sex)
	{
		1->s="����"
		2->s="����"
		3->s="����"
		4->s="����"
	}
	return s
}

fun numberSelect(a:Int)
{
	when(a)
	{
		1->println("1�� ������")
	    2,3->println("2��3�� ������")
		in 4..7->println("4~7���� ���õ�")
		8,9 ->println("8Ȥ�� 9���õ�")
		!in 1..7->println("8�ϰ� 9�� ���õ�")
	}
		
}
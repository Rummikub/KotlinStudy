// ���
// ������� �� ���� �׾��� �Ķ�����! 
open class Saram{													//<<<����� �����ִ� Ŭ�������� open ����� ��
		var name:String=""
		var sex:String=""
		var addr:String=""
	
	    open  fun myData(){								        //<<< ������ ����� ������ Ŭ������ open   
				println("Saram:myData() Call......................................")
		}
}
class Member:Saram()
{
			fun dataPrint()
			{
						name="ȫ�浿"
						sex="����"
						addr="����"
			}
				
			override fun myData()  							//<<<  ������					open ~~ override
			{
				 println("Member:myData() Call..................................")
			}
			
}

fun main(args:Array<String>){
		var mem:Member=Member();
	    mem.dataPrint()
	    println(mem.name)
	    println(mem.sex)
	    println(mem.addr)
	    mem.myData()
}
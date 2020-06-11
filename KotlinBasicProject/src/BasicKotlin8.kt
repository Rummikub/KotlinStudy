// 상속
// 멤버변수 는 밑줄 그어진 파란색임! 
open class Saram{													//<<<상속을 내려주는 클래스에서 open 써줘야 함
		var name:String=""
		var sex:String=""
		var addr:String=""
	
	    open  fun myData(){								        //<<< 재정의 상수를 내리는 클래스도 open   
				println("Saram:myData() Call......................................")
		}
}
class Member:Saram()
{
			fun dataPrint()
			{
						name="홍길동"
						sex="남자"
						addr="서울"
			}
				
			override fun myData()  							//<<<  재정의					open ~~ override
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
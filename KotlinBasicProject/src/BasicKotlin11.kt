class AA {
	
	val a:String?=null 			// String초기값 줄 때 형식 
	val b:String=""
	val c:BB?=null 					//  특히 클래스 객체 초기화 할 때 null을 넣어줘야 됨
}
class BB{

}
fun main(args:Array<String>)
{
		val foods:List<String> = listOf("사과","배","수박")		// 여기 한칸 안 띄면 비교연산자 인줄...
	    for(f in foods)
		{
			println(f)
		}
	
		val foods2=mutableListOf("밥","국수","라면");    // 데이터형 생략해도 됨  + 동적인 메모리! mutableListOf()
		foods2.add("떡")
		foods2.removeAt(0)														// 0번째 글짜 지우기
		foods2[1]="생선"																	// ArrayList와 같은 기능  ( 라면 => 생선)
		for(f in foods2){
			println(f)
		}
}


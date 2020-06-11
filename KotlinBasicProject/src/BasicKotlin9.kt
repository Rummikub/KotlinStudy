interface Runable{
	fun run()										// 자동으로 open이 붙음 - 인터페이스는 구현되지 않은 함수 - 즉, 메모리 할당을 할 수 없음
	// ★★★ DEFAULT 함수 = 인터페이스에서 구현을 할수 있는 함수를 일컬음
	fun test(){
		println("Runable Test Call....................................................")
	}
}
class Human:Runable{
	
	override fun run(){
		println("Human:run() Call.........................................................")
	}

}

// 안쓰는 함수는 override 안써도 됨 . @Override Mouseclick(){}...  이런 Swing썼을때 쓰지도 않는데 다 재정의 함수가 생겨야 됐던 것에 비해 훨씬 간편해짐 
class Human2:Runable{
		override fun run(){
			println("Huma2n:run() Call.........................................................")
		}
}

fun main(args:Array<String>)
{
	var h=Human()
	h.run()
	h.test()
}
interface Runable{
	fun run()										// �ڵ����� open�� ���� - �������̽��� �������� ���� �Լ� - ��, �޸� �Ҵ��� �� �� ����
	// �ڡڡ� DEFAULT �Լ� = �������̽����� ������ �Ҽ� �ִ� �Լ��� ������
	fun test(){
		println("Runable Test Call....................................................")
	}
}
class Human:Runable{
	
	override fun run(){
		println("Human:run() Call.........................................................")
	}

}

// �Ⱦ��� �Լ��� override �Ƚᵵ �� . @Override Mouseclick(){}...  �̷� Swing������ ������ �ʴµ� �� ������ �Լ��� ���ܾ� �ƴ� �Ϳ� ���� �ξ� �������� 
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
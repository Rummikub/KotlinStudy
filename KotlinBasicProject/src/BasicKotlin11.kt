class AA {
	
	val a:String?=null 			// String�ʱⰪ �� �� ���� 
	val b:String=""
	val c:BB?=null 					//  Ư�� Ŭ���� ��ü �ʱ�ȭ �� �� null�� �־���� ��
}
class BB{

}
fun main(args:Array<String>)
{
		val foods:List<String> = listOf("���","��","����")		// ���� ��ĭ �� ��� �񱳿����� ����...
	    for(f in foods)
		{
			println(f)
		}
	
		val foods2=mutableListOf("��","����","���");    // �������� �����ص� ��  + ������ �޸�! mutableListOf()
		foods2.add("��")
		foods2.removeAt(0)														// 0��° ��¥ �����
		foods2[1]="����"																	// ArrayList�� ���� ���  ( ��� => ����)
		for(f in foods2){
			println(f)
		}
}


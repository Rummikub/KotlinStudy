/*
 		������ ��� (function) -> ��ü���� ��� (class)
 		
 		1) Ŭ���� ����
 			= �Ű������� ���� ���
 				public class A
 				{
					 public A(){}
				}
 				A a = new A();
 
 >>in Kotlin		=>�ڹٴ� ��ü ������ new�� ���������,  ��Ʋ���� ��� X
 				class A
 				{
		
				}
 				val a=A()
 				List<String> list=new ArrayList<String>
 				=> var list=ArrayList<String>()
 			
 			=�Ű������� �����ϴ� ���
 				 class A(var name:String){}
 				 ȣ��) var a=A("")
 				- > direct�� �����ڿ� ���� �־���
 			=�Ű������� �����ϴ� ��� 2
 				class A
				{
					constructor(name:String) { }
				} -> ���� ����� ���� ������ ���� �־��ش�
 
 		 2) ��ü ����
 				var a=A("")
 			
 		3) ��������� �ʱ�ȭ
 			 = �ʱ⿡ ��������� �����ְ� get/setó��;
 				public class Sawon
 				{
						private String name
 						private String dept
 						private String job
 						public Sawon(String name,String dept,String job) {
								this.name=name
 								this.dept=dept
 								this.job=job
						}
 						=> getter, setter
				}

 				= ��������� �Ű������� �޾Ƽ� ó��
  				class Sawon(var name:String, var dept:String, var job:String){
												-> �������, . �� ������ �����ٰ� ����� �� ����
				} var s: Sawon("ȫ�浿","���ߺ�","���")
 				s.name="��û��"
   				s.dept=""
  				s.job=""
 				
 			* ���������� *
 					public  :  ��� Ŭ������ ���� ���� (���� ����) ~ !  �̰� �ڹٶ� �ٸ� ��...
						var a:String=""
  					private :  �ڽ��� Ŭ���������� ��� ����
 					protected : ��ӹ��� Ŭ�������� ��� ����
 			��		internal     ?? =>  default ( ���� ���� (���) �ȿ� �����ϴ� Ŭ�������� ��� ��� ����)
 		4) VO ����
 		5) �������̵�, ���
 	*/
class Sawon
{		// ȣ�� X, �ܼ� ��� O  --  ����������!!!!!!!
		constructor(name:String,dept:String,job:String)
		{
			println("�̸�: "+name)
			println("�μ�: $dept")
			println("����: $job")
		}
}
class Sawon2( var name:String, var dept:String, var job:String)
{
		// Member����!!!!�� ����༭ ���� ȣ�� ������    --  �����ڸ� �̿��ϴ� ��� ( ��������� ������� ���Ѵٴ� ����)
}
class Sawon3
{
	var name:String=""
	var dept:String=""				// ��ü�� public �� ����� ���´� (������ �����ϱ� ����)
	var job:String=""
}

// Main[]�� Class�ۿ� ��ġ -- C����� Ư¡�̱���   �׳��� ������.... �̹��б� ���� ���Ƹ�����

fun main(args:Array<String>)
{
	var sa:Sawon=Sawon("ȫ�浿","���ߺ�","���")
	
	var sa2=Sawon2("��û��","���ߺ�","����")
	println("�̸�: "+sa2.name)
	println("�μ�: "+sa2.dept)
	println("����: "+sa2.job)
	
	var sa3=Sawon3()
	sa3.name="������"
	sa3.dept="�λ��"
	sa3.job="����"
	println("�̸�: "+sa3.name)
	println("�μ�: "+sa3.dept)
	println("����: "+sa3.job)			
}
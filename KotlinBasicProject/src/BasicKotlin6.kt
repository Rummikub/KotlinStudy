import java.util.*
// Kotlin�� java�� ���̺귯���� �ʿ�ø��� ������� ��밡��
fun main(args:Array<String>){
	var com=((Math.random()*100)+1).toInt()
	println("com=$com")
	
	var temp=(Math.random()*10)+1
	var com1=temp.toInt()  // ����ȯ
	println("com1=$com1")
	// ����ȯ toDouble() toString()
	
	 var scan=Scanner(System.`in`)
	while(true){
		print("1~100������ ������ �Է��϶�")
		var i=scan.nextInt()
			if(i<0 || i>100)
			{
				println("1���� 100 ������ ������ �ٽ� �Է��϶�")
				continue
			}
		
			if(i<com)
			{
					println("�Է°����� ū ���� �Է��϶�")
			}else if(i>com)
			{
					println("�Է°����� ���� ���� �Է��϶�")
			}else{
					println("Game Over")
					break
		}
	}
}
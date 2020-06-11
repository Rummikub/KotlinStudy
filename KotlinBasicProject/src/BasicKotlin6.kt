import java.util.*
// Kotlin은 java의 라이브러리를 필요시마다 변경없이 사용가능
fun main(args:Array<String>){
	var com=((Math.random()*100)+1).toInt()
	println("com=$com")
	
	var temp=(Math.random()*10)+1
	var com1=temp.toInt()  // 형변환
	println("com1=$com1")
	// 형변환 toDouble() toString()
	
	 var scan=Scanner(System.`in`)
	while(true){
		print("1~100까지의 정수를 입력하라")
		var i=scan.nextInt()
			if(i<0 || i>100)
			{
				println("1에서 100 사이의 정수를 다시 입력하라")
				continue
			}
		
			if(i<com)
			{
					println("입력값보다 큰 값을 입력하라")
			}else if(i>com)
			{
					println("입력값보다 작은 값을 입력하라")
			}else{
					println("Game Over")
					break
		}
	}
}
fun  main(args:Array<String>)
{
	forTest1()
	println("=====2=====")
	forTest2()
	println("****3****")
	forTest3()
	println("-------4-----")
	forTest4()
	println("-------5-----")
	forTest5()
}

// for
fun forTest1()
{
	for(i in 1..10)
			println("i=$i")	
}
// >10
fun forTest2()
{
		for(i in 1 until(10))
			println("i=$i")
}
// +2
fun forTest3()
{
		for(i in 1..10 step 2)
			println("i=$i")
}
// 감소하는 함수 안됨!
fun forTest4()
{
		// for(i in 10..1) ==> X
    	for(i in 10 downTo(1))
			println("i=$i")
}
//forEach => Array
fun forTest5()
{
	var names=arrayOf("홍길동","심청이","박문수","김두한","춘향이")
	for(item  in names)
	{
			println(item)
	}
}
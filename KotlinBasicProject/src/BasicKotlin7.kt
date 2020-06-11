/*
 		절차적 언어 (function) -> 객체지향 언어 (class)
 		
 		1) 클래스 선언
 			= 매개변수가 없는 경우
 				public class A
 				{
					 public A(){}
				}
 				A a = new A();
 
 >>in Kotlin		=>자바는 객체 생성시 new를 사용하지만,  코틀린은 사용 X
 				class A
 				{
		
				}
 				val a=A()
 				List<String> list=new ArrayList<String>
 				=> var list=ArrayList<String>()
 			
 			=매개변수가 존재하는 경우
 				 class A(var name:String){}
 				 호출) var a=A("")
 				- > direct로 생성자에 값을 넣어줌
 			=매개변수가 존재하는 경우 2
 				class A
				{
					constructor(name:String) { }
				} -> 따로 블록을 빼서 생성자 값을 넣어준다
 
 		 2) 객체 생성
 				var a=A("")
 			
 		3) 멤버변수의 초기화
 			 = 초기에 멤버변수를 정해주고 get/set처리;
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

 				= 멤버변수를 매개변수로 받아서 처리
  				class Sawon(var name:String, var dept:String, var job:String){
												-> 멤버변수, . 만 찍으면 가져다가 사용할 수 있음
				} var s: Sawon("홍길동","개발부","사원")
 				s.name="심청이"
   				s.dept=""
  				s.job=""
 				
 			* 접근지정어 *
 					public  :  모든 클래스에 접근 가능 (생략 가능) ~ !  이게 자바랑 다른 점...
						var a:String=""
  					private :  자신의 클래스에서만 사용 가능
 					protected : 상속받은 클래스까지 사용 가능
 			★		internal     ?? =>  default ( 같은 폴더 (모듈) 안에 존재하는 클래스에서 모두 사용 가능)
 		4) VO 생성
 		5) 오버라이딩, 상속
 	*/
class Sawon
{		// 호출 X, 단순 출력 O  --  지역변수임!!!!!!!
		constructor(name:String,dept:String,job:String)
		{
			println("이름: "+name)
			println("부서: $dept")
			println("직위: $job")
		}
}
class Sawon2( var name:String, var dept:String, var job:String)
{
		// Member변수!!!!를 잡아줘서 변수 호출 가능함    --  생성자를 이용하는 방법 ( 접근지정어를 사용하지 못한다는 단점)
}
class Sawon3
{
	var name:String=""
	var dept:String=""				// 전체에 public 이 선언된 상태다 (생략이 가능하기 때문)
	var job:String=""
}

// Main[]이 Class밖에 위치 -- C언어적 특징이구나   그놈의 포인터.... 이번학기 학점 말아먹은듯

fun main(args:Array<String>)
{
	var sa:Sawon=Sawon("홍길동","개발부","사원")
	
	var sa2=Sawon2("심청이","개발부","과장")
	println("이름: "+sa2.name)
	println("부서: "+sa2.dept)
	println("직위: "+sa2.job)
	
	var sa3=Sawon3()
	sa3.name="춘향이"
	sa3.dept="인사부"
	sa3.job="부장"
	println("이름: "+sa3.name)
	println("부서: "+sa3.dept)
	println("직위: "+sa3.job)			
}
package com.sist.mykotlinapplication
/*
       1) 변수
           val : 상수형 변수(final)
           var : 변수 => 변경이 가능한 상태
                 => 자동 지정변수
           var a : String
           var b : Int
           var c : Array<String>
           =======> 간결성
           var a="" ~ a:String으로 인식
           var b=10 ~ b:Int로 인식
           var c=arrayOf("","","") ==> c:Array<String>으로 자동 인식
       2) 제어문
            if() ~ if~else  ~ if~else~   if~else if~ else
            while(조건), do~while
            when <-- switch~case
            for (i in 1..9 step 2)
            for (i in 1..until(9))
            for (item in list)
       3) 연산자
           =산술연산자, 비교연산자 (** 문자열 비교 (==)) , 논리연산자 ,단항연산자 , 대입연산자 (=)
       4) 함수 ==> 반복을 제거, 재사용, 한가지 기능만 수행할 수 있음
           fun 함수명(매개변수...):리턴데이터형 ==> (a:Int,b:String)
           {
           }
           fun 함수명(매개변수...):Int ==> (a:Int,b:String)
           {
           }
       5) 클래스 : 상속, 인터페이스
           상속 내리는 클래스 : open class A
           상속 받는 클래스 : class B:A() ==> 오버라이딩 ==> open fun
           ==> data class A(var a:Int); ==> VO
       6) 안드로이드 라이브러리
       7) 화면디자인
 */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        // 데이터를 받는다
        val height=intent.getStringExtra("height").toInt();
        // 전송 => 문자열 => 전송을 받은 후엔 원하는 데이터형 변환
        val weight=intent.getStringExtra("weight").toInt();
        val result=weight/Math.pow(height/100.0,2.0); // 소수점 반올림
        when{
            result>=35 -> resulttextView.text="고도비만"
            result>=30 -> resulttextView.text="중도비만"
            result>=25 -> resulttextView.text="경도비만"
            result>=20 -> resulttextView.text="과체중"
            result>=18.5 -> resulttextView.text="정상"
            else -> resulttextView.text="저체중"
        }
        Toast.makeText(this,"height:$height,weight:$weight,결과:$result", Toast.LENGTH_LONG).show();

    }
}
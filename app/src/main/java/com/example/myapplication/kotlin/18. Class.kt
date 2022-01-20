package com.example.myapplication.kotlin


// 18. Class

// OOP -> Object Oriented Programing (객체지향 프로그래밍)

// 객체
// - 이름이 있는 모든 것

// 절차지향 프로그래밍
// - 코드를 위에서 부터 아래로 실행을 하면 문제가 해결된다!

// 객체지향 프로그래밍 문제 해결 방법
// - 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다
// - 선수, 심판, 경기장, 관중 -> 축구게임

// 객체를 만드는 방법
// - 설명서가 있어야 합니다.

fun main(array: Array<String>) {

    //클래스(설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "big")

    val bigCar = Car("v8 engine", "big")

    // 우리가 만드 클래스(설명서)는 자료형이 된다
    val bigCar1: Car = Car("v8 engine", "big")
    val SuperCar: SuperCar = SuperCar("good engine", "big", "white")

    // 인스턴스가 가지고 있는 기능을 사용하는 방법
    val runableCar: RunableCar = RunableCar("simple engine", "short body")
    runableCar.ride()
    runableCar.navi("구로구청")
    runableCar.Drive()

    // 인스턴스의 멤버 변수에 접근 하는 방법
    val runableCar2: RunableCar2 = RunableCar2("nice engine", "long body")
    println(runableCar2.body)
    println(runableCar2.engine)
}

// 클래스(설명서) 만드는 방법 (1)
class Car(var engine: String, var body: String) {

}

// 클래스(설명서) 만드는 방법(2)
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
//        println(engine)
//        println(body)
//        println(door)
        this.engine = engine
        this.body = body
        this.door = door
    }

}

// 클래스(설명서) 만드는 방법(3) -> 1번 방법의 확장
class Car1(engine: String, body: String) {
    var door: String = ""

    //생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

//클래스(설명서) 만드는 방법(4) -> 2번 방법의 확장
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}


class RunableCar(engine: String,body: String) {

    fun ride() {
        println("탑승 하였습니다")
    }

    fun Drive(){
        println("달립니다")
    }

    fun navi(destination: String){
        println("$destination 으로 목적지가 설정되었습니다")
    }
}

class RunableCar2{
    // 멤버 변수(부속품)
    var engine: String = ""
    var body: String = ""

    // 생성자(조립 방법)
    constructor(engine: String,body: String){
        this.engine = engine
        this.body = body
    }


    init {
        // 인스턴스화 될 때 가장 먼저 호출 되는 것
        // 초기 셋팅을 할 때
        println("RunableCar2가 만들어 졌습니다")
    }

    // 기능
    fun ride() {
        println("탑승 하였습니다")
    }

    fun Drive(){
        println("달립니다")
    }

    fun navi(destination: String){
        println("$destination 으로 목적지가 설정되었습니다")
    }
}
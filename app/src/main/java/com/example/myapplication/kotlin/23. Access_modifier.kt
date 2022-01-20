package com.example.myapplication.kotlin

/// 23. 접근 제어자

fun main(array: Array<String>) {

    val testAccess: TestAccess = TestAccess("아무개")

    // Private 키워드 때문에 외부에서 더 이상 사용할 수 없다.
    // 내부에서 사용 가능 (외부와 내부를 단절)
//    testAccess.test()
//    println(testAccess.name)
//    testAccess.name = "아무개 투"
//    println(testAccess.name)

    var reward : Reward = Reward()
//    reward.rewardAmount = 2000

    val runningCar : RunningCar = RunningCar()
    runningCar.runFast()
//    runningCar.run


}

class Reward() {
    private var rewardAmount: Int = 1000
}

class TestAccess {
    private var name: String = "홍길동"

    constructor(name: String) {
        this.name = name
    }

    fun changeName(newName: String){
        this.name = newName
    }

    private fun test(){
        println("테스트")
    }
}

class RunningCar(){

    fun runFast(){

    }

    private fun run() {

    }
}
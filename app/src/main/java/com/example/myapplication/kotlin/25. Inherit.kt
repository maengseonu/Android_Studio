package com.example.myapplication.kotlin

//두번까지는 봐준다
//두번 이상 넘어가면 리펙토링 해라

// 25. 상속
//부모로부터 설명서를 물려받는다

fun main(array: Array<String>) {
    val superCar100: SuperCar100 = SuperCar100()
    println(superCar100.drive())
    superCar100.stop()

    val bus100: Bus100 = Bus100()
//    bus100.drive()


}

// 부모 : Car 100
// 자식 : SuperCar100
open class Car100() {
    open fun drive():String {
        return "달린다"
//        println("달린다")
    }

    fun stop() {

    }

}

// 상속
class SuperCar100() : Car100() {
    override fun drive(): String {
        val run = super.drive()
        return "빨리 $run"
    }
}


class Bus100(): Car100() {

}
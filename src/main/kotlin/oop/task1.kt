package main.kotlin.oop

fun main() {
    val xiaomiA32=Phone("38094676426", "Xiaomi", 345)
    val samsunA72=Phone("38094676426", "Samsung", 345)
    val xiaomiX10Pro=Phone("38094676426", "Xiaomi", 345)
    xiaomiA32.print()
    xiaomiA32.print()
    xiaomiX10Pro.print()
    xiaomiA32.receiveCall("Petro")
    samsunA72.receiveCall("Ivan", "0962384598")
    samsunA72.sendMessage("0472550055")
    println(xiaomiA32.number)
}

class Phone(var number:String, var model:String, var weight:Int) {

    fun print(){
        println("Номер ${number.toString()}, Модель ${model.toString()}, Вага ${weight.toString()}")}
    fun receiveCall(nameCaller: String) {
        println("Звонит $nameCaller")
    }
    fun receiveCall(nameCaller:String, numberCaller:String){
        println("Звонит $nameCaller, номер $numberCaller")
    }
    fun sendMessage(numberCaller:String){
        println("Отправлено сообщение на номер $numberCaller")
    }

    constructor (_number: String, _model: String):this(_number, _model, 0){
        this.number=_number
        this.model=_model
        this.weight=0
    }

    constructor ():this("-", "-", 0){
        this.number="-"
        this.model="-"
        this.weight=0
    }
}
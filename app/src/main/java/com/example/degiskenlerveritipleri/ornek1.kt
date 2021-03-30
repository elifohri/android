package com.example.degiskenlerveritipleri

import java.lang.Exception
import java.util.*

fun main() {

    var ogrenciAdi = "ahmet"
    var ogranciYas = 23
    var ogrenciBoy = 1.98
    var ogrenciBasHarf = 'a'

    println(ogrenciAdi)
    println(ogranciYas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)

    var urun_id:Int = 3416
    var urun_ad:String = "Kol Saati"
    var urun_adet:Int = 100
    var urun_fiyat:Double = 109.99
    var urun_tedarikci:String = "rolex"

    println(urun_id)
    println(urun_ad)
    println(urun_adet)
    println(urun_fiyat)
    println(urun_tedarikci)

    println("Deneme1")
    print("Deneme2")
    println("Deneme3")

    println("$urun_tedarikci marka $urun_ad $urun_fiyat fiyatla satılmaktadır. Stokta $urun_adet adet kalmıştır.")

    var a = 10
    var b = 20

    println("$a ve $b nin toplamı : ${a+b}")

    var sayi1 = 10
    val pi = 3.14   //değişmeyen sabitler val ile tanımlanır

    // Type Casting
    // Yöntem1

    var yazi1 = "34t"

    try{
        var x = yazi1.toInt()
        println(x)
    }catch (e:Exception){
        println("Dönüşümde hata var!")
    }

    // Yöntem2

    var yazi2 = "48.56"
    var y = yazi2.toDoubleOrNull()

    if(y != null) {
        println("y: $y")
    }else{
        println("Dönüşümde hata var")
    }

    // Yöntem3

    var yazi3 = "67"

    var z = yazi3.toIntOrNull()

    z?.let {
        print("z: $z")      // int'e ceviremezse hiçbir işlem yapmaz ama hata da vermez
    }

    println("Adınızı giriniz:")
    val girdi = Scanner(System.`in`)
    val ad = girdi.next()
  //  val sayi4 = girdi.nextInt()
    println("Adınız: $ad")


}
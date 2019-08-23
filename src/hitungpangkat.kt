import java.util.*

fun main(args : Array<String>)  {

    pangkatBulat()
}
fun pangkatBulat (){
    var scan = Scanner(System.`in`)
    println("masukkan nilai")
    var nilai = scan.nextInt()
    println("masukkan jumlah")
    var jumlah = scan.nextInt()
    var a=1;
    for(p in 1..jumlah) {
        a = a * nilai
    }
    println("hasil nilai" +a)
}
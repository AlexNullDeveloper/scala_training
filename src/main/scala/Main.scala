object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world")

    val number = 4
    val str = "1.0"
    println(number + str)

    val answer = 40 * 2 / 4
    println(answer.getClass.getCanonicalName)

    var counter = 0
    while (counter < 5) {
      println(counter)
      counter += 1
    }

    val xMax, yMax = 100
    var greeting, message : String = null

    println(1.toString.contains("1"))

    val inclusive = 1.to(10)
    println(inclusive.getClass) //scala.collection.immutable.Range$Inclusive

    val unit = "99.44".toDouble
    println(unit + 0.01)


    val a = 1
    val b = 2
    //то же самое, что и a+b
    println(a.+(b))


    println("Hello".intersect("World")) //lo

    println("zyx".sorted)

    println("Bonjour".sorted)

    //операторы это методы

    println("Hello"(4))


    //TODO посмотреть RichInt, RichDouble, StringOps


  }
}
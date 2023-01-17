object ListExample extends App{

  val numberList = List(12, 32, 42, 11, 9, 38)

  val div = numberList.reduce((x, y) => x  - y)
  println(div)

  val exponentiation = numberList.map(x => scala.math.pow(x,3))
  println(exponentiation)

  val findNumb = numberList.find(x => {x == 12})
  println(findNumb)

  val groups = numberList.groupBy(x => x%10)
  println(groups)
  println(groups(2))

  val randomName = "Vasya"
  val sayHello: String => String = x => s"Hello, ${x}"
  println(sayHello(randomName))

  val fibs: LazyList[Int] =
    0 #:: 1 #::
      fibs.zip(fibs.tail).map { n =>
        n._1 + n._2
      }
  fibs.take(5).foreach(println)
  fibs.take(6).foreach(println)

}

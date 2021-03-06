/**
 * > soultion1 
 * input : I am a boy
 * output : boy a am I
 * 
 * > soultion2
 * input : I am a boy
 * output : yob a ma I
 */
object solution12 {
  def main(args: Array[String]): Unit = {
    val inputString = scala.io.StdIn.readLine
    println("input : " + inputString)

    println("solution1 : " + solution1(inputString))
    println("solution2 : " + solution2(inputString))
  }

  def solution1(inputString: String) = {
    inputString.split(" ").reverse.mkString(" ")
  }

  def solution2(inputString: String): String = {
    val result = for (s <- inputString.split(" ").reverse)
      yield s.reverse
    result.mkString(" ")
  }
}

/**
 * > 교집합 
 * input : [A, B, C, D], [C, D, E, F]
 * output : [C, D]
 */
object solution3 {
  def main(args: Array[String]) {
    val a = List("A", "B", "C", "D")
    val b = List("C", "D", "E", "F")

    var map = scala.collection.mutable.Map.empty[String, Int]
    for(s <- a) {
      map(s) = 1
    }
    for(s <- b) {
      if(map.contains(s))
        map(s) += 1;
    }

    println(map.filter(_._2 > 1).keys.mkString(" "))
  }
}

/**
 * [23, 32, 3, 9 , 40] 원소의 값을 조합해서 가장 큰 정수를 리턴하시오.
 * output : 94033223 
 */



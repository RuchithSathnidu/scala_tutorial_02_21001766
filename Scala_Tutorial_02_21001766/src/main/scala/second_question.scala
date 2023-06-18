object second_question {
  def main(args: Array[String]): Unit = {
    var a:Int = 2
    var b:Int = 3
    var c:Int = 4
    var d:Int = 5
    var k:Double = 4.3
    var g:Double = 5

      println("--b*a+c*d-- = " + ((b-1)*a+c*(d-1)));
      println("a++ = " + (a+1));
      println("–2*(g–k)+c = " + (-2*(g-k)+c));
      println("c=c++ = " + (c+1));
      c=c+1;
      println("c=++c*a++ = " + ((c+1)*(a+1)));
      c=((c+1)*(a+1))

  }

}

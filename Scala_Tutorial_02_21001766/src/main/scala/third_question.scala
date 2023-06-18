object third_question {
  def main(args: Array[String]): Unit = {
       var salary:Double = take_home_salary(40,30)
       println("The salary = " + salary)
  }

   def normal_h(nh:Double):Double = nh*250
   def ot_h(oh:Double):Double = oh*85
   def tax(w_s:Double):Double = w_s*0.12
   def take_home_salary(nh:Double, oh:Double):Double = normal_h(nh) + ot_h(oh) - tax(normal_h(nh) + ot_h(oh))

}

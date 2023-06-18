object fourth_question {
     def main(args: Array[String]): Unit = {
         var price:Double = 15
         var pro:Double = profit(price)
         println("when the ticket price is " + price + " the profit is " + pro)
     }

     def attendance (price:Double):Double = {
          if(price<15){
               (((15-price)*4)+120)
          }else{
               ((120-(price-15)*4))
          }
     }
     def income (price:Double):Double = attendance(price)*price

     def cost (price:Double):Double = 500 + attendance(price)*3

     def profit (price:Double):Double = income(price) - cost(price)

}

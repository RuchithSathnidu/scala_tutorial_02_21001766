object fourth_question {
     def main(args: Array[String]): Unit = {
         var price:Double = 6
         var max:Double = 0
         var pro: Double = 0

       do {
         max=pro
         price=price+1
         pro = profit(price)
         println("when the ticket price is " + price + " the profit is " + pro)
       } while (max<=pro)

       println()
       println("when the ticket price is " + (price-1) + " the owner can get the highest profit and the highest profit is " + max)
       println("Andin that case " + attendance(price-1) +" people attend a performance")
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

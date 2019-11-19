
/**
 * Here I test the methods of the the SalesTax Class.
 *
 * @author (Lane Humphreys)
 * @version (09/19/19)
 */
public class SalesTaxTester
{
   public static void main(String[]args )
   {
       // here i created the sales tax object
       SalesTax ten = new SalesTax();
       // here i printed the sales tax percentage
       System.out.println("The Sales Tax is 10%");
       // here i called the calculate sales tax method
       ten.calculateSalesTax(59.99);
       // here i called the totalcost method
       ten.totalCost();
       //here i assigned the total cost as a variable to the word cost
       double cost = ten.getTotalCost();
       // in the next two lines i just printed the information
       System.out.println("The total cost with tax is $" + cost);
       System.out.println("Expected: $65.989");

       
       
       
       
               
              
   }
}

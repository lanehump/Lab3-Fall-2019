
/**
 * Here I wrote methods to use in the sales tax tester class.
 * 
 * @author (Lane Humphreys) 
 * @version (09/19/19)
 */
public class SalesTax
{
    /**
     * here i created every instance variable
     */
    private double tax;
    private double purchasePrice;
    private double taxDue;
    private double totalCost;
    //here i created the SalesTax class and set it to zero
    public SalesTax()
    {
        tax = 0.1;
    }
    //here i set up the calculation for the tax rate
    public SalesTax(double rate)
    {
        tax = (rate / 100);
    }
    // here i created the method to calculate the tax due with the purchse amount
    public void calculateSalesTax(double purchase)
    {
        purchasePrice = purchase;
        taxDue = purchase * tax;
    }
    // here i set the method to get the total cost
    public void totalCost()
    {
        totalCost = purchasePrice + taxDue;
    }
    // here is the method that returns the total cost
    public double getTotalCost()
    {
        return totalCost;
    }
    
}

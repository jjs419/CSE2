//Jay Scudder
//Homework 2 Arithmetic
//February 8th 2016

//define class

    public class Arithmetic {
        //main method
        
        public static void main (String[] args) {
                
                //input variables
                //number of pairs of pants
                    int numPants = 3; 
                //cost per pair of pants
                    double pantsPrice = 34.98;
                //number of sweatshirts
                    int numShirts = 2;
                //cost per shirt
                    double shirtPrice = 24.99;
                //number of belts
                    int numBelts = 1;
                //cost per box of envelopes
                    double beltPrice = 33.99;
                //tax rate
                    double paSalesTax = 0.06;
                    
                //sales totals
                
                    double totalCostPants = numPants*pantsPrice; //totalCostPants is the # of pants times the price of each pair
                    double totalCostShirts = numShirts*shirtPrice; //total cost of shirts
                    double totalCostBelts = numBelts*beltPrice; //total cost of belts
                    double taxPants = totalCostPants*paSalesTax; //amount of tax charged on the sale of pants
                    double taxShirts = totalCostShirts*paSalesTax; //amount of tax charged on the sale of shirts
                    double taxBelts = totalCostBelts*paSalesTax; //amount of tax charged on the sale of belts
                    double totalNoTax = totalCostBelts+totalCostPants+totalCostShirts; //total cost of all purchases before tax
                    double totalSalesTax = taxBelts+taxPants+taxShirts; //the total amount of sales tax charged on all purchases
                    double totalWithTax = totalNoTax+totalSalesTax; //the final amount owed
                    
                //Converting values to numbers that make sense
                    //To change the total costs into numbers which only have two places after the decimal,
                    //I am going to multiply the value by 100, change it to an integer, then divide by 100
                    
                    double corrTotalCostPants = totalCostPants*100; //here "corr" stands for "corrected"
                    int intTotalCostPants = (int) corrTotalCostPants; //converting the multiplied value to an integer
                    double finTotalCostPants = intTotalCostPants/100.0; //here "fin" means "final"
                    
                    double corrTotalCostShirts = totalCostShirts*100;
                    int intTotalCostShirts = (int) corrTotalCostShirts;
                    double finTotalCostShirts = intTotalCostShirts/100.0;
                    
                    double corrTotalCostBelts = totalCostBelts*100;
                    int intTotalCostBelts = (int) corrTotalCostBelts;
                    double finTotalCostBelts = intTotalCostBelts/100.0;
                    
                    double corrTaxPants = taxPants*100;
                    int intTaxPants = (int) corrTaxPants;
                    double finTaxPants = intTaxPants/100.0;
                    
                    double corrTaxShirts = taxShirts*100;
                    int intTaxShirts = (int) corrTaxShirts;
                    double finTaxShirts = intTaxShirts/100.0;
                    
                    double corrTaxBelts = taxBelts*100;
                    int intTaxBelts = (int) corrTaxBelts;
                    double finTaxBelts = intTaxBelts/100.0;
                    
                    double corrTotalNoTax = totalNoTax*100;
                    int intTotalNoTax = (int) corrTotalNoTax;
                    double finTotalNoTax = intTotalNoTax/100.0;
                    
                    double corrTotalSalesTax = totalSalesTax*100;
                    int intTotalSalesTax = (int) corrTotalSalesTax;
                    double finTotalSalesTax = intTotalSalesTax/100.0;
                    
                    double corrTotalWithTax = totalWithTax*100;
                    int intTotalWithTax = (int) corrTotalWithTax;
                    double finTotalWithTax = intTotalWithTax/100.0;
                    
                //Printing the corrected values with appropriate text
                
                    System.out.println("Total cost of pants "+finTotalCostPants);
                    System.out.println("Total cost of sweatshirts "+finTotalCostShirts);
                    System.out.println("Total cost of belts "+finTotalCostBelts);
                    System.out.println("Total tax on pants "+finTaxPants);
                    System.out.println("Total tax on sweatshirts "+finTaxShirts);
                    System.out.println("Total tax on belts "+finTaxBelts);
                    System.out.println("Total cost before tax "+finTotalNoTax);
                    System.out.println("Total sales tax "+finTotalSalesTax);
                    System.out.println("Total cost with tax "+finTotalWithTax);
                    
        }
    }
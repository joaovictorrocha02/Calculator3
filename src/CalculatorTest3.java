public class CalculatorTest3 {
    public static void main(String[] args) {
        
       Calculator3 calc = new Calculator3();
       
      
       
       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    
    calc.findTotal(10.00, "person1");
    calc.findTotal(12.00, "person2");
    calc.findTotal(9.00, "person3");
    calc.findTotal(8.00, "person4");
    calc.findTotal(7.00, "person5");
    calc.findTotal(15.00, "person6");
    calc.findTotal(11.00, "person7");
    calc.findTotal(30.00, "person8");
                
    
    
    
    }    
    
    
}

package tickets;

public class CalculateTicket {

    private int age;
    private int basePrice;

    // Parameterized constructor
    public CalculateTicket(int age, int basePrice) {
        this.age = age;
        this.basePrice = basePrice;
    }

    // Calculate function
    public double calculate(){

        if (age <=2){
            return 0.0;
        }
        if (age <=12){
            return this.basePrice*0.5;
        }
        if (this.age>65){
            return this.basePrice*0.8;
        }

        return basePrice;
    }

}

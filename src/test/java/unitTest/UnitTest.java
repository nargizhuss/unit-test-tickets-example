package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.CalculateTicket;

public class UnitTest {

    @Test
    public void calculateTicket_calculate_infant_freePrice(){

        // 1. Pre-Condition - Arrange - Given - Pre-conditions
        CalculateTicket passenger = new CalculateTicket(1, 1000);

        // 2. Act - When - Test
        double result = passenger.calculate();

        // 3. Assert - Then - Compare expected and actual
        Assert.assertEquals(result, 0.0);


    }

    @Test
    public void calculateTicket_calculate_child_halfPrice(){

        CalculateTicket passenger = new CalculateTicket(10, 1000);
        double result = passenger.calculate();
        Assert.assertEquals(result, 500);

    }

    




}

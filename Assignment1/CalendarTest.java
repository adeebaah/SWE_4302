package Assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalendarTest {
    @Test
    public void DateCheck()
    {
        Calendar date1= new Calendar(31, 1,2003, Months.January);
        Calendar ans= date1.CalculateNextDate();
        ans.printer();
        Calendar expected= new Calendar(1,2,2003, Months.February);
        assertEquals(expected.printer(), ans.printer());
    }
    @Test
    public void CheckLeapYear()
    {
        Calendar date1= new Calendar(28, 2,2002,Months.February);
        Calendar ans= date1.CalculateNextDate();
        ans.printer();
        Calendar expected= new Calendar(1,3,2002, Months.March);
        assertEquals(expected.printer(), ans.printer());
    }

}
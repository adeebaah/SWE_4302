package Assignment1;

public class Calendar {
    int day,month,year;
    Months months;

    public Calendar(int day, int month, int year, Months nm)
    {
        this.day= day;
        this.month= month;
        this.year= year;
        this.months= nm;
    }

    public String printer()
    {
        return(this.day+"-"+this.month+"-"+this.year);
    }

    public Calendar CalculateNextDate()
    {
        Calculate_Date cd= new Calculate_Date();
        Calendar calendar= new Calendar(this.day,this.month,this.year,this.months);
        Calendar answer = cd.nextDate(calendar);
        return answer;
    }
}

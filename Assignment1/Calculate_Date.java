package Assignment1;

public class Calculate_Date {
    boolean isLeapyear(int year)
    {
        return(year%400==0 || (year%4==0 && year%100!=0 ));
    }

    public Calendar nextDate(Calendar calendar)
    {
        int day= calendar.day;
        int month= calendar.month;
        int year= calendar.year;
        String type= String.valueOf(calendar.months.name);

        if(type=="It has 31 days")
        {
            if(day==31)
            {
                calendar.months= calendar.months.nextMonth();
                day=1;
                month++;
                if(month>12)
                {
                    month=1;
                    year++;
                }
            }
            else
            {
                day++;
            }
        }
        else if(type=="It has 30 days")
        {
            if(day==30)
            {
                day=1;
                month++;
                if(month>12)
                {
                    month=1;
                    year++;
                }
                calendar.months=calendar.months.nextMonth();
            }
            else day++;
        }
        else if(type=="Leap_Month")
        {
            if(day==29)
            {
                day=1;
                month++;
                calendar.months=calendar.months.nextMonth();
            }
            else if(day==28)
            {
                if(isLeapyear(year))
                {
                    day++;
                }
                else
                {
                    day=1;
                    month++;
                }
                calendar.months=calendar.months.nextMonth();
            }
            else day++;

        }
        Calendar ans= new Calendar(day, month, year, calendar.months);
        return ans;
    }
}



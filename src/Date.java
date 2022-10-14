class Date
{
    private int day, year, month;

    public Date(int month,int day, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay()
    {
        this.day = day;
    }
    public int getDay()
    {
        return day;
    }
    public void setMonth(int month)
    {
        this.month = month;
    }
    public int getMonth()
    {
        return month;
    }
    public void setYear(int year)
    {
        this.year = year;
    }

    public int getYear()
    {
        return year;
    }

    public String toString()
    {
        return month+"-"+day+"-"+year;
    }
}
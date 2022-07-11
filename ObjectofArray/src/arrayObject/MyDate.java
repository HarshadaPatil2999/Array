package arrayObject;

public class MyDate {
	int date,month,year;
	MyDate()
	{}
	int getDate()
	{
		return date;
	}
	void setDate(int date)
	{
		this.date=date;
	}
	int getMonth()
	{
		return month;
	}
	void setMonth(int month)
	{
		this.month=month;
	}
	int getYear()
	{
		return year;
	}
	void setYear(int year)
	{
		this.year=year;
	}
	public String toString()
	{
		return date+" "+"/"+month+" "+"/"+year;
	}

}

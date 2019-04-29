package hotelBooking_BeatVer;


public class Hotel extends Residence 
{

//	static ArrayList<Hotel> selectedHotel = new ArrayList<Hotel>();
//	Residence[] hotelList;
	
	Hotel(String name, String country, String star, String pool, String breakfast, String price)
	{
		super(name,country,star,pool,breakfast, price);
	}
	
	String getName()
	{
		return name;
	}
	
	String getCountry()
	{
		return country;
	}
	
	String getStar()
	{
		return this.star;
	}
	
	String getPool()
	{
		return this.pool;
	}
	
	String getBreakfast()
	{
		return this.breakfast;
	}
	
	String getPrice()
	{
		return this.price;
	}
	
	public String toString()
	{
		return "Country        : "+getCountry()+"\n"+
			   "Hotel name     : "+getName()+"\n"+
			   "Hotel Star     : "+getStar()+"\n"+
			   "Hotel Pool     : "+getPool()+"\n"+
			   "Hotel Breakfast: "+getBreakfast()+"\n"+
			   "Price          : "+getPrice()+"\n";
	}
	

	
}

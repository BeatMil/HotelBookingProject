package hotelBooking_BeatVer;

abstract class Residence 
{
	protected String name;
	protected String country;
	protected String star;
	protected String pool;
	protected String breakfast;
	protected String price;
	
	Residence(String name, String country,String star,String pool, String breakfast, String price)
	{
		this.name = name;
		this.country = country;
		this.star = star;
		this.pool = pool;
		this.breakfast = breakfast;	
		this.price = price;
	}
	
	
	
	
}

package hotelBooking_BeatVer;

public class Helper 
{
	void filterWithSomething()
	{
		System.out.println("Please specify hotel rating e.g. 1-5:");
		String star = inputChecker(condition_num);
		selectedHotelList.clear();
		for (Hotel hotel : hotelList)
		{
			if (hotel.getCountry().equalsIgnoreCase(country) && hotel.getStar().equalsIgnoreCase(star))
			{
			 	System.out.println(hotel);
				selectedHotelList.add((Hotel) hotel);
			}
		}
		checkIfNoHotel(selectedHotelList);
	}
}

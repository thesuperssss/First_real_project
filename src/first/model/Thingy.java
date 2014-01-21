package first.model;

public class Thingy
{
	private String Name;
	private String Movie;
	private String Food;

	public Thingy()
	{
		Name = "Oddish";
		Movie = "movie";
		Food = "food";
	}

	public void setName(String name)
	{
		this.Name = name;
	}

	public String getName()
	{
		return Name;
	}

	public void setMovie(String movie)
	{
		this.Movie = movie;
	}

	public String getMovie()
	{
		return Movie;
	}

	public void setFood(String food)
	{
		this.Food = food;
	}

	public String getFood()
	{
		return Food;
	}
}

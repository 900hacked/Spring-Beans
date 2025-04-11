package frenchBeans.SpringValue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Movies {
	
	public Movies() {
		
	}

//	@Value("Shrek")
	@Value("${movie.name}")
	private String movieName;
	
	private int movieYear;
	
	@Value("${genre.name:ben10}")
	private String genre;

	public Movies(String movieName, int movieYear, String genre) {
		super();
		this.movieName = movieName;
		this.movieYear = movieYear;
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}

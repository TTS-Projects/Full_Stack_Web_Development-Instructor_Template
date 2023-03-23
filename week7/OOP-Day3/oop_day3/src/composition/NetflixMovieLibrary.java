package composition;

import java.util.List;

class NetflixMovieLibrary
{
	private final List<NetflixMovie> movies;
	
	NetflixMovieLibrary (List<NetflixMovie> movies){
			this.movies = movies;
	}
	public List<NetflixMovie> getTotalNetflixMoviesInNetflixLibrary(){
		return movies;
	}
}
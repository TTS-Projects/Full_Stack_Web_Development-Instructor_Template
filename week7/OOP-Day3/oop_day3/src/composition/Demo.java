package composition;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	  public static void main (String[] args)
	  {
	    NetflixMovie movieObject1 = new NetflixMovie("Titanic","James Cameron");
	    NetflixMovie movieObject2 = new NetflixMovie("47 Meters Down", "James Harris");
	    List<NetflixMovie> allNetflixMovies = new ArrayList<NetflixMovie>();
	    allNetflixMovies.add(movieObject1);
	    allNetflixMovies.add(movieObject2);
	    //allNetflixMovies.add(movieObject2);
	    List<NetflixMovie> allCoolNetflixMovies = new ArrayList<NetflixMovie>();
	    allCoolNetflixMovies.add(movieObject1);
	    allCoolNetflixMovies.add(movieObject2);
	    
	    NetflixMovieLibrary netflix = new NetflixMovieLibrary(allNetflixMovies);
	    NetflixMovie movieObject3 = new NetflixMovie("33 Meters Down", "James Harris");
	    //allNetflixMovies.add(movieObject3);
	    
	    List<NetflixMovie> mvs = netflix.getTotalNetflixMoviesInNetflixLibrary();
	    
	    System.out.println(mvs);
	    
//	    for(NetflixMovie mv : mvs){
//	      System.out.println("Title : " + mv.title + " and "
//	          +" Producer : " + mv.producer);
//	    }
	  }
	}
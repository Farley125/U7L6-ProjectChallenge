import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<SimpleMovie> movies = MovieDatabaseBuilder.getMovieDB("src/movie_data");
        System.out.println("Number of movies: " + movies.size());
        ArrayList<ArrayList> kevinBaconMovies = new ArrayList<ArrayList>();
        ArrayList<ArrayList> degreeOfBacon = new ArrayList<ArrayList>();
        ArrayList<String> names = new ArrayList<String>();

        for (SimpleMovie movie: movies) {
            if (movie.getActors().indexOf("Kevin Bacon") != -1) {
                String[] list = movie.getActors().split("//:");
                for (String string : list) {
                    if (!names.contains(string)) {
                        names.add(string);
                    }
                }
            }
        }
        degreeOfBacon.add(names);
        names = null;

        for (String name : degreeOfBacon[0])
        for (SimpleMovie movie: movies) {
            if (movie.getActors().indexOf("Kevin Bacon") != -1) {
                String[] list = movie.getActors().split("//:");
                for (String string : list) {
                    if (!names.contains(string)) {
                        names.add(string);
                    }
                }
            }
        }
    }
}
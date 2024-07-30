package structural.composite;

public class Main {

    public static void main(String[] args) {

        Directory movieDirectory = new Directory("Movie");
        FileSystem  harryPotter = new File("harryPotter");
        movieDirectory.addFile(harryPotter);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.addFile(hulchul);
        movieDirectory.addFile(comedyMovieDirectory);

        movieDirectory.showDetails();



    }
}

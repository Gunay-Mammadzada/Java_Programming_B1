package day33_a_static;

public class Song {
    String name;
    double length;
    String artist;
    String genre;


    //Constructors: name-length  | name-length-artist |  name-length-artist-genre


    public Song (String name, double length){
        this.name=name;
        this.length=length;

    }

    public Song (String name, double length,String artist){
        this(name,length);
        this.artist=artist;

    }
    public Song (String name, double length,String artist,String genre){
      this(name, length, artist);
        this.genre=genre;

    }

    @Override
    public String toString() {
        return "Song" +
                "\n name=" + name +
                "\n length=" + length +
                "\n artist='" + artist +
                "\n genre=" + genre ;
    }
}

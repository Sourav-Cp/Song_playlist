import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Albums {
    private String title;
    private String artist;
    private List<Song> songs;

    public Albums(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public Albums(String title, String artist, List<Song> songs) {
        this.title = title;
        this.artist = artist;
        this.songs = songs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Optional<Song> searchSong(String songName)
    {
        for(Song song: songs)
        {
            if(song.getName().equals(songName))
            {
                return Optional.of(song);
            }
        }
        return Optional.empty();
    }
    private boolean findSong(Song songToFind)
    {
        for(Song song : songs)
        {
            if(song.getName().equals(songToFind.getName()) && song.getArtist().equals(songToFind.getArtist())) return true;
        }
        return false;
    }
    public String addSong(Song song)
    {
        if(this.findSong(song)) return "Song Already Exist";

        this.songs.add(song);
        return "Song Added";
    }
}

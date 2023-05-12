import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class MyPlayList {

    private String title;
    private List<Song> songs;
    private boolean wasNext = false;
    private ListIterator<Song> itr;

    public MyPlayList(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
        itr = songs.listIterator();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String addSongFromAlbum(Albums album, String songName) {
        Optional<Song> songOpt = album.searchSong(songName);
        if (songOpt.isEmpty()) return "Song Not Found in Album";

        Song songInAlbum = songOpt.get();
        this.songs.add(songInAlbum);
        itr = songs.listIterator();

        return "Song Added Successfully";

    }

    public String playNext() {

        if (!wasNext) {
            wasNext = true;
            itr.next();
        }
        if (itr.hasNext()) {
            wasNext = true;
            Song song = itr.next();
            return "Next Song is" + song;
        }

        return "You have reached end of Playlist";
    }

    public String playPrevious() {

        if (wasNext) {
            wasNext = false;
            itr.previous();
        }
        if (itr.hasPrevious()) {
            wasNext = false;
            Song song = itr.previous();
            return "Previous Song is" + song;
        }

        return "You have reached start of Playlist";
    }
    public String currSong()
    {
        if(wasNext)
        {
            wasNext = false;
            return "Current Song is" + itr.previous();
        }
        wasNext = true;
        return "Current song is"+ itr.next();
    }
}

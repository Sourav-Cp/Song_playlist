public class Main {
    public static void main(String[] args) {

        Albums album1 = new Albums("Gloria","Sam Smith");
        album1.addSong(new Song("Unholy","Sam Smith",2));
        album1.addSong(new Song("Perfect","Sam Smith",3));
        album1.addSong(new Song("Gloria","Sam Smith",1));

        Albums album2 = new Albums("Honestly","Drake");
        album2.addSong(new Song("HerLoss","Drake",2));
        album2.addSong(new Song("views","Drake",3));
        album2.addSong(new Song("TakeCare","Drake",2));

        MyPlayList playList = new MyPlayList("myPlayList");
        playList.addSongFromAlbum(album1,"Unholy");
        playList.addSongFromAlbum(album1,"Gloria");
        playList.addSongFromAlbum(album2,"HerLoss");
        playList.addSongFromAlbum(album2,"TakeCare");

        System.out.println(playList.currSong());
        System.out.println(playList.playPrevious());
        System.out.println(playList.playNext());
        System.out.println(playList.playNext());
        System.out.println(playList.playPrevious());
        System.out.println(playList.playPrevious());
    }
}
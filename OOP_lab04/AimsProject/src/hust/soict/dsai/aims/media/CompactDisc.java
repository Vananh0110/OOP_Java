package hust.soict.dsai.aims.media;

import java.util.List;
import java.util.ArrayList;


public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public String getArtist(){
        return artist;
    }

    public CompactDisc(int id, String title, String category, float cost, String director, String artist, ArrayList<Track> tracks ){
        super();
        this.artist = artist;
        this.tracks = tracks;

    }

    public CompactDisc(int id, String title, String category, float cost, String director, String artist){
        super();
        this.artist = artist;
    }
    public boolean addTrack(Track track){
        if(tracks.contains(track))
        {
            System.out.println("Track already exists in CD");
            return false;
        }
        else{
            tracks.add(track);
            return true;
        }
    }

    public boolean removeTrack(Track track){
        if(!tracks.contains(track)){
            System.out.println("Track doesn't exist in CD.");
            return false;
        }
        else{
            tracks.remove(track);
            return true;
        }
    }

    @Override
    public int getLength(){
        int length = 0;
        for(int i = 0; i < tracks.size(); i++)
        {
            length += tracks.get(i).getLength();
        }
        return length;
    }

    @Override
    public void play(){
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for(int i = 0; i < tracks.size(); i++)
            tracks.get(i).play();
    }

}

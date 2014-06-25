package domain;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EpisodeManager {
    private List<Episode> episodes = new ArrayList();
    private List<String> episodeTitles = new ArrayList();
    private int currentEpisode = 1;
    
    public void addEpisodes(File[] files) {
        for(File file : files)
            episodes.add(new Episode(file, currentEpisode++));
    }
    
    public void addEpisodeTitle(String title) {
        episodeTitles.add(title);
    }
    
    public void setEpisodeTitle(int index, String title) {
        episodeTitles.set(index, title);
    }
    
    public List<Episode> getEpisodes() {
        return episodes;
    }
    
    public List<String> getEpisodeTitles() {
        return episodeTitles;
    }
    
    public void removeEpisodeTitle(int index) {
        episodeTitles.remove(index);
    }
    
    public void clearEpisodeTitles() {
        episodeTitles.clear();
    }
    
    public void swapEpisodes(int index0, int index1) {
        Episode episode0 = episodes.get(index0);
        Episode episode1 = episodes.get(index1);
        
        int number = episode0.getNumber();
        episode0.setNumber(episode1.getNumber());
        episode1.setNumber(number);
        
        episodes.set(index0, episode1);
        episodes.set(index1, episode0);
    }
    
    public void swapEpisodeTitles(int index0, int index1) {
        String title = episodeTitles.get(index0);
        episodeTitles.set(index0, episodeTitles.get(index1));
        episodeTitles.set(index1, title);
    }
    
    public int getNumEpisodes() {
        return episodes.size();
    }    
    
    public void setEpisodeFormat(String format) {
        int i = 0;        
        for(Episode episode : episodes) {
            String episodeName = format;
            episodeName = episodeName.replaceAll("#", (episode.getNumber() < 10 ? "0" : "") + episode.getNumber());
            episodeName = episodeName.replaceAll("\\?", i < episodeTitles.size() ? episodeTitles.get(i++) : "?");
            episode.setName(episodeName);
        }
    }
}
 
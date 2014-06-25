package domain;

import java.io.File;

public class Episode {
    private File file;
    private String name;
    private String title;
    private int number;
    
    public Episode(File file, int number) {
        this.file = file;
        this.name = "";
        this.title = "";
        this.number = number;
    }
    
    public String getOriginalName() {
        return file.getName();
    }
    
    public String getName() {
        return name;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        return file.getName();
    }
}

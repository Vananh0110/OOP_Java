public class DigitalVideoDisc {
    private String title;
    private String category;
    private String directory;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title){
        super();
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost){
        super();
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String directory, float cost){
        super();
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.directory = directory;
        this.cost = cost;

    }

    public DigitalVideoDisc(String title, String category, String directory, int length, float cost){
        super();
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.directory = directory;
        this.length = length;
        this.cost = cost;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirectory() {
        return directory;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString(){
        return(getTitle() + " - " + getCategory() + " - " + getDirectory() + " - " + getLength() + " : " + getCost() + "$");
    }

    public boolean isMatch(String title){
        if(this.getTitle().contains(title)) return true;
        else return false;
    }

    public boolean isMatch(int id){
        if(id == this.id) return true;
        else return false;
    }


}


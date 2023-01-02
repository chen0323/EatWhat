package tw.edu.tku.eatwhat;

public class Bean {
    String name;
    int imageId;

    public Bean(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name =name;
    }

    public int getImageId() {
        return imageId;
    }

}

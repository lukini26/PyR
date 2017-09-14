package ar.com.puebloyreforma.pyr;

/**
 * Created by lucas on 05/09/2017.
 */

public class ModelClass {

    String title,image, url;

    public ModelClass(String title, String image) {
        this.title = title;
        this.image = image;
        this.url = url;
    }

    public ModelClass() {
    }

    public  String getUrl() {return url;}
    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

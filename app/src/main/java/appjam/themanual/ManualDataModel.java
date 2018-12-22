package appjam.themanual;

/**
 * Created by 김예원 on 2018-12-22.
 */

public class ManualDataModel {
    private String title;
    private int person;
    private int bgImage;

    public ManualDataModel(String title, int person, int bgImage) {
        this.title = title;
        this.person = person;
        this.bgImage = bgImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getBgImage() {
        return bgImage;
    }

    public void setBgImage(int bgImage) {
        this.bgImage = bgImage;
    }
}

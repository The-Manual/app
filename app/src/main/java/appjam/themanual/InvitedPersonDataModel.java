package appjam.themanual;

/**
 * Created by 김예원 on 2018-12-23.
 */

public class InvitedPersonDataModel {
    private int profileImage;
    private String profileName;
    private String profileEmail;

    public InvitedPersonDataModel(int profileImage, String profileName, String profileEmail) {
        this.profileImage = profileImage;
        this.profileName = profileName;
        this.profileEmail = profileEmail;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileEmail() {
        return profileEmail;
    }

    public void setProfileEmail(String profileEmail) {
        this.profileEmail = profileEmail;
    }
}

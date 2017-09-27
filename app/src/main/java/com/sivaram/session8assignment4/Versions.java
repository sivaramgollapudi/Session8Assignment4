package com.sivaram.session8assignment4;

/**
 * Created by User on 27/09/2017.
 */

public class Versions {

    // Android Version Image And Name Private Variables
    private String versionName;
    private int versionImage;


    // Versions Class Constructor
    public Versions(String versionName, int versionImage) {
        this.versionName = versionName;
        this.versionImage = versionImage;
    }

    // Getter and Setter for Android Version Image And Version Name
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public int getVersionImage() {
        return versionImage;
    }

    public void setVersionImage(int versionImage) {
        this.versionImage = versionImage;
    }
}

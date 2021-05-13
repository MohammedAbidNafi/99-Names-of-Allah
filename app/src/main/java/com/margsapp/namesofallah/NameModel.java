package com.margsapp.namesofallah;


public class NameModel {
    String banName;
    String enName;
    String  bannglamean;
    String  englishmean;
    int mp3File;

    public NameModel(String banName, String enName) {
        this.banName = banName;
        this.enName = enName;
    }

    public NameModel(String banName, String enName, String  bannglamean,String  englishmean,int mp3File) {
        this.banName = banName;
        this.enName = enName;
        this.bannglamean = bannglamean;
        this.englishmean = englishmean;
        this.mp3File = mp3File;
    }

    public String getBanName() {
        return banName;
    }

    public void setBanName(String banName) {
        this.banName = banName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getBannglamean() {
        return bannglamean;
    }

    public void setBannglamean(String bannglamean) {
        this.bannglamean = bannglamean;
    }

    public int getMp3File() {
        return mp3File;
    }

    public String getEnglishmean() {
        return englishmean;
    }

    public void setEnglishmean(String englishmean) {
        this.englishmean = englishmean;
    }

    public void setMp3File(int mp3File) {
        this.mp3File = mp3File;
    }
}

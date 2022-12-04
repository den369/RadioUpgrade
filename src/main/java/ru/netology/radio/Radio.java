package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int stationsCount;

    public Radio() {

    }

    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
    }

     public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > stationsCount - 1) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void next() {
        if (currentRadioStation < stationsCount - 1) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = stationsCount - 1;
        }
    }

    public void volumePlus() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void volumeMinus() {

        if (currentVolume > 0) {
            currentVolume--;

        } else {
            currentVolume = 0;
        }
    }
}
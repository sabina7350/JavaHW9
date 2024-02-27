package org.example;

public class Radio {
    private int currentVolume;
    private int currentFM;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentFM() {
        return currentFM;
    }

    public void setCurrentFM(int newCurrentFM) {
        if (newCurrentFM > 9) {
            return;
        }
        if (newCurrentFM < 0) {
            return;
        }
        currentFM = newCurrentFM;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void volumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


    public void next() {
        if (currentFM < 9) {
            currentFM = currentFM + 1;
        } else {
            currentFM = 0;
        }
    }

    public void prev() {
        if (currentFM > 0) {
            currentFM = currentFM - 1;
        } else {
            currentFM = 9;
        }
    }
}
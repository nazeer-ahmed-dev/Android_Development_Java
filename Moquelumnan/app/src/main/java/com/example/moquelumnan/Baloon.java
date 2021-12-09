package com.example.moquelumnan;

public class Baloon {
    int image ;
    int audio;
    int number;

    public Baloon(int image,int number)
    {
        this.image = image;
        this.audio = audio;
        this.number = number;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setAudio(int audio) {
        this.audio = audio;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getImage() {
        return image;
    }

    public int getAudio() {
        return audio;
    }

    public int getNumber() {
        return number;
    }
}

package com.example.eva1_14_clima;

public class Weather     {
    private  String city;
    private  double temp;
    private  String desc;
    private int ImageWeater;

    public Weather() {
    }

    public Weather(String city, double temp, String desc, int imageWeater) {
        this.city = city;
        this.temp = temp;
        this.desc = desc;
        ImageWeater = imageWeater;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageWeater() {
        return ImageWeater;
    }

    public void setImageWeater(int imageWeater) {
        ImageWeater = imageWeater;
    }
}

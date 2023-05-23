package com.my.testing.Computers;


public class Microsoft implements information {


    @Override
    public int Establishment(int date) {
        return date;
    }

    @Override
    public String companyName(String name) {
        return name;
    }

    @Override
    public String DevelopLanguage(String language) {
        return language;
    }

    @Override
    public String OprationSystem(String os) {
        return os;
    }

    @Override
    public int TwoDigits() {
        int result=2021-getEstablishment();
        return result;
    }

    public int getEstablishment()
    {
        return Establishment(1975);
    }


}


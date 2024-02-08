package com.hospital.common;

public class SelectCriteria {
    private String option;
    private String nameValue;
    private String sickValue;

    public SelectCriteria() {
    }

    public SelectCriteria(String option, String nameValue, String sickValue) {
        this.option = option;
        this.nameValue = nameValue;
        this.sickValue = sickValue;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getNameValue() {
        return nameValue;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }

    public String getSickValue() {
        return sickValue;
    }

    public void setSickValue(String sickValue) {
        this.sickValue = sickValue;
    }

    @Override
    public String toString() {
        return "SelectCriteria{" +
                "option='" + option + '\'' +
                ", nameValue='" + nameValue + '\'' +
                ", sickValue='" + sickValue + '\'' +
                '}';
    }
}

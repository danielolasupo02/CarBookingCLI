package model;

public class Car {
    private String brandName;
    private String brandModel;
    private boolean isElectric;

    public Car(String brandName, String brandModel, boolean isElectric) {
        this.brandName = brandName;
        this.brandModel = brandModel;
        this.isElectric = isElectric;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", brandModel='" + brandModel + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }
}

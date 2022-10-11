package Dealership;

public class CarModel {
    private String CarBrand;
    private String CarModel;

    public CarModel(String carBrand, String carModel, int price) {
        CarBrand = carBrand;
        CarModel = carModel;
        Price = price;
    }

    private int Price;

    public String getCarBrand() {
        return CarBrand;
    }

    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}

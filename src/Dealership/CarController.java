package Dealership;

public class CarController {
    private CarModel Model;
    private CarView View;
    public CarController(CarView View,CarModel Model){
        this.View=View;
        this.Model=Model;
    }//constructor
    public void setCarBrand(String Brand){
        Model.setCarBrand(Brand);
    }
    public void setCarModel(String Model){
        this.Model.setCarModel(Model);
    }
    public void setCarPrice(int Price){
        this.Model.setPrice(Price);
    }
    public String getCarBrand(){
        return this.Model.getCarBrand();
    }
    public String getCarModel(){
        return this.Model.getCarModel();
    }
    public int getPrice(){
        return this.Model.getPrice();
    }
    public void ViewCar(){
        this.View.printCarDetails(this.Model.getCarBrand(),this.Model.getCarModel(),this.Model.getPrice());
    }
}

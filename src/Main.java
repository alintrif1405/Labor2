import Dealership.CarController;
import Dealership.CarModel;
import Dealership.CarView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CarModel> List=new ArrayList<CarModel>();
        CarModel Model=new CarModel("Lada","Veyron",21);
        CarView View=new CarView();
        CarController Controller= new CarController(View,Model);
        Controller.ViewCar();
        Controller.setCarBrand("Test1");
        System.out.println("update");
        Controller.ViewCar();
        List.add(Model);
        List.add(new CarModel("Test2","TestModel2",192));
        for(CarModel iterator:List)
            System.out.println(iterator.getCarBrand()+"    "+iterator.getCarModel());
        List.remove(Model);
        for(CarModel iterator:List)
            System.out.println(iterator.getCarBrand()+"    "+iterator.getCarModel());
    }
}
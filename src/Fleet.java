import java.lang.reflect.Array;
import java.util.ArrayList;

public class Fleet {

    private ParkingLot _parkingLot;
    private Street _street;
    private Workshop _workshop;

    Fleet(){}

    private void _orderNewCar()
    {
    Equipment _newEquipment = null;
    int _newBasePrice = 0;
    Car _newCar = new Car(_newEquipment,_newBasePrice);
    _parkingLot._registerCar(_newCar);
    }

    private void _orderNewParkingLot()
    {

    }

    private void _orderRent()
    {

    }

    private void _orderScrapCar()
    {

    }

    private void _orderWorkshop()
    {

    }

    private Car _chooseCar(Location _location)
    {
        return null;
    }

    public int _menuDisplayOrder()
    {
        return 0;
    }

    public int _menuDisplayLocation()
    {
        return 0;
    }

    private Equipment _menuEquipment()
    {
        return null;
    }

    private Car _menuNewCar()
    {
        return null;
    }

    public static void main(String[] args)
    {
        ParkingLot _parkingLot = new ParkingLot();
        Street _street = new Street();
        Workshop _workshop = new Workshop();

        // add test cars
        Equipment _eqTest1 = new Equipment(true,true, true, false, false);
        _eqTest1._setOthers("new");
        Equipment _eqTest2 = new Equipment(false,true,false,false,false);
        _eqTest2._setOthers("multi-media");
        Equipment _eqTest3 = new Equipment(false,true,true,true,false);
        Equipment _eqTest4 = new Equipment(true,true,true,false,false);
        Equipment _eqTest5 = new Equipment(false,true,true,false,false);
        _eqTest5._setOthers("cabriolet");
        Equipment _eqTest6 = new Equipment(true,true,true,true,false);

        SmallCar car1 = new SmallCar(_eqTest2,50);
        SmallCar car2 = new SmallCar(_eqTest2,40);
        MidsizeCar car3 = new MidsizeCar(_eqTest3,60);
        MidsizeCar car4 = new MidsizeCar(_eqTest4,60);
        UpperClassCar car5 = new UpperClassCar(_eqTest5,90);
        UpperClassCar car6 = new UpperClassCar(_eqTest6,80);

        // put all cars to Parking lot

        _parkingLot._registerCar(car1);
        _parkingLot._registerCar(car2);
        _parkingLot._registerCar(car3);
        _parkingLot._registerCar(car4);
        _parkingLot._registerCar(car5);
        _parkingLot._registerCar(car6);


    }
}

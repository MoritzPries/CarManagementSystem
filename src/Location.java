import java.util.ArrayList;

public class Location {

    private ArrayList<Car> _allCars = new ArrayList<Car>();

    Location (){}

    public boolean _registerCar (Car _car)
    {
        _allCars.add(_car);
        return true;
    }

    public boolean _unregisterCar (Car _car)
    {
        _allCars.remove(_car);
        return true;
    }

    public Car _getAllCar()
    {
        return null;
    }

    public ArrayList<Car> _getAllCars(String _type)
    {
        return _allCars;
    }

    public ArrayList<Car> get_allCars()
    {
        return _allCars;
    }

    public Car _getCar(String _licensePlate)
    {
        return null;
    }

    public String _toString()
    {
        String _output = "stored cars:\n";
        for ( Car _car : _allCars)
        {
            _output += _car._toString();
            _output += "\n";
        }
        return _output;

    }

    public static void main(String[] args)
    {
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

        Workshop _workshop = new Workshop();
        Street _street = new Street();
        ParkingLot _parkingLot = new ParkingLot();

        _parkingLot._registerCar(car1);
        _parkingLot._registerCar(car2);
        _street._registerCar(car3);
        _street._registerCar(car4);
        _workshop._registerCar(car5);
        _workshop._registerCar(car6);

        System.out.println("Parking Lot, " + _parkingLot._toString());
        System.out.println("Street, " + _street._toString());
        System.out.println("Workshop, " + _workshop._toString());

    }
}

public class Car {

    private Equipment _equipment;
    private int _basePrice;
    private String _licensePlate;
    private static int _number = 1001;

     Car (Equipment _equipment, int _basePrice)
    {
    this._equipment = _equipment;
    this._basePrice = _basePrice;

    this._licensePlate = "L-RA-" + _number;
    _number++;
    }

    public int _calculateRentPrice ()
    {
        return _basePrice + 2 * _equipment._calculateTotalSurcharge();
    }

    public String get_licensePlate() {
        return _licensePlate;
    }

    public String get_Typ()
    {
        return "hallo";
    }

    public void _changeTires(boolean _winterTires)
    {
    _equipment._changeTires(_winterTires);
    }

    public String _toString ()
    {
        String _output = "";
        _output += get_licensePlate();
        _output += " ";
        _output += _equipment._toString();
        _output += " rent price: " + _calculateRentPrice();
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
    SmallCar car3 = new SmallCar(_eqTest3,60);
    SmallCar car4 = new SmallCar(_eqTest4,60);
    SmallCar car5 = new SmallCar(_eqTest5,90);
    SmallCar car6 = new SmallCar(_eqTest6,80);
    car6._changeTires(false);

    System.out.println(car1._toString());
    System.out.println(car2._toString());
    System.out.println(car3._toString());
    System.out.println(car4._toString());
    System.out.println(car5._toString());
    System.out.println(car6._toString());

    }
}

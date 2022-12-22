public class Equipment {

    private boolean _automatic, _airCondition, _navigationSystem, _parkAssistant, _winterTires;
    private String _others;
    private static int surcharge;

    Equipment ( boolean _automatic, boolean _airCondition, boolean _navigationSystem, boolean _parkAssistant, boolean _winterTires )
    {
        this._automatic = _automatic;
        this._airCondition = _airCondition;
        this._navigationSystem = _navigationSystem;
        this._parkAssistant = _parkAssistant;
        this._winterTires = _winterTires;
    }

    public int _calculateTotalSurcharge()
    {
        int _result = 0;
        if(_automatic){_result+=5;}
        if(_airCondition){_result+=5;}
        if(_navigationSystem){_result+=5;}
        if(_parkAssistant){_result+=5;}
        if(_winterTires){_result+=5;}
        return _result;
    }

    public void _changeTires (boolean _winterTires)
    {
    if(_winterTires){System.out.println("the winter tires were changed to summer tires");}
    else {System.out.println("the summer tires were changed to winter tires");}

    this._winterTires = !_winterTires;
    }

    public void _setOthers (String _others)
    {
        this._others = _others;
    }

    public static void _setSurcharge (int _euro)
    {
        surcharge = _euro;
    }

    public String _toString ()
    {
        String _output;
        _output = "Equipment: ";
        if(_automatic){_output += "automatic, ";}
        if(_airCondition){_output += "air condition, ";}
        if(_navigationSystem){_output += "navigation system, ";}
        if(_parkAssistant){_output += "park assistant, ";}
        if(_winterTires){_output += "winter tires ";}else{_output += "summer tires ";}

        if ( _others != null ) { _output += ", " + _others;}

        return _output;
    }

    public static void main(String[] args)
    {
    /*
    Equipment _eqTest1 = new Equipment(true,true, true, false, false);
    _eqTest1._setOthers("new");
    Equipment _eqTest2 = new Equipment(false,true,false,false,false);
    _eqTest2._setOthers("multi-media");
    Equipment _eqTest3 = new Equipment(false,true,true,true,false);
    Equipment _eqTest4 = new Equipment(true,true,true,false,false);
    Equipment _eqTest5 = new Equipment(false,true,true,false,false);
    _eqTest5._setOthers("cabriolet");
    Equipment _eqTest6 = new Equipment(true,true,true,true,false);


    System.out.println(_eqTest1._toString());
    System.out.println(_eqTest2._toString());
    System.out.println(_eqTest3._toString());
    System.out.println(_eqTest4._toString());
    System.out.println(_eqTest5._toString());
    System.out.println(_eqTest6._toString());
    */
    }
}

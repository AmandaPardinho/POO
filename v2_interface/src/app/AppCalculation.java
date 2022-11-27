package app;

import calc.ObjectCalc;
import module.ModuleInterface1;
import module.ModuleIntergace2;

public class AppCalculation {
    public static void main(String[] args) {
        //Situation 1 - the object's method is called as it is
        ObjectCalc oc = new ObjectCalc();
        oc.performsCalc();

        //Situation 2 - the X module can only call via calcValues() method
        ModuleInterface1 mi1 = oc;
        mi1.calcValues();

        //Situation 2 - the Y module can only call via executeCalc() method
        ModuleIntergace2 mi2 = oc;
        mi2.executeCalc();
    }
}

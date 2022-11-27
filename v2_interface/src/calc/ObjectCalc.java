package calc;

import module.ModuleInterface1;
import module.ModuleIntergace2;

public class ObjectCalc implements ModuleInterface1, ModuleIntergace2 {
    public void performsCalc(){
        System.out.println("Calculated");
    }

    @Override
    public void calcValues() {
        performsCalc();
    }

    @Override
    public void executeCalc() {
        performsCalc();
    }
}

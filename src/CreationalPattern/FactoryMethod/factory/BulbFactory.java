package CreationalPattern.FactoryMethod.factory;

import CreationalPattern.FactoryMethod.light.BulbLight;
import CreationalPattern.FactoryMethod.light.ILight;

public class BulbFactory implements  IFactory{

    @Override
    public ILight createLight() {
        return new BulbLight();
    }
}

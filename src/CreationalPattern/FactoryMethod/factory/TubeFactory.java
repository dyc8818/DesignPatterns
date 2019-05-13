package CreationalPattern.FactoryMethod.factory;

import CreationalPattern.FactoryMethod.light.ILight;
import CreationalPattern.FactoryMethod.light.TubeLIght;

public class TubeFactory implements IFactory{
    @Override
    public ILight createLight() {
        return new TubeLIght();
    }
}

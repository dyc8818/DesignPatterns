package CreationalPattern.FactoryMethod.factory;

import CreationalPattern.FactoryMethod.light.ILight;

public interface IFactory {
    ILight createLight();
}

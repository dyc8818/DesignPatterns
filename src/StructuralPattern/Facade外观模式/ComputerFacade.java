package StructuralPattern.Facade外观模式;

public class ComputerFacade {
    CPU cpu;
    Disk disk;
    Memory memory;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.disk = new Disk();
        this.memory = new Memory();
    }

    public void startup(){
        System.out.println("start the computer!");
        cpu.start();
        memory.start();
        disk.start();
        System.out.println("start computer finished!");
    }

    public void shutdown(){
        System.out.println("begin to close the computer!");
        cpu.stop();
        memory.stop();
        disk.stop();
        System.out.println("computer closed!");
    }

}

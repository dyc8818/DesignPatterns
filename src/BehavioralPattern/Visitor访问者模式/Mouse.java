package BehavioralPattern.Visitor访问者模式;

class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    @Override
    public void startup() {
        System.out.println("键盘已经启动");
    }

}

class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    @Override
    public void startup() {
        System.out.println("屏幕已经启动");
    }
}

public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    @Override
    public void startup() {
        System.out.println("鼠标已经启动");
    }
}

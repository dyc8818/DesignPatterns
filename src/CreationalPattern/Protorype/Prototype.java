package CreationalPattern.Protorype;

import java.io.*;

public class Prototype implements Cloneable, Serializable {
    double a = 1.5;
    String b = "asdasdasd";
    int c[] = new int[]{1};
    public Prototype shallowclone() {
        try {
            Prototype p = (Prototype) super.clone();
            p.c = p.c.clone();
            return p;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        Prototype cloneProtype = prototype.shallowclone();
        System.out.println(prototype.hashCode()+",a:"+prototype.a+",b:"+prototype.b+",hash:"+prototype.b.hashCode());
        System.out.println(cloneProtype.hashCode()+",a:"+cloneProtype.a+",b:"+cloneProtype.b+",hash:"+cloneProtype.b.hashCode());
        cloneProtype.b="123123";
        cloneProtype.a=9.9;
        cloneProtype.c[0]=100;
        System.out.println(prototype.a);
        System.out.println(prototype.b);
        System.out.println(prototype.c[0]);
    }

}
class DeepClone{
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(prototype);
            oos.flush();
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Prototype cloneProtype = (Prototype) ois.readObject();

            System.out.println(prototype.hashCode()+",a:"+prototype.a+",b:"+prototype.b+",hash:"+prototype.b.hashCode());
            System.out.println(cloneProtype.hashCode()+",a:"+cloneProtype.a+",b:"+cloneProtype.b+",hash:"+cloneProtype.b.hashCode());
            cloneProtype.b="123123";
            cloneProtype.a=9.9;
            cloneProtype.c[0]=100;
            System.out.println(prototype.a);
            System.out.println(prototype.b);
            System.out.println(prototype.c[0]);
            oos.close();
            ois.close();
            bos.close();
            bis.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

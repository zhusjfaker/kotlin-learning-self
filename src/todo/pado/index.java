package todo.pado;

import cuzz.Model;

public class index implements Cloneable {
    public static void main(String[] args) {
        Model.Companion.getX();
        Model.Companion.test();
        Model.Companion.xs();
        Model.instance.INSTANCE.getC();

    }


    public void bos(){
        Model.Companion.getX();
        Model.Companion.test();
        Model.Companion.xs();
        Model.instance.INSTANCE.getC();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}



package ar.com.xeven;

public class Gato {
    private int patas;
    private static int ojos;
    private final boolean conCola = true;

    public boolean isConCola() {
        return conCola;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    public int getPatas() {
        return patas;
    }

    public static int getOjos() {
        return ojos;
    }

    public static void setOjos(int ojos) {
        Gato.ojos = ojos;
    }
}

package ar.com.xeven;

public class Main {

    public static void main(String[] args) {
        // felix es un Gato
        Gato felix = new Gato();
        // felix tiene 3 patas
        felix.setPatas(3);
        Gato garfield = new Gato();
        garfield.setPatas(4);
        // todos los Gatos tienen 2 ojos
        System.out.println("felix tiene "+felix.getPatas()+" patas.");
        System.out.println("gardfield tiene "+garfield.getPatas()+" patas.");
        System.out.println("¿Cuántos ojos tiene un Gato? "+Gato.getOjos());

        Gato.setOjos(3);
        System.out.println("Ojos: "+Gato.getOjos());
        System.out.println("felix, ¿cuántos ojos tenés? "+felix.getOjos());

        garfield.setOjos(8);
        System.out.println("garfield tiene "+garfield.getOjos()+" ojos.");
        System.out.println("felix tiene "+felix.getOjos()+" ojos.");

        Gato salem = new Gato();
        System.out.println("salem, ¿cuántos ojos tenés? "+salem.getOjos());

        if(felix.isConCola())
            System.out.println("Tiene cola");
        else
            System.out.println("Algo salió mal");
    }
}

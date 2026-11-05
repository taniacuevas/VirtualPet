public class Main {

    public static void main(String[] args) {

        Teclat teclat = new Teclat();

        System.out.println("Quina mascota vols?");
        System.out.println("1.- Gos");
        System.out.println("2.- Gat");
        int tipus = teclat.llegirEnter("Tipus: ");
        while (tipus != 1 && tipus != 2) {
            System.out.println("Tipus no valid. Escriu 1 o 2.");
            tipus = teclat.llegirEnter("Tipus: ");
        }

        String nom = teclat.llegirText("Nom de la mascota: ");

        Mascota mascota = new Mascota();
        mascota.iniciar(nom, tipus);

        Mascota dummy = new Mascota();
        dummy.iniciarDummy();

        int opcio = -1;

        while (opcio != 0 && mascota.viva == true) {

            System.out.println();
            mascota.mostrar();
            System.out.println("1.- Dormir");
            System.out.println("2.- Jugar");
            System.out.println("3.- Menjar");
            System.out.println("4.- Dutxar");
            System.out.println("5.- Atacar");
            System.out.println("0.- Sortir");
            opcio = teclat.llegirEnter("Opcio: ");

            if (opcio == 1) {
                mascota.dormir();
            } else if (opcio == 2) {
                mascota.jugar();
            } else if (opcio == 3) {
                mascota.menjar();
            } else if (opcio == 4) {
                mascota.dutxar();
            } else if (opcio == 5) {
                int n = teclat.llegirEnter("Quantes vegades vols atacar? ");
                while (n < 0) {
                    System.out.println("El numero no pot ser negatiu.");
                    n = teclat.llegirEnter("Quantes vegades vols atacar? ");
                }
                mascota.atacar(dummy, n);
                dummy.mostrar();
                if (dummy.energia <= 0 || dummy.higiene <= 0 || dummy.humor <= 0) {
                    System.out.println("El dummy s'ha destruit. Apareix un de nou.");
                    dummy.iniciarDummy();
                }
            } else if (opcio == 0) {
                System.out.println("Sortint de l'aplicacio...");
            } else {
                System.out.println("Opcio no valida.");
            }
            mascota.bailar();
            mascota.comprovarVida();
        }

        if (mascota.viva == false) {
            System.out.println();
            mascota.mostrar();
            System.out.println(mascota.nom + " ha mort. Game over.");
        }

        mascota.bailar();

    }
}

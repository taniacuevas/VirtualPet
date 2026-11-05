public class Mascota {

    public String nom;
    public int tipus;
    public int energia;
    public int higiene;
    public int pes;
    public int humor;
    public boolean viva;

    public void iniciar(String n, int t) {
        nom = n;
        tipus = t;
        energia = (int) (System.nanoTime() % 21) + 40;
        higiene = (int) (System.nanoTime() % 21) + 40;
        pes = (int) (System.nanoTime() % 21) + 40;
        humor = (int) (System.nanoTime() % 21) + 40;
        viva = true;
    }

    public void iniciarDummy() {
        nom = "Dummy";
        tipus = 3;
        energia = 100;
        higiene = 100;
        pes = 100;
        humor = 100;
        viva = true;
    }

    public void mostrar() {
        System.out.println(nom + " -> Energia: " + energia + " | Higiene: " + higiene
                + " | Pes: " + pes + " | Humor: " + humor);
    }

    public void dormir() {
        if (tipus == 1) {
            energia = energia + 25;
        } else {
            energia = energia + 20;
        }
        humor = humor + 10;
    }

    public void jugar() {
        energia = energia - 20;
        humor = humor + 20;
        pes = pes - 10;
    }

    public void menjar() {
        energia = energia + 10;
        higiene = higiene - 15;
        pes = pes + 10;
    }

    public void dutxar() {
        if (tipus == 1) {
            energia = energia - 10;
            higiene = higiene + 25;
            humor = humor - 15;
        } else {
            energia = energia - 5;
            higiene = higiene + 25;
            humor = humor + 5;
        }
    }

    public void atacar(Mascota dummy, int n) {
        int i = 1;
        while (i <= n && energia > 0 && higiene > 0 && humor > 0
                && dummy.energia > 0 && dummy.higiene > 0 && dummy.humor > 0) {
            energia = energia - 3;
            higiene = higiene - 3;
            humor = humor - 3;

            dummy.energia = dummy.energia - 3;
            dummy.higiene = dummy.higiene - 3;
            dummy.humor = dummy.humor - 3;

            i = i + 1;
        }
        System.out.println("Cops fets: " + (i - 1));
    }

    public void comprovarVida() {
        if (energia <= 0 || energia > 100 || higiene <= 0 || higiene > 100
                || pes <= 0 || pes > 100 || humor <= 0 || humor > 100) {
            viva = false;
        }
    }
    public void bailar(){
        System.out.println(this.nom + " está bailando un mambo!");
    }
}

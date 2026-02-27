package lab01;
import java.util.ArrayList;
import java.util.Random;

public class UsaClasse {
    public static void main(String[] args) {
        // Tank meuTanque = new Tank("Bob");
        // Tank meuTanque2 = new Tank("Jack");

        // meuTanque.fire_at(meuTanque2);

        // System.out.println(meuTanque);
        // System.out.println(meuTanque2);

        Random random = new Random();

        ArrayList<Tank> tanques = new ArrayList<>();

        tanques.add(new Tank("Bob"));
        tanques.add(new Tank("Jack"));
        tanques.add(new Tank("Mike"));
        tanques.add(new Tank("Tony"));
        tanques.add(new Tank("Steve"));

        while (tanques.size() > 1) {

            int atacanteIndex = random.nextInt(tanques.size());
            Tank atacante = tanques.get(atacanteIndex);

            int alvoIndex;

            do {
                alvoIndex = random.nextInt(tanques.size());
            } while (alvoIndex == atacanteIndex);

            Tank alvo = tanques.get(alvoIndex);

            atacante.fire_at(alvo);

            if (!alvo.isAlive()) {
                tanques.remove(alvo);
            }

            System.out.println("Tanques restantes: " + tanques.size());
            System.out.println("----------------------------");
        }

        System.out.println("Restou: " + tanques.get(0).getName());
    }
}
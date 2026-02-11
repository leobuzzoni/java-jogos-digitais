public class UsaClasse {
    public static void main(String[] args) {
        Tank meuTanque = new Tank("Bob");
        Tank meuTanque2 = new Tank("Jack");

        meuTanque.fire_at(meuTanque2);

        System.out.println(meuTanque);
        System.out.println(meuTanque2);
    }
}
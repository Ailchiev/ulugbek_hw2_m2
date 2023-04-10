public class Bugatti extends HyperCars{
    public int weight;
    public Bugatti(int year, int hp, int torque,int weight) {
        super(year, hp, torque);
        this.weight=weight;
    }

    @Override
    public void print() {
        System.out.println("Год выпуска: " + year + ", Колличество лошадиных сил: " +
                hp + ", Крутящий момент: " + torque + ", Вес: " + weight);
    }
}

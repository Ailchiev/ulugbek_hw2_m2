public class KoenigseggAgeraRS extends  HyperCars {
    public String modification;
    public KoenigseggAgeraRS(int year, int hp, int torque, String modification) {
        super(year, hp, torque);
        this.modification=modification;
    }

    @Override
    public void print() {
        System.out.println("Год выпуска: " + year + ", Колличество лошадиных сил: " +
                hp + ", Крутящий момент: " + torque + ", модификация: " + modification);
    }
}

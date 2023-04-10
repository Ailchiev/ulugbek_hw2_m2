public abstract class  HyperCars extends  Transport implements Printable{
    public int year;
    public int hp;
    public int torque;

    public HyperCars(int year, int hp, int torque) {
        this.year = year;
        this.hp = hp;
        this.torque = torque;
    }
    public void print() {
        System.out.println("Год выпуска: " + year + ", Колличество лошадиных сил: " +
                hp + ", Крутящий момент: " + torque);
    }
}

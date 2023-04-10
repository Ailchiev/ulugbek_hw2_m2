public class Main {
    public static void main(String[] args) {
        createObject("KoenigseggAgeraRS");
        createObject("Bugatti");
        createObject("HyperCars");
    }
    public static String createObject(String className) {
        switch (className) {
            case "KoenigseggAgeraRS":
                 {
                     KoenigseggAgeraRS koenigseggAgeraRS=new KoenigseggAgeraRS(2018,1347,1560,"RS");
                     koenigseggAgeraRS.print();
                };

                break;
            case "Bugatti":
               Bugatti bugatti = new Bugatti(2019,1500,1600,1800);
                bugatti.print();
                break;
            case "HyperCars":
                     {
                         HyperCars hyperCars=new HyperCars(2004, 550, 450) {
                         };
                         hyperCars.print();
                };
                break;

        }
        return className;
    }
}
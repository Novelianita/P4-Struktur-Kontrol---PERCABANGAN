public class DemoSwitch2 {

    public static void main(String[] args) {
        int grade = 80;
        switch(grade){
            case 100:
            System.out.println("Exsellent!");
            break;
            case 90:
            System.out.println("Good Job!");
            break;
            case 80:
            System.out.println("Study harder!");
            break;
            default:
            System.out.println("Sorry, you failed.");
        }
}
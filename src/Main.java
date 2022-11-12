public class Main {
    public static void main(String[] args) {
            //      User user = new User();
            //      Scanner scanner = new Scanner(System.in);
            BankAccount bankAccount = new BankAccount();
            double deposit = bankAccount.deposit(20000);

            while (true) {
                try {
                    for (int j = 0; j < deposit; j++) {
                        int withDraw = bankAccount.withDraw(6000);
                        deposit = deposit - withDraw;
                        System.out.println("Успешно! Вы вывели " + withDraw + " сом , Ваш остаток: " + deposit);
                    }
                    break;
                } catch (LimitException e) {
                    System.out.println(e.getMessage() + e.getRemainingAmount());
                    break;

                }
            }
/*        System.out.println("Здраствуйте. ");
        while (true) {
            System.out.println("Введите ваше имя: ");
            String name = scanner.next();
            try {
                user.setName(name);
                System.out.println("Успешно. Ваше имя " + user.getName());
            } catch (IllegalNameLengthException ine) {
                System.out.println(ine.getMessage());
            }
            System.out.println("Введите возраст: ");
            Integer age = scanner.nextInt();
            try {
                user.setAge(age);
                System.out.println("Успешно. Ваш возраст " + user.getAge());
            } catch (IllegalAgeException iae) {
                System.out.println(iae.getMessage());
            }
        }
 */



    }
}
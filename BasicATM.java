import java.util.Scanner;

public class BasicATM {
    public static void main(String[] args) {
        int userInput;
        String userID = "", userPassword = ""; // Kullanıcı adı ve şifre
        String userName, password;
        int balance = 1500; // Başlangıç bakiyesi
        int attempt = 3; // 3 giriş hakkı
        boolean isBlocked = false; // Kullanıcı bloke edildi mi?
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("\nWelcome to BP Bank!\n1- Create account\n2- Login\n3- Exit\nEnter your choice: ");
            userInput = input.nextInt();
            input.nextLine(); // Buffer temizleme

            switch (userInput) {
                case 1:
                    System.out.print("Choose Username: ");
                    userID = input.nextLine();
                    System.out.print("Choose Password: ");
                    userPassword = input.nextLine();
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    if (userID.isEmpty() || userPassword.isEmpty()) {
                        System.out.println("No account found. Please create an account first.");
                        break;
                    }

                    if (isBlocked) {
                        System.out.println("Your account is blocked! You need to reset your password.");
                        System.out.print("Enter your username to reset password: ");
                        String resetUser = input.nextLine();

                        if (resetUser.equals(userID)) {
                            System.out.print("Enter new password: ");
                            userPassword = input.nextLine();
                            attempt = 3; // Şifre sıfırlandığında giriş hakkı yenilenir
                            isBlocked = false;
                            System.out.println("Password reset successfully! You can now log in.");
                        } else {
                            System.out.println("Username does not match! Try again later.");
                        }
                        break;
                    }

                    while (attempt > 0) {  // Kullanıcı giriş yapana kadar tekrar denemesini sağlar
                        System.out.print("Username: ");
                        userName = input.nextLine();
                        System.out.print("Password: ");
                        password = input.nextLine();

                        if (userName.equals(userID) && password.equals(userPassword)) {
                            System.out.println("\nLogin successful! Welcome " + userID + " !");
                            do {
                                System.out.println("\n1- Show balance");
                                System.out.println("2- Withdrawal");
                                System.out.println("3- Deposit");
                                System.out.println("4- Exit");
                                System.out.print("Please select the transaction you would like to perform: ");
                                userInput = input.nextInt();
                                input.nextLine(); // Buffer temizleme

                                switch (userInput) {
                                    case 1:
                                        System.out.println("Your balance: $" + balance);
                                        break;
                                    case 2:
                                        System.out.print("Enter amount to withdraw: ");
                                        int withdraw = input.nextInt();
                                        input.nextLine();
                                        if (withdraw > balance) {
                                            System.out.println("Insufficient funds!");
                                        } else {
                                            balance -= withdraw;
                                            System.out.println("Withdrawal successful! New balance: $" + balance);
                                        }
                                        break;
                                    case 3:
                                        System.out.print("Enter amount to deposit: ");
                                        int deposit = input.nextInt();
                                        input.nextLine();
                                        balance += deposit;
                                        System.out.println("Deposit successful! New balance: $" + balance);
                                        break;
                                    case 4:
                                        System.out.println("Logging out...");
                                        break;
                                    default:
                                        System.out.println("Invalid choice! Please try again.");
                                }
                            } while (userInput != 4);
                            break;  // Başarılı giriş yapınca login döngüsünden çık
                        } else {
                            attempt--;
                            if (attempt > 0) {
                                System.out.println("Incorrect username or password! Remaining attempts: " + attempt);
                            } else {
                                System.out.println("You have been temporarily blocked! Please reset your password.");
                                isBlocked = true; // Kullanıcı bloke edilir
                                break;
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using BP Bank. Goodbye!");
                    System.exit(0); // Programı kapat
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (true); // Program kullanıcı çıkış yapana kadar devam eder
    }
}

# BasicATM - Simple Java ATM Simulation

## Description
BasicATM is a simple Java-based ATM simulation program that allows users to create an account, log in, check their balance, deposit money, and withdraw funds. The program is designed with basic security features, including password protection, login attempt limits, and password reset functionality.

## Features
- **Account Creation**: Users can create an account by setting a username and password.
- **Login System**: Users must log in with their credentials to access their account.
- **Balance Inquiry**: Users can check their account balance.
- **Withdraw Money**: Users can withdraw money from their account if they have sufficient funds.
- **Deposit Money**: Users can deposit money into their account.
- **Account Lock**: After three failed login attempts, the account is temporarily locked until the password is reset.
- **Password Reset**: If an account is locked, users can reset their password by providing their username.
- **Exit Option**: Users can exit the program at any time.

## Prerequisites
- Java Development Kit (JDK) installed (JDK 8 or higher)
- A Java IDE or command-line interface to compile and run the program

## How to Run
1. **Compile the program:**
   ```bash
   javac BasicATM.java
   ```
2. **Run the program:**
   ```bash
   java BasicATM
   ```
3. Follow the on-screen instructions to create an account, log in, and perform transactions.

## Program Flow
1. The user is presented with a menu:
   - Create Account
   - Login
   - Exit
2. If the user selects "Create Account," they set a username and password.
3. If "Login" is selected, the user must enter the correct credentials.
4. After logging in, the user can:
   - Check balance
   - Withdraw money
   - Deposit money
   - Logout
5. If an incorrect username or password is entered three times, the account is locked until the user resets their password.
6. The program runs in a loop until the user chooses to exit.

## Example Usage
```plaintext
Welcome to BP Bank!
1- Create account
2- Login
3- Exit
Enter your choice: 1
Choose Username: JohnDoe
Choose Password: 1234
Account created successfully!

Welcome to BP Bank!
1- Create account
2- Login
3- Exit
Enter your choice: 2
Username: JohnDoe
Password: 1234

Login successful! Welcome JohnDoe!

1- Show balance
2- Withdrawal
3- Deposit
4- Exit
Please select the transaction you would like to perform: 1
Your balance: $1500
```

## Future Improvements
- Store user data persistently using a database or file system.
- Implement a graphical user interface (GUI).
- Add multiple user support.
- Improve security with encrypted password storage.

## License
This project is for educational purposes and is released under the MIT License.

## Author
- **[Your Name]**


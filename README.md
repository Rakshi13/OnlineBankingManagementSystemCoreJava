Implemented core Java banking system using
"OOPS, Collections, Streams, Lambdas, Enums, Singleton & Reflection.”


Think this project as a real bank counter.

User → Menu (Main Class)
     → Service (Business Logic)
     → Repository (Data Storage)
     → Model (Objects)
     → Output to Console

Project Structure :
---------------------
com.bankapp
│
├── main
│   └── BankApplication.java
│
├── model
│   ├── User.java
│   ├── Account.java
│   ├── SavingsAccount.java
│   ├── CurrentAccount.java
│   └── Transaction.java
│
├── enums
│   ├── AccountType.java
│   └── TransactionType.java
│
├── repository
│   ├── UserRepository.java
│   └── TransactionRepository.java
│
├── service
│   ├── AccountService.java
│   ├── TransactionService.java
│   └── impl
│       ├── AccountServiceImpl.java
│       └── TransactionServiceImpl.java
│
├── util
│   ├── Database.java
│   ├── ValidationUtil.java
│   └── ReflectionUtil.java
│
├── exception
│   ├── InsufficientBalanceException.java
│   └── UserNotFoundException.java
│
└── functional
    └── TaxCalculator.java



Final Output of this project will be look like this .
-----------------------------------------------------
/Library/Java/JavaVirtualMachines/jdk-23.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=49700:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/rakshithg/Documents/Mine/BookApp/out/production/BookApp Main
3 Users added successfully

List of USERS are :-
----------------------------------
userid : 1 | Username : Rakshith.G
userid : 2 | Username : Ramu
userid : 3 | Username : Shashank.S

CREATE ACCOUNT FOR SPECIFIC USER:
----------------------------------
User account is created

Deposit amount FOR SPECIFIC USER:
----------------------------------
Balance Amount is successfully despoited:30000.0

Withdraw amount FOR SPECIFIC USER:
----------------------------------
Withdrawal Amount is :20000.0

check bank balance:
----------------------------------
Total Balance is : 10000.0


Process finished with exit code 0

import com.example.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Repository<User, Integer> userRepository = new UserRepository();
    static Repository<Product, Long> productRepository = new ProductRepository();
    static Repository<Order, Integer> orderRepository = new OrderRepository();
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        int ch = 0;

        while (ch != 4) {
            System.out.println("1. User\n2. Product\n3. Order\n4. Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    userOperations();
                    break;
                case 2:
                    productOperations();
                    break;
                case 3:
                    orderOperations();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
//        User user = new User(1, "Riya", 30, "riya@gmail.com");
//        userRepository.save(user);
//        User user1 = new User(2, "Jiya", 30, "jiya@gmail.com");
//        userRepository.save(user1);
//        System.out.println(userRepository.findById(1));
//        System.out.println(userRepository.findById(2));
    }

    private static void orderOperations () {
        int ch = 0;

        while (ch != 3) {
            System.out.println("1. Save Order\n2. Find Oder By ID\n3. Exit\n");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Order ID: ");
                    int orderId = sc.nextInt();
                    System.out.println("Enter User ID: ");
                    int userId = sc.nextInt();
                    System.out.println("Enter Product ID: ");
                    long productId = sc.nextLong();
                    Product prod=productRepository.findById(productId);
//                    System.out.println("Enter Product Name: ");
//                    String productName = sc.next();
                    System.out.println("Enter Quantity: ");
                    int quantity = sc.nextInt();
//                    System.out.println("Enter Price: ");
//                    double price = sc.nextDouble();
                    Order order = new Order(orderId, userId, prod, quantity);
                    orderRepository.save(order);

                    break;
                case 2:
                    System.out.println("Enter order ID: ");
                    int oId = sc.nextInt();
                    System.out.println(orderRepository.findById(oId));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    private static void productOperations () {
        int ch = 0;
        while (ch != 3) {
            System.out.println("1. Save Product\n2. Find Product By ID\n3. Exit\n");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Product ID: ");
                    long productId = sc.nextLong();
                    System.out.println("Enter Product Name: ");
                    String productName = sc.next();
                    System.out.println("Enter Price: ");
                    double price = sc.nextDouble();
                    Product product = new Product(productId, productName, price);
                    productRepository.save(product);
                    break;
                case 2:
                    System.out.println("Enter Product ID: ");
                    long pId = sc.nextLong();
                    System.out.println(productRepository.findById(pId));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    private static void userOperations () {
        int ch = 0;
        while (ch != 3) {
            System.out.println("1. Save User\n2. Find User By ID\n3. Exit\n");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter User ID: ");
                    int userId = sc.nextInt();
                    System.out.println("Enter User Name: ");
                    String userName = sc.next();
                    System.out.println("Enter User Age: ");
                    int userAge = sc.nextInt();
                    System.out.println("Enter User Email: ");
                    String userEmail = sc.next();
                    User user = new User(userId, userName, userAge, userEmail);
                    userRepository.save(user);
                    break;
                case 2:
                    System.out.println("Enter User ID: ");
                    int uId = sc.nextInt();
                    System.out.println(userRepository.findById(uId));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
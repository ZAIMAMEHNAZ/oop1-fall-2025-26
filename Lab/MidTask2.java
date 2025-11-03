package Lab;

public class MidTask2 {
    public static void main(String[] args) {

        String firstName = "Zaima";
        String lastName = "Mehnaz";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name:" + fullName);

        String productName = "Earphone";
        String productId = "2-3567-28";
        String productCode = productName + " " + productId;
        System.out.println("Product Code:" + productCode);

        String email = "zaimamehnaz24@gmail.com";
        String userName = email.substring(0, email.indexOf("@") + 10);
        System.out.println("Username:" + userName);

        String message = "Product purchase Successful!";
        System.out.println("Total number of characters:" + message.length());

        String sentence = "Thank You";
        String message1 = sentence.toUpperCase();
        String message2 = sentence.toLowerCase();
        System.out.println(message1);
        System.out.println(message2);

        String updatedSentence = sentence.replace("Thank You", "Welcome");
        System.out.println("Updated Sentence:" + updatedSentence);

    }
};

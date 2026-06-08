// Main file to test both KidUser and AdultUser
// Test case 1 -> KidUser, Test case 2 -> AdultUser

public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        System.out.println("---Test Case 1 : KidUser---");

        // age = 10, valid kid
        KidUser kid1 = new KidUser(10, "Kids");
        kid1.registerAccount();
        kid1.requestBook();

        System.out.println();

        // age = 18, not a kid
        KidUser kid2 = new KidUser(18, "Fiction");
        kid2.registerAccount();
        kid2.requestBook();

        System.out.println();
        System.out.println("---Test Case 2 : AdultUser---");

        // age = 5, not an adult
        AdultUser adult1 = new AdultUser(5, "Kids");
        adult1.registerAccount();
        adult1.requestBook();

        System.out.println();

        // age = 23, valid adult
        AdultUser adult2 = new AdultUser(23, "Fiction");
        adult2.registerAccount();
        adult2.requestBook();
    }
}

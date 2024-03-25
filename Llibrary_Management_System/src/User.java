class User {

    private String name;
    private final int membershipID;


    public User(String name, int membershipID) {
        this.name = name;
        this.membershipID = membershipID;
    }

    public void displayUserInfo() {
        System.out.println("User Name: " + name);
        System.out.println("Membership ID: " + membershipID);
    }
}
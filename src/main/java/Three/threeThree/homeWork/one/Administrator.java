package Three.threeThree.homeWork.one;

public class Administrator extends User implements iAdministrator {

    public Administrator(String name) {
        super(name);
    }

    @Override
    public void findBook() {
        System.out.println("Administrator took book");
    }

    @Override
    public void overdueNotification(User user) {
        System.out.println(user.getName()+" user has been notified of the delay");

    }
}
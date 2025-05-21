public class AuthService {
    private final UserDao userDao = new UserDao();

    public void register(String username, String password, String firstName, String lastName) throws Exception {
        User user = new User(username, password, firstName, lastName);
        userDao.register(user);
        System.out.println("რეგისტრაცია წარმატებით დასრულდა!");
    }

    public void login(String username, String password) throws Exception {
        User user = userDao.login(username, password);
        if (user != null) {
            System.out.println("მოგესალმებით, " + user.getFirstName() + " " + user.getLastName() + "!");
        } else {
            System.out.println("მომხმარებელი ან პაროლი არასწორია.");
        }
    }
}

package lab_5.ex_11;

public class Author {
    private String name, email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author[" + "name = " + name + ", email = " + email + ']';
    }
}

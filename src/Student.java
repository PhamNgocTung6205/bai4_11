
public class Student {
    String fullname;
    String ID;
    String email;

    /**
     * khoi tao.
     * @param fullname ten.
     * @param ID id.
     * @param email email.
     */
    public Student(String fullname, String ID, String email) {
        this.fullname = fullname;
        this.ID = ID;
        this.email = email;
    }

    /**
     * in.
     * @return chuoi.
     */
    @Override
    public String toString() {
        return "SV: " + fullname + " (ID: " + ID + ")";
    }
}
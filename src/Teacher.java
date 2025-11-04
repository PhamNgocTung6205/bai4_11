
public class Teacher {
    String fullname;
    String ID;
    String email;
    String title; // Chức danh (GS, TS, ThS)

    /**
     * khoi tao.
     * @param fullname ten.
     * @param ID id.
     * @param email email.
     * @param title title.
     */
    public Teacher(String fullname, String ID, String email, String title) {
        this.fullname = fullname;
        this.ID = ID;
        this.email = email;
        this.title = title;
    }

    /**
     * in.
     * @return chuoi.
     */
    @Override
    public String toString() {
        return "GV: " + title + " " + fullname;
    }
}
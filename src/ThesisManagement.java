/**
 * lớp để chạy chương trình.
 * Chứa phương thức main().
 */
public class ThesisManagement {
    public static void main(String[] args) {
        // Khởi tạo các đối tượng
        Student sv1 = new Student("Nguyễn Văn An", "1001", "an.nv@email.com");
        Student sv2 = new Student("Trần Thị Bình", "1002", "binh.tt@email.com");

        Teacher gv1 = new Teacher("Phạm Hùng Cường", "T201", "cuong.ph@edu.vn", "PGS.TS");
        Advisor ad1 = new Advisor("Lê Minh Dũng", "dung.lm@company.com");

        // Khởi tạo các khoá luận
        KLTN<Student, Teacher> kltn1 = new KLTN<>(sv1, gv1, "Hệ thống quản lý thư viện");
        KLTN<Student, Advisor> kltn2 = new KLTN<>(sv2, ad1, "Phân tích dữ liệu bán hàng");
        KLTN<Student, Teacher> kltn3 = new KLTN<>(sv1, gv1, "Blockchain trong truy xuất nguồn gốc");

        // Khởi tạo danh sách sắp xếp và thêm KLTN
        ListSortable<KLTN<?, ?>> dsKLTN = new ListSortable<>();

        // Thêm không theo thứ tự alphabet
        dsKLTN.add(kltn1); // "Hệ thống..."
        dsKLTN.add(kltn2); // "Phân tích..."
        dsKLTN.add(kltn3); // "Blockchain..."

        // In danh sách
        dsKLTN.print();
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Lớp ListSortable
 * E: Là kiểu của đối tượng mà danh sách sẽ chứa
 * Ràng buộc "E extends Comparable<E>" nghĩa
 * là các lớp trong ListSortable thì phải implement giao diện Comparable
 */
public class ListSortable<E extends Comparable> {
    private List<E> danhSach;

    public ListSortable() {
        this.danhSach = new ArrayList<>();
    }

    public void add(E item) {
        this.danhSach.add(item);
    }

    /**
     * Phương thức in danh sách đã được sắp xếp.
     */
    public void print() {
        System.out.println("--- DANH SÁCH KHOÁ LUẬN (ĐÃ SẮP XẾP) ---");
        Collections.sort(this.danhSach);
        for (E item : this.danhSach) {
            System.out.println(item);
        }
    }
}
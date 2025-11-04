public class KLTN<T, V> implements Comparable<KLTN> {
    T student;
    V guide;
    String tenKhoaLuan;

    public KLTN(T student, V guide, String tenKhoaLuan) {
        this.student = student;
        this.guide = guide;
        this.tenKhoaLuan = tenKhoaLuan;
    }

    /**
     * Đây là phương thức để sắp xếp.
     */
    @Override
    public int compareTo(KLTN o) {
        return this.tenKhoaLuan.compareTo(o.tenKhoaLuan);
    }

    @Override
    public String toString() {
        return "KLTN: " + tenKhoaLuan + "\n" +
                "  - " + student.toString() + "\n" +
                "  - " + guide.toString() + "\n";
    }
}
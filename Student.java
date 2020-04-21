public class Student {
    private String Ten;
    private int Tuoi;
    private float Diem;

    public Student(String ten, int tuoi, float diem) {
        Ten = ten;
        Tuoi = tuoi;
        Diem = diem;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public float getDiem() {
        return Diem;
    }

    public void setDiem(float diem) {
        Diem = diem;
    }

}

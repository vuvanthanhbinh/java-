public class SinhVien {
   
    private String hoTen;
    private String maSV;
    private double gpa;

    
    public SinhVien(String hoTen, String maSV, double gpa) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.gpa = gpa;
    }

   
    public void hienThiThongTin() {
        System.out.println("MSSV: " + maSV + " | Ho ten: " + hoTen + " | GPA: " + gpa);
    }

    public boolean xetHocBong() {
        return this.gpa >= 3.2;
    }

    
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Nguyen Van A", "SV001", 3.5);
        SinhVien sv2 = new SinhVien("Tran Thi B", "SV002", 2.8);

        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
    }
}

package quanlysach;

public class Textbook extends Book {
     private String monHoc;
    private String capDo;

    // Constructor đầy đủ
    public Textbook(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
}
// Getter & Setter
    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return super.toString() + 
               ", Mon hoc: " + monHoc +
               ", Cap do: " + capDo;
    }
}
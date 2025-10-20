package quanlysach;
public class Book
{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    // Constructor mặc định
    public Book(){
    }
    // Constructor có tham số 
    public Book(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
}
public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) 
    {
        this.tieuDe = tieuDe;
    }
    public String getTacGia() 
    {
        return tacGia;
    }
    public void setTacGia(String tacGia) 
    {
        this.tacGia = tacGia;
    }
    public int getNamXuatBan() 
    {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) 
    {
        this.namXuatBan = namXuatBan;
    }
    public int getSoLuong()
     {
        return soLuong;
    }
    public void setSoLuong(int soLuong) 
    {
        this.soLuong = soLuong;
    }
    public void hienThiThongTin()
    {
     System.out.println(this.toString());
    }
    // Phương thức toString()
    @Override
    public String toString() {
        return "Ma sach: " + maSach + 
               ", Tieu de: " + tieuDe +
               ", Tac gia: " + tacGia +
               ", Nam xuat ban: " + namXuatBan +
               ", So luong: " + soLuong;
    }
}
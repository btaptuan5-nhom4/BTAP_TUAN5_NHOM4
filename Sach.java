public class Sach 
{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    public Sach() 
    {
        this.maSach = "";
        this.tieuDe = "";
        this.tacGia = "";
        this.namXuatBan = 0;
        this.soLuong = 0;
    }
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    public String getTieuDe() 
    {
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
    public double getGiaBan() 
    {
        return giaBan;
    }
    public void setGiaBan(double giaBan) 
    {
        this.giaBan = giaBan;
    }
    public void hienThiThongTin() 
    {
        System.out.println("----- Thong tin sach -----");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
    }
}

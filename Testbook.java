package quanlysach;
public class Testbook {
    public static void main(String[] args) 
    {
        Book sach1 = new Book("B001", "Lap trinh huong doi tuong", "Nguyen Van A", 2022, 5);
        Book sach2 = new Book();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Cau truc du lieu va giai thuat");
        sach2.setTacGia("Tran Thi B");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(3);
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}

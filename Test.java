public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("S001", "Lap trinh Java", "Nguyen Van A", 2022, 10);
        Sach sach2 = new Sach("S002", "Co so du lieu", "Tran Thi B", 2021, 5);
        Sach sach3 = new Sach();
        sach3.setMaSach("S003");
        sach3.setTieuDe("Mang may tinh");
        sach3.setTacGia("Le Van C");
        sach3.setNamXuatBan(2023);
        sach3.setSoLuong(7);
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
        sach3.hienThiThongTin();
    }
}
 
    


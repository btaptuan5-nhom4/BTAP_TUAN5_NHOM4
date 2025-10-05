public class TestSach 
{
    public static void main(String[] args) 
    {
        Sach s1 = new Sach("S001", "Cau truc du lieu & giai thuat", "Ts.Hoang Thi My Le", 2019, 100);
        Sach s2 = new Sach("S002", "Co so du lieu II", "Ths.Nguyen Thi Ha Quyen", 2025, 100);
        Sach s3 = new Sach();

        s3.maSach = "S003";
        s3.tieuDe = "Thiet ke web";
        s3.tacGia = "Ths.Tran Buu Dung";
        s3.namXuatBan = 2022;
        s3.soLuong = 90;

        s1.hienThiThongTin();
        s2.hienThiThongTin();
        s3.hienThiThongTin();
    }
}

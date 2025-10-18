public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT01", "Giai tich 1", "Nguyen Van A",
                                              2022, 10, 50000, "Toan hoc", "Dai hoc");
        SachTieuThuyet st1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling",
                                               2010, 3, 70000, "Ky ao", true);

        ql.themSach(sg1);
        ql.themSach(st1);

        System.out.println("\n===== HIEN THI DANH SACH =====");
        ql.hienThiDanhSachSach();

        IKiemKe kiemKe = new SachGiaoTrinh("GT02", "Hoa hoc", "Tran Van B",
                                           2021, 5, 55000, "Hoa hoc", "Pho thong");

        System.out.println("\n===== KIEM TRA GIAO DIEN =====");
        boolean coDu = kiemKe.kiemTraTonKho(100);
        System.out.println("Kiem tra ton kho (nguong 100) => " + (coDu ? "Du" : "Khong du"));
        kiemKe.capNhatViTri("Kho A1-Ke 5");

        System.out.println("\n===== KET QUA CUOI CUNG =====");
        ql.hienThiDanhSachSach();
    }
}

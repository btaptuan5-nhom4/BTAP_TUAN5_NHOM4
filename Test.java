public class Test 
{
    public static void main(String[] args) 
    {
        Sach s1 = new Sach("S001", "Lap trinh Java", "Nguyen Van A", 2022, 10);
        Sach s2 = new Sach("S002", "Lap trinh C", "Tran Thi B", 2023, 5);

        s1.hienThiThongTin();
        s2.hienThiThongTin();

        Sach s3 = new Sach();
        s3.hienThiThongTin();

        System.out.println("\nSau khi cap nhat:");
        System.out.println("Tieu de moi: " + s1.getTieuDe());
    }
}

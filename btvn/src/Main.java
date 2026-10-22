public class Main {
    public static void main(String[] args) {

        SanPham banPhim = new SanPham("SP01", "Bàn phím cơ", 450000, 20);
        SanPham chuot = new SanPham("SP02", "Chuột không dây", 200000, 50);


        SanPham taiNghe = new SanPham("SP03", "Tai nghe");
        taiNghe.setDonGia(350000);
        taiNghe.setSoLuongTon(10);

        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        banPhim.hienThi();
        chuot.hienThi();
        taiNghe.hienThi();

        DonHang donAn = new DonHang("An", banPhim, 2);
        DonHang donBinh = new DonHang("Bình", chuot, 5);

        DonHang donChi = new DonHang("Chi", taiNghe, 0);

        System.out.println("\n===== DANH SÁCH ĐƠN HÀNG =====");
        System.out.printf("%-6s %-17s %-3s %-9s\n", "Khách", "Sản phẩm", "SL", "Thành tiền");
        donAn.inDonHang();
        donBinh.inDonHang();
        donChi.inDonHang();
    }
}
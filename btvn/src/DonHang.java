public class DonHang {
    private String tenKhach;
    private SanPham sanPham;
    private int soLuong;

    public DonHang(String tenKhach, SanPham sanPham, int soLuong) {
        this.tenKhach = tenKhach;
        this.sanPham = sanPham;

        if (soLuong < 1) {
            this.soLuong = 1;
        } else {
            this.soLuong = soLuong;
        }
    }

    public double tinhThanhTien() {
        double tong = sanPham.getDonGia() * soLuong;
        if (soLuong >= 5) {
            tong = tong * 0.9;
        }
        return tong;
    }

    public void inDonHang() {
        System.out.printf("Khách: %-6s | Mua: %-2d %-15s | Phải trả: %-9.0f\n",
                tenKhach, soLuong, sanPham.getTenSP(), tinhThanhTien());
    }
}
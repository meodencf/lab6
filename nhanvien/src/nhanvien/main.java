
package nhanvien;


public class main {
    public static void main(String[] args){
        NhanVienFullTime nhanvienfulltime = new NhanVienFullTime();
        nhanvienfulltime.TinhLuong();
        nhanvienfulltime.NhanVienFullTime();
        nhanvienfulltime.TenNhanVien();
        nhanvienfulltime.loainhanvien();
        
        NhanVienPartTime nhanvienparttime = new NhanVienPartTime();
        nhanvienparttime.nhanvienparttime();
        nhanvienparttime.tinhluong();
        nhanvienparttime.loainhanvien();
    }
}

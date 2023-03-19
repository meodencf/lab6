
package nhanvien;

public class NhanVienFullTime extends Nhanvien{

    static void TinhLuong() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int loaiChucVu;
    int ngayLamThem;
    
    public void loainhanvien(){
        System.out.println("ten nhan vien:"+loaiChucVu);
    }
    @Override
    public void tinhluong(){
        System.out.println("luong nhan vien:"+luong*ngayLamThem);
    }
    public void NhanVienFullTime(){
        System.out.println("ngay lam them:"+ngayLamThem);
    }

}

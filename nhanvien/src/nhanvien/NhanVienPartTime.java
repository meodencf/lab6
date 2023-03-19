
package nhanvien;


public class NhanVienPartTime extends Nhanvien {
    int giolamviec;
    String loainhanvien;
    public void nhanvienparttime(){
        System.out.println("ten nhan vien:"+ten);
        System.out.println("gio lam viec nhan vien:"+giolamviec);
    }
    public void loainhanvien(){
        System.out.println("loai nhan vien:"+loainhanvien);
    }
    @Override
    public void tinhluong(){
        System.out.println("luong nhan vien:"+luong*giolamviec);
    }
}

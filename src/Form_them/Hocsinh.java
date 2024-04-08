package Form_them;
import java.util.Date;
public class Hocsinh{
    private String maSV;
    private String tenSV;
    private Date ngaySinh;
    private boolean gioiTinh;
    private String dienThoai;
    private String email;
    
    public Hocsinh(String maSV, String tenSV, Date ngaySinh, boolean gioiTinh, String dienThoai, String email) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
        this.email = email;
    }

    public Hocsinh() {
    }

    
    
}

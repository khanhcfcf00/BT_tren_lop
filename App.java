public class Hoa_qua {
    public String hinhdang ;
    public String So_luong_hien_co /*don vi: Tan */;
    public String ngay_nhap_hang ;
    public Double gia_ban/*don vi VND/kg */ ;
public Hoa_qua(String hinhdang, String so_luong_hien_co, String ngay_nhap_hang, Double gia_ban){
    this.hinhdang = hinhdang ;
    this.So_luong_hien_co = so_luong_hien_co;
    this.gia_ban = gia_ban ;
    this.ngay_nhap_hang = ngay_nhap_hang ;
}}
public class Tao extends Hoa_qua {
    public Tao(String hinhdang, String so_luong_hien_co, String ngay_nhap_hang, Double gia_ban) {
        super(hinhdang, so_luong_hien_co, ngay_nhap_hang, gia_ban);
    }
}
public class Cam extends Hoa_qua {

    public Cam(String hinhdang, String so_luong_hien_co, String ngay_nhap_hang, Double gia_ban) {
        super(hinhdang, so_luong_hien_co, ngay_nhap_hang, gia_ban);
    }

}
public class Cam_Cao_Phong extends Cam {
    public Cam_Cao_Phong(String hinhdang, String so_luong_hien_co, String ngay_nhap_hang, Double gia_ban) {
        super(hinhdang, so_luong_hien_co, ngay_nhap_hang, gia_ban);
    }

    public void setgia_ban(int i) {
    }

    public void setSo_luong_hien_co(int i) {
    }

    public void hinhdang(int tron) {
    }
    
}
public class cam_sanh extends Cam {
    public cam_sanh(String hinhdang, String so_luong_hien_co, String ngay_nhap_hang, Double gia_ban) {
        super(hinhdang, so_luong_hien_co, ngay_nhap_hang, gia_ban);
    }   
}
public class App {
    public static void main(String[] args) throws Exception {
       Cam_Cao_Phong cao_Phong = new Cam_Cao_Phong(String, String, String, Double);
       cao_Phong.setgia_ban(20000);
       int hai_tan;
       cao_Phong.setSo_luong_hien_co( hai_tan);
       int tron;
       cao_Phong.hinhdang( tron);
       cao_Phong.setngay_nhap_hang(hom_qua);
    }
}

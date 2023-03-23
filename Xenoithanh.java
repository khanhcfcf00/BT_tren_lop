public class Xenoithanh {
    public String MaSoChuyen;
    public String Hotentaixe;
    public String SoXe;
    public int SoTuyen;
    public int getSoTuyen() {
        return SoTuyen;
    }
    private float QuangDuong;
    public float getQuangDuong() {
        return QuangDuong;
    }
    private double Doanhthu;
    public double getDoanhthu() {
        return Doanhthu;
    }
    public void setDoanhthu(float doanhthu) {
        Doanhthu = doanhthu;
    }
    public String getMaSoChuyen (){
       return this.MaSoChuyen;}
public String setHotentaixe(){
    return this.Hotentaixe;
}
public String setSoXe(){
    return this.SoXe;
}

public void getSoTuyen(int SoTuyen){
    this.SoTuyen = SoTuyen;
}
public void setQuangDuong( float QuangDuong){
    this.QuangDuong = QuangDuong ;
}
public void Doanhthu(double d){
    this.Doanhthu = d;
}
void Indanhsach(){
    
    System.out.print(MaSoChuyen + "\n");
    System.out.print(Hotentaixe + "\n");
    System.out.print(SoXe + "\n");
    System.out.print(SoTuyen + "\n");
    System.out.print(QuangDuong + "\n");
    System.out.print(Doanhthu + "\n");
}
}
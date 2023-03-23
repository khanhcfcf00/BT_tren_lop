public class Xengoaithanh {
    public String MaSoChuyen;
    public String Hotentaixe;
    private String SoXe;
    private String noiden;
    public String getnoiden() {
        return noiden;
    }
    private float Doanhthu;
    public float getDoanhthu() {
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
public String getSoXe(){
    return this.SoXe;
}
private int Songaydiduoc;
public int getSongaydiduoc() {
    return Songaydiduoc;
}
public void setSongaydiduoc(int songaydiduoc) {
    Songaydiduoc = songaydiduoc;
}
public void Doanhthu(float Doanhthu){
    this.Doanhthu = Doanhthu;
}
void Indanhsach(){
    
    System.out.print(MaSoChuyen + "\n");
    System.out.print(Hotentaixe + "\n");
    System.out.print(SoXe + "\n");
    System.out.print(noiden + "\n");
    System.out.print(Songaydiduoc + "\n");
    System.out.print(Doanhthu + "\n");
}
}

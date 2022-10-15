public class LuongHuu {
    private int tuoi_nghi;
    private int nam_bhxh;
    private int tien_luong;
    
    public LuongHuu() {
        tuoi_nghi = 0;
        nam_bhxh = 0;
        tien_luong = 0;
    }
    public LuongHuu(int tuoi_nghi, int nam_bhxh, int tien_luong) {
        this.tuoi_nghi = tuoi_nghi;
        this.nam_bhxh = nam_bhxh;
        this.tien_luong = tien_luong;
    }
    public int getTuoiNghi() {
        return tuoi_nghi;
    }
    public void setTuoiNghi(int tuoi_nghi) {
        this.tuoi_nghi = tuoi_nghi;
    }
    
    public int getNamBhxh() {
        return nam_bhxh;
    }
    public void setNamBhxh(int nam_bhxh) {
        this.nam_bhxh = nam_bhxh;
    }
    
    public int getTienLuong() {
        return tien_luong;
    }
    public void setTienLuong(int tien_luong) {
        this.tien_luong = tien_luong;
    }
    public double tyLeLuong() {
         double ty_le_luong = 0.45 + (nam_bhxh - 20) * 0.02;
         if (ty_le_luong > 0.75) {
             ty_le_luong = 0.75;
         }
         return ty_le_luong;
    }
     public int mucLuong() {
        int muc_luong;
        if (tuoi_nghi < 47 || nam_bhxh < 20) {
            muc_luong = 0;
        } else {
            muc_luong = (int)(tien_luong * tyLeLuong());
        }
        return muc_luong;
    }
    
    public String run() {
        if (tuoi_nghi < 0 || tuoi_nghi > 56 || nam_bhxh < 0 || nam_bhxh > 100 || tien_luong < 0 || tien_luong > 29800000) {
            return ("khong hop le");
        } else {
            return ("" + mucLuong());
        }
    }

    /*============================KIỂM THỬ DÒNG ĐIỀU KHIỂN ==================================*/
    public int MucLuongHuu (int tuoi_nghi, int nam_bhxh, int tien_luong) {
        int muc_luong;
        double ty_le_luong;
        if (tuoi_nghi < 0 || tuoi_nghi > 56 || nam_bhxh < 0 || nam_bhxh > 100 || tien_luong < 0 || tien_luong > 29800000) {
            muc_luong = -1; // không hợp lệ
        } else if (tuoi_nghi < 47 || nam_bhxh < 20) {
            muc_luong = 0;
        } else {
            ty_le_luong = Math.max ((0.45 + (nam_bhxh - 20) * 0.02), 0.75);
            muc_luong = (int) (tien_luong * ty_le_luong);
        }
        return muc_luong;
    }
    
}
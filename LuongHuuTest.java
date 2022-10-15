
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LuongHuuTest {
    int tuoi_nghi = 52;
    int nam_bhxh = 35;
    int tien_luong = 3000000;
    
    LuongHuu test = new LuongHuu(tuoi_nghi, nam_bhxh, tien_luong);
    // @Test
    // public void luong_nghi_test(){
    //     assertEquals("khong hop le", test.run());
    // }
    @Test
    public void muc_luonghuu_test(){
        assertEquals(2250000, test.MucLuongHuu(tuoi_nghi, nam_bhxh, tien_luong));
    }
}

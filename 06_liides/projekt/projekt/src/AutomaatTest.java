import org.junit.Assert;
import org.junit.Test;

public class AutomaatTest {
    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_alguses_on_4() {
        isikukoodEE ee = new isikukoodEE("Martiine", "40404049996");
        Assert.assertEquals("F", ee.getSugu());
    }
    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_alguses_on_7() {
        isikukoodEE ee = new isikukoodEE("Martiine", "70303039914");
        Assert.assertEquals("Vigane isikukood!", ee.getSugu());
    }

    @Test
    public void kontrolli_kas_kuupaev_on_03_03_1903_kui_isikukood_30303039914() {
        isikukoodEE ee = new isikukoodEE("Martiine", "30303039914");
        Assert.assertEquals("03.03.1903", ee.getKuupaev());
    }
    @Test
    public void kontrolli_kas_kuupaev_on_11_11_1911_kui_isikukood_111111_111Q() {
        isikukoodFI fi = new isikukoodFI("Martiinas", "111111-111Q");
        Assert.assertEquals("11.11.1911", fi.getKuupaev());
    }
}

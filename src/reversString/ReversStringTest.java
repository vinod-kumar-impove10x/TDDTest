package reversString;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ReversStringTest {
    @Test
    public void nothing(){

    }

    @Test
    public void givenVinod_returnsDoniv(){
        ReversString reversString = new ReversString();
        String result = reversString.revers("Vinod");
        assertEquals("doniV",result);
    }

    @Test
    public void givenJyothi_returnsIhtoyj(){
        ReversString reversString = new ReversString();
        String result = reversString.revers("Jyothi");
        assertEquals("ihtoyJ",result);
    }

    @Test
    public void givenSumanth_returnsHtnamus(){
        ReversString reversString = new ReversString();
        String result = reversString.revers("Sumanth");
        assertEquals("htnamuS",result);
    }

    @Test
    public void givenVissu_returnsUssiv(){
        ReversString reversString = new ReversString();
        String result = reversString.revers("Vissu");
        assertEquals("ussiV",result);
    }
}

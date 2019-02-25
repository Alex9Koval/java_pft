package ua.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void testArea(){
        Root r = new Root(5,3,6,4 );
        Assert.assertEquals(r.distance(), 1.4142135623730951);
    }
}

import org.junit.*;

public class A4JUnitTests {


    /*@BeforeClass    // annotation for prerequisites
    public void beforeClassMethod() {
    }*/

    @Before    // annotation for starting activities before each testing method
    public void setUp() {
    }

    @Test    // annotation for main activities for each testing method
    public void method1() {
        Assert.assertTrue(1 + 1 == 2);
        Assert.assertTrue("Message: ",1 + 1 == 2);
        Assert.assertFalse(1 + 1 == 4);
    }

    @Test    // annotation for main activities for each testing method
    @Ignore
    public void method2() {
        Assert.assertNull("");
        Assert.assertNotNull("");
    }

    @Test    // annotation for main activities for each testing method
    public void method3() {
        Assert.assertEquals(10,5 + 5);
        Assert.assertNotEquals(10,2 + 2);
    }

    @After    // annotation for closing activities after each testing method
    public void tearDown() {
    }

    /*@AfterClass    // annotation for closing activities
    public void afterClassMethod() {
    }*/
}

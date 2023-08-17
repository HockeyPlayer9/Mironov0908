import org.example.CashbackHackService;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    @org.junit.Test
    public void testRemain () {
        CashbackHackService service = new CashbackHackService();
        int amount = 2300;
        int actual = service.remain(amount);
        int expected = 700;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainCash () {
        CashbackHackService service = new CashbackHackService();
        int amount = 5000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }
}

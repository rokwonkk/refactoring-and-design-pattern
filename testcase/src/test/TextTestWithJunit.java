package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextTestWithJunit {

    @Test
    public void testToNumber(){
        Text text = new Text("123");
        assertEquals(new Integer(123), text.toNumber());
    }

    @Test
    public void testToNumber_nullorEmpty(){
        Text text1 = new Text(null);
        assertNull(text1.toNumber());
        Text text2 = new Text("");
        assertNull(text2.toNumber());
    }

    @Test
    public void testToNumber_containsLeadingAndTrailingSpaces(){
        Text text1 = new Text(" 123");
        assertEquals(123, text1.toNumber());

        Text text2 = new Text("123 ");
        assertEquals(123, text2.toNumber());

        Text text3 = new Text(" 123 ");
        assertEquals(123, text3.toNumber());
    }

    @Test
    public void testToNumber_containsMultiLeadingAndTrailingSpaces(){

        Text text1 = new Text(" 123");
        assertEquals(123, text1.toNumber());

        Text text2 = new Text("123 ");
        assertEquals(123, text2.toNumber());

        Text text3 = new Text(" 123 ");
        assertEquals(123, text3.toNumber());

    }

    @Test
    public void testToNumber_containsInvalidCharaters(){

        Text text1 = new Text("123a4");
        Assert.assertNull(text1.toNumber());

        Text text2 = new Text("123 4");
        Assert.assertNull(text2.toNumber());

    }
}

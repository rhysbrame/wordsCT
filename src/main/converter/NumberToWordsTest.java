package main.converter;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import static main.converter.NumberToWords.convert;

public class NumberToWordsTest extends TestCase {

    @Test
    public void testZero() {
        Assert.assertEquals("zero", convert(0));
    }

    @Test
    public void testOver() {
        Assert.assertEquals("number too large", convert(1234567890));
    }

    @Test
    public void testUnique() {
        Assert.assertEquals("one", convert(1));
        Assert.assertEquals("ten", convert(10));
        Assert.assertEquals("nineteen", convert(19));
    }

    @Test
    public void testTens() {
        Assert.assertEquals("twenty", convert(20));
        Assert.assertEquals("twenty one", convert(21));
    }
}
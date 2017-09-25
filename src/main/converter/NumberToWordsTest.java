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

    @Test
    public void testHundredAnd() {
        Assert.assertEquals("one hundred", convert(100));
        Assert.assertEquals("one hundred and one", convert(101));
        Assert.assertEquals("nine hundred and ninety nine", convert(999));
    }

    @Test
    public void testThousandAnd() {
        Assert.assertEquals("one thousand", convert(1000));
        Assert.assertEquals("one thousand and one", convert(1001));
        Assert.assertEquals("five thousand one hundred and ten", convert(5110));
        Assert.assertEquals("nine thousand nine hundred and ninety nine", convert(9999));
    }




}
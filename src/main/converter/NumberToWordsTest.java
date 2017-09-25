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

    @Test
    public void testUpToMillion() {
        Assert.assertEquals("one hundred thousand", convert(100000));
        Assert.assertEquals("one hundred thousand and one", convert(100001));
        Assert.assertEquals("one hundred thousand and ten", convert(100010));
        Assert.assertEquals("one hundred thousand one hundred and ten", convert(100110));
        Assert.assertEquals("nine hundred and ninety nine thousand nine hundred and ninety nine", convert(999999));
    }

    @Test
    public void testUpToBillion() {
        Assert.assertEquals("one million", convert(1000000));
        Assert.assertEquals("one million and one", convert(1000001));
        Assert.assertEquals("one million and ten", convert(1000010));
        Assert.assertEquals("nine million one hundred thousand one hundred and ten", convert(9100110));
        Assert.assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", convert(56945781));
        Assert.assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", convert(999999999));
    }
}
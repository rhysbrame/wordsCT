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
}
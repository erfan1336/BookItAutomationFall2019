package com.bookit.units;

import com.bookit.utilities.APIUtilities;
import org.junit.Assert;
import org.junit.Test;

public class APIUtilitiesUnitTests {

    /**
     *Class with units tests for APIUtilities class
     * Here we ensure that utilities work fine before using them in action
     */
    @Test
    public void getTokenTest(){
        String token = APIUtilities.getToken();
        String tokenForStudent = APIUtilities.getToken("student");
        String tokenForTeacher = APIUtilities.getToken("teacher");

        Assert.assertNotNull(token);
        Assert.assertNotNull(tokenForStudent);
        Assert.assertNotNull(tokenForTeacher);
    }
}

package com.stackroute.movieapp.repositoriestest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
public class FakeIntegrationTestIT {

    @Test
    public void fakeTest(){
        assertTrue(false);
    }
}
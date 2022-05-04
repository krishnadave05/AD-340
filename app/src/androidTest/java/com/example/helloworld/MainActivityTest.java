package com.example.helloworld;

import static org.junit.Assert.*;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule mainActivityRule = new ActivityScenarioRule<>(MainActivity.class);

//   @Test
//    public void displaysHelloWorld(){
//        onView(withId(R.id.hello_world)).check(matches(withText("helloworld")));
//    }

}
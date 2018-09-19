package com.example.prate.coloradogeology;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeDown;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class MainActivityUITest{

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

   // @Rule
 //   public IntentsTestRule<MainActivity> intentsTestRule =
//            new IntentsTestRule<>(MainActivity.class);

    @Test
    public void clickOnNationalParksTab(){
        onView(withText("National Parks")).perform(click());
        //onView(withText("Geologic Summary")).perform(click());
    }

    @Test
    public void clickOnFossilsTab(){
        onView(withId(R.id.tabs)).perform(swipeLeft());
        onView(withText("Fossils")).perform(click());
        //onView(withText("Geologic Summary")).perform(click());
    }

    @Test
    public void clickOnEarthquakesTab(){
        onView(withId(R.id.tabs)).perform(swipeLeft());
        onView(withText("Earthquakes")).perform(click());
        onView(withId(R.id.earthquake_list)).perform(ViewActions.swipeUp());
    }

    @Test
    public void swipeToNationalParksTab(){
        onView(withId(R.id.viewpager)).perform(ViewActions.swipeLeft());
    }

    @Test
    public void swipeToFossilsTab(){
        onView(withId(R.id.viewpager)).perform(ViewActions.swipeLeft(), ViewActions.swipeLeft());

    }

    @Test
    public void swipeToEarthquakesTab(){
        onView(withId(R.id.viewpager)).perform(ViewActions.swipeLeft(), ViewActions.swipeLeft(), ViewActions.swipeLeft());

    }

    @Test
    public void validateFirstEarthquakeIntentOpensUri(){
        onView(withId(R.id.tabs)).perform(swipeLeft());
        onView(withText("Earthquakes")).perform(click());
        onData(anything()).inAdapterView(withId(R.id.earthquake_list)).atPosition(0).perform(click());

    }

    @Test
    public void validateLastEarthquakeIntent(){
        onView(withId(R.id.tabs)).perform(swipeLeft());
        onView(withText("Earthquakes")).perform(click());
        onView(withId(R.id.earthquake_list)).perform(ViewActions.swipeUp(), ViewActions.swipeUp());
        onData(anything()).inAdapterView(withId(R.id.earthquake_list)).atPosition(30).perform(click());

    }


}
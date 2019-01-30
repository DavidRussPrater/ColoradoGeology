package com.example.prate.coloradogeology;

import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.espresso.contrib.NavigationViewActions;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.swipeRight;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;

@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);


    // This test case confirms that the ListView in the national parks fragment works correctly
    @Test
    public void scrollNationalParksList() {
        onView(withId(R.id.list)).perform(swipeUp());

    }


    // This test case confirms that clicking on the hamburger icon in the AppBar opens the
    // navigation drawer
    @Test
    public void openAndCloseNavigationBar() {
        onView(withId(R.id.drawer_layout))
                .perform(DrawerActions.open());
        onView(withId(R.id.drawer_layout)).perform(DrawerActions.close());
    }


    // This test confirms that each fragment is navigated to correctly
    @Test
    public void testNavigationMenu() {

        // Open the navigation menu and click on the national parks menu.
        onView(withId(R.id.drawer_layout))
                .perform(DrawerActions.open());
        onView(withId(R.id.nvView)).perform(NavigationViewActions.navigateTo(R.id.national_parks_menu));


        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Open the navigation menu and click on the fossils menu
        onView(withId(R.id.drawer_layout))
                .perform(DrawerActions.open());
        onView(withId(R.id.nvView)).perform(NavigationViewActions.navigateTo(R.id.fossils_menu));

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Open the navigation menu and click on the earthquake menu
        onView(withId(R.id.drawer_layout))
                .perform(DrawerActions.open());
        onView(withId(R.id.nvView)).perform(NavigationViewActions.navigateTo(R.id.earthquake_menu));

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }



    // This test case confirms that swiping right from the edge opens
    @Test
    public void swipeToOpenNavigationDrawer(){

        onView(withId(R.id.drawer_layout)).perform(swipeRight());


    }


    // This test case confirms that the ListView in the fossil fragment works correctly
    @Test
    public void scrollFossilsList() {
        // Open the navigation menu and click on the fossils menu
        onView(withId(R.id.drawer_layout))
                .perform(DrawerActions.open());
        onView(withId(R.id.nvView)).perform(NavigationViewActions.navigateTo(R.id.fossils_menu));

        // Swiped the fossils list
        onView(withId(R.id.list)).perform(swipeUp());

    }


    // This test case confirms that the Earthquake ListView scrolls correctly
    @Test
    public void scrollEarthquakesList() {
        // Open the navigation menu and click on the fossils menu
        onView(withId(R.id.drawer_layout))
                .perform(DrawerActions.open());
        onView(withId(R.id.nvView)).perform(NavigationViewActions.navigateTo(R.id.earthquake_menu));

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Swiped the fossils list
        onView(withId(R.id.earthquake_list)).perform(swipeUp());


    }

    // This test case confirms that the Earthquake Maps fragment is opened correctly when clicked on
    @Test
    public void clickOnEarthquakesMap() {
        // Open the navigation menu and click on the fossils menu
        onView(withId(R.id.drawer_layout))
                .perform(DrawerActions.open());
        onView(withId(R.id.nvView)).perform(NavigationViewActions.navigateTo(R.id.earthquake_menu));

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Swiped the fossils list
        onView(withText("Earthquake Map")).perform(click());

    }

    @Test
    public void clickOnNationalParksTab() {
        // Open the navigation menu and click on the fossils menu
        onView(withId(R.id.drawer_layout))
                .perform(DrawerActions.open());
        onView(withId(R.id.nvView)).perform(NavigationViewActions.navigateTo(R.id.national_parks_menu));

        // Swiped the fossils list
        onView(withText("Map of Parks")).perform(click());

    }


    // This test case confirms that the Earthquake Maps fragment is opened correctly when swiped left
    @Test
    public void swipeToEarthquakesMapTab() {
        // Open the navigation menu and click on the fossils menu
        onView(withId(R.id.drawer_layout))
                .perform(DrawerActions.open());
        onView(withId(R.id.nvView)).perform(NavigationViewActions.navigateTo(R.id.earthquake_menu));

        // Swiped the fossils list
        onView(withId(R.id.earthquake_list)).perform(swipeLeft());
    }

    // This test case confirms that the user can navigate back to the National Parks fragment
    @Test
    public void clickBackToGeologicSummary() {

        // Open the navigation menu and click on the fossils menu
        onView(withId(R.id.drawer_layout))
                .perform(DrawerActions.open());
        onView(withId(R.id.nvView)).perform(NavigationViewActions.navigateTo(R.id.national_parks_menu));

        // Swiped the fossils list
        onView(withId(R.id.list)).perform(swipeLeft());

    }

    // This test case confirms that the browser is opened when the first earthquake in the ListView
    // is clicked on
    @Test
    public void validateFirstEarthquakeIntentOpensUri() {
        // Open the navigation menu and click on the earthquake menu
        onView(withId(R.id.drawer_layout))
                .perform(DrawerActions.open());
        onView(withId(R.id.nvView)).perform(NavigationViewActions.navigateTo(R.id.earthquake_menu));

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        onData(anything()).inAdapterView(withId(R.id.earthquake_list)).atPosition(0).perform(click());

    }

    // This test case confirms that the browser is opened when the last earthquake int the ListView
    // is clicked on
    @Test
    public void validateLastEarthquakeIntent() {
        // Open the navigation menu and click on the earthquake menu
        onView(withId(R.id.drawer_layout))
                .perform(DrawerActions.open());
        onView(withId(R.id.nvView)).perform(NavigationViewActions.navigateTo(R.id.earthquake_menu));

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        onView(withId(R.id.earthquake_list)).perform(ViewActions.swipeUp(), ViewActions.swipeUp());
        onData(anything()).inAdapterView(withId(R.id.earthquake_list)).atPosition(30).perform(click());

    }


}

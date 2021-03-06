package pl.edu.agh.qualitycalculator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.fail;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void testSum(){
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("4"));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("4.0 plus 4.0 gives value 8.0")));
       }
    @Test
    public void testMULTIPLY(){
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("5.0"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("5.0"));
        onView(withId(R.id.btnMult)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("5.0 multiplied by 5.0 gives value 25.0")));
    }
    @Test
    public void testDIVIDE(){
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("20.0"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("5.0"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("20.0 divided by 5.0 gives value 4.0")));
        // komentarz
    }
    @Test
    public void testSubstract(){
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("20.0"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("5.0"));
        onView(withId(R.id.btnSub)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("20.0 minus 5.0 gives value 15.0")));
        // komentarz
    }
    @Test
    public void testAverage(){
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("20.0"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("5.0"));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText("5.0"));
        onView(withId(R.id.btnAverage)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("20.0 average by 5.0 average by 5.0 gives value 10.0")));
        // komentarz
    }
    @Test
    public void testError1(){
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum1)).perform(click()).perform(typeText("20.0"));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText("0.0"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("20.0 divided by 0.0 gives value Infinity")));
        // komentarz
    }
    @Test
    public void testError2(){
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum1)).perform(click()).perform(typeText(""));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText(""));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
        // komentarz
    }
    @Test
    public void testError3(){
        //fail("Not implemented yet!");

        onView(withId(R.id.etNum1)).perform(click()).perform(typeText(""));
        onView(withId(R.id.etNum2)).perform(click()).perform(typeText(""));
        onView(withId(R.id.etNum3)).perform(click()).perform(typeText(""));
        onView(withId(R.id.btnAverage)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Enter some data to calculate")));
        // komentarz
    }
}


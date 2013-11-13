package com.figitaki.androidsamples;

import android.annotation.SuppressLint;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.figitaki.androidsamples.MainActivityTest \
 * com.figitaki.androidsamples.tests/android.test.InstrumentationTestRunner
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private MainActivity mMainActivity;
    private EditText mEditText;

    @SuppressLint("NewApi")
    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mMainActivity = getActivity();
        mEditText = (EditText) mMainActivity
                .findViewById(R.id.edit_message);
    }

    public void testPreconditions() {
        assertNotNull("mMainActivity is null", mMainActivity);
        assertNotNull("mEditText is null", mEditText);
    }

    public void testEditMessage_hintText() {
        final String expected =
                mMainActivity.getString(R.string.edit_message);
        final String actual = mEditText.getHint().toString();
        assertEquals(expected, actual);
    }
}

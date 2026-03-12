package edu.up.cs301junitstarter;

/**
 * A single point in 2D space.
 * The coordinates are integers.
 *
 * Future instructors: I used a custom class here because, if you use android.graphics.Point,
 * you need to set up Robolectric or something if you want to run unit tests on it.
 * I called it Coords instead of Point so Android Studio won't try to auto-import
 * android.graphics.Point in students' TwoPointsTest file.
 */
public class Coords {

    public int x;
    public int y;

    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }


}

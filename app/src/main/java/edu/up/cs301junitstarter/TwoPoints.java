package edu.up.cs301junitstarter;

import java.util.Random;

/**
 * This class is designed to perform operations on two points in 2D space
 */
public class TwoPoints {

    // Future instructors: do not change to an android.graphics.Point (unless you want to set up Robolectric).
    private Coords[] points = new Coords[2];
    private Random rand = new Random();

    /** ctor */
    public TwoPoints() {
        points[0] = new Coords(0,0);
        points[1] = new Coords(0,0);
    }

    /** Gets a point.
     * - Assume this won't be called with an invalid index.
     */
    public Coords getPoint(int index) {
        return points[index];
    }

    /** Set a point.
     * - Assume this won't be called with an invalid index.
     * - The x and y parameters should work as positive, negative, or zero.
     */
    public void setPoint(int index, int x, int y) {
        points[index].x = x;
        points[index].y = y;
    }

    /** Assign a random value to a point.
     * - Assume this won't be called with an invalid index.
     * - The point at that index will be given new x and y coordinates.
     * - If you run this several times, the x and y coordinates should sometimes be positive, other times negative.
     * - The other point should stay the same.
     */
    public void randomValue(int index) {
        int x = rand.nextInt(20) - 10;
        int y = rand.nextInt(20) - 10;
        setPoint(index, x, y);
    }

    /** Sets a point to the origin.
     * - Assume this won't be called with an invalid index.
     * - The point at that index will have its x and y coordinates set to zero.
     * - The other point should stay the same.
     */
    public void setOrigin(int index) {
        setPoint(index, 0, 0);
    }

    /** Copy the values in one point to the other.
     * - Assume that this won't be called with an invalid index as either argument.
     * - The x and y coordinates of the destination point should change to match the current x and y coordinates of the source point.
     * - The source point's coordinates should not change.
     * - It should be a deep copy -- i.e., the two points should not be pointing to the same object after this runs.
     */
    public void copy(int srcIndex, int destIndex) {
        points[destIndex] = points[srcIndex];
    }

    /** Calculates the distance between the two points.
     * - Should work regardless of whether the invisible line between the two points is horizontal, vertical, or diagonal.
     * - Should work regardless of whether the x1-x0 is positive, negative, or zero; same for y1-y0.
     * - Should work for fractional distances as well as whole-number ones.
     * - Should work even when the distance is zero.
     */
    public double distance() {
        double result = 0.0;
        int xDiff = points[0].x - points[1].x;
        int yDiff = points[0].y - points[1].y;
        result = Math.sqrt(xDiff*xDiff + yDiff*yDiff);
        return result;
    }

    /** Calculates the slope of a line passing through the two points.
     * - The line starts at the point at index 0 and goes to the point at index 1. (E.g., if the points are (0,0) and (1,1), the slope should be *positive* 1.)
     * - If the line is vertical or the points are identical, we can't calculate the slope because it involves dividing by zero; this should throw an ArithmeticException (i.e., crashing is the desired behavior in this situation).
     * - If the line is horizontal, the slope should be zero.
     * - Should work regardless of whether the x1-x0 is positive, negative, or zero; same for y1-y0.
     * - Should work for fractional slopes as well as whole-number slopes.
     */
    public double slope() {
        double result = 0.0;
        if (points[0] == points[1]) {
            return result;
        }

        int xDiff = points[0].x - points[1].x;
        int yDiff = points[0].y - points[1].y;

        result = xDiff / yDiff;
        return result;
    }


}//TwoPoints

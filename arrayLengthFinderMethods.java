// Designed to find lengths of arrays.
// array.length() does this as well, but here's a new way.
// Note: This is designed for languages with bounds checking. 
public class arrayLengthFinderMethods {
    public static int lengthFinder(Object[] insertedObject) { // for object and non-primitive data types
        int foundLength = 0;
        Object temp;
        boolean arraysEndFound = false;

        while (arraysEndFound == false) {
            try {
                temp = insertedObject[foundLength];
                foundLength++;
            } catch (Exception e) {
                arraysEndFound = true;
            }
        }
        return foundLength;
    }

    // for primitive data types beyond this line
    //------------------------------------------------------------------------------
    public static int lengthFinder(int[] insertedIntegers) {
        int foundLength = 0;
        Object temp;
        boolean arraysEndFound = false;

        while (arraysEndFound == false) {
            try {
                temp = insertedIntegers[foundLength];
                foundLength++;
            } catch (Exception e) {
                arraysEndFound = true;
            }
        }
        return foundLength;
    }

    public static int lengthFinder(double[] insertedIntegers) {
        int foundLength = 0;
        Object temp;
        boolean arraysEndFound = false;

        while (arraysEndFound == false) {
            try {
                temp = insertedIntegers[foundLength];
                foundLength++;
            } catch (Exception e) {
                arraysEndFound = true;
            }
        }
        return foundLength;
    }

    public static int lengthFinder(long[] insertedIntegers) {
        int foundLength = 0;
        Object temp;
        boolean arraysEndFound = false;

        while (arraysEndFound == false) {
            try {
                temp = insertedIntegers[foundLength];
                foundLength++;
            } catch (Exception e) {
                arraysEndFound = true;
            }
        }
        return foundLength;
    }

    public static int lengthFinder(short[] insertedIntegers) {
        int foundLength = 0;
        Object temp;
        boolean arraysEndFound = false;

        while (arraysEndFound == false) {
            try {
                temp = insertedIntegers[foundLength];
                foundLength++;
            } catch (Exception e) {
                arraysEndFound = true;
            }
        }
        return foundLength;
    }

    public static int lengthFinder(char[] insertedIntegers) {
        int foundLength = 0;
        Object temp;
        boolean arraysEndFound = false;

        while (arraysEndFound == false) {
            try {
                temp = insertedIntegers[foundLength];
                foundLength++;
            } catch (Exception e) {
                arraysEndFound = true;
            }
        }
        return foundLength;
    }

    public static int lengthFinder(boolean[] insertedIntegers) {
        int foundLength = 0;
        Object temp;
        boolean arraysEndFound = false;

        while (arraysEndFound == false) {
            try {
                temp = insertedIntegers[foundLength];
                foundLength++;
            } catch (Exception e) {
                arraysEndFound = true;
            }
        }
        return foundLength;
    }

    public static int lengthFinder(float[] insertedIntegers) {
        int foundLength = 0;
        Object temp;
        boolean arraysEndFound = false;

        while (arraysEndFound == false) {
            try {
                temp = insertedIntegers[foundLength];
                foundLength++;
            } catch (Exception e) {
                arraysEndFound = true;
            }
        }
        return foundLength;
    }

    public static int lengthFinder(byte[] insertedIntegers) {
        int foundLength = 0;
        Object temp;
        boolean arraysEndFound = false;

        while (arraysEndFound == false) {
            try {
                temp = insertedIntegers[foundLength];
                foundLength++;
            } catch (Exception e) {
                arraysEndFound = true;
            }
        }
        return foundLength;
    }
}

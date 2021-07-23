public class MyRange {
    public static final int ASCII_VALUE_OF_1 = 48;
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }

    public boolean isEndWithInclude() {
        return this.input.endsWith("]");
    }

    public int getStart() {
        if(isStartWithInclude()) {
            return this.input.charAt(1) - ASCII_VALUE_OF_1;
        }
        else {
            return this.input.charAt(1) - 47;
        }
    }

    public int getEnd() {
        if(isEndWithInclude()) {
            return this.input.charAt(3) - 48;
        }
        else {
            return this.input.charAt(3) - 49;
        }
    }

    public String getResult() {
        int startNumber = getStart();
        int endNumber = getEnd();
        String result = "";
        for (int i = startNumber ; i <= endNumber; i++ ) {
            if(i != startNumber) {
                result = result.concat(',' + Integer.toString(i));
            } else {
                result = Integer.toString(i);
            }
        }
        return result;
    }

}
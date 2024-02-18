public class NoMatchException extends Exception {
    private String detail;

    public NoMatchException(String msg) {
        detail = msg;
    }

    @Override
    public String toString() {
        return "NoMatchException[" + detail + "]";
    }

    public static class CustomException {
        static void compute(String msg) throws NoMatchException {
            System.out.println("Called compute(" + msg + ")");
            if (!msg.equalsIgnoreCase("india")) {
                throw new NoMatchException("Input does not match 'India'");
            }
            System.out.println("Normal Exit");
        }
    }

    public static void main(String[] args) {
        try {
            CustomException.compute("india");
            CustomException.compute("usa");
        } catch (NoMatchException e) {
            System.out.println("Caught " + e);
        }
    }
}

public class TrainconsistApp {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String shape;
        String cargo;
        boolean finallyExecuted;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                if (shape.equalsIgnoreCase("Rectangular")
                        && cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException(
                            "Unsafe: Rectangular bogie cannot carry Petroleum"
                    );
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                finallyExecuted = true;
                System.out.println("Assignment attempt completed");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("===== UC15: Safe Cargo Assignment =====");

        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        g1.assignCargo("Petroleum");

        System.out.println();

        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum");

        System.out.println("\nProgram continues safely...");
    }
}
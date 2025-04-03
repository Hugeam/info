class SameName {
    private int value;

    public SameName(int value) {
        this.value = value * 2;
    }

    public void display() {
        System.out.println("SameName (modified): " + value);
    }
}
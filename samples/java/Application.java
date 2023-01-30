class Application implements Runnable {
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}

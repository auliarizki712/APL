class Main {
    public static void main (String[] args) {
        Kucing kucing = new Meow();

        Bebek meowAdapter = new MeowAdapter(kucing);
        System.out.println("suara bebek sekarang berubah dari kwek jadi : ");
        meowAdapter.kwek();
    }
}
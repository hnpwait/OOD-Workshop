public class ModuleA {

    public void process01(int id, String name) {
        // TODO
    }

}

class Client {
    public void call() {
        ModuleA a = new ModuleA();
        a.process01(1, "name");
    }
}
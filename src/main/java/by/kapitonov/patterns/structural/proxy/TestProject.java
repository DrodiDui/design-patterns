package by.kapitonov.patterns.structural.proxy;

public class TestProject implements Project{

    private String url;

    public TestProject(String url) {
        this.url = url;
        load();
    }

    @Override
    public void run() {
        System.out.println("Running project");
    }

    private void load() {
        System.out.println("Loading real project from: " + url);
    }
}

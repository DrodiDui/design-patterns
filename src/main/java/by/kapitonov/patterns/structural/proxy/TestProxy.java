package by.kapitonov.patterns.structural.proxy;

public class TestProxy {
    public static void main(String[] args) {

        Project project = new ProxyProject("https://www.github.com/DrodiDui/design-patterns.git");
        project.run();

    }
}

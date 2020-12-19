package by.kapitonov.patterns.structural.proxy;

public class TestProxy {
    public static void main(String[] args) {

        Project firstProject = new ProxyProject(
                new RealProject("https://www.github.com/DrodiDui/design-patterns.git")
        );
        //firstProject.run();

        Project secondProject = new ProxyProject(
                new TestProject("D:/dev/project")
        );
        secondProject.run();

    }
}

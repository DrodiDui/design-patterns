package by.kapitonov.patterns.structural.proxy;

public class ProxyProject implements Project {

    private Project project;

    public ProxyProject(Project project) {
        this.project = project;
    }

    @Override
    public void run() {
        project.run();
        System.out.println("qeqweqweq");
    }
}

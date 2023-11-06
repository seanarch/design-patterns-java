package observer.ext;

public class StatusBar implements Observer{
    private DataSource dataSource;

    public StatusBar(DataSource datasource) {
        this.dataSource = datasource;
    }
    @Override
    public void update() {
        System.out.println("Status Bar notified: " + dataSource.getValue());
    }
}

public class Ferrari extends Car{
    private String engine;
    private String model;
    public Ferrari(int doors, String engine, String model, int topSpeed) {
        super(doors, topSpeed);
        this.engine = engine;
        this.model = model;
        System.out.printf("Ferrari created ;number of doors: %d, engine: %s, model: %s, top speed: %d %s", doors,engine,model,topSpeed,"\n");
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

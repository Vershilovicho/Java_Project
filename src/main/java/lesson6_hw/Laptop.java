package lesson6_hw;

public class Laptop {
    private String brand;
    private String model;
    private String color;
    private String screenDiagonal;
    private String amountOfRam;
    private String numberOfProcessorCores;

    public Laptop(String brand, String model, String color, String screenDiagonal, String amountOfRam, String numberOfProcessorCores) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenDiagonal = screenDiagonal;
        this.amountOfRam = amountOfRam;
        this.numberOfProcessorCores = numberOfProcessorCores;
    }

    public String toString() {
        System.out.printf("Бренд: %s; модель: %s; цвет: %s; диагональ экрана: %s; объем оперативной памяти: %s; количество ядер процессора: %s", brand, model, color, screenDiagonal, amountOfRam, numberOfProcessorCores);
        return ".";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(String screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getAmountOfRam() {
        return amountOfRam;
    }

    public void setAmountOfRam(String amountOfRam) {
        this.amountOfRam = amountOfRam;
    }

    public String getNumberOfProcessorCores() {
        return numberOfProcessorCores;
    }

    public void setNumberOfProcessorCores(String numberOfProcessorCores) {
        this.numberOfProcessorCores = numberOfProcessorCores;
    }
}

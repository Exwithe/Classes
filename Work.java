public class Work {
    private String name;
    private String job;
    private int salary;
    private int sector;

    public Work(String name, String job, int salary, int sector) {
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.sector = sector;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }

    public int getSector() {
        return sector;
    }
}

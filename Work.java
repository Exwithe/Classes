public class Work {
    private String job;
    private int salary;
    private int sector;

    public Work(String job, int salary, int sector) {
        this.job = job;
        this.salary = salary;
        this.sector = sector;
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

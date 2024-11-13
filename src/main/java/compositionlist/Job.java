package compositionlist;

public class Job {
    private String workplace;
    private int styear;

    public Job(String workplace, int styear) {
        this.workplace = workplace;
        this.styear = styear;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public int getStyear() {
        return styear;
    }

    public void setStyear(int styear) {
        this.styear = styear;
    }
}

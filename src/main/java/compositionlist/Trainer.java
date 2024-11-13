package compositionlist;

import java.util.List;

public class Trainer {
    private List<Names> name;
    private List<Address> cim;
    private List<Job> jobs;

    public Trainer(List<Names> name, List<Address> cim, List<Job> jobs) {
        this.name = name;
        this.cim = cim;
        this.jobs = jobs;
    }

    public List<Names> getName() {
        return name;
    }

    public void setName(List<Names> name) {
        this.name = name;
    }

    public List<Address> getCim() {
        return cim;
    }

    public void setCim(List<Address> cim) {
        this.cim = cim;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}



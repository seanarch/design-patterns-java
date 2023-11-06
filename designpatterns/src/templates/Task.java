package templates;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task() {
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }
    public void execute() {
        auditTrail.record();

        doExcute();
    }

    protected abstract void doExcute();
}

package templates;

public class GenerateReportTask extends  Task{
//    private AuditTrail auditTrail;
//
//    public GenerateReportTask(AuditTrail auditTrail) {
//        this.auditTrail = auditTrail;
//    }
//
//    public void execute() {
//        auditTrail.record();
//
//        System.out.println("Generate Report");
//    }

    @Override
    protected void doExcute() {
        System.out.println("Generate Report");
    }
}

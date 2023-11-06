package templates;

public class TransferMoneyTask extends  Task{

//    private AuditTrail auditTrail;
//
//    public TransferMoneyTask(AuditTrail auditTrail) {
//        super(auditTrail);
//    }

//    public void execute() {
//        auditTrail.record();
//
//        System.out.println("Transfer Money");
//
//    }

    @Override
    protected void doExcute() {
        System.out.println("Transfer Money");
    }
}

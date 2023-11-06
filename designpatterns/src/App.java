import iterator.*;
import state.Canvas;
import state.SelectionTool;
import strategy.*;
import templates.GenerateReportTask;
import templates.TransferMoneyTask;

public class App {
    public static void main(String[] args) throws Exception {
//        var canvas = new Canvas();
//
//        canvas.setCurrentTool(new SelectionTool());
//        canvas.mouseDown();
//        canvas.mouseUp();

        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");


        Iterator iterator = history.createIterator();
        while(iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a", new PngCompressor(), new BlackAndWhiteFilter());


        var chatClient = new ChatClient();
        chatClient.send("Test message", new AESencryption() );


        var task = new TransferMoneyTask();
        task.execute();

        var task2 = new GenerateReportTask();
        task2.execute();
    }
}

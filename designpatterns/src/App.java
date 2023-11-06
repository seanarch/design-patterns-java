import command.*;
import command.editor.BoldCommand;
import command.editor.History;
import command.editor.HtmlDocument;
import command.editor.UndoCommand;
import command.fx.Button;
import iterator.*;
import observer.Chart;
import observer.SpreadSheet;
import observer.ext.DataSource;
import observer.ext.StatusBar;
import observer.ext.StockListView;
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


        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var botton = new Button(command);
        botton.click();

        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhite());
        composite.execute();

        var history2 = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history2);
        boldCommand.execute();
        System.out.println(document.getContent());

//        boldCommand.unexecute();
//        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history2);
        undoCommand.execute();
        System.out.println(document.getContent());

//        var dataSource = new DataSource();
//        var sheet1 = new SpreadSheet(dataSource);
//        var sheet2 = new SpreadSheet(dataSource);
//        var chart = new Chart(dataSource);
//
//        dataSource.addObserver(sheet1);
//        dataSource.addObserver(sheet2);
//        dataSource.addObserver(chart);
//
//        dataSource.setValue(1);

        var dataSource2 = new DataSource();
        var statusbar = new StatusBar(dataSource2);
        var stockview = new StockListView(dataSource2);

        dataSource2.addObserver(statusbar);
        dataSource2.addObserver(stockview);

        dataSource2.setValue(22);
    }
}

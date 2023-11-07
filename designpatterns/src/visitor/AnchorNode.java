package visitor;

public class AnchorNode implements HtmlNode{
    @Override
    public void highlight() {
        System.out.println("Highlight-anchor");
    }
}

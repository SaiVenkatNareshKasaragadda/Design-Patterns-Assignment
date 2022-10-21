import javax.swing.JOptionPane;
public class ReminderVisitor extends NodeVisitor {
    private Reminder m_Reminder;

    public void visitProduct(Product product){
        product.accept(this);
        
    }

    public void visitTrading(Trading trading){
        trading.accept(this);
        
    }

    public void visitFacade(Facade facade){
        facade.accept(this);
        
    }

}

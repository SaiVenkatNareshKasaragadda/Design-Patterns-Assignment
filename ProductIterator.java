public class ProductIterator implements ListIterator {

    private ClassProductList productslist;
    int position=0;

    public ProductIterator(ClassProductList productsList){
        this.productslist = productsList;
    }
    
    public boolean hasNext(){
        return position<productslist.size()?true:false;
    }

    public Product Next(){
        return hasNext()?productslist.get(position):null;
    }
    
    public void MoveToHead(){
        position=0;
    }

    public void Remove(){
        productslist.remove(position);
    }
}

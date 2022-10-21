public class OfferingIterator implements ListIterator{

private OfferingList biddingList;
int position=0;

public OfferingIterator(OfferingList biddingList){
    this.biddingList = biddingList;
}

public boolean hasNext(){
    return position<biddingList.size()?true:false;
}

public Offering Next(){
    return hasNext()?biddingList.get(position):null;
}

public void MoveToHead(){
    position=0;
}

public void Remove(){
    biddingList.remove(position);
}
}

public class Cart {
    
    public static final int MAX_NUMBERS_ORDERED = 20;
    int qtyOrdered = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered == MAX_NUMBERS_ORDERED - 1){
            System.out.println("The cart is almost full.");
        }
        else
        {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc " + "\"" + disc.getTitle() +"\""+" has been added.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc)
    {
        for(int i = 0; i < qtyOrdered; i++)
        {
            if(itemsOrdered[i].equals(disc)){
                if(i == MAX_NUMBERS_ORDERED - 1) qtyOrdered--;
                else
                {
                    for(int j = i + 1; j < qtyOrdered; j++)
                    {
                        itemsOrdered[j-1] = itemsOrdered[j];
                    }
                    qtyOrdered--;
                }
            }
        }
        System.out.println("The disc " + "\"" + disc.getTitle() +"\""+" has been removed from the cart.");
    }

    public float totalCost(){
        float totalCost = 0;
        for(int i = 0; i < qtyOrdered; i++)
        {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }

    // 2.1 Overloading by differing types of parameter
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        for(int i = 0; i < dvdList.length; i++) {
            addDigitalVideoDisc(dvdList[i]);
        }
    }


    // 2.2 Overloading by differing types of parameter
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        this.addDigitalVideoDisc(dvd1);
        this.addDigitalVideoDisc(dvd2);
    }


    public void print(){
        System.out.println("************************************CART************************************");

        if(qtyOrdered != 0){
            for(int i = 0; i < qtyOrdered; i++){
                System.out.println((i+1)+". DVD " + itemsOrdered[i].toString());
            }
        }
        else System.out.println("Cart is empty!");

        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************************************");
    }

    public void search(String title) {
        int count = 0;
        for(int i = 0; i < qtyOrdered; i++){
            if(itemsOrdered[i].isMatch(title)){
                count = 1;
                System.out.println(itemsOrdered[i].toString());
            }
        }
        if(count == 0){
            System.out.println("Not found");
        }    
    }

    public void search(int id){
        int count = 0;
        for(int i = 0; i < qtyOrdered; i++){
            if(itemsOrdered[i].isMatch(id)){
                count = 1;
                System.out.println(itemsOrdered[i].toString());
            }
        }
        if(count == 0){
            System.out.println("Not found");
        }
    }

}
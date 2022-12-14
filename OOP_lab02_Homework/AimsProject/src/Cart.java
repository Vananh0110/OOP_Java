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




    

}
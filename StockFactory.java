public class StockFactory {

    public Stock getStock(String companyName){
        if(companyName.equals("31_GRP")){
            return new 31_GRP();
        }
        if(companyName.equals("A.B.FOOD")){
            return new ABFOOD();
        }
        if(companyName.equals("ABDN.ASSET.MAN")){
            return new ABDNASSETMAN();
        }
        if(companyName.equals("ADMIRAL_GRP")){
            return new ADMIRAL_GRP();
        }
        if(companyName.equals("ANGLO_AMERICAN")){
            return new ANGLO_AMERICAN();
        }
        if(companyName.equals("ANTOFAGASTA")){
            return new ANTOFAGASTA();
        }
        if(companyName.equals("ARM HLDGS")){
            return new ARM_HLDGS();
        }
        if(companyName.equals("ASHTEAD GRP")){
            return new ASHTEAD();
        }
        if(companyName.equals("ASTRAZENECA")){
            return new ASTRAZENECA();
        }
        if(companyName.equals("AVIVA")){
            return new AVIVA();
        }

    }

}

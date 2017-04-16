



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.NoSuchElementException;


class Shop{
     int id;
     double prize;
     ArrayList<String> itemList;

    public Shop(int id, double prize, ArrayList<String> itemList) {
        this.id = id;
        this.prize = prize;
        this.itemList = itemList;
    }

    public int getId() {
        return id;
    }

    public double getPrize() {
        return prize;
    }


}
public class Assignment3 {
    public static void main(String[] arg) {
        
    
    BufferedReader br = null;
       ArrayList<Shop> shopList=new ArrayList<Shop>();
         try{	
	
                // String arg[]={ "sample_data.csv","burger", "tofu_log"};
           //String arg[]={"sample_data.csv","fancy_european_water", "extreme_fajita"};
//String arg[]={"sample_data.csv"};
          //String arg[]={"chef_salad", "wine_spritzer"};
           //String arg[]={};
          //  String arg[]={"sample_data.csv","chef_salad", " steak_salad_sandwich"};
             
             
	String line = "";
	String cvsSplitBy = ",";
    
	
        String csvFile = "/home/webonise/program/"+arg[0];
        int id;
        double prize=0;
      
              
         br = new BufferedReader(new FileReader(csvFile));
       
		while ((line = br.readLine()) != null) {
                     ArrayList<String> itemList=new ArrayList();
			String[] shops = line.split(cvsSplitBy);
                         id=Integer.parseInt(shops[0].trim());
                       prize=Double.parseDouble(shops[1].trim());
                    for(int i=2;i<shops.length;i++){                      
                       itemList.add(shops[i].trim());                                     
                      }
                    shopList.add(new Shop(id, prize,itemList));
                 
                }
                
                
       /*   show csv file data
                  
           for(Shop shop : shopList){
               System.out.print(shop.id+" "+shop.prize);
               for(String item: shop.itemList){
                   System.out.print(" "+item);   
               }
               System.out.println("");
                       
           } 
           
        */
           
           
           //real logic
           ArrayList<Shop> myList=new ArrayList<Shop>();
          //argument items
           for(Shop shop : shopList){
           for(int i=1;i<arg.length;i++){
               
               if(shop.itemList.contains(arg[i])==true) {
                   myList.add(shop);
                   break;//break repeated lines
                   
               }
           }}
             /*  System.out.println("\n My list");
               
           //list with items given by user
               
              for(Shop myShop : myList){
               System.out.print(myShop.id+" "+myShop.prize);
               for(String item: myShop.itemList){
                   System.out.print(" "+item);   
               }
               System.out.println("");
                       
           }  */
             /* //check menu available but distributed over multiple items.
            */
              
           //Create hashmap for id nd sum prize and put sum values
              HashMap<Integer,Double> hm = new HashMap<Integer,Double>();
           
              
              for(int i=0;i<myList.size();){
                  double sumPrice=0;
                 int currentId=myList.get(i).getId();
                 while(i<myList.size()&&currentId==myList.get(i).getId()){
                 sumPrice=sumPrice+myList.get(i).getPrize();
                 i++;
              } 
            //put sum price in hashmap     
                 hm.put(currentId, sumPrice);
              }
              
              
/*
              
  **data in hash map            

Set<Integer> keys = hm.keySet();  //get all keys
for(Integer i: keys)
{
    System.out.println(hm.get(i));
}

*/
        double min=Collections.min(hm.values());
    System.out.println(getKeyFromValue(hm,min)+","+min);
           
           
         
         
         
         }        
         
                catch (FileNotFoundException e) {
                    System.out.println("No such file or directory");
		
	} catch(NumberFormatException e){
             System.out.println("File is empty");
        }
        catch(NoSuchElementException e)
         {
             System.out.println("entered item not in csv file");
         }
          catch(ArrayIndexOutOfBoundsException e){
              System.out.println("Missing data"); 
          }    
         catch(Exception e){
             System.out.println("somthing wrong");
             e.printStackTrace();
         }
         finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
              
    }
      public static Object getKeyFromValue(HashMap hm, Object value) {
    for (Object o : hm.keySet()) {
      if (hm.get(o).equals(value)) {
        return o;
      }
    }
    return null;
  }
}

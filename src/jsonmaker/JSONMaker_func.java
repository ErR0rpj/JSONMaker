package jsonmaker;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
 
import org.json.JSONException;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import org.json.simple.JSONObject;

public class JSONMaker_func {
    
    //private static final String all_company_details="{\"status\":true,\"code\":200,\"msg\":\"Successfully\",\"response\":[{\"stock_id\":\"63541\",\"name\":\"Asian Paints\",\"short_name\":\"ASPN\",\"country\":\"india\"},{\"stock_id\":\"63542\",\"name\":\"AXIS Bank\",\"short_name\":\"AXBK\",\"country\":\"india\"},{\"stock_id\":\"63543\",\"name\":\"Bajaj Auto\",\"short_name\":\"BAJA\",\"country\":\"india\"},{\"stock_id\":\"63544\",\"name\":\"Bajaj Finance\",\"short_name\":\"BJFN\",\"country\":\"india\"},{\"stock_id\":\"63545\",\"name\":\"Bharti Airtel\",\"short_name\":\"BRTI\",\"country\":\"india\"},{\"stock_id\":\"63546\",\"name\":\"HCL Tech\",\"short_name\":\"HCLT\",\"country\":\"india\"},{\"stock_id\":\"63547\",\"name\":\"HDFC Bank\",\"short_name\":\"HDBK\",\"country\":\"india\"},{\"stock_id\":\"63548\",\"name\":\"Hero MotoCorp\",\"short_name\":\"HROM\",\"country\":\"india\"},{\"stock_id\":\"63549\",\"name\":\"Hindustan Unilever\",\"short_name\":\"HLL\",\"country\":\"india\"},{\"stock_id\":\"63550\",\"name\":\"Housing Development Finance\",\"short_name\":\"HDFC\",\"country\":\"india\"},{\"stock_id\":\"63551\",\"name\":\"ICICI Bank\",\"short_name\":\"ICBK\",\"country\":\"india\"},{\"stock_id\":\"63552\",\"name\":\"IndusInd Bank\",\"short_name\":\"INBK\",\"country\":\"india\"},{\"stock_id\":\"63553\",\"name\":\"Infosys\",\"short_name\":\"INFY\",\"country\":\"india\"},{\"stock_id\":\"63554\",\"name\":\"ITC\",\"short_name\":\"ITC\",\"country\":\"india\"},{\"stock_id\":\"63555\",\"name\":\"Kotak Mahindra Bank\",\"short_name\":\"KTKM\",\"country\":\"india\"},{\"stock_id\":\"63556\",\"name\":\"Larsen & Toubro\",\"short_name\":\"LART\",\"country\":\"india\"},{\"stock_id\":\"63557\",\"name\":\"Mahindra & Mahindra\",\"short_name\":\"MAHM\",\"country\":\"india\"},{\"stock_id\":\"63558\",\"name\":\"Maruti Suzuki\",\"short_name\":\"MRTI\",\"country\":\"india\"},{\"stock_id\":\"63559\",\"name\":\"NTPC\",\"short_name\":\"NTPC\",\"country\":\"india\"},{\"stock_id\":\"63560\",\"name\":\"Oil & Natural Gas\",\"short_name\":\"ONGC\",\"country\":\"india\"},{\"stock_id\":\"63561\",\"name\":\"Power Grid\",\"short_name\":\"PGRD\",\"country\":\"india\"},{\"stock_id\":\"63562\",\"name\":\"Reliance Industries\",\"short_name\":\"RELI\",\"country\":\"india\"},{\"stock_id\":\"63563\",\"name\":\"SBI\",\"short_name\":\"SBI\",\"country\":\"india\"},{\"stock_id\":\"63564\",\"name\":\"Vedanta\",\"short_name\":\"VDAN\",\"country\":\"india\"},{\"stock_id\":\"63565\",\"name\":\"Sun Pharma\",\"short_name\":\"SUN\",\"country\":\"india\"},{\"stock_id\":\"63566\",\"name\":\"Tata Consultancy\",\"short_name\":\"TCS\",\"country\":\"india\"},{\"stock_id\":\"63567\",\"name\":\"Tata Motors\",\"short_name\":\"TAMO\",\"country\":\"india\"},{\"stock_id\":\"63568\",\"name\":\"Tata Steel Ltd\",\"short_name\":\"TISC\",\"country\":\"india\"},{\"stock_id\":\"63569\",\"name\":\"Tech Mahindra\",\"short_name\":\"TEML\",\"country\":\"india\"},{\"stock_id\":\"63570\",\"name\":\"Yes Bank\",\"short_name\":\"YESB\",\"country\":\"india\"},{\"stock_id\":\"63571\",\"name\":\"Tata Motors DV Ltd\",\"short_name\":\"TAMdv\",\"country\":\"india\"},{\"stock_id\":\"63572\",\"name\":\"Asian Paints\",\"short_name\":\"ASPN\",\"country\":\"india\"}]}";
    
    
    public static void main(String args[]) {
        JSONMaker j= new JSONMaker();
        JSONMaker.main(args);
        /*JSONParser jsonParser= new JSONParser();
        
        try (FileReader reader = new FileReader("symbol_name7.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONObject employeeList = (JSONObject) obj;
            System.out.println(employeeList);
             
           
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
    }
    
}

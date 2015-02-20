package za.ac.cput.Chapter3;

import java.util.*;

/**
 * Created by student on 2015/02/20.
 */
public class Models implements WealthyLifestyle{

    @Override
    public Set<String> Motorcycles()
    {
        Set  mBikes = new HashSet();

        mBikes.add("250R");
        mBikes.add("400R");
        mBikes.add("ZX-6R");               //Kawasaki Ninja motorcycles
        mBikes.add("ZX-10R");
        mBikes.add("ZX-12R");

        return mBikes;
    }

    @Override
    public Map<String, String> SuperCars()
    {
        Map cars = new HashMap();
        cars.put("Fast1", "Bugatti Veyron SS");
        cars.put("Fast2", "Koenigsegg Agera R");
        cars.put("Fast3", "McLaren F1");                        //Best super cars around
        cars.put("Fast4", "SSC Ultimate Aero TT");
        cars.put("Fast5", "Hennessey Venom GT");

        return cars;

    }

    @Override
    public List<String> ExoticBeaches()
    {

        List beaches = new ArrayList();
        beaches.add("Bahamas");
        beaches.add("Rosalie Bay");
        beaches.add("Matira Beach");                            //Exotic beaches in the world
        beaches.add("Paradise Beach");
        beaches.add("Anse Source d'Argent");

        return beaches;
    }
}

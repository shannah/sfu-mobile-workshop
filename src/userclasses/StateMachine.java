/**
 * Your application code goes here
 */

package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.util.Resources;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    
    public static final String FOOD_ICON = "cutlery_cccccc_256.png";
    public static final String STUDY_ICON = "book_cccccc_256.png";
    private Image foodIcon;
    private Image studyIcon;
    
    public static final String CATEGORY_FOOD = "food";
    public static final String CATEGORY_STUDY_SPACE = "study";
    public static final String CATEGORY_PARKING = "parking";
    public static final String CATEGORY_EVENTS = "events";
    public static final String CATEGORY_FACILITIES = "facilities";
    
    private String selectedCategory;
    private ArrayList<Destination> destinations;
    private Destination selectedDestination;
    
    private Image getFoodIcon() {
        if (foodIcon == null) {
            foodIcon = fetchResourceFile().getImage(FOOD_ICON);
        }
        return foodIcon;
    }
    
    private Image getStudyIcon() {
        if (studyIcon == null) {
            studyIcon = fetchResourceFile().getImage(STUDY_ICON);
        }
        return studyIcon;
    }
    
    private String getNameForCategory(String category) {
        if (CATEGORY_FOOD.equals(category)) {
            return "Food";
        } else if (CATEGORY_STUDY_SPACE.equals(category)) {
            return "Study Space";
        } else {
            return category;
        }
    }
    
    public static class Destination {
        private String name, shortDescription, longDescription, category;
        private Image icon;
        
    }
    
    
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
        
        
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
        
        destinations = new ArrayList<Destination>();
        String[] foodDestinations = {
            "SFU Pub", "Cheap food and booze", "Come here for a good time and great service",
            "Renaissance Coffee", "Coffee, Tea, and Snacks", "Sit down for a nice cup of coffee",
            "Nesters Deli", "Meat, Lunch, Snacks", "Come here for lunch and enjoy the view"
        };
        
        for (int i=0; i<foodDestinations.length; i+=3) {
            Destination d = new Destination();
            d.name = foodDestinations[i];
            d.shortDescription = foodDestinations[i+1];
            d.longDescription = foodDestinations[i+2];
            d.category = CATEGORY_FOOD;
            d.icon = getFoodIcon();
            destinations.add(d);
        }
        
        String[] studyDestinations = {
            "SFU Library", "Lots of study rooms", "Come here to study individually or as a group",
            "2nd Floor Pods", "Loud but comfy", "Try this out and see if you pass your tests",
            "Secret Location", "Not telling", "Come here if you can find the place"
        };
        
        for (int i=0; i<studyDestinations.length; i+=3) {
            Destination d = new Destination();
            d.name = studyDestinations[i];
            d.shortDescription = studyDestinations[i+1];
            d.longDescription = studyDestinations[i+2];
            d.category = CATEGORY_STUDY_SPACE;
            d.icon = getStudyIcon();
            destinations.add(d);
        }
       
        
    }


    @Override
    protected boolean initListModelLocationsList(List cmp) {
        ArrayList<Hashtable> items = new ArrayList<Hashtable>();
        for (Destination d : destinations) {
            if (d.category.equals(selectedCategory)) {
                Hashtable pub = new Hashtable();
                pub.put("Line1", d.name);
                pub.put("Line2", d.shortDescription);
                pub.put("icon", d.icon);
                pub.put("destination", d);
                items.add(pub);
            }
        }
        
        cmp.setModel(new com.codename1.ui.list.DefaultListModel(items.toArray()));
        return true;
    }
    
    

   

    @Override
    protected void onMain_FoodButtonAction(Component c, ActionEvent event) {
        selectedCategory = CATEGORY_FOOD;
    
    }

    @Override
    protected void onMain_StudyButtonAction(Component c, ActionEvent event) {
        selectedCategory = CATEGORY_STUDY_SPACE;
    
    }

    @Override
    protected void onCategoryForm_LocationsListAction(Component c, ActionEvent event) {
        List l = (List)c;
        Hashtable selected = (Hashtable)l.getSelectedItem();
        selectedDestination = (Destination)selected.get("destination");
                
        showForm("DestinationDetailsForm", null);
    }

    @Override
    protected void beforeDestinationDetailsForm(Form f) {
        findDetailsHeading().setText(selectedDestination.name);
        findDetailsDescription().setText(selectedDestination.longDescription);
        f.setTitle(selectedDestination.name);
    }

    @Override
    protected void beforeCategoryForm(Form f) {
        f.setTitle(getNameForCategory(selectedCategory));
    }
}

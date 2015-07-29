/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        UIBuilder.registerCustomComponent("SpanLabel", com.codename1.components.SpanLabel.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        UIBuilder.registerCustomComponent("SpanLabel", com.codename1.components.SpanLabel.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Label findDistrance(Component root) {
        return (com.codename1.ui.Label)findByName("Distrance", root);
    }

    public com.codename1.ui.Label findDistrance() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Distrance", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Distrance", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findDetailsHeading(Component root) {
        return (com.codename1.ui.Label)findByName("DetailsHeading", root);
    }

    public com.codename1.ui.Label findDetailsHeading() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("DetailsHeading", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("DetailsHeading", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findReservationButton(Component root) {
        return (com.codename1.ui.Button)findByName("ReservationButton", root);
    }

    public com.codename1.ui.Button findReservationButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("ReservationButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("ReservationButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findDestinationImage(Component root) {
        return (com.codename1.ui.Label)findByName("DestinationImage", root);
    }

    public com.codename1.ui.Label findDestinationImage() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("DestinationImage", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("DestinationImage", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findFoodButton(Component root) {
        return (com.codename1.ui.Button)findByName("FoodButton", root);
    }

    public com.codename1.ui.Button findFoodButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("FoodButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("FoodButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.list.MultiList findLocationsList(Component root) {
        return (com.codename1.ui.list.MultiList)findByName("locationsList", root);
    }

    public com.codename1.ui.list.MultiList findLocationsList() {
        com.codename1.ui.list.MultiList cmp = (com.codename1.ui.list.MultiList)findByName("locationsList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.list.MultiList)findByName("locationsList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findName(Component root) {
        return (com.codename1.ui.Label)findByName("Name", root);
    }

    public com.codename1.ui.Label findName() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Name", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Name", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findShortDescription(Component root) {
        return (com.codename1.ui.Label)findByName("ShortDescription", root);
    }

    public com.codename1.ui.Label findShortDescription() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("ShortDescription", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("ShortDescription", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findDetailsDescription(Component root) {
        return (com.codename1.components.SpanLabel)findByName("DetailsDescription", root);
    }

    public com.codename1.components.SpanLabel findDetailsDescription() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("DetailsDescription", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("DetailsDescription", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findStudyButton(Component root) {
        return (com.codename1.ui.Button)findByName("StudyButton", root);
    }

    public com.codename1.ui.Button findStudyButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("StudyButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("StudyButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton4(Component root) {
        return (com.codename1.ui.Button)findByName("Button4", root);
    }

    public com.codename1.ui.Button findButton4() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton3(Component root) {
        return (com.codename1.ui.Button)findByName("Button3", root);
    }

    public com.codename1.ui.Button findButton3() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findIcon(Component root) {
        return (com.codename1.ui.Label)findByName("Icon", root);
    }

    public com.codename1.ui.Label findIcon() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Icon", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Icon", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton2(Component root) {
        return (com.codename1.ui.Button)findByName("Button2", root);
    }

    public com.codename1.ui.Button findButton2() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_FoodFormHome = 1;
    public static final int COMMAND_MainFood = 2;
    public static final int COMMAND_MainStudySpaces = 3;

    protected boolean onFoodFormHome() {
        return false;
    }

    protected boolean onMainFood() {
        return false;
    }

    protected boolean onMainStudySpaces() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_FoodFormHome:
                if(onFoodFormHome()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainFood:
                if(onMainFood()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainStudySpaces:
                if(onMainStudySpaces()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("FoodForm".equals(f.getName())) {
            exitFoodForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("CategoryForm".equals(f.getName())) {
            exitCategoryForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("DestinationDetailsForm".equals(f.getName())) {
            exitDestinationDetailsForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitFoodForm(Form f) {
    }


    protected void exitCategoryForm(Form f) {
    }


    protected void exitDestinationDetailsForm(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("FoodForm".equals(f.getName())) {
            beforeFoodForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("CategoryForm".equals(f.getName())) {
            beforeCategoryForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("DestinationDetailsForm".equals(f.getName())) {
            beforeDestinationDetailsForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeFoodForm(Form f) {
    }


    protected void beforeCategoryForm(Form f) {
    }


    protected void beforeDestinationDetailsForm(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("FoodForm".equals(c.getName())) {
            beforeContainerFoodForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("CategoryForm".equals(c.getName())) {
            beforeContainerCategoryForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("DestinationDetailsForm".equals(c.getName())) {
            beforeContainerDestinationDetailsForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerFoodForm(Container c) {
    }


    protected void beforeContainerCategoryForm(Container c) {
    }


    protected void beforeContainerDestinationDetailsForm(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("FoodForm".equals(f.getName())) {
            postFoodForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("CategoryForm".equals(f.getName())) {
            postCategoryForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("DestinationDetailsForm".equals(f.getName())) {
            postDestinationDetailsForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postFoodForm(Form f) {
    }


    protected void postCategoryForm(Form f) {
    }


    protected void postDestinationDetailsForm(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("FoodForm".equals(c.getName())) {
            postContainerFoodForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("CategoryForm".equals(c.getName())) {
            postContainerCategoryForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("DestinationDetailsForm".equals(c.getName())) {
            postContainerDestinationDetailsForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerFoodForm(Container c) {
    }


    protected void postContainerCategoryForm(Container c) {
    }


    protected void postContainerDestinationDetailsForm(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("FoodForm".equals(rootName)) {
            onCreateFoodForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("CategoryForm".equals(rootName)) {
            onCreateCategoryForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("DestinationDetailsForm".equals(rootName)) {
            onCreateDestinationDetailsForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateFoodForm() {
    }


    protected void onCreateCategoryForm() {
    }


    protected void onCreateDestinationDetailsForm() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("FoodForm".equals(f.getName())) {
            getStateFoodForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("CategoryForm".equals(f.getName())) {
            getStateCategoryForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("DestinationDetailsForm".equals(f.getName())) {
            getStateDestinationDetailsForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateFoodForm(Form f, Hashtable h) {
    }


    protected void getStateCategoryForm(Form f, Hashtable h) {
    }


    protected void getStateDestinationDetailsForm(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("FoodForm".equals(f.getName())) {
            setStateFoodForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("CategoryForm".equals(f.getName())) {
            setStateCategoryForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("DestinationDetailsForm".equals(f.getName())) {
            setStateDestinationDetailsForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateFoodForm(Form f, Hashtable state) {
    }


    protected void setStateCategoryForm(Form f, Hashtable state) {
    }


    protected void setStateDestinationDetailsForm(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("locationsList".equals(listName)) {
            return initListModelLocationsList(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelLocationsList(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("CategoryForm")) {
            if("locationsList".equals(c.getName())) {
                onCategoryForm_LocationsListAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("DestinationDetailsForm")) {
            if("ReservationButton".equals(c.getName())) {
                onDestinationDetailsForm_ReservationButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("FoodButton".equals(c.getName())) {
                onMain_FoodButtonAction(c, event);
                return;
            }
            if("StudyButton".equals(c.getName())) {
                onMain_StudyButtonAction(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onMain_Button2Action(c, event);
                return;
            }
            if("Button3".equals(c.getName())) {
                onMain_Button3Action(c, event);
                return;
            }
            if("Button4".equals(c.getName())) {
                onMain_Button4Action(c, event);
                return;
            }
        }
    }

      protected void onCategoryForm_LocationsListAction(Component c, ActionEvent event) {
      }

      protected void onDestinationDetailsForm_ReservationButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_FoodButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_StudyButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_Button2Action(Component c, ActionEvent event) {
      }

      protected void onMain_Button3Action(Component c, ActionEvent event) {
      }

      protected void onMain_Button4Action(Component c, ActionEvent event) {
      }

}

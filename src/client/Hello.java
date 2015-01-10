package client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.datepicker.client.DatePicker;

/**
 * Created by dmitry on 07.01.15.
 */
public class Hello implements EntryPoint {
    DatePicker datePicker= new DatePicker();

    MenuBar support;
    MenuBar liveteam;
    MenuBar paymentSystems;
    MenuBar mainMenue;
    public void onModuleLoad() {
        RootPanel.get("calendar").add(datePicker);

        Command cmd = new Command(){
            @Override
            public void execute() {
                Window.alert("I'm "+ support.getTitle());
            }
        };
        support = new MenuBar(true);
        liveteam = new MenuBar(true);
        paymentSystems = new MenuBar(true);
        mainMenue = new MenuBar(true);
        mainMenue.setFocusOnHoverEnabled(true);
        support.addItem("o.kondratova",cmd);
        support.addItem("e.musinova",cmd);
        liveteam.addItem("d.davydov",cmd);
        liveteam.addItem("m.sharishev",cmd);
        paymentSystems.addItem("i.oborin",cmd);
        paymentSystems.addItem("o.anferov",cmd);
        mainMenue.addItem("Support",support);
        mainMenue.addItem("Liveteam",liveteam);
        mainMenue.addItem("Payment Systems Integration",paymentSystems);
        RootPanel.get().add(mainMenue);
    }
}

package mvp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import mvp.shared.Person;

/**
 * Created by dmitry on 10.01.15.
 */
public class MVPApp implements EntryPoint{

    @Override
    public void onModuleLoad() {
        Person me = new Person("Dmitry", "Davydov");
        Label label = new Label(me.toString());
        RootPanel.get().add(label);
    }
}

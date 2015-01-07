package client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

/**
 * Created by dmitry on 07.01.15.
 */
public class Hello implements EntryPoint {
    Label label1=new Label("HELLO SLOT #1");
    Label label2=new Label("HELLO SLOT #2");
    Button button1= new Button("Button 1");
    Form form1= new Form();
    public void onModuleLoad() {
        RootPanel.get("slot1").add(label1);
        RootPanel.get("slot2").add(label2);
        RootPanel.get("btn1").add(button1);
        RootPanel.get().add(form1);
    }
}

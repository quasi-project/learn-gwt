package client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;

/**
 * Created by dmitry on 07.01.15.
 */
public class Hello implements EntryPoint {
    Button button1= new Button("Button 1");
    Form form1= new Form();
    Button face = new Button("('.')");
    Button changeFace = new Button("Click to change face");
    int i =0;

    public void onModuleLoad() {
        button1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Window.alert("Hello I am a "+button1.getText());
            }
        });
        form1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Window.alert("Hello I am a "+form1.getText());
            }
        });
        changeFace.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                String newFace="(-";
                for (int j = i; j > 0; j--) {
                    newFace += "_";
                }
                newFace+="-)";
                i++;
                face.setText(newFace);
            }
        });
        RootPanel.get("btn1").add(button1);
        RootPanel.get().add(form1);
        RootPanel.get().add(changeFace);
        RootPanel.get().add(face);
    }
}

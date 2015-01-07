package client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiBinder;

/**
 * Created by dmitry on 07.01.15.
 */
public class Form extends Composite{
    interface FormUiBinder extends UiBinder<Widget, Form> {
    }

    private static FormUiBinder ourUiBinder = GWT.create(FormUiBinder.class);

    public Form() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}
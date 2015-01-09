package client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiBinder;

/**
 * Created by dmitry on 07.01.15.
 */
public class Form extends Composite implements HasClickHandlers {
    @Override
    public HandlerRegistration addClickHandler(ClickHandler handler) {
        return addDomHandler(handler, ClickEvent.getType());
    }

    interface FormUiBinder extends UiBinder<Widget, Form> {
    }

    private static FormUiBinder ourUiBinder = GWT.create(FormUiBinder.class);

    public Form() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    public String getText() {
        return getElement().getInnerText();
    }
}
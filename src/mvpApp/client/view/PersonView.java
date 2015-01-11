package mvpApp.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import mvpApp.client.presenter.PersonPresenter;
import mvpApp.client.presenter.PersonPresenter.Display;

/**
 * Created by dmitry on 11.01.15.
 */
public class PersonView extends Composite implements Display {
    private PersonPresenter presenter;

    interface PersonViewUiBinder extends UiBinder<HTMLPanel, PersonView> {
    }

    private static PersonViewUiBinder ourUiBinder = GWT.create(PersonViewUiBinder.class);

    public PersonView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    @Override
    public void clear() {
        name.setText("");
    }

    @Override
    public void setName(String name) {
        this.name.setText(name);
    }

    @Override
    public void setPresenter(PersonPresenter presenter) {
        this.presenter = presenter;
    }


    @UiField
    Button button;
    @UiField
    Label name;

    @UiHandler("button")
    void onClick(ClickEvent e) {
        if (presenter != null) {
            presenter.doShowFullName();
        }
    }
}
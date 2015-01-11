package mvpApp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import mvpApp.client.presenter.PersonPresenter;
import mvpApp.client.presenter.PersonPresenter.Display;
import mvpApp.client.presenter.Presenter;
import mvpApp.client.view.PersonView;
import mvpApp.shared.Person;

/**
 * Created by dmitry on 10.01.15.
 */
public class MvpApp implements EntryPoint{

    @Override
    public void onModuleLoad() {
        Person me = new Person("Dmitry", "Davydov");
        Display view = new PersonView();
        Presenter presenter = new PersonPresenter(me, view);
        presenter.go(RootPanel.get());
    }
}

package ru.ntik.views.about;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import ru.ntik.views.DataGrid;


@PageTitle("About")
@Route(value = "about")
//@RouteAlias(value = "")
public class AboutView extends VerticalLayout {

    public AboutView() {
        DataGrid dataGrid = new DataGrid();
        dataGrid.setTitle("JAVAJVAJVJAVJVAJAV");

        add(dataGrid);
    }
}

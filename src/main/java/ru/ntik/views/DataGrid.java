package ru.ntik.views;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

import java.util.List;

@Tag("data-grid")
//@CssImport("./libs/dx.light.css")
//@NpmPackage(value = "devextreme", version = "22.1.3")
//@JsModule("./data-grid.js")
public class DataGrid extends Component {

    public DataGrid() {
        setItems(MockData.getData());
    }

    private void setItems(String json) {
        getElement().setProperty("items", json);
    }

    public void setTitle(String title) {
        getElement().setProperty("title", title);
    }

    public String getTitle() {
        return getElement().getProperty("title");
    }
}
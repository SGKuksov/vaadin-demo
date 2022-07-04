package ru.ntik.views;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@Tag("data-grid")
@JsModule("./data-grid.js")
public class DataGrid extends Component {

    public DataGrid() {
        setItems(MockData.getData());
    }

    private void setItems(String json) {
        getElement().setProperty("items", json);
    }
}
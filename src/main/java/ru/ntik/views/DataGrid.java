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

    private void setItems(List<String> items) {
        getElement().setProperty("items", "[{\"dovDate\":\"2022-02-02T00:00\",\"dogId\":1,\"endDate\":\"2022-01-01T00:00\",\"insertDate\":\"2022-06-06T00:00\",\"materialId\":3,\"dovNumber\":1,\"eiId\":5,\"id\":1,\"materialCount\":4,\"objStructId\":1,\"startDate\":\"2022-02-02T00:00\",\"telegramPosId\":5,\"status\":\"a\"},{\"dovDate\":\"2022-02-02T00:00\",\"dogId\":1,\"endDate\":\"2022-01-01T00:00\",\"insertDate\":\"2021-06-06T00:00\",\"materialId\":3,\"dovNumber\":1,\"eiId\":5,\"id\":2,\"materialCount\":3,\"objStructId\":2,\"startDate\":\"2022-02-02T00:00\",\"telegramPosId\":5,\"status\":\"a\"}]");
    }

    public void setTitle(String title) {
        getElement().setProperty("title", title);
    }

    public String getTitle() {
        return getElement().getProperty("title");
    }
}
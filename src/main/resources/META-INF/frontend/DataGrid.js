import { __decorate } from "tslib";
import { css, html, LitElement } from 'lit';
import { property } from 'lit/decorators.js';
import { createRef, ref } from 'lit/directives/ref.js';
import $ from './libs/jquery';
import './libs/dx.all';

export class DataGrid extends LitElement {
    constructor() {
        super(...arguments);
        // static shadowRootOptions = {...LitElement.shadowRootOptions, delegatesFocus: true};
        this.items = '';
        this.gridRef = createRef();
    }
    firstUpdated(_changedProperties) {
        super.firstUpdated(_changedProperties);
        // @ts-ignore
        // eslint-disable-next-line no-undef
        $(this.gridRef.value)
            // @ts-ignore
            .dxDataGrid({
            dataSource: JSON.parse(this.items),
            // columns: [
            // 'CompanyName',
            // 'Phone',
            // 'Fax',
            // 'City',
            // {
            //   dataField: 'State',
            //   groupIndex: 0,
            // },
            // ],
            keyExpr: 'id',
            allowColumnReordering: true,
            // allowColumnGrouping: true,
            allowColumnResizing: true,
            columnResizingMode: 'widget',
            remoteOperations: false,
            showBorders: true,
            grouping: {
                autoExpandAll: true,
            },
            searchPanel: {
                visible: true,
            },
            paging: {
                pageSize: 10,
            },
            groupPanel: {
                visible: true,
            },
            height: '100%',
            wordWrapEnabled: false,
            hoverStateEnabled: true,
            focusedRowEnabled: true,
            autoNavigateToFocusedRow: false,
            onFocusedRowChanging: () => null,
            onSelectionChanged: () => null,
        });
    }
    render() {
        return html`<div ${ref(this.gridRef)}></div>`;
    }
    createRenderRoot() {
        return this;
    }
}
DataGrid.styles = css ``;
__decorate([
    property({ type: Number })
], DataGrid.prototype, "items", void 0);
//# sourceMappingURL=DataGrid.js.map
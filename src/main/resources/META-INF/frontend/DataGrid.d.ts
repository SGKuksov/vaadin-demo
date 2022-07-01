import { LitElement, PropertyValues } from 'lit';
export declare class DataGrid extends LitElement {
    static styles: import("lit").CSSResult;
    items: string;
    gridRef: import("lit-html/directives/ref").Ref<Element>;
    protected firstUpdated(_changedProperties: PropertyValues): void;
    render(): import("lit-html").TemplateResult<1>;
    createRenderRoot(): this;
}

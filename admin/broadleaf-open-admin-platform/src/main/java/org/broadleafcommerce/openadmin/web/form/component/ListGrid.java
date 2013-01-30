
package org.broadleafcommerce.openadmin.web.form.component;

import org.broadleafcommerce.openadmin.web.form.entity.Field;

import java.util.ArrayList;
import java.util.List;

public class ListGrid {

    protected String className;
    protected List<Field> headerFields = new ArrayList<Field>();
    protected List<ListGridRecord> records = new ArrayList<ListGridRecord>();
    protected int startIndex = 0;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Field> getHeaderFields() {
        return headerFields;
    }

    public void setHeaderFields(List<Field> headerFields) {
        this.headerFields = headerFields;
    }

    public List<ListGridRecord> getRecords() {
        return records;
    }

    public void setRecords(List<ListGridRecord> records) {
        this.records = records;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

}

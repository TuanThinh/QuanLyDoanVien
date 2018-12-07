package mta.qldv.utils;

public class Paging {
    private int totalRecord;

    private int numberRecord;
    private String txtSearch;
    private String columnName;
    private String sort;
    private int numberPage;

    private int totalPage;
    private int firstResult;
    private int maxResult;

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getNumberRecord() {
        return numberRecord;
    }

    public void setNumberRecord(int numberRecord) {
        this.numberRecord = numberRecord;
    }

    public String getTxtSearch() {
        return txtSearch;
    }

    public void setTxtSearch(String txtSearch) {
        this.txtSearch = txtSearch;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getSort() {
        if(sort.equals("")){
            return "asc";
        }
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getNumberPage() {
        if(numberPage == 0){
            return 1;
        }
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public int getTotalPage() {
        totalPage = totalRecord / numberRecord;
        if (totalRecord % numberRecord != 0){
            totalPage++;
        }
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getFirstResult() {
        firstResult = (numberPage - 1) * numberRecord;
        return firstResult;
    }

    public void setFirstResult(int firstResult) {
        this.firstResult = firstResult;
    }

    public int getMaxResult() {
        maxResult = getFirstResult() + numberRecord - 1;
        if(maxResult > totalRecord)
            maxResult = totalRecord;
        return maxResult;
    }

    public void setMaxResult(int maxResult) {
        this.maxResult = maxResult;
    }
}

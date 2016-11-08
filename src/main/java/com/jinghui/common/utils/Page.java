package com.jinghui.common.utils;

import java.util.List;

public class Page<T> {
    private int pageNo = 1;
    private int pageSize = 5;
    private String orderBy = null;
    private boolean asc = true;
    private boolean autoCount = false;
    private List<T> result = null;
    private int totalCount = -1;

    public Page() {
    }

    public Page(int pageSize, boolean autoCount) {
        this.autoCount = autoCount;
        this.pageSize = pageSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public boolean isPageSizeSetted() {
        return this.pageSize > -1;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getFirst() {
        if ((this.pageNo < 1) || (this.pageSize < 1)) {
            return -1;
        } else {
            return (this.pageNo - 1) * this.pageSize;
        }
    }

    public boolean isFirstSetted() {
        return (this.pageNo > 0) && (this.pageSize > 0);
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public boolean isOrderBySetted() {
        return this.orderBy != null;
    }

    public boolean isAsc() {
        return this.asc;
    }

    public void setAsc(boolean asc) {
        this.asc = asc;
    }

    public boolean isAutoCount() {
        return this.autoCount;
    }

    public void setAutoCount(boolean autoCount) {
        this.autoCount = autoCount;
    }

    public List<T> getResult() {
        return this.result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPages() {
        if (this.totalCount == -1) {
            return -1;
        }
        int count = this.totalCount / this.pageSize;
        if (this.totalCount % this.pageSize > 0) {
            count++;
        }
        return count;
    }

    public boolean isHasNext() {
        return this.pageNo + 1 <= getTotalPages();
    }

    public int getNextPage() {
        if (isHasNext()) {
            return this.pageNo + 1;
        }
        return this.pageNo;
    }

    public boolean isHasPre() {
        return this.pageNo - 1 >= 1;
    }

    public int getPrePage() {
        if (isHasPre()) {
            return this.pageNo - 1;
        }
        return this.pageNo;
    }
}
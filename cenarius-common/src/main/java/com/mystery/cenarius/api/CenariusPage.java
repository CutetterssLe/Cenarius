package com.mystery.cenarius.api;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author Mystery
 * 分页数据封装
 */
public class CenariusPage<T> {

    private Integer pageNo;

    private Integer pageSize;

    private Integer currentPage;

    private Integer totalPage;

    private Long totalCount;

    private List<T> dataList;

    public CenariusPage(Integer pageNo, Integer pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.currentPage = (pageNo - 1) * pageSize + 1;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    /**
     * pageHelper转commonPage
     * @param dataList
     * @return
     */
    public static <T> CenariusPage<T> convert(List<T> dataList) {
        PageInfo<T> pageInfo = new PageInfo<>(dataList);
        CenariusPage<T> page = new CenariusPage<>(pageInfo.getPageNum(), pageInfo.getPageSize());
        page.setPageNo(pageInfo.getPageNum());
        page.setPageSize(pageInfo.getPageSize());
        page.setTotalPage(pageInfo.getPages());
        page.setTotalCount(pageInfo.getTotal());
        page.setDataList(dataList);
        return page;
    }

    @Override
    public String toString() {
        return "CommonPage{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                ", totalPage=" + totalPage +
                ", totalCount=" + totalCount +
                ", dataList=" + dataList +
                '}';
    }
}

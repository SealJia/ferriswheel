package com.micmiu.mvc.ferriswheel.examples.demos.jqgrid.model;

import com.micmiu.mvc.ferriswheel.core.model.AbstractQuery;
import com.micmiu.mvc.ferriswheel.core.model.SortType;
import com.micmiu.mvc.ferriswheel.utils.RefAnnotationUtil;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 基于AbstractQuery实现jqgrid的分页查询
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 11/28/2015
 * Time: 21:59
 */
public abstract class JqgridQuery extends AbstractQuery {

	/**
	 * 排序升序常量.
	 */
	public static final String SORT_ASC = "asc";

	/**
	 * 排序降序常量.
	 */
	public static final String SORT_DESC = "desc";

	private int page = 1;

	private int rows = DEFAULT_ITEMS_PERPAGE;

	/**
	 * 排序方式
	 */
	private String sord;
	/**
	 * 排序字段
	 */
	private String sidx;


	/**
	 * 获取每页记录数.
	 *
	 * @return 每页记录数
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * 设置每页记录数.
	 *
	 * @param rows 每页记录数
	 */
	public void setRows(int rows) {
		this.rows = rows;
	}

	/**
	 * 获取当前页数.
	 *
	 * @return 页数
	 */
	public int getPage() {
		return page;
	}

	/**
	 * 设置当前页数.
	 *
	 * @param page 页数
	 */
	public void setPage(int page) {
		this.page = page;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	/**
	 * 获取子类所有排序字段及排序顺序Map. 需要生成的字段值可用@SortProperty标示.
	 *
	 * @return Map<String, String> 排序字段Map
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Map<String, SortType> getSortProperties() {
		// 优先处理排序字段.
		// 排序字段有先后顺序, 必须采用LinkedHashMap
		Map<String, SortType> easyuiSortProperties = new LinkedHashMap<String, SortType>();
		List<Field> properties = RefAnnotationUtil.getAllPublicFields(getClass());
		for (Field p : properties) {
			if (getQueryPropertyName(p.getName()).equals(this.sidx)) {
				if (SORT_ASC.equals(this.sord)) {
					easyuiSortProperties.put(getQueryPropertyName(p.getName()),
							SortType.ASC);
				} else if (SORT_DESC.equals(this.sord)) {
					easyuiSortProperties.put(getQueryPropertyName(p.getName()),
							SortType.DESC);
				}
			}
		}
		easyuiSortProperties.putAll(super.getSortProperties());
		return easyuiSortProperties;
	}

	@Override
	public int getPageNo() {
		return this.getPage();
	}

	@Override
	public int getPageRows() {
		return this.getRows();
	}

	@Override
	public int getStartIndex() {
		return (page - 1) * rows;
	}
}


package estate.service;

import estate.entity.json.TableData;
import estate.entity.json.TableFilter;

import java.util.ArrayList;

/**
 * Created by kangbiao on 15-9-7.
 * 服务业务层
 */
public interface ServiceService
{
    /**
     * 根据过滤条件返回相应的保修数据
     * @param tableFilter 过滤条件
     * @return
     */
    ArrayList<TableData> getRepairList(TableFilter tableFilter);




}

package cn.itcast.service.impl;

import cn.itcast.dao.ItemsMapper;
import cn.itcast.domain.Items;
import cn.itcast.domain.ItemsExample;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> getItemsList() {
        ItemsExample example = new ItemsExample();
        List<Items> itemsList = itemsMapper.selectByExampleWithBLOBs(example);
        return itemsList;
    }
}

package cn.itcast.controller;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ItemController {
    
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/itemList")
    public ModelAndView getList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Items> itemsList = itemsService.getItemsList();

        modelAndView.addObject("itemList",itemsList);
        modelAndView.setViewName("itemList");
        return modelAndView;
    }

}

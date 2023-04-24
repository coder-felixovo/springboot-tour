package pers.felix.springboottour.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pers.felix.springboottour.entity.Currency;
import pers.felix.springboottour.entity.ResponseResult;
import pers.felix.springboottour.mapper.CurrencyMapper;

import javax.annotation.Resource;

/**
 * @author Felix Lee
 * @date 2023/4/24 14:46
 */
@RestController
public class CurrencyController {

    @Resource
    private CurrencyMapper currencyMapper;

    @PostMapping(path = "/add_currency")
    public Object addCurrency(@RequestBody Currency currency) {
        ResponseResult res = new ResponseResult();
        int count = currencyMapper.addCurrency(currency);
        if (count > 0) {
            res.setCode(1);
            res.setMessage("添加货币种类成功");
            return res;
        } else {
            res.setCode(-1);
            res.setMessage("添加货币种类失败");
            return res;
        }
    }
}

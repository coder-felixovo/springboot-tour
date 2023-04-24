package pers.felix.springboottour.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import pers.felix.springboottour.entity.Currency;

@Mapper
public interface CurrencyMapper {

    @Insert("INSERT INTO currency(currency_id, currency_name) VALUES (#{currencyId}, #{currencyName})")
    int addCurrency(Currency currency);
}

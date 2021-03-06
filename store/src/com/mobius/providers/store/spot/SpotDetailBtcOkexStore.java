package com.mobius.providers.store.spot;


import com.mobius.common.StoreException;
import com.mobius.entity.spot.SpotDetailBtcOkex;
import org.guiceside.persistence.hibernate.dao.enums.Persistent;
import org.guiceside.persistence.hibernate.dao.hquery.Selector;

import java.util.Date;
import java.util.List;


public interface SpotDetailBtcOkexStore {

    SpotDetailBtcOkex getById(Long id, Selector... selectors) throws StoreException;

    Integer getCountTradeSymbolDay(Long tradeId, Long symbolId, Date tradingDay) throws StoreException;


    List<SpotDetailBtcOkex> getList(List<Selector> selectorList) throws StoreException;

    void save(SpotDetailBtcOkex spotDetailBtcOkex, Persistent persistent) throws StoreException;

    void save(List<SpotDetailBtcOkex> detailBtcOkexList, Persistent persistent) throws StoreException;

    void delete(SpotDetailBtcOkex spotDetailBtcOkex) throws StoreException;

    void deleteById(Long id) throws StoreException;
}

package com.github.kuresson.app;

import com.github.kuresson.app.domain.model.ItemType;
import com.github.kuresson.app.domain.model.StockItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
}

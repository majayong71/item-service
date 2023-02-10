package hello.itemservice.domain.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class ItemRepository {

    private static final Map<Long, Item> store = new HashMap<>(); //static
    private static long sequence = 0L; //static

    public Item save(Item item) {     //아이템 저장하는 기능
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id) {  //아이템 조회
        return store.get(id);
    }

    public List<Item> findAll() {  //모든 아이템 조
        return new ArrayList<>(store.values());
    }

    public void update(Long itemId, Item updateParam) { //아이템을넣고 아이템과 관련된 업데이트 파라미터를 넣으면 업데이트되는 기능

        Item findItem = findById(itemId);
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
    }

    public void clearStore() {
        store.clear();
    }
}

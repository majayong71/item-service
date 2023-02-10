package hello.itemservice.domain.item;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    //     int 를 쓰게되면 0이 라도 값이 들어가야하지만
    //     Integer 를 쓰면 null값도 들어갈 수 있다.

    public Item() {

    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}




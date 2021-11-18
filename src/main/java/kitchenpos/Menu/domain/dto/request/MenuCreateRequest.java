package kitchenpos.Menu.domain.dto.request;

import kitchenpos.Menu.domain.Menu;
import kitchenpos.Menu.domain.MenuProduct;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class MenuCreateRequest {

    private String name;
    private BigDecimal price;
    private long menuGroupId;
    private List<MenuProductRequest> menuProducts;

    protected MenuCreateRequest() {
    }

    public Menu toEntity() {
        return new Menu(
                name,
                price,
                menuGroupId,
                this.menuProducts.stream()
                        .map(product -> new MenuProduct(
                                product.productId,
                                product.quantity)
                        )
                        .collect(Collectors.toList())
        );
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public long getMenuGroupId() {
        return menuGroupId;
    }

    public List<MenuProductRequest> getMenuProducts() {
        return menuProducts;
    }

    public static class MenuProductRequest {

        private long productId;
        private long quantity;

        protected MenuProductRequest() {
        }

        public long getProductId() {
            return productId;
        }

        public long getQuantity() {
            return quantity;
        }
    }
}

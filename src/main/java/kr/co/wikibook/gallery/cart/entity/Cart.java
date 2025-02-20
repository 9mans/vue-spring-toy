package kr.co.wikibook.gallery.cart.entity;

import jakarta.persistence.*;
import kr.co.wikibook.gallery.cart.dto.CartRead;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer memberId;

    @Column(nullable = false)
    private Integer itemId;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime created;

    public Cart() {

    }

    public Cart(Integer memberId, Integer itemId) {
        this.memberId = memberId;
        this.itemId = itemId;
    }

    public CartRead toRead() {

        return CartRead.builder()
                .id(id)
                .itemId(itemId)
                .build();
    }
}

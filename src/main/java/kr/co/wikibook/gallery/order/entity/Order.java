package kr.co.wikibook.gallery.order.entity;

import jakarta.persistence.*;
import kr.co.wikibook.gallery.order.dto.OrderRead;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer memberId;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 500, nullable = false)
    private String address;

    @Column(length = 10, nullable = false)
    private String payment;

    @Column(length = 16)
    private String cardNumber;

    @Column(nullable = false)
    private Long amount;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime created;

    public Order() {

    }

    public Order(Integer memberId, String name, String address, String payment, String cardNumber, Long amount) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.payment = payment;
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    public OrderRead toRead() {
        return OrderRead.builder()
                .id(id)
                .name(name)
                .address(address)
                .payment(payment)
                .amount(amount)
                .created(created)
                .build();
    }
}

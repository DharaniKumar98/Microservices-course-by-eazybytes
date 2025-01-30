package com.eazybytes.cards.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Cards" )
public class Card extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;

    private String mobileNumber;

    private String cardNumber;

    private String cardType;

    private int totalLimit;

    private int amountUsed;

    private int availableAmount;

}

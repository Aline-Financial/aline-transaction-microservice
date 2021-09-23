package com.aline.transactionmicroservice.dto;

import com.aline.transactionmicroservice.model.TransactionMethod;
import com.aline.transactionmicroservice.model.TransactionStatus;
import com.aline.transactionmicroservice.model.TransactionType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Standard DTO to represent a transaction
 * <br>
 * <em>This is what should be returned when retrieving
 * transaction information through the API.</em>
 */
@Data
@Builder
public class TransactionResponse {
    private long id;
    private TransactionMethod method;
    private int amount;
    private String accountNumber;
    private String initialBalance;
    private String postedBalance;
    private LocalDateTime date;
    private TransactionType type;
    private TransactionStatus status;
}
package com.acsousa.javacourse._13_interfaces.exercise.services;

import java.util.Calendar;
import java.util.Date;

import com.acsousa.javacourse._13_interfaces.exercise.entities.Contract;
import com.acsousa.javacourse._13_interfaces.exercise.entities.Installment;

/**
 * ContractService
 */
public class ContractService {

  private OnlinePaymentSerice onlinePaymentSerice;

  public ContractService(OnlinePaymentSerice onlinePaymentSerice) {
    this.onlinePaymentSerice = onlinePaymentSerice;
  }

  public void processContract(Contract contract, int months) {
    for (int i = 1; i <= months; i++) {
      double amount = contract.getTotalValue() / months;
      amount += onlinePaymentSerice.interest(amount, i);
      amount += onlinePaymentSerice.paymentFee(amount);
      Date dueDate = addMonths(contract.getDate(), i);
      contract.getInstallments().add(new Installment(dueDate, amount));
    }
  }

  private Date addMonths(Date date, int month) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.MONTH, month);
    return calendar.getTime();
  }
}

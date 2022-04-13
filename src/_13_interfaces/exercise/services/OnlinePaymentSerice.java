package _13_interfaces.exercise.services;

/**
 * OnlinePaymentSerice
 */
public interface OnlinePaymentSerice {

  double paymentFee(double amount);

  double interest(double amount, int months);
}

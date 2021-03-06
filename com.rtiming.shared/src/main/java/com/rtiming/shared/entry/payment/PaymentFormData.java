package com.rtiming.shared.entry.payment;

import java.util.Date;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "com.rtiming.client.entry.payment.PaymentForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class PaymentFormData extends AbstractFormData {

  private static final long serialVersionUID = 1L;

  public Amount getAmount() {
    return getFieldByClass(Amount.class);
  }

  public CurrencyUid getCurrencyUid() {
    return getFieldByClass(CurrencyUid.class);
  }

  public EvtPayment getEvtPayment() {
    return getFieldByClass(EvtPayment.class);
  }

  public PaymentNo getPaymentNo() {
    return getFieldByClass(PaymentNo.class);
  }

  /**
   * access method for property PaymentNr.
   */
  public Long getPaymentNr() {
    return getPaymentNrProperty().getValue();
  }

  /**
   * access method for property PaymentNr.
   */
  public void setPaymentNr(Long paymentNr) {
    getPaymentNrProperty().setValue(paymentNr);
  }

  public PaymentNrProperty getPaymentNrProperty() {
    return getPropertyByClass(PaymentNrProperty.class);
  }

  public Registration getRegistration() {
    return getFieldByClass(Registration.class);
  }

  public TypeUid getTypeUid() {
    return getFieldByClass(TypeUid.class);
  }

  public static class Amount extends AbstractValueFieldData<Double> {

    private static final long serialVersionUID = 1L;
  }

  public static class CurrencyUid extends AbstractValueFieldData<Long> {

    private static final long serialVersionUID = 1L;
  }

  public static class EvtPayment extends AbstractValueFieldData<Date> {

    private static final long serialVersionUID = 1L;
  }

  public static class PaymentNo extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;
  }

  public static class PaymentNrProperty extends AbstractPropertyData<Long> {

    private static final long serialVersionUID = 1L;
  }

  public static class Registration extends AbstractValueFieldData<Long> {

    private static final long serialVersionUID = 1L;
  }

  public static class TypeUid extends AbstractValueFieldData<Long> {

    private static final long serialVersionUID = 1L;
  }
}

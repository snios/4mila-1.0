package com.rtiming.shared.settings.currency;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

import com.rtiming.shared.common.AbstractCodeBoxData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "com.rtiming.client.settings.currency.CurrencyForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class CurrencyFormData extends AbstractFormData {

  private static final long serialVersionUID = 1L;

  public CodeBox getCodeBox() {
    return getFieldByClass(CodeBox.class);
  }

  /**
   * access method for property CurrencyUid.
   */
  public Long getCurrencyUid() {
    return getCurrencyUidProperty().getValue();
  }

  /**
   * access method for property CurrencyUid.
   */
  public void setCurrencyUid(Long currencyUid) {
    getCurrencyUidProperty().setValue(currencyUid);
  }

  public CurrencyUidProperty getCurrencyUidProperty() {
    return getPropertyByClass(CurrencyUidProperty.class);
  }

  public ExchangeRate getExchangeRate() {
    return getFieldByClass(ExchangeRate.class);
  }

  public static class CodeBox extends AbstractCodeBoxData {

    private static final long serialVersionUID = 1L;
  }

  public static class CurrencyUidProperty extends AbstractPropertyData<Long> {

    private static final long serialVersionUID = 1L;
  }

  public static class ExchangeRate extends AbstractValueFieldData<Double> {

    private static final long serialVersionUID = 1L;
  }
}

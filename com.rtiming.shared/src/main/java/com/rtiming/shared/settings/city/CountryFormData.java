package com.rtiming.shared.settings.city;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

import com.rtiming.shared.common.AbstractCodeBoxData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "com.rtiming.client.settings.city.CountryForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class CountryFormData extends AbstractFormData {

  private static final long serialVersionUID = 1L;

  public CodeBox getCodeBox() {
    return getFieldByClass(CodeBox.class);
  }

  public CountryCode getCountryCode() {
    return getFieldByClass(CountryCode.class);
  }

  /**
   * access method for property CountryUid.
   */
  public Long getCountryUid() {
    return getCountryUidProperty().getValue();
  }

  /**
   * access method for property CountryUid.
   */
  public void setCountryUid(Long countryUid) {
    getCountryUidProperty().setValue(countryUid);
  }

  public CountryUidProperty getCountryUidProperty() {
    return getPropertyByClass(CountryUidProperty.class);
  }

  public Nation getNation() {
    return getFieldByClass(Nation.class);
  }

  public static class CodeBox extends AbstractCodeBoxData {

    private static final long serialVersionUID = 1L;
  }

  public static class CountryCode extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;
  }

  public static class CountryUidProperty extends AbstractPropertyData<Long> {

    private static final long serialVersionUID = 1L;
  }

  public static class Nation extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;
  }
}

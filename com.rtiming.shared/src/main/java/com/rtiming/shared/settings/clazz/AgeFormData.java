package com.rtiming.shared.settings.clazz;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

import com.rtiming.shared.dao.RtClassAgeKey;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "com.rtiming.client.settings.clazz.AgeForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class AgeFormData extends AbstractFormData {

  private static final long serialVersionUID = 1L;

  public Clazz getClazz() {
    return getFieldByClass(Clazz.class);
  }

  public From getFrom() {
    return getFieldByClass(From.class);
  }

  /**
   * access method for property Key.
   */
  public RtClassAgeKey getKey() {
    return getKeyProperty().getValue();
  }

  /**
   * access method for property Key.
   */
  public void setKey(RtClassAgeKey key) {
    getKeyProperty().setValue(key);
  }

  public KeyProperty getKeyProperty() {
    return getPropertyByClass(KeyProperty.class);
  }

  public Sex getSex() {
    return getFieldByClass(Sex.class);
  }

  public To getTo() {
    return getFieldByClass(To.class);
  }

  public static class Clazz extends AbstractValueFieldData<Long> {

    private static final long serialVersionUID = 1L;
  }

  public static class From extends AbstractValueFieldData<Long> {

    private static final long serialVersionUID = 1L;
  }

  public static class KeyProperty extends AbstractPropertyData<RtClassAgeKey> {

    private static final long serialVersionUID = 1L;
  }

  public static class Sex extends AbstractValueFieldData<Long> {

    private static final long serialVersionUID = 1L;
  }

  public static class To extends AbstractValueFieldData<Long> {

    private static final long serialVersionUID = 1L;
  }
}

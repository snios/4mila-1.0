package com.rtiming.shared.ecard.download;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "com.rtiming.client.ecard.download.ECardStationStatusForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class ECardStationStatusFormData extends AbstractFormData {

  private static final long serialVersionUID = 1L;

  public ComPort getComPort() {
    return getFieldByClass(ComPort.class);
  }

  public Modus getModus() {
    return getFieldByClass(Modus.class);
  }

  public Status getStatus() {
    return getFieldByClass(Status.class);
  }

  public static class ComPort extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;
  }

  public static class Modus extends AbstractValueFieldData<Long> {

    private static final long serialVersionUID = 1L;
  }

  public static class Status extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;
  }
}

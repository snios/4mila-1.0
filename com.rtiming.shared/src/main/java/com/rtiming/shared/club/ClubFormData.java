package com.rtiming.shared.club;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

import com.rtiming.shared.settings.addinfo.AbstractAdditionalInformationFieldData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "com.rtiming.client.club.ClubForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class ClubFormData extends AbstractFormData {

  private static final long serialVersionUID = 1L;

  public AdditionalInformation getAdditionalInformation() {
    return getFieldByClass(AdditionalInformation.class);
  }

  /**
   * access method for property ClubNr.
   */
  public Long getClubNr() {
    return getClubNrProperty().getValue();
  }

  /**
   * access method for property ClubNr.
   */
  public void setClubNr(Long clubNr) {
    getClubNrProperty().setValue(clubNr);
  }

  public ClubNrProperty getClubNrProperty() {
    return getPropertyByClass(ClubNrProperty.class);
  }

  public ContactRunner getContactRunner() {
    return getFieldByClass(ContactRunner.class);
  }

  public ExtKey getExtKey() {
    return getFieldByClass(ExtKey.class);
  }

  public Name getName() {
    return getFieldByClass(Name.class);
  }

  public Shortcut getShortcut() {
    return getFieldByClass(Shortcut.class);
  }

  public static class AdditionalInformation extends AbstractAdditionalInformationFieldData {

    private static final long serialVersionUID = 1L;

    @Override
    public AdditionalInformationRowData addRow() {
      return (AdditionalInformationRowData) super.addRow();
    }

    @Override
    public AdditionalInformationRowData addRow(int rowState) {
      return (AdditionalInformationRowData) super.addRow(rowState);
    }

    @Override
    public AdditionalInformationRowData createRow() {
      return new AdditionalInformationRowData();
    }

    @Override
    public Class<? extends AbstractTableRowData> getRowType() {
      return AdditionalInformationRowData.class;
    }

    @Override
    public AdditionalInformationRowData[] getRows() {
      return (AdditionalInformationRowData[]) super.getRows();
    }

    @Override
    public AdditionalInformationRowData rowAt(int index) {
      return (AdditionalInformationRowData) super.rowAt(index);
    }

    public void setRows(AdditionalInformationRowData[] rows) {
      super.setRows(rows);
    }

    public static class AdditionalInformationRowData extends AbstractAdditionalInformationRowData {

      private static final long serialVersionUID = 1L;
    }
  }

  public static class ClubNrProperty extends AbstractPropertyData<Long> {

    private static final long serialVersionUID = 1L;
  }

  public static class ContactRunner extends AbstractValueFieldData<Long> {

    private static final long serialVersionUID = 1L;
  }

  public static class ExtKey extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;
  }

  public static class Name extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;
  }

  public static class Shortcut extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;
  }
}

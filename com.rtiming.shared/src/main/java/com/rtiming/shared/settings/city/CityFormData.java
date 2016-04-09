package com.rtiming.shared.settings.city;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "com.rtiming.client.settings.city.CityForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class CityFormData extends AbstractFormData {

  private static final long serialVersionUID = 1L;

  public Area getArea() {
    return getFieldByClass(Area.class);
  }

  public City getCity() {
    return getFieldByClass(City.class);
  }

  /**
   * access method for property CityNr.
   */
  public Long getCityNr() {
    return getCityNrProperty().getValue();
  }

  /**
   * access method for property CityNr.
   */
  public void setCityNr(Long cityNr) {
    getCityNrProperty().setValue(cityNr);
  }

  public CityNrProperty getCityNrProperty() {
    return getPropertyByClass(CityNrProperty.class);
  }

  public Country getCountry() {
    return getFieldByClass(Country.class);
  }

  public Region getRegion() {
    return getFieldByClass(Region.class);
  }

  public Zip getZip() {
    return getFieldByClass(Zip.class);
  }

  public static class Area extends AbstractValueFieldData<Long> {

    private static final long serialVersionUID = 1L;
  }

  public static class City extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;
  }

  public static class CityNrProperty extends AbstractPropertyData<Long> {

    private static final long serialVersionUID = 1L;
  }

  public static class Country extends AbstractValueFieldData<Long> {

    private static final long serialVersionUID = 1L;
  }

  public static class Region extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;
  }

  public static class Zip extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;
  }
}

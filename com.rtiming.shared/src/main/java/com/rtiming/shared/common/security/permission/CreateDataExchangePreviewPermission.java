package com.rtiming.shared.common.security.permission;

import java.security.BasicPermission;

public class CreateDataExchangePreviewPermission extends BasicPermission {

  private static final long serialVersionUID = 0L;

  public CreateDataExchangePreviewPermission() {
  super("CreateDataExchangePreview");
  }
}

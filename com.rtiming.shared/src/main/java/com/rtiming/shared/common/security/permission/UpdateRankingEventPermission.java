package com.rtiming.shared.common.security.permission;

import java.security.BasicPermission;

public class UpdateRankingEventPermission extends BasicPermission {

  private static final long serialVersionUID = 0L;

  public UpdateRankingEventPermission() {
    super("UpdateRankingEvent");
  }
}

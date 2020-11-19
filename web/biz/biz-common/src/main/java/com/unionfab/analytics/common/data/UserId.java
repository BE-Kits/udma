package com.unionfab.analytics.common.data;

import com.unionfab.domain.EntityId;
import java.util.UUID;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString(of = {"id"})
public class UserId implements EntityId {

  @Getter final UUID id;

  @Override
  public String getEntityType() {
    return "USER";
  }
}

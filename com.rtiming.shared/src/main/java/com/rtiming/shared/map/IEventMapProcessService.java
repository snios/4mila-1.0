package com.rtiming.shared.map;

import org.eclipse.scout.rt.platform.exception.ProcessingException;
import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

import com.rtiming.shared.event.EventMapFormData;

@TunnelToServer
public interface IEventMapProcessService extends IService {

  EventMapFormData prepareCreate(EventMapFormData formData) throws ProcessingException;

  EventMapFormData create(EventMapFormData formData) throws ProcessingException;

  EventMapFormData load(EventMapFormData formData) throws ProcessingException;

  EventMapFormData store(EventMapFormData formData) throws ProcessingException;

  EventMapFormData delete(EventMapFormData formData) throws ProcessingException;
}

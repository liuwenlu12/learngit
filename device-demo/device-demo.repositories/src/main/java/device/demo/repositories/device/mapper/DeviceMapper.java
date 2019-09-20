package device.demo.repositories.device.mapper;

import device.demo.models.device.Device;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


public interface DeviceMapper {

    Device getDeviceId(@Param("id") String id);

}

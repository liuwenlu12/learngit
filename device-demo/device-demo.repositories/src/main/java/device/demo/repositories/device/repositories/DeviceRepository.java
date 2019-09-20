package device.demo.repositories.device.repositories;

import device.demo.models.device.Device;
import device.demo.repositories.device.irepositories.IDeviceRepository;
import device.demo.repositories.device.mapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeviceRepository implements IDeviceRepository {

    @Autowired
    private DeviceMapper deviceMapper;

    public Device getDeviceId(String id) {
        return deviceMapper.getDeviceId(id);
    }
}

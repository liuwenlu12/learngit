package device.demo.repositories.device.irepositories;

import device.demo.models.device.Device;

public interface IDeviceRepository {

    Device getDeviceId(String id);

}

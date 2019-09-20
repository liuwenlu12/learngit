package device.demo.services.device;

import device.demo.interfaces.device.IDeviceService;
import device.demo.models.device.Device;
import device.demo.repositories.device.irepositories.IDeviceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import witparking.core.exceptions.BusinessException;



@Service("DeviceService")
public class DeviceService implements IDeviceService {

    private final Logger logger = LoggerFactory.getLogger(DeviceService.class);


    @Autowired
    private IDeviceRepository  iDeviceRepository;

    public Device findDeviceId(String id) throws BusinessException {
        return iDeviceRepository.getDeviceId(id);
    }
}

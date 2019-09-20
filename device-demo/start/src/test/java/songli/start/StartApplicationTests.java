package songli.start;

import device.demo.interfaces.device.IDeviceService;
import device.demo.models.device.Device;
import device.demo.repositories.device.irepositories.IDeviceRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StartApplicationTests {
    @Autowired
    IDeviceRepository iDeviceRepository;

    @Test
    public void contextLoads() {

//          AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

      /*  String deviceId = iDeviceService.findDeviceId("33ED4C97C3A849BE9C4B4AB59949EFD7");
        System.out.println("deviceId = " + deviceId);*/

        Device deviceId = iDeviceRepository.getDeviceId("33ED4C97C3A849BE9C4B4AB59949EFD7");
        System.out.println("deviceId = " + deviceId);
        
    }

}

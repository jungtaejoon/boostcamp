package carami.todo.config;

import org.springframework.context.annotation.*;

@Configuration
// dao, service에 대한 컴포넌트를 scan한다. sevice는 미리 추가한다.
@ComponentScan(basePackages = {
        "carami.todo.dao",
        "carami.todo.service"
})
@Import({DbConfig.class}) // DBConfig 를 설정한다.
public class RootApplicationContextConfig {
}
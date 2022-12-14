package kafdrop.service;

import org.slf4j.*;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.info.*;
import org.springframework.stereotype.*;

@Service
@ConditionalOnResource(resources="${spring.info.build.location:classpath:META-INF/build-info.properties}")
public final class BuildInfo {
  public BuildInfo(BuildProperties buildProperties) {
    final var log = LoggerFactory.getLogger(BuildInfo.class);
    log.info("Kafdrop version: {}, build time: {}", buildProperties.getVersion(), buildProperties.getTime());
  }
}

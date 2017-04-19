package quality.gates.sonar.api63;

import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.HttpClientBuilder;
import quality.gates.sonar.api.SonarHttpRequester;

public class SonarHttpRequester63 extends SonarHttpRequester {

    private static final String SONAR_API_LOGIN = "/api/authentication/login";

    private static final String SONAR_API_QUALITY_GATES_STATUS = "/api/events?resource=%s&format=json&categories=Alert";

    private static final String SONAR_API_TASK_INFO = "/api/ce/component?componentKey=%s";

    public SonarHttpRequester63() {

        context = HttpClientContext.create();
        client = HttpClientBuilder.create().build();
    }

    @Override
    protected String getSonarApiLogin() {
        return SONAR_API_LOGIN;
    }

    @Override
    protected String getSonarApiTaskInfoUrl() {
        return SONAR_API_TASK_INFO;
    }

    @Override
    protected String getSonarApiQualityGatesStatusUrl() {
        return SONAR_API_QUALITY_GATES_STATUS;
    }
}

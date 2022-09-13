
import com.cloudbees.plugins.credentials.impl.*
import com.cloudbees.plugins.credentials.*
import com.cloudbees.plugins.credentials.domains.*

def env = System.getenv()
Credentials c = (Credentials) new UsernamePasswordCredentialsImpl(CredentialsScope.GLOBAL,"dockerHub", "Docker Hub Account", env.DOCKER_USER, env.DOCKER_PASS)
SystemCredentialsProvider.getInstance().getStore().addCredentials(Domain.global(), c)
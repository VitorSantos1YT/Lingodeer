package okhttp3.internal.platform;

import aj.uZCn.evRpcb;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.m;
import mf.sOm.txBUGYhC;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class Jdk9Platform extends Platform {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Integer f45526d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String g(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null || applicationProtocol.equals(BuildConfig.VERSION_NAME)) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext;
        Integer num = f45526d;
        if (num != null && num.intValue() >= 9) {
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            m.e(sSLContext2, "getInstance(...)");
            return sSLContext2;
        }
        try {
            sSLContext = SSLContext.getInstance("TLSv1.3");
        } catch (NoSuchAlgorithmException unused) {
            sSLContext = SSLContext.getInstance("TLS");
        }
        m.c(sSLContext);
        return sSLContext;
    }

    static {
        new Companion(0);
        String property = System.getProperty("java.specification.version");
        Integer numT0 = property != null ? x.t0(property) : null;
        f45526d = numT0;
        if (numT0 != null) {
            return;
        }
        try {
            SSLSocket.class.getMethod(txBUGYhC.kwv, null);
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void e(SSLSocket sSLSocket, String str, List list) {
        m.f(list, evRpcb.yeTAaRIDYsRzkUE);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Platform.f45527a.getClass();
        sSLParameters.setApplicationProtocols((String[]) Platform.Companion.a(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }
}

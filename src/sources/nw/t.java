package nw;

import com.google.common.base.Preconditions;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import mw.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f44274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f44275c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.grpc.okhttp.internal.k f44276a;

    static {
        t tVar;
        Logger logger = Logger.getLogger(t.class.getName());
        f44274b = logger;
        io.grpc.okhttp.internal.k kVar = io.grpc.okhttp.internal.k.f34537d;
        ClassLoader classLoader = t.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e8) {
            logger.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e8);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e10) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e10);
                tVar = new t(kVar);
            }
        }
        tVar = new s(kVar);
        f44275c = tVar;
    }

    public t(io.grpc.okhttp.internal.k kVar) {
        Preconditions.k(kVar, "platform");
        this.f44276a = kVar;
    }

    public static boolean c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            Preconditions.f("Userinfo must not be present on authority: '%s'", k1.a(str).getAuthority().indexOf(64) == -1, str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
        this.f44276a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.f44276a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List list) {
        io.grpc.okhttp.internal.k kVar = this.f44276a;
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strB = b(sSLSocket);
            if (strB != null) {
                kVar.a(sSLSocket);
                return strB;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } catch (Throwable th2) {
            kVar.a(sSLSocket);
            throw th2;
        }
    }
}

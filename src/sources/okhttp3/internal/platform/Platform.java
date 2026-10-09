package okhttp3.internal.platform;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.m;
import m00.i;
import nv.p;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.platform.android.AndroidLogHandler;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import ry.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class Platform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f45527a = new Companion(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Platform f45528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f45529c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        public static ArrayList a(List protocols) {
            m.f(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(n.W(arrayList, 10));
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj2 = arrayList.get(i11);
                i11++;
                arrayList2.add(((Protocol) obj2).toString());
            }
            return arrayList2;
        }

        public static byte[] b(List protocols) {
            m.f(protocols, "protocols");
            i iVar = new i();
            ArrayList arrayListA = a(protocols);
            int size = arrayListA.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListA.get(i11);
                i11++;
                String str = (String) obj;
                iVar.J(str.length());
                iVar.Y(str);
            }
            return iVar.x(iVar.f40718b);
        }

        private Companion() {
        }
    }

    static {
        PlatformRegistry.f45530a.getClass();
        AndroidLog.f45535a.getClass();
        try {
            for (Map.Entry entry : AndroidLog.f45537c.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (AndroidLog.f45536b.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(AndroidLogHandler.f45538a);
                }
            }
        } catch (RuntimeException e8) {
            e8.printStackTrace();
        }
        Android10Platform.f45516f.getClass();
        Platform android10Platform = Android10Platform.f45517g ? new Android10Platform() : null;
        if (android10Platform == null) {
            AndroidPlatform.f45520f.getClass();
            android10Platform = AndroidPlatform.f45521g ? new AndroidPlatform() : null;
        }
        if (android10Platform == null) {
            throw new IllegalStateException(p.j(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        f45528b = android10Platform;
        f45529c = Logger.getLogger(OkHttpClient.class.getName());
    }

    public CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        return new BasicCertificateChainCleaner(d(x509TrustManager));
    }

    public TrustRootIndex d(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List protocols) {
        m.f(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int i11) throws IOException {
        m.f(address, "address");
        socket.connect(address, i11);
    }

    public String g(SSLSocket sSLSocket) {
        return null;
    }

    public Object h() {
        if (f45529c.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean i(String hostname) {
        m.f(hostname, "hostname");
        return true;
    }

    public void j(String message, int i11, Throwable th2) {
        m.f(message, "message");
        f45529c.log(i11 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    public void k(Object obj, String message) {
        m.f(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(message, 5, (Throwable) obj);
    }

    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        m.e(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}

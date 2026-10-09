package okhttp3.internal.platform;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.m;
import okhttp3.OkHttpClient;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidPlatform extends Platform implements ContextAwarePlatform {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Companion f45520f = new Companion(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f45521g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f45522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f45523e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CustomTrustRootIndex implements TrustRootIndex {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X509TrustManager f45524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f45525b;

        public CustomTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            this.f45524a = x509TrustManager;
            this.f45525b = method;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                Object objInvoke = this.f45525b.invoke(this.f45524a, x509Certificate);
                m.d(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e8) {
                throw new AssertionError("unable to get issues and signature", e8);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return m.a(this.f45524a, customTrustRootIndex.f45524a) && m.a(this.f45525b, customTrustRootIndex.f45525b);
        }

        public final int hashCode() {
            return this.f45525b.hashCode() + (this.f45524a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f45524a + ", findByIssuerAndSignatureMethod=" + this.f45525b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Platform.f45527a.getClass();
        PlatformRegistry.f45530a.getClass();
        f45521g = Build.VERSION.SDK_INT < 29;
    }

    public AndroidPlatform() {
        StandardAndroidSocketAdapter standardAndroidSocketAdapter;
        StandardAndroidSocketAdapter.f45553g.getClass();
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            standardAndroidSocketAdapter = new StandardAndroidSocketAdapter(cls);
        } catch (Exception e8) {
            AndroidLog androidLog = AndroidLog.f45535a;
            String name = OkHttpClient.class.getName();
            androidLog.getClass();
            AndroidLog.a(name, 5, "unable to load android socket classes", e8);
            standardAndroidSocketAdapter = null;
        }
        AndroidSocketAdapter.f45539e.getClass();
        DeferredSocketAdapter deferredSocketAdapter = new DeferredSocketAdapter(AndroidSocketAdapter.f45540f);
        ConscryptSocketAdapter.f45548a.getClass();
        DeferredSocketAdapter deferredSocketAdapter2 = new DeferredSocketAdapter(ConscryptSocketAdapter.f45549b);
        BouncyCastleSocketAdapter.f45545a.getClass();
        int i11 = 0;
        ArrayList arrayListT = l.T(new SocketAdapter[]{standardAndroidSocketAdapter, deferredSocketAdapter, deferredSocketAdapter2, new DeferredSocketAdapter(BouncyCastleSocketAdapter.f45546b)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListT.size();
        while (i11 < size) {
            Object obj = arrayListT.get(i11);
            i11++;
            if (((SocketAdapter) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f45523e = arrayList;
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    public final void a(Context context) {
        this.f45522d = context;
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    public final Context b() {
        return this.f45522d;
    }

    @Override // okhttp3.internal.platform.Platform
    public final CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        AndroidCertificateChainCleaner.f45532d.getClass();
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        AndroidCertificateChainCleaner androidCertificateChainCleaner = x509TrustManagerExtensions != null ? new AndroidCertificateChainCleaner(x509TrustManager, x509TrustManagerExtensions) : null;
        return androidCertificateChainCleaner != null ? androidCertificateChainCleaner : new BasicCertificateChainCleaner(d(x509TrustManager));
    }

    @Override // okhttp3.internal.platform.Platform
    public final TrustRootIndex d(X509TrustManager x509TrustManager) {
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new CustomTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void e(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        m.f(protocols, "protocols");
        ArrayList arrayList = this.f45523e;
        int size = arrayList.size();
        int i11 = 0;
        do {
            if (i11 >= size) {
                obj = null;
                break;
            } else {
                obj = arrayList.get(i11);
                i11++;
            }
        } while (!((SocketAdapter) obj).b(sSLSocket));
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            socketAdapter.d(sSLSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void f(Socket socket, InetSocketAddress address, int i11) throws IOException {
        m.f(address, "address");
        try {
            socket.connect(address, i11);
        } catch (ClassCastException e8) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e8;
            }
            throw new IOException("Exception in connect", e8);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f45523e;
        int size = arrayList.size();
        int i11 = 0;
        do {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
        } while (!((SocketAdapter) obj).b(sSLSocket));
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.c(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean i(String hostname) {
        m.f(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void j(String message, int i11, Throwable th2) {
        m.f(message, "message");
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}

package okhttp3.internal.platform;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.m;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Android10Platform extends Platform implements ContextAwarePlatform {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Companion f45516f = new Companion(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f45517g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f45518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f45519e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Platform.f45527a.getClass();
        PlatformRegistry.f45530a.getClass();
        f45517g = Build.VERSION.SDK_INT >= 29;
    }

    public Android10Platform() {
        Android10SocketAdapter.f45531a.getClass();
        Platform.f45527a.getClass();
        PlatformRegistry.f45530a.getClass();
        Android10SocketAdapter android10SocketAdapter = Build.VERSION.SDK_INT >= 29 ? new Android10SocketAdapter() : null;
        AndroidSocketAdapter.f45539e.getClass();
        DeferredSocketAdapter deferredSocketAdapter = new DeferredSocketAdapter(AndroidSocketAdapter.f45540f);
        ConscryptSocketAdapter.f45548a.getClass();
        DeferredSocketAdapter deferredSocketAdapter2 = new DeferredSocketAdapter(ConscryptSocketAdapter.f45549b);
        BouncyCastleSocketAdapter.f45545a.getClass();
        int i11 = 0;
        ArrayList arrayListT = l.T(new SocketAdapter[]{android10SocketAdapter, deferredSocketAdapter, deferredSocketAdapter2, new DeferredSocketAdapter(BouncyCastleSocketAdapter.f45546b)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListT.size();
        while (i11 < size) {
            Object obj = arrayListT.get(i11);
            i11++;
            if (((SocketAdapter) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f45519e = arrayList;
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    public final void a(Context context) {
        this.f45518d = context;
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    public final Context b() {
        return this.f45518d;
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(x509TrustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void e(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        m.f(protocols, "protocols");
        ArrayList arrayList = this.f45519e;
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
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f45519e;
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
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean i(String hostname) {
        m.f(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void k(Object obj, String message) {
        m.f(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, message);
        } else {
            m.d(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            ((CloseGuard) obj).warnIfOpen();
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext l() {
        StrictMode.noteSlowCall(bjXGJ.jcDuXwzTPQKBriL);
        return super.l();
    }
}

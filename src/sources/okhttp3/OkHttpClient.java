package okhttp3;

import hh.c;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class OkHttpClient implements Call.Factory, WebSocket.Factory {
    public static final Companion E = new Companion(0);
    public static final List F = _UtilJvmKt.k(new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});
    public static final List G = _UtilJvmKt.k(new ConnectionSpec[]{ConnectionSpec.f44994g, ConnectionSpec.f44995h});
    public final long A;
    public final RouteDatabase B;
    public final TaskRunner C;
    public final ConnectionPool D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dispatcher f45084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f45087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f45089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Authenticator f45090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f45091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f45092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CookieJar f45093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Dns f45094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Proxy f45095l;
    public final ProxySelector m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Authenticator f45096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SocketFactory f45097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SSLSocketFactory f45098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final X509TrustManager f45099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f45100r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f45101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HostnameVerifier f45102t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CertificatePinner f45103u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CertificateChainCleaner f45104v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f45105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f45106x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f45107y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f45108z;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
        public int A;
        public long B;
        public RouteDatabase C;
        public TaskRunner D;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConnectionPool f45110b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f45113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f45114f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f45115g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Authenticator f45116h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f45117i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f45118j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CookieJar f45119k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Dns f45120l;
        public Proxy m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ProxySelector f45121n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Authenticator f45122o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public SocketFactory f45123p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public SSLSocketFactory f45124q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public X509TrustManager f45125r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public List f45126s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public List f45127t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public HostnameVerifier f45128u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CertificatePinner f45129v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public CertificateChainCleaner f45130w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f45131x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f45132y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f45133z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Dispatcher f45109a = new Dispatcher();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f45111c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f45112d = new ArrayList();

        public Builder() {
            EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f45029a;
            TimeZone timeZone = _UtilJvmKt.f45204a;
            m.f(eventListener$Companion$NONE$1, "<this>");
            this.f45113e = new c(eventListener$Companion$NONE$1, 7);
            this.f45114f = true;
            this.f45115g = true;
            Authenticator authenticator = Authenticator.f44943a;
            this.f45116h = authenticator;
            this.f45117i = true;
            this.f45118j = true;
            this.f45119k = CookieJar.f45018a;
            this.f45120l = Dns.f45027a;
            this.f45122o = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            m.e(socketFactory, "getDefault(...)");
            this.f45123p = socketFactory;
            OkHttpClient.E.getClass();
            this.f45126s = OkHttpClient.G;
            this.f45127t = OkHttpClient.F;
            this.f45128u = OkHostnameVerifier.f45574a;
            this.f45129v = CertificatePinner.f44966d;
            this.f45131x = 10000;
            this.f45132y = 10000;
            this.f45133z = 10000;
            this.A = 60000;
            this.B = 1024L;
        }

        public final void a(long j11, TimeUnit unit) {
            m.f(unit, "unit");
            this.f45131x = _UtilJvmKt.b(j11, unit);
        }

        public final void b(long j11, TimeUnit unit) {
            m.f(unit, "unit");
            this.f45132y = _UtilJvmKt.b(j11, unit);
        }

        public final void c(long j11, TimeUnit unit) {
            m.f(unit, "unit");
            this.f45133z = _UtilJvmKt.b(j11, unit);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    public OkHttpClient(Builder builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        m.f(builder, "builder");
        this.f45084a = builder.f45109a;
        this.f45085b = _UtilJvmKt.j(builder.f45111c);
        this.f45086c = _UtilJvmKt.j(builder.f45112d);
        this.f45087d = builder.f45113e;
        boolean z11 = builder.f45114f;
        this.f45088e = z11;
        boolean z12 = builder.f45115g;
        this.f45089f = z12;
        this.f45090g = builder.f45116h;
        this.f45091h = builder.f45117i;
        this.f45092i = builder.f45118j;
        this.f45093j = builder.f45119k;
        this.f45094k = builder.f45120l;
        Proxy proxy = builder.m;
        this.f45095l = proxy;
        if (proxy != null) {
            proxySelector = NullProxySelector.f45554a;
        } else {
            proxySelector = builder.f45121n;
            if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
                proxySelector = NullProxySelector.f45554a;
            }
        }
        this.m = proxySelector;
        this.f45096n = builder.f45122o;
        this.f45097o = builder.f45123p;
        List list = builder.f45126s;
        this.f45100r = list;
        this.f45101s = builder.f45127t;
        this.f45102t = builder.f45128u;
        int i11 = builder.f45131x;
        this.f45105w = i11;
        int i12 = builder.f45132y;
        this.f45106x = i12;
        int i13 = builder.f45133z;
        this.f45107y = i13;
        this.f45108z = builder.A;
        this.A = builder.B;
        RouteDatabase routeDatabase = builder.C;
        RouteDatabase routeDatabase2 = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        this.B = routeDatabase2;
        TaskRunner taskRunner = builder.D;
        this.C = taskRunner == null ? TaskRunner.N : taskRunner;
        ConnectionPool connectionPool = builder.f45110b;
        if (connectionPool == null) {
            connectionPool = new ConnectionPool(null, null, i12, i13, i11, i12, z11, z12, routeDatabase2, 31);
            builder.f45110b = connectionPool;
        }
        this.D = connectionPool;
        if (list != null && list.isEmpty()) {
            this.f45098p = null;
            this.f45104v = null;
            this.f45099q = null;
            this.f45103u = CertificatePinner.f44966d;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.f45098p = null;
                this.f45104v = null;
                this.f45099q = null;
                this.f45103u = CertificatePinner.f44966d;
                break;
            }
            if (((ConnectionSpec) it.next()).f44996a) {
                SSLSocketFactory sSLSocketFactory = builder.f45124q;
                if (sSLSocketFactory != null) {
                    this.f45098p = sSLSocketFactory;
                    CertificateChainCleaner certificateChainCleaner = builder.f45130w;
                    m.c(certificateChainCleaner);
                    this.f45104v = certificateChainCleaner;
                    X509TrustManager x509TrustManager = builder.f45125r;
                    m.c(x509TrustManager);
                    this.f45099q = x509TrustManager;
                    CertificatePinner certificatePinner = builder.f45129v;
                    certificatePinner.getClass();
                    this.f45103u = m.a(certificatePinner.f44968b, certificateChainCleaner) ? certificatePinner : new CertificatePinner(certificatePinner.f44967a, certificateChainCleaner);
                    break;
                }
                Platform.f45527a.getClass();
                Platform.f45528b.getClass();
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                m.c(trustManagers);
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager2 = (X509TrustManager) trustManager;
                        this.f45099q = x509TrustManager2;
                        Platform platform = Platform.f45528b;
                        platform.getClass();
                        try {
                            SSLContext sSLContextL = platform.l();
                            sSLContextL.init(null, new TrustManager[]{x509TrustManager2}, null);
                            SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
                            m.e(socketFactory, "getSocketFactory(...)");
                            this.f45098p = socketFactory;
                            CertificateChainCleaner.f45573a.getClass();
                            CertificateChainCleaner certificateChainCleanerC = Platform.f45528b.c(x509TrustManager2);
                            this.f45104v = certificateChainCleanerC;
                            CertificatePinner certificatePinner2 = builder.f45129v;
                            certificatePinner2.getClass();
                            this.f45103u = m.a(certificatePinner2.f44968b, certificateChainCleanerC) ? certificatePinner2 : new CertificatePinner(certificatePinner2.f44967a, certificateChainCleanerC);
                            break;
                        } catch (GeneralSecurityException e8) {
                            throw new AssertionError("No System TLS: " + e8, e8);
                        }
                    }
                }
                String string = Arrays.toString(trustManagers);
                m.e(string, "toString(...)");
                throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
            }
        }
        X509TrustManager x509TrustManager3 = this.f45099q;
        CertificateChainCleaner certificateChainCleaner2 = this.f45104v;
        SSLSocketFactory sSLSocketFactory2 = this.f45098p;
        List list2 = this.f45086c;
        List list3 = this.f45085b;
        m.d(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        m.d(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.f45100r;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((ConnectionSpec) it2.next()).f44996a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (certificateChainCleaner2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager3 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (certificateChainCleaner2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager3 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!m.a(this.f45103u, CertificatePinner.f44966d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // okhttp3.Call.Factory
    public final RealCall a(Request request) {
        m.f(request, "request");
        return new RealCall(this, request);
    }

    public OkHttpClient() {
        this(new Builder());
    }
}

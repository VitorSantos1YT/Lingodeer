package okhttp3.internal.connection;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.m;
import m00.b;
import m00.c0;
import m00.d0;
import m00.k0;
import m00.l;
import mt.l0;
import nv.p;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import oz.r;
import oz.x;
import ty.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConnectPlan implements RoutePlanner.Plan, ExchangeCodec.Carrier {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f45240a0 = 0;
    public final boolean H;
    public final ConnectionUser K;
    public final RealRoutePlanner L;
    public final Route M;
    public final List N;
    public final int O;
    public final Request P;
    public final int Q;
    public final boolean R;
    public volatile boolean S;
    public Socket T;
    public Socket U;
    public Handshake V;
    public Protocol W;
    public d0 X;
    public c0 Y;
    public RealConnection Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskRunner f45241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RealConnectionPool f45242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45246f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f45247t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45248a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45248a = iArr;
        }
    }

    static {
        new Companion(0);
    }

    public static ConnectPlan l(ConnectPlan connectPlan, int i11, Request request, int i12, boolean z11, int i13) {
        return new ConnectPlan(connectPlan.f45241a, connectPlan.f45242b, connectPlan.f45243c, connectPlan.f45244d, connectPlan.f45245e, connectPlan.f45246f, connectPlan.f45247t, connectPlan.H, connectPlan.K, connectPlan.L, connectPlan.M, connectPlan.N, (i13 & 1) != 0 ? connectPlan.O : i11, (i13 & 2) != 0 ? connectPlan.P : request, (i13 & 4) != 0 ? connectPlan.Q : i12, (i13 & 8) != 0 ? connectPlan.R : z11);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void a(RealCall realCall, IOException iOException) {
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RealConnection b() {
        this.K.u(this.M);
        RealConnection realConnection = this.Z;
        m.c(realConnection);
        this.K.t(realConnection, this.M);
        ReusePlan reusePlanI = this.L.i(this, this.N);
        if (reusePlanI != null) {
            return reusePlanI.f45321a;
        }
        synchronized (realConnection) {
            RealConnectionPool realConnectionPool = this.f45242b;
            realConnectionPool.getClass();
            TimeZone timeZone = _UtilJvmKt.f45204a;
            realConnectionPool.f45302g.add(realConnection);
            realConnectionPool.f45300e.c(realConnectionPool.f45301f, 0L);
            this.K.a(realConnection);
        }
        this.K.v(realConnection);
        this.K.e(realConnection);
        return realConnection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.Plan c() {
        return new ConnectPlan(this.f45241a, this.f45242b, this.f45243c, this.f45244d, this.f45245e, this.f45246f, this.f45247t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        this.S = true;
        Socket socket = this.T;
        if (socket != null) {
            _UtilJvmKt.c(socket);
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult d() {
        Socket socket;
        Socket socket2;
        Route route = this.M;
        if (this.T != null) {
            throw new IllegalStateException("TCP already connected");
        }
        ConnectionUser connectionUser = this.K;
        connectionUser.x(this);
        boolean z11 = false;
        try {
            try {
                connectionUser.w(route);
                i();
                z11 = true;
                RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, null, null, 6);
                connectionUser.k(this);
                return connectResult;
            } catch (IOException e8) {
                if (route.f45185a.f44938g == null && route.f45186b.type() != Proxy.Type.DIRECT) {
                    Address address = route.f45185a;
                    address.f44939h.connectFailed(address.f44940i.i(), route.f45186b.address(), e8);
                }
                connectionUser.l(route, e8);
                RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, e8, 2);
                connectionUser.k(this);
                if (!z11 && (socket2 = this.T) != null) {
                    _UtilJvmKt.c(socket2);
                }
                return connectResult2;
            }
        } catch (Throwable th2) {
            connectionUser.k(this);
            if (!z11 && (socket = this.T) != null) {
                _UtilJvmKt.c(socket);
            }
            throw th2;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void e() {
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final boolean f() {
        return this.W != null;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x0164  */
    /* JADX WARN: Code duplicated, block: B:119:0x0168  */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult g() throws Throwable {
        ConnectPlan connectPlan;
        Socket socket;
        ConnectPlan connectPlan2;
        Socket socket2 = this.T;
        if (socket2 == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (f()) {
            throw new IllegalStateException("already connected");
        }
        Route route = this.M;
        Address address = route.f45185a;
        Address address2 = route.f45185a;
        List list = address.f44942k;
        ConnectionUser connectionUser = this.K;
        connectionUser.x(this);
        boolean z11 = false;
        ConnectPlan connectPlan3 = null;
        try {
            try {
                if (this.P != null) {
                    RoutePlanner.ConnectResult connectResultK = k();
                    if (connectResultK.f45324b != null || connectResultK.f45325c != null) {
                        connectionUser.k(this);
                        Socket socket3 = this.U;
                        if (socket3 != null) {
                            _UtilJvmKt.c(socket3);
                        }
                        _UtilJvmKt.c(socket2);
                        return connectResultK;
                    }
                }
                if (address2.f44934c != null) {
                    d0 d0Var = this.X;
                    if (d0Var == null) {
                        m.n("source");
                        throw null;
                    }
                    if (d0Var.f40691b.R()) {
                        c0 c0Var = this.Y;
                        if (c0Var == null) {
                            m.n("sink");
                            throw null;
                        }
                        if (c0Var.f40685b.R()) {
                            connectionUser.o();
                            SSLSocketFactory sSLSocketFactory = address2.f44934c;
                            HttpUrl httpUrl = address2.f44940i;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket2, httpUrl.f45048d, httpUrl.f45049e, true);
                            m.d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            ConnectPlan connectPlanN = n(list, sSLSocket);
                            ConnectionSpec connectionSpec = (ConnectionSpec) list.get(connectPlanN.Q);
                            ConnectPlan connectPlanM = connectPlanN.m(list, sSLSocket);
                            try {
                                connectionSpec.a(sSLSocket, connectPlanN.R);
                                j(sSLSocket, connectionSpec);
                                connectionUser.j(this.V);
                                connectPlan2 = connectPlanM;
                            } catch (IOException e8) {
                                e = e8;
                                connectPlan = null;
                                connectPlan3 = connectPlanM;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.U = socket2;
                List list2 = address2.f44941j;
                Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(protocol)) {
                    protocol = Protocol.HTTP_1_1;
                }
                this.W = protocol;
                connectPlan2 = null;
                try {
                    connectPlan = null;
                    try {
                        TaskRunner taskRunner = this.f45241a;
                        try {
                            RealConnectionPool realConnectionPool = this.f45242b;
                            Route route2 = this.M;
                            Socket socket4 = this.U;
                            m.c(socket4);
                            Handshake handshake = this.V;
                            try {
                                Protocol protocol2 = this.W;
                                m.c(protocol2);
                                d0 d0Var2 = this.X;
                                if (d0Var2 == null) {
                                    m.n("source");
                                    throw null;
                                }
                                c0 c0Var2 = this.Y;
                                if (c0Var2 == null) {
                                    m.n("sink");
                                    throw null;
                                }
                                try {
                                    try {
                                        RealConnection realConnection = new RealConnection(taskRunner, realConnectionPool, route2, socket2, socket4, handshake, protocol2, d0Var2, c0Var2, this.f45247t, this.f45242b.f45297b);
                                        this.Z = realConnection;
                                        realConnection.i();
                                        connectionUser.f(route, this.W);
                                        try {
                                            try {
                                                connectPlan = null;
                                                try {
                                                    RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, null, null, 6);
                                                    connectionUser.k(this);
                                                    return connectResult;
                                                } catch (IOException e10) {
                                                    e = e10;
                                                    connectPlan3 = connectPlan2;
                                                    z11 = true;
                                                    connectionUser.l(route, e);
                                                    if (this.H) {
                                                        connectPlan3 = connectPlan;
                                                    } else {
                                                        connectPlan3 = connectPlan;
                                                    }
                                                    RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, connectPlan3, e);
                                                    connectionUser.k(this);
                                                    if (!z11) {
                                                        socket = this.U;
                                                        if (socket != null) {
                                                            _UtilJvmKt.c(socket);
                                                        }
                                                        _UtilJvmKt.c(socket2);
                                                    }
                                                    return connectResult2;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                z11 = true;
                                                connectionUser.k(this);
                                                if (!z11) {
                                                    Socket socket5 = this.U;
                                                    if (socket5 != null) {
                                                        _UtilJvmKt.c(socket5);
                                                    }
                                                    _UtilJvmKt.c(socket2);
                                                }
                                                throw th;
                                            }
                                        } catch (IOException e11) {
                                            e = e11;
                                            connectPlan = null;
                                        }
                                    } catch (IOException e12) {
                                        e = e12;
                                        connectPlan = null;
                                        connectPlan3 = connectPlan2;
                                    }
                                } catch (IOException e13) {
                                    e = e13;
                                    connectPlan = null;
                                }
                            } catch (IOException e14) {
                                e = e14;
                                connectPlan = null;
                            }
                        } catch (IOException e15) {
                            e = e15;
                            connectPlan = null;
                        }
                    } catch (IOException e16) {
                        e = e16;
                    }
                } catch (IOException e17) {
                    e = e17;
                    connectPlan = null;
                }
                connectPlan3 = connectPlan2;
            } catch (IOException e18) {
                e = e18;
                connectPlan = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        connectionUser.l(route, e);
        if (this.H || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException))) {
            connectPlan3 = connectPlan;
        }
        RoutePlanner.ConnectResult connectResult3 = new RoutePlanner.ConnectResult(this, connectPlan3, e);
        connectionUser.k(this);
        if (!z11) {
            socket = this.U;
            if (socket != null) {
                _UtilJvmKt.c(socket);
            }
            _UtilJvmKt.c(socket2);
        }
        return connectResult3;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final Route h() {
        return this.M;
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.M.f45186b.type();
        int i11 = type == null ? -1 : WhenMappings.f45248a[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            socketCreateSocket = this.M.f45185a.f44933b.createSocket();
            m.c(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(this.M.f45186b);
        }
        this.T = socketCreateSocket;
        if (this.S) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f45246f);
        try {
            Platform.f45527a.getClass();
            Platform.f45528b.f(socketCreateSocket, this.M.f45187c, this.f45245e);
            try {
                this.X = b.c(b.j(socketCreateSocket));
                this.Y = b.b(b.h(socketCreateSocket));
            } catch (NullPointerException e8) {
                if (m.a(e8.getMessage(), "throw with null exception")) {
                    throw new IOException(e8);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.M.f45187c);
            connectException.initCause(e10);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, ConnectionSpec connectionSpec) {
        Protocol protocolA;
        Address address = this.M.f45185a;
        try {
            if (connectionSpec.f44997b) {
                Platform.f45527a.getClass();
                Platform.f45528b.e(sSLSocket, address.f44940i.f45048d, address.f44941j);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            Handshake.Companion companion = Handshake.f45035e;
            m.c(session);
            companion.getClass();
            Handshake handshakeA = Handshake.Companion.a(session);
            HostnameVerifier hostnameVerifier = address.f44935d;
            m.c(hostnameVerifier);
            if (hostnameVerifier.verify(address.f44940i.f45048d, session)) {
                CertificatePinner certificatePinner = address.f44936e;
                m.c(certificatePinner);
                this.V = new Handshake(handshakeA.f45036a, handshakeA.f45037b, handshakeA.f45038c, new l0(certificatePinner, handshakeA, address, 12));
                String hostname = address.f44940i.f45048d;
                m.f(hostname, "hostname");
                Iterator it = certificatePinner.f44967a.iterator();
                String strG = null;
                if (it.hasNext()) {
                    ((CertificatePinner.Pin) it.next()).getClass();
                    x.s0(null, "**.", false);
                    throw null;
                }
                if (connectionSpec.f44997b) {
                    Platform.f45527a.getClass();
                    strG = Platform.f45528b.g(sSLSocket);
                }
                this.U = sSLSocket;
                this.X = b.c(b.j(sSLSocket));
                this.Y = b.b(b.h(sSLSocket));
                if (strG != null) {
                    Protocol.Companion.getClass();
                    protocolA = Protocol.Companion.a(strG);
                } else {
                    protocolA = Protocol.HTTP_1_1;
                }
                this.W = protocolA;
                Platform.f45527a.getClass();
                Platform.f45528b.getClass();
                return;
            }
            List listA = handshakeA.a();
            if (listA.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + address.f44940i.f45048d + " not verified (no certificates)");
            }
            Object obj = listA.get(0);
            m.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb2 = new StringBuilder("\n            |Hostname ");
            sb2.append(address.f44940i.f45048d);
            sb2.append(" not verified:\n            |    certificate: ");
            CertificatePinner.f44965c.getClass();
            StringBuilder sb3 = new StringBuilder("sha256/");
            l lVar = l.f40723d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            m.e(encoded, "getEncoded(...)");
            l lVar2 = l.f40723d;
            int length = encoded.length;
            b.e(encoded.length, 0, length);
            sb3.append(new l(ry.l.M(encoded, 0, length)).c("SHA-256").a());
            sb2.append(sb3.toString());
            sb2.append("\n            |    DN: ");
            sb2.append(x509Certificate.getSubjectDN().getName());
            sb2.append("\n            |    subjectAltNames: ");
            OkHostnameVerifier.f45574a.getClass();
            sb2.append(ry.m.H0(OkHostnameVerifier.a(x509Certificate, 7), OkHostnameVerifier.a(x509Certificate, 2)));
            sb2.append("\n            ");
            throw new SSLPeerUnverifiedException(r.h0(sb2.toString()));
        } catch (Throwable th2) {
            Platform.f45527a.getClass();
            Platform.f45528b.getClass();
            _UtilJvmKt.c(sSLSocket);
            throw th2;
        }
    }

    public final RoutePlanner.ConnectResult k() throws IOException {
        Request request;
        Request request2 = this.P;
        m.c(request2);
        Route route = this.M;
        String str = "CONNECT " + _UtilJvmKt.i(route.f45185a.f44940i, true) + " HTTP/1.1";
        while (true) {
            d0 d0Var = this.X;
            if (d0Var == null) {
                m.n("source");
                throw null;
            }
            c0 c0Var = this.Y;
            if (c0Var == null) {
                m.n("sink");
                throw null;
            }
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, d0Var, c0Var);
            d0 d0Var2 = this.X;
            if (d0Var2 == null) {
                m.n("source");
                throw null;
            }
            k0 k0VarTimeout = d0Var2.f40690a.timeout();
            long j11 = this.f45243c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            k0VarTimeout.g(j11, timeUnit);
            c0 c0Var2 = this.Y;
            if (c0Var2 == null) {
                m.n("sink");
                throw null;
            }
            c0Var2.f40684a.timeout().g(this.f45244d, timeUnit);
            http1ExchangeCodec.l(request2.f45136c, str);
            http1ExchangeCodec.a();
            Response.Builder builderE = http1ExchangeCodec.e(false);
            m.c(builderE);
            builderE.f45165a = request2;
            Response responseA = builderE.a();
            int i11 = responseA.f45161d;
            http1ExchangeCodec.k(responseA);
            if (i11 == 200) {
                request = null;
                break;
            }
            if (i11 != 407) {
                throw new IOException(p.j(i11, "Unexpected response code for CONNECT: "));
            }
            Request requestA = route.f45185a.f44937f.a(route, responseA);
            if (requestA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            String strB = responseA.f45163f.b("Connection");
            if (strB == null) {
                strB = null;
            }
            if ("close".equalsIgnoreCase(strB)) {
                request = requestA;
                break;
            }
            request2 = requestA;
        }
        if (request == null) {
            return new RoutePlanner.ConnectResult(this, null, null, 6);
        }
        Socket socket = this.T;
        if (socket != null) {
            _UtilJvmKt.c(socket);
        }
        int i12 = this.O + 1;
        ConnectionUser connectionUser = this.K;
        if (i12 < 21) {
            connectionUser.f(route, null);
            return new RoutePlanner.ConnectResult(this, l(this, i12, request, 0, false, 12), null, 4);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        connectionUser.l(route, protocolException);
        return new RoutePlanner.ConnectResult(this, null, protocolException, 2);
    }

    public final ConnectPlan m(List connectionSpecs, SSLSocket sSLSocket) {
        String[] strArr;
        m.f(connectionSpecs, "connectionSpecs");
        int i11 = this.Q;
        int size = connectionSpecs.size();
        for (int i12 = i11 + 1; i12 < size; i12++) {
            ConnectionSpec connectionSpec = (ConnectionSpec) connectionSpecs.get(i12);
            connectionSpec.getClass();
            if (connectionSpec.f44996a && ((strArr = connectionSpec.f44999d) == null || _UtilCommonKt.e(strArr, sSLSocket.getEnabledProtocols(), a.f52663b))) {
                String[] strArr2 = connectionSpec.f44998c;
                if (strArr2 != null) {
                    String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                    CipherSuite.f44972b.getClass();
                    if (!_UtilCommonKt.e(strArr2, enabledCipherSuites, CipherSuite.f44973c)) {
                    }
                }
                return l(this, 0, null, i12, i11 != -1, 3);
            }
        }
        return null;
    }

    public final ConnectPlan n(List connectionSpecs, SSLSocket sSLSocket) throws UnknownServiceException {
        m.f(connectionSpecs, "connectionSpecs");
        if (this.Q != -1) {
            return this;
        }
        ConnectPlan connectPlanM = m(connectionSpecs, sSLSocket);
        if (connectPlanM != null) {
            return connectPlanM;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.R);
        sb2.append(", modes=");
        sb2.append(connectionSpecs);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        m.c(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        m.e(string, "toString(...)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    public ConnectPlan(TaskRunner taskRunner, RealConnectionPool connectionPool, int i11, int i12, int i13, int i14, int i15, boolean z11, ConnectionUser user, RealRoutePlanner realRoutePlanner, Route route, List list, int i16, Request request, int i17, boolean z12) {
        m.f(taskRunner, SemtNwfPgIhi.CUFwTX);
        m.f(connectionPool, "connectionPool");
        m.f(user, "user");
        m.f(route, "route");
        this.f45241a = taskRunner;
        this.f45242b = connectionPool;
        this.f45243c = i11;
        this.f45244d = i12;
        this.f45245e = i13;
        this.f45246f = i14;
        this.f45247t = i15;
        this.H = z11;
        this.K = user;
        this.L = realRoutePlanner;
        this.M = route;
        this.N = list;
        this.O = i16;
        this.P = request;
        this.Q = i17;
        this.R = z12;
    }
}

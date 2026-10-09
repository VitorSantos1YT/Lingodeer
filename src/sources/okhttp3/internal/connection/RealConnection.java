package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.m;
import m00.c0;
import m00.d0;
import m00.j;
import m00.k;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.tls.OkHostnameVerifier;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection, ExchangeCodec.Carrier, Lockable {
    public final Protocol H;
    public final k K;
    public final j L;
    public final int M;
    public final ConnectionListener N;
    public Http2Connection O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final ArrayList V;
    public long W;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskRunner f45289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RealConnectionPool f45290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Route f45291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Socket f45292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Socket f45293f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Handshake f45294t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public RealConnection(TaskRunner taskRunner, RealConnectionPool connectionPool, Route route, Socket rawSocket, Socket socket, Handshake handshake, Protocol protocol, d0 source, c0 sink, int i11, ConnectionListener connectionListener) {
        m.f(taskRunner, "taskRunner");
        m.f(connectionPool, "connectionPool");
        m.f(route, "route");
        m.f(rawSocket, "rawSocket");
        m.f(socket, "socket");
        m.f(protocol, "protocol");
        m.f(source, "source");
        m.f(sink, "sink");
        this.f45289b = taskRunner;
        this.f45290c = connectionPool;
        this.f45291d = route;
        this.f45292e = rawSocket;
        this.f45293f = socket;
        this.f45294t = handshake;
        this.H = protocol;
        this.K = source;
        this.L = sink;
        this.M = i11;
        this.N = connectionListener;
        this.U = 1;
        this.V = new ArrayList();
        this.W = Long.MAX_VALUE;
    }

    public static void d(OkHttpClient okHttpClient, Route failedRoute, IOException failure) {
        m.f(failedRoute, "failedRoute");
        m.f(failure, "failure");
        if (failedRoute.f45186b.type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.f45185a;
            address.f44939h.connectFailed(address.f44940i.i(), failedRoute.f45186b.address(), failure);
        }
        RouteDatabase routeDatabase = okHttpClient.B;
        synchronized (routeDatabase) {
            routeDatabase.f45322a.add(failedRoute);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void a(RealCall realCall, IOException iOException) {
        boolean z11;
        synchronized (this) {
            try {
                z11 = false;
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.O != null) || (iOException instanceof ConnectionShutdownException)) {
                        z11 = !this.P;
                        this.P = true;
                        if (this.S == 0) {
                            if (iOException != null) {
                                d(realCall.f45278a, this.f45291d, iOException);
                            }
                            this.R++;
                        }
                    }
                } else if (((StreamResetException) iOException).f45498a == ErrorCode.REFUSED_STREAM) {
                    int i11 = this.T + 1;
                    this.T = i11;
                    if (i11 > 1) {
                        z11 = !this.P;
                        this.P = true;
                        this.R++;
                    }
                } else if (((StreamResetException) iOException).f45498a != ErrorCode.CANCEL || !realCall.Q) {
                    z11 = !this.P;
                    this.P = true;
                    this.R++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            this.N.getClass();
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void b(Http2Connection http2Connection, Settings settings) {
        m.f(settings, "settings");
        synchronized (this) {
            try {
                int i11 = this.U;
                int i12 = (settings.f45496a & 8) != 0 ? settings.f45497b[3] : Integer.MAX_VALUE;
                this.U = i12;
                if (i12 < i11) {
                    RealConnectionPool realConnectionPool = this.f45290c;
                    Address address = this.f45291d.f45185a;
                    realConnectionPool.getClass();
                    m.f(address, "address");
                    RealConnectionPool.AddressState addressState = (RealConnectionPool.AddressState) realConnectionPool.f45299d.get(address);
                    if (addressState != null) {
                        realConnectionPool.b(addressState);
                        throw null;
                    }
                } else if (i12 > i11) {
                    RealConnectionPool realConnectionPool2 = this.f45290c;
                    realConnectionPool2.f45300e.c(realConnectionPool2.f45301f, 0L);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void c(Http2Stream http2Stream) {
        http2Stream.c(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        _UtilJvmKt.c(this.f45292e);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void e() {
        synchronized (this) {
            this.P = true;
        }
        this.N.getClass();
    }

    public final boolean f(Address address, List list) {
        m.f(address, "address");
        HttpUrl httpUrl = address.f44940i;
        TimeZone timeZone = _UtilJvmKt.f45204a;
        if (this.V.size() < this.U && !this.P) {
            Route route = this.f45291d;
            Address address2 = route.f45185a;
            Address address3 = route.f45185a;
            if (address2.a(address)) {
                String str = httpUrl.f45048d;
                String hostname = httpUrl.f45048d;
                if (!m.a(str, address3.f44940i.f45048d)) {
                    if (this.O != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Route route2 = (Route) it.next();
                            Proxy.Type type = route2.f45186b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && route.f45186b.type() == type2 && m.a(route.f45187c, route2.f45187c)) {
                                HostnameVerifier hostnameVerifier = address.f44935d;
                                OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.f45574a;
                                if (hostnameVerifier != okHostnameVerifier) {
                                    break;
                                }
                                TimeZone timeZone2 = _UtilJvmKt.f45204a;
                                HttpUrl httpUrl2 = address3.f44940i;
                                if (httpUrl.f45049e != httpUrl2.f45049e) {
                                    break;
                                }
                                boolean zA = m.a(hostname, httpUrl2.f45048d);
                                Handshake handshake = this.f45294t;
                                if (!zA) {
                                    if (!this.Q && handshake != null) {
                                        List listA = handshake.a();
                                        if (!listA.isEmpty()) {
                                            Object obj = listA.get(0);
                                            m.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            okHostnameVerifier.getClass();
                                            if (!OkHostnameVerifier.c(hostname, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    CertificatePinner certificatePinner = address.f44936e;
                                    m.c(certificatePinner);
                                    m.c(handshake);
                                    List peerCertificates = handshake.a();
                                    m.f(hostname, "hostname");
                                    m.f(peerCertificates, "peerCertificates");
                                    Iterator it2 = certificatePinner.f44967a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    ((CertificatePinner.Pin) it2.next()).getClass();
                                    x.s0(null, "**.", false);
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g(boolean z11) {
        long j11;
        TimeZone timeZone = _UtilJvmKt.f45204a;
        long jNanoTime = System.nanoTime();
        if (this.f45292e.isClosed() || this.f45293f.isClosed() || this.f45293f.isInputShutdown() || this.f45293f.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.O;
        if (http2Connection != null) {
            synchronized (http2Connection) {
                if (http2Connection.f45430f) {
                    return false;
                }
                return http2Connection.Q >= http2Connection.P || jNanoTime < http2Connection.R;
            }
        }
        synchronized (this) {
            j11 = jNanoTime - this.W;
        }
        if (j11 < 10000000000L || !z11) {
            return true;
        }
        Socket socket = this.f45293f;
        k source = this.K;
        m.f(socket, "<this>");
        m.f(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.R();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final Route h() {
        return this.f45291d;
    }

    public final void i() throws SocketException {
        this.W = System.nanoTime();
        Protocol protocol = this.H;
        if (protocol == Protocol.HTTP_2 || protocol == Protocol.H2_PRIOR_KNOWLEDGE) {
            this.f45293f.setSoTimeout(0);
            Object obj = this.N;
            FlowControlListener flowControlListener = obj instanceof FlowControlListener ? (FlowControlListener) obj : null;
            if (flowControlListener == null) {
                flowControlListener = FlowControlListener.None.f45388a;
            }
            Http2Connection.Builder builder = new Http2Connection.Builder(this.f45289b);
            Socket socket = this.f45293f;
            String peerName = this.f45291d.f45185a.f44940i.f45048d;
            k source = this.K;
            j sink = this.L;
            m.f(socket, "socket");
            m.f(peerName, "peerName");
            m.f(source, "source");
            m.f(sink, "sink");
            builder.f45433b = socket;
            String str = _UtilJvmKt.f45205b + ' ' + peerName;
            m.f(str, "<set-?>");
            builder.f45434c = str;
            builder.f45435d = source;
            builder.f45436e = sink;
            builder.f45437f = this;
            builder.f45439h = this.M;
            m.f(flowControlListener, "flowControlListener");
            builder.f45440i = flowControlListener;
            Http2Connection http2Connection = new Http2Connection(builder);
            this.O = http2Connection;
            Http2Connection.f45421c0.getClass();
            Settings settings = Http2Connection.f45422d0;
            this.U = (settings.f45496a & 8) != 0 ? settings.f45497b[3] : Integer.MAX_VALUE;
            Http2Writer http2Writer = http2Connection.Z;
            synchronized (http2Writer) {
                try {
                    if (http2Writer.f45485d) {
                        throw new IOException("closed");
                    }
                    Logger logger = Http2Writer.f45481f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(_UtilJvmKt.d(">> CONNECTION " + Http2.f45417b.f(), new Object[0]));
                    }
                    http2Writer.f45482a.Q0(Http2.f45417b);
                    http2Writer.f45482a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Http2Writer http2Writer2 = http2Connection.Z;
            Settings settings2 = http2Connection.T;
            http2Writer2.getClass();
            m.f(settings2, "settings");
            synchronized (http2Writer2) {
                try {
                    if (http2Writer2.f45485d) {
                        throw new IOException("closed");
                    }
                    http2Writer2.c(0, Integer.bitCount(settings2.f45496a) * 6, 4, 0);
                    for (int i11 = 0; i11 < 10; i11++) {
                        boolean z11 = true;
                        if (((1 << i11) & settings2.f45496a) == 0) {
                            z11 = false;
                        }
                        if (z11) {
                            http2Writer2.f45482a.writeShort(i11);
                            http2Writer2.f45482a.writeInt(settings2.f45497b[i11]);
                        }
                    }
                    http2Writer2.f45482a.flush();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            int iA = http2Connection.T.a();
            if (iA != 65535) {
                http2Connection.Z.i(0, iA - 65535);
            }
            TaskQueue.b(http2Connection.f45431t.d(), http2Connection.f45427c, http2Connection.f45424a0, 6);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        Route route = this.f45291d;
        sb2.append(route.f45185a.f44940i.f45048d);
        sb2.append(':');
        sb2.append(route.f45185a.f44940i.f45049e);
        sb2.append(", proxy=");
        sb2.append(route.f45186b);
        sb2.append(" hostAddress=");
        sb2.append(route.f45187c);
        sb2.append(" cipherSuite=");
        Handshake handshake = this.f45294t;
        if (handshake == null || (obj = handshake.f45037b) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.H);
        sb2.append('}');
        return sb2.toString();
    }
}

package okhttp3.internal.connection;

import am.rVFB.LwKl;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import ep.a;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import okhttp3.Address;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import oz.o;
import ry.k;
import sy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RealRoutePlanner implements RoutePlanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskRunner f45306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RealConnectionPool f45307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f45313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f45314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Address f45315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RouteDatabase f45316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ConnectionUser f45317l;
    public RouteSelector.Selection m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RouteSelector f45318n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Route f45319o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f45320p;

    public RealRoutePlanner(TaskRunner taskRunner, RealConnectionPool connectionPool, int i11, int i12, int i13, int i14, int i15, boolean z11, boolean z12, Address address, RouteDatabase routeDatabase, ConnectionUser connectionUser) {
        m.f(taskRunner, "taskRunner");
        m.f(connectionPool, "connectionPool");
        m.f(address, "address");
        m.f(routeDatabase, "routeDatabase");
        m.f(connectionUser, "connectionUser");
        this.f45306a = taskRunner;
        this.f45307b = connectionPool;
        this.f45308c = i11;
        this.f45309d = i12;
        this.f45310e = i13;
        this.f45311f = i14;
        this.f45312g = i15;
        this.f45313h = z11;
        this.f45314i = z12;
        this.f45315j = address;
        this.f45316k = routeDatabase;
        this.f45317l = connectionUser;
        this.f45320p = new k();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean a(RealConnection realConnection) {
        RouteSelector routeSelector;
        Route route;
        if (this.f45320p.isEmpty() && this.f45319o == null) {
            if (realConnection != null) {
                synchronized (realConnection) {
                    route = null;
                    if (realConnection.R == 0 && realConnection.P && _UtilJvmKt.a(realConnection.f45291d.f45185a.f44940i, this.f45315j.f44940i)) {
                        route = realConnection.f45291d;
                    }
                }
                if (route != null) {
                    this.f45319o = route;
                    return true;
                }
            }
            RouteSelector.Selection selection = this.m;
            if ((selection == null || selection.f45336b >= selection.f45335a.size()) && (routeSelector = this.f45318n) != null) {
                return routeSelector.a();
            }
        }
        return true;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean b() {
        return this.f45317l.b();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final Address c() {
        return this.f45315j;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean d(HttpUrl url) {
        m.f(url, "url");
        HttpUrl httpUrl = this.f45315j.f44940i;
        return url.f45049e == httpUrl.f45049e && m.a(url.f45048d, httpUrl.f45048d);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final k e() {
        return this.f45320p;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final RoutePlanner.Plan f() throws IOException {
        Socket socketP;
        boolean z11;
        ReusePlan reusePlan;
        RealConnection realConnectionR = this.f45317l.r();
        if (realConnectionR == null) {
            reusePlan = null;
        } else {
            boolean zG = realConnectionR.g(this.f45317l.d());
            synchronized (realConnectionR) {
                try {
                    if (!zG) {
                        z11 = !realConnectionR.P;
                        realConnectionR.P = true;
                        socketP = this.f45317l.p();
                    } else if (realConnectionR.P || !d(realConnectionR.f45291d.f45185a.f44940i)) {
                        socketP = this.f45317l.p();
                        z11 = false;
                    } else {
                        z11 = false;
                        socketP = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f45317l.r() == null) {
                if (socketP != null) {
                    _UtilJvmKt.c(socketP);
                }
                this.f45317l.s(realConnectionR);
                this.f45317l.c(realConnectionR);
                if (socketP != null) {
                    this.f45317l.q(realConnectionR);
                } else if (z11) {
                    this.f45317l.h(realConnectionR);
                }
                reusePlan = null;
            } else {
                if (socketP != null) {
                    throw new IllegalStateException("Check failed.");
                }
                reusePlan = new ReusePlan(realConnectionR);
            }
        }
        if (reusePlan != null) {
            return reusePlan;
        }
        ReusePlan reusePlanI = i(null, null);
        if (reusePlanI != null) {
            return reusePlanI;
        }
        if (!this.f45320p.isEmpty()) {
            return (RoutePlanner.Plan) this.f45320p.removeFirst();
        }
        ConnectPlan connectPlanG = g();
        ReusePlan reusePlanI2 = i(connectPlanG, connectPlanG.N);
        return reusePlanI2 != null ? reusePlanI2 : connectPlanG;
    }

    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, java.util.List] */
    public final ConnectPlan g() throws IOException {
        String hostAddress;
        int port;
        List listE;
        boolean zContains;
        Route route = this.f45319o;
        if (route != null) {
            this.f45319o = null;
            return h(route, null);
        }
        RouteSelector.Selection selection = this.m;
        if (selection != null && selection.f45336b < selection.f45335a.size()) {
            int i11 = selection.f45336b;
            ArrayList arrayList = selection.f45335a;
            if (i11 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i12 = selection.f45336b;
            selection.f45336b = i12 + 1;
            return h((Route) arrayList.get(i12), null);
        }
        RouteSelector routeSelector = this.f45318n;
        if (routeSelector == null) {
            routeSelector = new RouteSelector(this.f45315j, this.f45316k, this.f45317l, this.f45314i);
            this.f45318n = routeSelector;
        }
        if (!routeSelector.a()) {
            throw new IOException("exhausted all routes");
        }
        if (!routeSelector.a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (routeSelector.f45332f < routeSelector.f45331e.size()) {
            Address address = routeSelector.f45327a;
            if (routeSelector.f45332f >= routeSelector.f45331e.size()) {
                throw new SocketException("No route to " + address.f44940i.f45048d + "; exhausted proxy configurations: " + routeSelector.f45331e);
            }
            List list = routeSelector.f45331e;
            int i13 = routeSelector.f45332f;
            routeSelector.f45332f = i13 + 1;
            Proxy proxy = (Proxy) list.get(i13);
            ConnectionUser connectionUser = routeSelector.f45329c;
            ArrayList arrayList3 = new ArrayList();
            routeSelector.f45333g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                HttpUrl httpUrl = address.f44940i;
                hostAddress = httpUrl.f45048d;
                port = httpUrl.f45049e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                RouteSelector.f45326i.getClass();
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    m.e(hostAddress, "getHostName(...)");
                } else {
                    hostAddress = address2.getHostAddress();
                    m.e(hostAddress, "getHostAddress(...)");
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                o oVar = _HostnamesCommonKt.f45201a;
                m.f(hostAddress, "<this>");
                if (_HostnamesCommonKt.f45201a.f(hostAddress)) {
                    listE = ns.o.K(InetAddress.getByName(hostAddress));
                } else {
                    connectionUser.g(hostAddress);
                    List listA = address.f44932a.a(hostAddress);
                    if (listA.isEmpty()) {
                        throw new UnknownHostException(address.f44932a + " returned no addresses for " + hostAddress);
                    }
                    connectionUser.i(hostAddress, listA);
                    listE = listA;
                }
                if (routeSelector.f45330d && listE.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : listE) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = _UtilCommonKt.f45202a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        c cVarO = ns.o.o();
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                cVarO.add(it.next());
                            }
                            if (it2.hasNext()) {
                                cVarO.add(it2.next());
                            }
                        }
                        listE = ns.o.e(cVarO);
                    }
                }
                Iterator it3 = listE.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), port));
                }
            }
            Iterator it4 = routeSelector.f45333g.iterator();
            while (it4.hasNext()) {
                Route route2 = new Route(routeSelector.f45327a, proxy, (InetSocketAddress) it4.next());
                RouteDatabase routeDatabase = routeSelector.f45328b;
                synchronized (routeDatabase) {
                    zContains = routeDatabase.f45322a.contains(route2);
                }
                if (zContains) {
                    routeSelector.f45334h.add(route2);
                } else {
                    arrayList2.add(route2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            ry.m.d0(arrayList2, routeSelector.f45334h);
            routeSelector.f45334h.clear();
        }
        RouteSelector.Selection selection2 = new RouteSelector.Selection(arrayList2);
        this.m = selection2;
        if (this.f45317l.b()) {
            throw new IOException("Canceled");
        }
        if (selection2.f45336b >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i14 = selection2.f45336b;
        selection2.f45336b = i14 + 1;
        return h((Route) arrayList2.get(i14), arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051 A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:14:0x0044, B:22:0x0051, B:25:0x0058), top: B:53:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #1 {all -> 0x004f, blocks: (B:14:0x0044, B:22:0x0051, B:25:0x0058), top: B:53:0x0044 }] */
    public final ReusePlan i(ConnectPlan connectPlan, List list) {
        RealConnection realConnection;
        boolean z11;
        Socket socketP;
        RealConnectionPool realConnectionPool = this.f45307b;
        boolean zD = this.f45317l.d();
        Address address = this.f45315j;
        ConnectionUser connectionUser = this.f45317l;
        boolean z12 = connectPlan != null && connectPlan.f();
        realConnectionPool.getClass();
        m.f(address, "address");
        m.f(connectionUser, "connectionUser");
        Iterator it = realConnectionPool.f45302g.iterator();
        m.e(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                realConnection = null;
                break;
            }
            realConnection = (RealConnection) it.next();
            m.c(realConnection);
            synchronized (realConnection) {
                if (z12) {
                    try {
                        if (!(realConnection.O != null)) {
                            z11 = false;
                        } else if (realConnection.f(address, list)) {
                            connectionUser.a(realConnection);
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (realConnection.f(address, list)) {
                    z11 = false;
                } else {
                    connectionUser.a(realConnection);
                    z11 = true;
                }
            }
            if (z11) {
                if (realConnection.g(zD)) {
                    break;
                }
                synchronized (realConnection) {
                    realConnection.P = true;
                    socketP = connectionUser.p();
                }
                if (socketP != null) {
                    _UtilJvmKt.c(socketP);
                }
            }
        }
        if (realConnection == null) {
            return null;
        }
        if (connectPlan != null) {
            this.f45319o = connectPlan.M;
            Socket socket = connectPlan.U;
            if (socket != null) {
                _UtilJvmKt.c(socket);
            }
        }
        this.f45317l.v(realConnection);
        this.f45317l.e(realConnection);
        return new ReusePlan(realConnection);
    }

    public final ConnectPlan h(Route route, ArrayList arrayList) throws UnknownServiceException {
        m.f(route, "route");
        Address address = route.f45185a;
        if (address.f44934c == null) {
            if (!address.f44942k.contains(ConnectionSpec.f44995h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f45185a.f44940i.f45048d;
            Platform.f45527a.getClass();
            if (!Platform.f45528b.i(str)) {
                throw new UnknownServiceException(a.g("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (address.f44941j.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        Request request = null;
        if (route.f45186b.type() == Proxy.Type.HTTP) {
            Address address2 = route.f45185a;
            if (address2.f44934c != null || address2.f44941j.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
                Request.Builder builder = new Request.Builder();
                HttpUrl url = route.f45185a.f44940i;
                m.f(url, "url");
                builder.f45140a = url;
                builder.c("CONNECT", null);
                Address address3 = route.f45185a;
                builder.b(HttpHeaders.HOST, _UtilJvmKt.i(address3.f44940i, true));
                builder.b("Proxy-Connection", LwKl.FPcZXZBZGFL);
                builder.b(HttpHeaders.USER_AGENT, "okhttp/5.1.0");
                request = new Request(builder);
                Response.Builder builder2 = new Response.Builder();
                builder2.f45165a = request;
                Protocol protocol = Protocol.HTTP_1_1;
                m.f(protocol, "protocol");
                builder2.f45166b = protocol;
                builder2.f45167c = 407;
                builder2.f45168d = "Preemptive Authenticate";
                builder2.f45175k = -1L;
                builder2.f45176l = -1L;
                Headers.Builder builder3 = builder2.f45170f;
                builder3.getClass();
                _HeadersCommonKt.b("Proxy-Authenticate");
                _HeadersCommonKt.c("OkHttp-Preemptive", "Proxy-Authenticate");
                builder3.e("Proxy-Authenticate");
                _HeadersCommonKt.a(builder3, "Proxy-Authenticate", "OkHttp-Preemptive");
                Request requestA = address3.f44937f.a(route, builder2.a());
                if (requestA != null) {
                    request = requestA;
                }
            }
        }
        return new ConnectPlan(this.f45306a, this.f45307b, this.f45308c, this.f45309d, this.f45310e, this.f45311f, this.f45312g, this.f45313h, this.f45317l, this, route, arrayList, 0, request, -1, false);
    }
}

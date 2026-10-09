package okhttp3.internal.connection;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import ns.o;
import okhttp3.Address;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilJvmKt;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RouteSelector {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Companion f45326i = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f45327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RouteDatabase f45328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConnectionUser f45329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f45331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f45333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f45334h;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Selection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f45335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45336b;

        public Selection(ArrayList arrayList) {
            this.f45335a = arrayList;
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, ConnectionUser connectionUser, boolean z11) {
        List listK;
        m.f(address, "address");
        m.f(routeDatabase, "routeDatabase");
        m.f(connectionUser, "connectionUser");
        this.f45327a = address;
        this.f45328b = routeDatabase;
        this.f45329c = connectionUser;
        this.f45330d = z11;
        r rVar = r.f50854a;
        this.f45331e = rVar;
        this.f45333g = rVar;
        this.f45334h = new ArrayList();
        HttpUrl httpUrl = address.f44940i;
        Proxy proxy = address.f44938g;
        connectionUser.m(httpUrl);
        if (proxy != null) {
            listK = o.K(proxy);
        } else {
            URI uriI = httpUrl.i();
            if (uriI.getHost() == null) {
                listK = _UtilJvmKt.k(new Proxy[]{Proxy.NO_PROXY});
            } else {
                List<Proxy> listSelect = address.f44939h.select(uriI);
                listK = (listSelect == null || listSelect.isEmpty()) ? _UtilJvmKt.k(new Proxy[]{Proxy.NO_PROXY}) : _UtilJvmKt.j(listSelect);
            }
        }
        this.f45331e = listK;
        this.f45332f = 0;
        connectionUser.n(httpUrl, listK);
    }

    public final boolean a() {
        return this.f45332f < this.f45331e.size() || !this.f45334h.isEmpty();
    }
}

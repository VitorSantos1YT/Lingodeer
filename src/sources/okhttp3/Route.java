package okhttp3;

import defpackage.e;
import dl.ExOZ.xItStCyvVEZ;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.m;
import okhttp3.internal._HostnamesCommonKt;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Route {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f45185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f45186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f45187c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return m.a(route.f45185a, this.f45185a) && m.a(route.f45186b, this.f45186b) && m.a(route.f45187c, this.f45187c);
    }

    public final int hashCode() {
        return this.f45187c.hashCode() + ((this.f45186b.hashCode() + ((this.f45185a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        Address address = this.f45185a;
        HttpUrl httpUrl = address.f44940i;
        HttpUrl httpUrl2 = address.f44940i;
        String str = httpUrl.f45048d;
        InetSocketAddress inetSocketAddress = this.f45187c;
        InetAddress address2 = inetSocketAddress.getAddress();
        String strB = (address2 == null || (hostAddress = address2.getHostAddress()) == null) ? null : _HostnamesCommonKt.b(hostAddress);
        if (q.w0(str, ':')) {
            e.C(sb2, "[", str, "]");
        } else {
            sb2.append(str);
        }
        if (httpUrl2.f45049e != inetSocketAddress.getPort() || str.equals(strB)) {
            sb2.append(":");
            sb2.append(httpUrl2.f45049e);
        }
        if (!str.equals(strB)) {
            if (this.f45186b.equals(Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (strB == null) {
                sb2.append("<unresolved>");
            } else if (q.w0(strB, ':')) {
                e.C(sb2, "[", strB, "]");
            } else {
                sb2.append(strB);
            }
            sb2.append(":");
            sb2.append(inetSocketAddress.getPort());
        }
        return sb2.toString();
    }

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        m.f(address, "address");
        m.f(inetSocketAddress, xItStCyvVEZ.VpNubrzMAC);
        this.f45185a = address;
        this.f45186b = proxy;
        this.f45187c = inetSocketAddress;
    }
}

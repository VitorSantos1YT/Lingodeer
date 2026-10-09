package okhttp3;

import com.adjust.sdk.Constants;
import defpackage.e;
import hh.p0;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.m;
import nv.p;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Address {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dns f44932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f44933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f44934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f44935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CertificatePinner f44936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Authenticator f44937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Proxy f44938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProxySelector f44939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HttpUrl f44940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f44941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f44942k;

    public Address(String uriHost, int i11, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        m.f(uriHost, "uriHost");
        m.f(dns, "dns");
        m.f(socketFactory, "socketFactory");
        m.f(proxyAuthenticator, "proxyAuthenticator");
        m.f(protocols, "protocols");
        m.f(connectionSpecs, "connectionSpecs");
        m.f(proxySelector, "proxySelector");
        this.f44932a = dns;
        this.f44933b = socketFactory;
        this.f44934c = sSLSocketFactory;
        this.f44935d = hostnameVerifier;
        this.f44936e = certificatePinner;
        this.f44937f = proxyAuthenticator;
        this.f44938g = proxy;
        this.f44939h = proxySelector;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        String str = sSLSocketFactory != null ? Constants.SCHEME : "http";
        if (str.equalsIgnoreCase("http")) {
            builder.f45054a = "http";
        } else {
            if (!str.equalsIgnoreCase(Constants.SCHEME)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            builder.f45054a = Constants.SCHEME;
        }
        String strB = _HostnamesCommonKt.b(_UrlKt.d(uriHost, 0, 0, 7));
        if (strB == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        builder.f45057d = strB;
        if (1 > i11 || i11 >= 65536) {
            throw new IllegalArgumentException(p.j(i11, "unexpected port: ").toString());
        }
        builder.f45058e = i11;
        this.f44940i = builder.a();
        this.f44941j = _UtilJvmKt.j(protocols);
        this.f44942k = _UtilJvmKt.j(connectionSpecs);
    }

    public final boolean a(Address that) {
        m.f(that, "that");
        return m.a(this.f44932a, that.f44932a) && m.a(this.f44937f, that.f44937f) && m.a(this.f44941j, that.f44941j) && m.a(this.f44942k, that.f44942k) && m.a(this.f44939h, that.f44939h) && m.a(this.f44938g, that.f44938g) && m.a(this.f44934c, that.f44934c) && m.a(this.f44935d, that.f44935d) && m.a(this.f44936e, that.f44936e) && this.f44940i.f45049e == that.f44940i.f45049e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return m.a(this.f44940i, address.f44940i) && a(address);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f44936e) + ((Objects.hashCode(this.f44935d) + ((Objects.hashCode(this.f44934c) + ((Objects.hashCode(this.f44938g) + ((this.f44939h.hashCode() + p0.b(p0.b((this.f44937f.hashCode() + ((this.f44932a.hashCode() + e.d(527, 31, this.f44940i.f45053i)) * 31)) * 31, 31, this.f44941j), 31, this.f44942k)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Address{");
        HttpUrl httpUrl = this.f44940i;
        sb2.append(httpUrl.f45048d);
        sb2.append(':');
        sb2.append(httpUrl.f45049e);
        sb2.append(", ");
        Proxy proxy = this.f44938g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f44939h;
        }
        return p0.o(sb2, str, '}');
    }
}

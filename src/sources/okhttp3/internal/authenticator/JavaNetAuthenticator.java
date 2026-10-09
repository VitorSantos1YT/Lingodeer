package okhttp3.internal.authenticator;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.EOFException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import m00.i;
import m00.l;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.platform.Platform;
import oz.a;
import ry.r;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class JavaNetAuthenticator implements Authenticator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dns f45206b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45207a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f45207a = iArr;
        }
    }

    public JavaNetAuthenticator() {
        this(0);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    /* JADX WARN: Code duplicated, block: B:59:0x0136  */
    /* JADX WARN: Code duplicated, block: B:70:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0069 A[SYNTHETIC] */
    @Override // okhttp3.Authenticator
    public final Request a(Route route, Response response) {
        String str;
        List<Challenge> list;
        Request request;
        HttpUrl httpUrl;
        boolean z11;
        Proxy proxy;
        Dns dns;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        String str2;
        String str3;
        Charset charset;
        Address address;
        Dns dns2;
        Headers headers = response.f45163f;
        int i11 = response.f45161d;
        if (i11 != 401) {
            if (i11 != 407) {
                list = r.f50854a;
            } else {
                str = "Proxy-Authenticate";
            }
            request = response.f45158a;
            httpUrl = request.f45134a;
            z11 = response.f45161d == 407;
            if (route != null) {
                proxy = route.f45186b;
            } else {
                proxy = Proxy.NO_PROXY;
            }
            for (Challenge challenge : list) {
                if ("Basic".equalsIgnoreCase(challenge.f44970a)) {
                    dns = (route != null || (address = route.f45185a) == null || (dns2 = address.f44932a) == null) ? this.f45206b : dns2;
                    if (z11) {
                        SocketAddress socketAddressAddress = proxy.address();
                        m.d(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        try {
                            passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), b(proxy, httpUrl, dns), inetSocketAddress.getPort(), httpUrl.f45045a, (String) challenge.f44971b.get("realm"), challenge.f44970a, new URL(httpUrl.f45053i), java.net.Authenticator.RequestorType.PROXY);
                        } catch (MalformedURLException e8) {
                            throw new RuntimeException(e8);
                        }
                    } else {
                        String str4 = httpUrl.f45048d;
                        m.c(proxy);
                        try {
                            passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(str4, b(proxy, httpUrl, dns), httpUrl.f45049e, httpUrl.f45045a, (String) challenge.f44971b.get("realm"), challenge.f44970a, new URL(httpUrl.f45053i), java.net.Authenticator.RequestorType.SERVER);
                        } catch (MalformedURLException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                    if (passwordAuthenticationRequestPasswordAuthentication != null) {
                        if (z11) {
                            str2 = "Proxy-Authorization";
                        } else {
                            str2 = HttpHeaders.AUTHORIZATION;
                        }
                        String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                        m.e(userName, "getUserName(...)");
                        char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                        m.e(password, "getPassword(...)");
                        String str5 = new String(password);
                        str3 = (String) challenge.f44971b.get("charset");
                        if (str3 != null) {
                            try {
                                charset = Charset.forName(str3);
                                m.e(charset, "forName(...)");
                            } catch (Exception unused) {
                                charset = a.f46137e;
                            }
                        } else {
                            charset = a.f46137e;
                        }
                        int i12 = Credentials.f45020a;
                        m.f(charset, "charset");
                        String str6 = userName + ':' + str5;
                        l lVar = l.f40723d;
                        m.f(str6, "<this>");
                        byte[] bytes = str6.getBytes(charset);
                        m.e(bytes, "getBytes(...)");
                        String strConcat = "Basic ".concat(new l(bytes).a());
                        Request.Builder builderB = request.b();
                        builderB.b(str2, strConcat);
                        return new Request(builderB);
                    }
                }
            }
            return null;
        }
        str = "WWW-Authenticate";
        String str7 = str;
        l lVar2 = okhttp3.internal.http.HttpHeaders.f45342a;
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (str7.equalsIgnoreCase(headers.d(i13))) {
                i iVar = new i();
                iVar.Y(headers.g(i13));
                try {
                    okhttp3.internal.http.HttpHeaders.b(iVar, arrayList);
                } catch (EOFException e11) {
                    Platform.f45527a.getClass();
                    Platform.f45528b.j("Unable to parse challenge", 5, e11);
                }
            }
        }
        list = arrayList;
        request = response.f45158a;
        httpUrl = request.f45134a;
        if (response.f45161d == 407) {
        }
        if (route != null) {
            proxy = route.f45186b;
        } else {
            proxy = Proxy.NO_PROXY;
        }
        while (r0.hasNext()) {
            if ("Basic".equalsIgnoreCase(challenge.f44970a)) {
                if (route != null) {
                }
                if (z11) {
                    SocketAddress socketAddressAddress2 = proxy.address();
                    m.d(socketAddressAddress2, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress2 = (InetSocketAddress) socketAddressAddress2;
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(inetSocketAddress2.getHostName(), b(proxy, httpUrl, dns), inetSocketAddress2.getPort(), httpUrl.f45045a, (String) challenge.f44971b.get("realm"), challenge.f44970a, new URL(httpUrl.f45053i), java.net.Authenticator.RequestorType.PROXY);
                } else {
                    String str8 = httpUrl.f45048d;
                    m.c(proxy);
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(str8, b(proxy, httpUrl, dns), httpUrl.f45049e, httpUrl.f45045a, (String) challenge.f44971b.get("realm"), challenge.f44970a, new URL(httpUrl.f45053i), java.net.Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    if (z11) {
                        str2 = "Proxy-Authorization";
                    } else {
                        str2 = HttpHeaders.AUTHORIZATION;
                    }
                    String userName2 = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    m.e(userName2, "getUserName(...)");
                    char[] password2 = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    m.e(password2, "getPassword(...)");
                    String str9 = new String(password2);
                    str3 = (String) challenge.f44971b.get("charset");
                    if (str3 != null) {
                        charset = Charset.forName(str3);
                        m.e(charset, "forName(...)");
                    } else {
                        charset = a.f46137e;
                    }
                    int i14 = Credentials.f45020a;
                    m.f(charset, "charset");
                    String str10 = userName2 + ':' + str9;
                    l lVar3 = l.f40723d;
                    m.f(str10, "<this>");
                    byte[] bytes2 = str10.getBytes(charset);
                    m.e(bytes2, "getBytes(...)");
                    String strConcat2 = "Basic ".concat(new l(bytes2).a());
                    Request.Builder builderB2 = request.b();
                    builderB2.b(str2, strConcat2);
                    return new Request(builderB2);
                }
            }
        }
        return null;
    }

    public JavaNetAuthenticator(int i11) {
        Dns defaultDns = Dns.f45027a;
        m.f(defaultDns, "defaultDns");
        this.f45206b = defaultDns;
    }

    public static InetAddress b(Proxy proxy, HttpUrl httpUrl, Dns dns) {
        int i11;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i11 = -1;
        } else {
            i11 = WhenMappings.f45207a[type.ordinal()];
        }
        if (i11 == 1) {
            return (InetAddress) ry.m.q0(dns.a(httpUrl.f45048d));
        }
        SocketAddress socketAddressAddress = proxy.address();
        m.d(socketAddressAddress, anrPHlQ.iMk);
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        m.e(address, "getAddress(...)");
        return address;
    }
}

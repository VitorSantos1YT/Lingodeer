package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.m;
import ns.o;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConnectionSpec {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f44992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f44993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ConnectionSpec f44994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConnectionSpec f44995h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f44998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f44999d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f45000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String[] f45001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f45002c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f45003d;

        public Builder(boolean z11) {
            this.f45000a = z11;
        }

        public final ConnectionSpec a() {
            return new ConnectionSpec(this.f45000a, this.f45003d, this.f45001b, this.f45002c);
        }

        public final void b(String... cipherSuites) {
            m.f(cipherSuites, "cipherSuites");
            if (!this.f45000a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
            m.e(objArrCopyOf, "copyOf(...)");
            this.f45001b = (String[]) objArrCopyOf;
        }

        public final void c(CipherSuite... cipherSuites) {
            m.f(cipherSuites, "cipherSuites");
            if (!this.f45000a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (CipherSuite cipherSuite : cipherSuites) {
                arrayList.add(cipherSuite.f44990a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void d(String... tlsVersions) {
            m.f(tlsVersions, "tlsVersions");
            if (!this.f45000a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
            m.e(objArrCopyOf, "copyOf(...)");
            this.f45002c = (String[]) objArrCopyOf;
        }

        public final void e(TlsVersion... tlsVersionArr) {
            if (!this.f45000a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.a());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            d((String[]) Arrays.copyOf(strArr, strArr.length));
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

    static {
        new Companion(0);
        CipherSuite cipherSuite = CipherSuite.f44987r;
        CipherSuite cipherSuite2 = CipherSuite.f44988s;
        CipherSuite cipherSuite3 = CipherSuite.f44989t;
        CipherSuite cipherSuite4 = CipherSuite.f44982l;
        CipherSuite cipherSuite5 = CipherSuite.f44983n;
        CipherSuite cipherSuite6 = CipherSuite.m;
        CipherSuite cipherSuite7 = CipherSuite.f44984o;
        CipherSuite cipherSuite8 = CipherSuite.f44986q;
        CipherSuite cipherSuite9 = CipherSuite.f44985p;
        List listL = o.L(cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9);
        f44992e = listL;
        List listL2 = o.L(cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.f44980j, CipherSuite.f44981k, CipherSuite.f44978h, CipherSuite.f44979i, CipherSuite.f44976f, CipherSuite.f44977g, CipherSuite.f44975e);
        f44993f = listL2;
        Builder builder = new Builder(true);
        CipherSuite[] cipherSuiteArr = (CipherSuite[]) listL.toArray(new CipherSuite[0]);
        builder.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        builder.e(tlsVersion, tlsVersion2);
        builder.f45003d = true;
        builder.a();
        Builder builder2 = new Builder(true);
        CipherSuite[] cipherSuiteArr2 = (CipherSuite[]) listL2.toArray(new CipherSuite[0]);
        builder2.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length));
        builder2.e(tlsVersion, tlsVersion2);
        builder2.f45003d = true;
        f44994g = builder2.a();
        Builder builder3 = new Builder(true);
        CipherSuite[] cipherSuiteArr3 = (CipherSuite[]) listL2.toArray(new CipherSuite[0]);
        builder3.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr3, cipherSuiteArr3.length));
        builder3.e(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        builder3.f45003d = true;
        builder3.a();
        f44995h = new Builder(false).a();
    }

    public ConnectionSpec(boolean z11, boolean z12, String[] strArr, String[] strArr2) {
        this.f44996a = z11;
        this.f44997b = z12;
        this.f44998c = strArr;
        this.f44999d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z11) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        m.c(enabledCipherSuites);
        String[] strArr = this.f44998c;
        if (strArr != null) {
            CipherSuite.f44972b.getClass();
            enabledCipherSuites = _UtilCommonKt.i(strArr, enabledCipherSuites, CipherSuite.f44973c);
        }
        String[] strArr2 = this.f44999d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            m.e(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = _UtilCommonKt.i(enabledProtocols2, strArr2, ty.a.f52663b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        m.c(supportedCipherSuites);
        CipherSuite.f44972b.getClass();
        CipherSuite$Companion$ORDER_BY_NAME$1 comparator = CipherSuite.f44973c;
        byte[] bArr = _UtilCommonKt.f45202a;
        m.f(comparator, "comparator");
        int length = supportedCipherSuites.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            } else if (comparator.compare(supportedCipherSuites[i11], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i11++;
            }
        }
        if (z11 && i11 != -1) {
            String str = supportedCipherSuites[i11];
            m.e(str, "get(...)");
            m.f(enabledCipherSuites, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            m.e(objArrCopyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        Builder builder = new Builder();
        builder.f45000a = this.f44996a;
        builder.f45001b = strArr;
        builder.f45002c = strArr2;
        builder.f45003d = this.f44997b;
        builder.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        builder.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        ConnectionSpec connectionSpecA = builder.a();
        if (connectionSpecA.c() != null) {
            sSLSocket.setEnabledProtocols(connectionSpecA.f44999d);
        }
        if (connectionSpecA.b() != null) {
            sSLSocket.setEnabledCipherSuites(connectionSpecA.f44998c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.f44998c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.f44972b.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.f44999d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.Companion.getClass();
            arrayList.add(TlsVersion.Companion.a(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z11 = connectionSpec.f44996a;
        boolean z12 = this.f44996a;
        if (z12 != z11) {
            return false;
        }
        if (z12) {
            return Arrays.equals(this.f44998c, connectionSpec.f44998c) && Arrays.equals(this.f44999d, connectionSpec.f44999d) && this.f44997b == connectionSpec.f44997b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f44996a) {
            return 17;
        }
        String[] strArr = this.f44998c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f44999d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f44997b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f44996a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append(Objects.toString(b(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append(Objects.toString(c(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return ep.a.l(sb2, this.f44997b, ')');
    }
}

package okhttp3;

import c00.f;
import com.bumptech.glide.d;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilJvmKt;
import qy.q;
import ry.n;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Handshake {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f45035e = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TlsVersion f45036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CipherSuite f45037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f45039d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        public static Handshake a(SSLSession sSLSession) throws IOException {
            List listK;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            CipherSuite cipherSuiteB = CipherSuite.f44972b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion.Companion.getClass();
            TlsVersion tlsVersionA = TlsVersion.Companion.a(protocol);
            try {
                listK = _UtilJvmKt.k(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listK = r.f50854a;
            }
            return new Handshake(tlsVersionA, cipherSuiteB, _UtilJvmKt.k(sSLSession.getLocalCertificates()), new f(7, listK));
        }

        private Companion() {
        }
    }

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List list, fz.a aVar) {
        m.f(tlsVersion, "tlsVersion");
        this.f45036a = tlsVersion;
        this.f45037b = cipherSuite;
        this.f45038c = list;
        this.f45039d = d.v(new b(0, aVar));
    }

    public final List a() {
        return (List) this.f45039d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.f45036a == this.f45036a && m.a(handshake.f45037b, this.f45037b) && m.a(handshake.a(), a()) && m.a(handshake.f45038c, this.f45038c);
    }

    public final int hashCode() {
        return this.f45038c.hashCode() + ((a().hashCode() + ((this.f45037b.hashCode() + ((this.f45036a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(n.W(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                m.e(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f45036a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f45037b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f45038c;
        ArrayList arrayList2 = new ArrayList(n.W(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                m.e(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}

package nw;

import com.google.common.base.Preconditions;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f44278a = Collections.unmodifiableList(Arrays.asList(io.grpc.okhttp.internal.l.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i11, io.grpc.okhttp.internal.c cVar) throws SSLPeerUnverifiedException {
        Preconditions.k(sSLSocketFactory, "sslSocketFactory");
        Preconditions.k(socket, "socket");
        Preconditions.k(cVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i11, true);
        String[] strArr = cVar.f34511b;
        String[] strArr2 = strArr != null ? (String[]) io.grpc.okhttp.internal.n.a(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) io.grpc.okhttp.internal.n.a(cVar.f34512c, sSLSocket.getEnabledProtocols());
        io.grpc.okhttp.internal.b bVar = new io.grpc.okhttp.internal.b(cVar);
        if (!bVar.f34505a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr2 == null) {
            bVar.f34506b = null;
        } else {
            bVar.f34506b = (String[]) strArr2.clone();
        }
        if (!bVar.f34505a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr3 == null) {
            bVar.f34507c = null;
        } else {
            bVar.f34507c = (String[]) strArr3.clone();
        }
        io.grpc.okhttp.internal.c cVar2 = new io.grpc.okhttp.internal.c(bVar);
        sSLSocket.setEnabledProtocols(cVar2.f34512c);
        String[] strArr4 = cVar2.f34511b;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        t tVar = t.f44275c;
        boolean z11 = cVar.f34513d;
        List list = f44278a;
        String strD = tVar.d(sSLSocket, str, z11 ? list : null);
        Preconditions.q("Only " + list + " are supported, but negotiated protocol is %s", list.contains(io.grpc.okhttp.internal.l.a(strD)), strD);
        if (io.grpc.okhttp.internal.e.f34521a.verify((str.startsWith("[") && str.endsWith("]")) ? nv.p.i(1, 1, str) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}

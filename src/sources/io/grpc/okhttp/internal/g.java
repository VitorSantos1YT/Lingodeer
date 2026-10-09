package io.grpc.okhttp.internal;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f34524e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f34525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f34526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f34527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f34528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Serializable f34529j;

    public g(xq.c cVar, xq.c cVar2, xq.c cVar3, xq.c cVar4, Provider provider, j jVar) {
        super(provider);
        this.f34525f = cVar;
        this.f34526g = cVar2;
        this.f34527h = cVar3;
        this.f34528i = cVar4;
        this.f34529j = jVar;
    }

    @Override // io.grpc.okhttp.internal.k
    public void a(SSLSocket sSLSocket) {
        switch (this.f34524e) {
            case 1:
                try {
                    ((Method) this.f34527h).invoke(null, sSLSocket);
                    return;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                } catch (InvocationTargetException e8) {
                    k.f34535b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e8);
                    return;
                }
            default:
                return;
        }
    }

    @Override // io.grpc.okhttp.internal.k
    public final void c(SSLSocket sSLSocket, String str, List list) {
        switch (this.f34524e) {
            case 0:
                xq.c cVar = (xq.c) this.f34528i;
                if (str != null) {
                    ((xq.c) this.f34525f).J(sSLSocket, Boolean.TRUE);
                    ((xq.c) this.f34526g).J(sSLSocket, str);
                }
                if (cVar.F(sSLSocket.getClass()) != null) {
                    cVar.K(sSLSocket, k.b(list));
                    return;
                }
                return;
            default:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    l lVar = (l) list.get(i11);
                    if (lVar != l.HTTP_1_0) {
                        arrayList.add(lVar.toString());
                    }
                }
                try {
                    ((Method) this.f34525f).invoke(null, sSLSocket, Proxy.newProxyInstance(k.class.getClassLoader(), new Class[]{(Class) this.f34528i, (Class) this.f34529j}, new i(arrayList)));
                    return;
                } catch (IllegalAccessException e8) {
                    throw new AssertionError(e8);
                } catch (InvocationTargetException e10) {
                    throw new AssertionError(e10);
                }
        }
    }

    @Override // io.grpc.okhttp.internal.k
    public final String d(SSLSocket sSLSocket) {
        byte[] bArr;
        switch (this.f34524e) {
            case 0:
                xq.c cVar = (xq.c) this.f34527h;
                if (cVar.F(sSLSocket.getClass()) == null || (bArr = (byte[]) cVar.K(sSLSocket, new Object[0])) == null) {
                    return null;
                }
                return new String(bArr, n.f34540b);
            default:
                try {
                    i iVar = (i) Proxy.getInvocationHandler(((Method) this.f34526g).invoke(null, sSLSocket));
                    boolean z11 = iVar.f34533b;
                    if (!z11 && iVar.f34534c == null) {
                        k.f34535b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                        return null;
                    }
                    if (z11) {
                        return null;
                    }
                    return iVar.f34534c;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                } catch (InvocationTargetException unused2) {
                    throw new AssertionError();
                }
        }
    }

    @Override // io.grpc.okhttp.internal.k
    public final j e() {
        switch (this.f34524e) {
            case 0:
                return (j) this.f34529j;
            default:
                return j.ALPN_AND_NPN;
        }
    }

    public g(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.f34525f = method;
        this.f34526g = method2;
        this.f34527h = method3;
        this.f34528i = cls;
        this.f34529j = cls2;
    }
}

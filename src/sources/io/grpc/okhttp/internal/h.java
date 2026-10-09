package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f34530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f34531f;

    public h(Provider provider, Method method, Method method2) {
        super(provider);
        this.f34530e = method;
        this.f34531f = method2;
    }

    @Override // io.grpc.okhttp.internal.k
    public final void c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (lVar != l.HTTP_1_0) {
                arrayList.add(lVar.toString());
            }
        }
        try {
            this.f34530e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // io.grpc.okhttp.internal.k
    public final String d(SSLSocket sSLSocket) {
        try {
            return (String) this.f34531f.invoke(sSLSocket, null);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // io.grpc.okhttp.internal.k
    public final j e() {
        return j.ALPN_AND_NPN;
    }
}

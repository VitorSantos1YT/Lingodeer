package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import io.grpc.ManagedChannelProvider$ProviderNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import lw.d;
import lw.k;
import lw.u0;
import lw.v0;
import lw.w0;
import lw.y;
import nw.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class GrpcChannelModule_ProvidesGrpcChannelFactory implements Factory<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GrpcChannelModule f20212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20213b;

    public GrpcChannelModule_ProvidesGrpcChannelFactory(GrpcChannelModule grpcChannelModule, Provider provider) {
        this.f20212a = grpcChannelModule;
        this.f20213b = provider;
    }

    @Override // oy.a
    public final Object get() {
        w0 w0Var;
        List list;
        GrpcChannelModule grpcChannelModule = this.f20212a;
        String str = (String) this.f20213b.get();
        grpcChannelModule.getClass();
        Logger logger = w0.f40483c;
        synchronized (w0.class) {
            try {
                if (w0.f40484d == null) {
                    List<u0> listF = y.f(u0.class, w0.a(), u0.class.getClassLoader(), new k(7));
                    w0.f40484d = new w0();
                    for (u0 u0Var : listF) {
                        w0.f40483c.fine("Service loader found " + u0Var);
                        w0 w0Var2 = w0.f40484d;
                        synchronized (w0Var2) {
                            u0Var.getClass();
                            w0Var2.f40485a.add(u0Var);
                        }
                    }
                    w0 w0Var3 = w0.f40484d;
                    synchronized (w0Var3) {
                        ArrayList arrayList = new ArrayList(w0Var3.f40485a);
                        Collections.sort(arrayList, Collections.reverseOrder(new v0()));
                        w0Var3.f40486b = Collections.unmodifiableList(arrayList);
                    }
                }
                w0Var = w0.f40484d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (w0Var) {
            list = w0Var.f40486b;
        }
        if ((list.isEmpty() ? null : (u0) list.get(0)) != null) {
            return j.forTarget(str).r();
        }
        throw new ManagedChannelProvider$ProviderNotFoundException("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }
}

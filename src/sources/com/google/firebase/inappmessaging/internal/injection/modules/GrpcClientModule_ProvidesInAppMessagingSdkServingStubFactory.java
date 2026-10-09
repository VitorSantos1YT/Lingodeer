package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.common.base.Preconditions;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServingGrpc;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lw.c1;
import lw.d;
import lw.g;
import rw.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory implements Factory<InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GrpcClientModule f20217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GrpcClientModule_ProvidesApiKeyHeadersFactory f20219c;

    public GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory(GrpcClientModule grpcClientModule, Provider provider, GrpcClientModule_ProvidesApiKeyHeadersFactory grpcClientModule_ProvidesApiKeyHeadersFactory) {
        this.f20217a = grpcClientModule;
        this.f20218b = provider;
        this.f20219c = grpcClientModule_ProvidesApiKeyHeadersFactory;
    }

    @Override // oy.a
    public final Object get() {
        d gVar = (d) this.f20218b.get();
        c1 c1Var = (c1) this.f20219c.get();
        this.f20217a.getClass();
        List listAsList = Arrays.asList(new h(c1Var));
        Preconditions.k(gVar, "channel");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            gVar = new g(gVar, (h) it.next());
        }
        return InAppMessagingSdkServingGrpc.a(gVar);
    }
}

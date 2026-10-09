package com.google.firebase.datatransport;

import android.content.Context;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import h2.d;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransportFactory lambda$getComponents$0(ComponentContainer componentContainer) {
        TransportRuntime.b((Context) componentContainer.a(Context.class));
        return TransportRuntime.a().c(CCTDestination.f7808f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransportFactory lambda$getComponents$1(ComponentContainer componentContainer) {
        TransportRuntime.b((Context) componentContainer.a(Context.class));
        return TransportRuntime.a().c(CCTDestination.f7808f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransportFactory lambda$getComponents$2(ComponentContainer componentContainer) {
        TransportRuntime.b((Context) componentContainer.a(Context.class));
        return TransportRuntime.a().c(CCTDestination.f7807e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component.Builder builderB = Component.b(TransportFactory.class);
        builderB.f18091a = LIBRARY_NAME;
        builderB.a(Dependency.d(Context.class));
        builderB.f18096f = new d(25);
        Component componentB = builderB.b();
        Component.Builder builderA = Component.a(new Qualified(LegacyTransportBackend.class, TransportFactory.class));
        builderA.a(Dependency.d(Context.class));
        builderA.f18096f = new d(26);
        Component componentB2 = builderA.b();
        Component.Builder builderA2 = Component.a(new Qualified(TransportBackend.class, TransportFactory.class));
        builderA2.a(Dependency.d(Context.class));
        builderA2.f18096f = new d(27);
        return Arrays.asList(componentB, componentB2, builderA2.b(), LibraryVersionComponent.a(LIBRARY_NAME, "19.0.0"));
    }
}

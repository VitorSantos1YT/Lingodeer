package com.google.firebase;

import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Preconditions;
import com.google.firebase.components.Qualified;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;
import ns.o;
import rz.e0;
import rz.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component.Builder builderA = Component.a(new Qualified(Background.class, y.class));
        builderA.a(new Dependency(new Qualified(Background.class, Executor.class), 1, 0));
        FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1 firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1 = new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1
            @Override // com.google.firebase.components.ComponentFactory
            public final Object d(ComponentContainer componentContainer) {
                Object objF = componentContainer.f(new Qualified(Background.class, Executor.class));
                m.e(objF, "get(...)");
                return e0.p((Executor) objF);
            }
        };
        Preconditions.a(firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1, "Null factory");
        builderA.f18096f = firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1;
        Component componentB = builderA.b();
        Component.Builder builderA2 = Component.a(new Qualified(Lightweight.class, y.class));
        builderA2.a(new Dependency(new Qualified(Lightweight.class, Executor.class), 1, 0));
        FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2 firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2 = new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
            @Override // com.google.firebase.components.ComponentFactory
            public final Object d(ComponentContainer componentContainer) {
                Object objF = componentContainer.f(new Qualified(Lightweight.class, Executor.class));
                m.e(objF, "get(...)");
                return e0.p((Executor) objF);
            }
        };
        Preconditions.a(firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2, "Null factory");
        builderA2.f18096f = firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2;
        Component componentB2 = builderA2.b();
        Component.Builder builderA3 = Component.a(new Qualified(Blocking.class, y.class));
        builderA3.a(new Dependency(new Qualified(Blocking.class, Executor.class), 1, 0));
        FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3 firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3 = new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
            @Override // com.google.firebase.components.ComponentFactory
            public final Object d(ComponentContainer componentContainer) {
                Object objF = componentContainer.f(new Qualified(Blocking.class, Executor.class));
                m.e(objF, "get(...)");
                return e0.p((Executor) objF);
            }
        };
        Preconditions.a(firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3, "Null factory");
        builderA3.f18096f = firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3;
        Component componentB3 = builderA3.b();
        Component.Builder builderA4 = Component.a(new Qualified(UiThread.class, y.class));
        builderA4.a(new Dependency(new Qualified(UiThread.class, Executor.class), 1, 0));
        FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4 firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4 = new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4
            @Override // com.google.firebase.components.ComponentFactory
            public final Object d(ComponentContainer componentContainer) {
                Object objF = componentContainer.f(new Qualified(UiThread.class, Executor.class));
                m.e(objF, "get(...)");
                return e0.p((Executor) objF);
            }
        };
        Preconditions.a(firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4, "Null factory");
        builderA4.f18096f = firebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4;
        return o.L(componentB, componentB2, componentB3, builderA4.b());
    }
}

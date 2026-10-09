package com.google.firebase.database;

import c3.a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseDatabaseComponent lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirebaseDatabaseComponent((FirebaseApp) componentContainer.a(FirebaseApp.class), componentContainer.i(InternalAuthProvider.class), componentContainer.i(InteropAppCheckTokenProvider.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component.Builder builderB = Component.b(FirebaseDatabaseComponent.class);
        builderB.f18091a = LIBRARY_NAME;
        builderB.a(Dependency.d(FirebaseApp.class));
        builderB.a(Dependency.a(InternalAuthProvider.class));
        builderB.a(Dependency.a(InteropAppCheckTokenProvider.class));
        builderB.f18096f = new a(25);
        return Arrays.asList(builderB.b(), LibraryVersionComponent.a(LIBRARY_NAME, "22.0.1"));
    }
}

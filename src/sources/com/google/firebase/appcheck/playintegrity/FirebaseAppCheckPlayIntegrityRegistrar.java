package com.google.firebase.appcheck.playintegrity;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.appcheck.playintegrity.internal.PlayIntegrityAppCheckProvider;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Qualified qualified = new Qualified(Lightweight.class, Executor.class);
        Qualified qualified2 = new Qualified(Blocking.class, Executor.class);
        Component.Builder builderB = Component.b(PlayIntegrityAppCheckProvider.class);
        builderB.f18091a = "fire-app-check-play-integrity";
        builderB.a(Dependency.d(FirebaseApp.class));
        builderB.a(new Dependency(qualified, 1, 0));
        builderB.a(new Dependency(qualified2, 1, 0));
        builderB.f18096f = new e(13, qualified, qualified2);
        return Arrays.asList(builderB.b(), LibraryVersionComponent.a("fire-app-check-play-integrity", "19.1.0"));
    }
}

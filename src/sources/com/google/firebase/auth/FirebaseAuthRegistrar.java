package com.google.firebase.auth;

import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ zzad lambda$getComponents$0(Qualified qualified, Qualified qualified2, Qualified qualified3, Qualified qualified4, Qualified qualified5, ComponentContainer componentContainer) {
        return new zzad((FirebaseApp) componentContainer.a(FirebaseApp.class), componentContainer.c(InteropAppCheckTokenProvider.class), componentContainer.c(HeartBeatController.class), (Executor) componentContainer.f(qualified), (Executor) componentContainer.f(qualified2), (Executor) componentContainer.f(qualified3), (ScheduledExecutorService) componentContainer.f(qualified4), (Executor) componentContainer.f(qualified5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Qualified qualified = new Qualified(Background.class, Executor.class);
        Qualified qualified2 = new Qualified(Blocking.class, Executor.class);
        Qualified qualified3 = new Qualified(Lightweight.class, Executor.class);
        Qualified qualified4 = new Qualified(Lightweight.class, ScheduledExecutorService.class);
        Qualified qualified5 = new Qualified(UiThread.class, Executor.class);
        Component.Builder builder = new Component.Builder(zzad.class, new Class[]{InternalAuthProvider.class});
        builder.a(Dependency.d(FirebaseApp.class));
        builder.a(new Dependency(1, 1, HeartBeatController.class));
        builder.a(new Dependency(qualified, 1, 0));
        builder.a(new Dependency(qualified2, 1, 0));
        builder.a(new Dependency(qualified3, 1, 0));
        builder.a(new Dependency(qualified4, 1, 0));
        builder.a(new Dependency(qualified5, 1, 0));
        builder.a(Dependency.b(InteropAppCheckTokenProvider.class));
        zzag zzagVar = new zzag();
        zzagVar.f18061a = qualified;
        zzagVar.f18062b = qualified2;
        zzagVar.f18063c = qualified3;
        zzagVar.f18064d = qualified4;
        zzagVar.f18065e = qualified5;
        builder.f18096f = zzagVar;
        return Arrays.asList(builder.b(), HeartBeatConsumerComponent.a(), LibraryVersionComponent.a("fire-auth", "24.1.0"));
    }
}

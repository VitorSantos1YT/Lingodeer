package com.google.firebase.appcheck;

import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.components.Component;
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
import jg.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Qualified qualified = new Qualified(UiThread.class, Executor.class);
        Qualified qualified2 = new Qualified(Lightweight.class, Executor.class);
        Qualified qualified3 = new Qualified(Background.class, Executor.class);
        Qualified qualified4 = new Qualified(Blocking.class, ScheduledExecutorService.class);
        Component.Builder builder = new Component.Builder(FirebaseAppCheck.class, new Class[]{InteropAppCheckTokenProvider.class});
        builder.f18091a = "fire-app-check";
        builder.a(Dependency.d(FirebaseApp.class));
        builder.a(new Dependency(qualified, 1, 0));
        builder.a(new Dependency(qualified2, 1, 0));
        builder.a(new Dependency(qualified3, 1, 0));
        builder.a(new Dependency(qualified4, 1, 0));
        builder.a(Dependency.b(HeartBeatController.class));
        builder.f18096f = new a(qualified, qualified2, qualified3, qualified4);
        builder.c(1);
        return Arrays.asList(builder.b(), HeartBeatConsumerComponent.a(), LibraryVersionComponent.a("fire-app-check", "19.1.0"));
    }
}

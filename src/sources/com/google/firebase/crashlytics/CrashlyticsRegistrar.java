package com.google.firebase.crashlytics;

import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f18209d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Qualified f18210a = new Qualified(Background.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qualified f18211b = new Qualified(Blocking.class, ExecutorService.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Qualified f18212c = new Qualified(Lightweight.class, ExecutorService.class);

    static {
        FirebaseSessionsDependencies.a(SessionSubscriber.Name.CRASHLYTICS);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Component.Builder builderB = Component.b(FirebaseCrashlytics.class);
        builderB.f18091a = "fire-cls";
        builderB.a(Dependency.d(FirebaseApp.class));
        builderB.a(Dependency.d(FirebaseInstallationsApi.class));
        builderB.a(new Dependency(this.f18210a, 1, 0));
        builderB.a(new Dependency(this.f18211b, 1, 0));
        builderB.a(new Dependency(this.f18212c, 1, 0));
        builderB.a(Dependency.a(CrashlyticsNativeComponent.class));
        builderB.a(Dependency.a(AnalyticsConnector.class));
        builderB.a(Dependency.a(FirebaseRemoteConfigInterop.class));
        builderB.f18096f = new a(this);
        builderB.c(2);
        return Arrays.asList(builderB.b(), LibraryVersionComponent.a("fire-cls", "20.0.6"));
    }
}

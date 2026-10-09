package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.component.AbtComponent;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.database.android.d;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RemoteConfigComponent lambda$getComponents$0(Qualified qualified, ComponentContainer componentContainer) {
        return new RemoteConfigComponent((Context) componentContainer.a(Context.class), (ScheduledExecutorService) componentContainer.f(qualified), (FirebaseApp) componentContainer.a(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.a(FirebaseInstallationsApi.class), ((AbtComponent) componentContainer.a(AbtComponent.class)).a("frc"), componentContainer.c(AnalyticsConnector.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Qualified qualified = new Qualified(Blocking.class, ScheduledExecutorService.class);
        Component.Builder builder = new Component.Builder(RemoteConfigComponent.class, new Class[]{FirebaseRemoteConfigInterop.class});
        builder.f18091a = LIBRARY_NAME;
        builder.a(Dependency.d(Context.class));
        builder.a(new Dependency(qualified, 1, 0));
        builder.a(Dependency.d(FirebaseApp.class));
        builder.a(Dependency.d(FirebaseInstallationsApi.class));
        builder.a(Dependency.d(AbtComponent.class));
        builder.a(Dependency.b(AnalyticsConnector.class));
        builder.f18096f = new d(qualified, 5);
        builder.c(2);
        return Arrays.asList(builder.b(), LibraryVersionComponent.a(LIBRARY_NAME, "23.1.0"));
    }
}

package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import h2.d;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbtComponent lambda$getComponents$0(ComponentContainer componentContainer) {
        return new AbtComponent((Context) componentContainer.a(Context.class), componentContainer.c(AnalyticsConnector.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component.Builder builderB = Component.b(AbtComponent.class);
        builderB.f18091a = LIBRARY_NAME;
        builderB.a(Dependency.d(Context.class));
        builderB.a(Dependency.b(AnalyticsConnector.class));
        builderB.f18096f = new d(7);
        return Arrays.asList(builderB.b(), LibraryVersionComponent.a(LIBRARY_NAME, bjXGJ.bSjUqB));
    }
}

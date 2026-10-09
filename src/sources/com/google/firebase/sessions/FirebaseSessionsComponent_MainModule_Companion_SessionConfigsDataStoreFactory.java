package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.settings.SessionConfigsSerializer;
import kotlin.jvm.internal.m;
import n5.f;
import n9.q;
import rz.e0;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory implements Factory<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20895b;

    public FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory(Provider provider, Provider provider2) {
        this.f20894a = provider;
        this.f20895b = provider2;
    }

    @Override // oy.a
    public final Object get() {
        Context appContext = (Context) this.f20894a.get();
        i blockingDispatcher = (i) this.f20895b.get();
        FirebaseSessionsComponent.MainModule.Companion companion = FirebaseSessionsComponent.MainModule.f20891a;
        companion.getClass();
        m.f(appContext, "appContext");
        m.f(blockingDispatcher, "blockingDispatcher");
        return FirebaseSessionsComponent.MainModule.Companion.a(companion, SessionConfigsSerializer.f21090a, new q(new br.b(29), 3), e0.c(blockingDispatcher), new a(appContext, 0));
    }
}

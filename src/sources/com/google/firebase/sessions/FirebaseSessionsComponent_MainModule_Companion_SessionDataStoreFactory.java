package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import kotlin.jvm.internal.m;
import n5.f;
import n9.q;
import rz.e0;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory implements Factory<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f20898c;

    public FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory(Provider provider, Provider provider2, Provider provider3) {
        this.f20896a = provider;
        this.f20897b = provider2;
        this.f20898c = provider3;
    }

    @Override // oy.a
    public final Object get() {
        Context appContext = (Context) this.f20896a.get();
        i blockingDispatcher = (i) this.f20897b.get();
        SessionDataSerializer sessionDataSerializer = (SessionDataSerializer) this.f20898c.get();
        FirebaseSessionsComponent.MainModule.Companion companion = FirebaseSessionsComponent.MainModule.f20891a;
        companion.getClass();
        m.f(appContext, "appContext");
        m.f(blockingDispatcher, "blockingDispatcher");
        m.f(sessionDataSerializer, "sessionDataSerializer");
        return FirebaseSessionsComponent.MainModule.Companion.a(companion, sessionDataSerializer, new q(new com.google.firebase.datastorage.a(sessionDataSerializer, 1), 3), e0.c(blockingDispatcher), new a(appContext, 1));
    }
}

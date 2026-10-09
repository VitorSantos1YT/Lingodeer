package com.google.firebase.auth;

import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.database.android.e;
import com.google.firebase.inject.Provider;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zzad implements InternalAuthProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f18052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f18053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f18054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f18055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f18056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f18057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f18058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f18059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f18060i = new ConcurrentHashMap();

    public zzad(FirebaseApp firebaseApp, Provider provider, Provider provider2, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, Executor executor4) {
        this.f18052a = firebaseApp;
        this.f18053b = provider;
        this.f18054c = provider2;
        this.f18055d = executor;
        this.f18056e = executor2;
        this.f18057f = executor3;
        this.f18058g = scheduledExecutorService;
        this.f18059h = executor4;
    }

    public static zzad d(FirebaseApp firebaseApp) {
        return (zzad) firebaseApp.c(zzad.class);
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public final void a(e eVar) {
        ConcurrentHashMap concurrentHashMap = this.f18060i;
        (concurrentHashMap.isEmpty() ? c() : (FirebaseAuth) concurrentHashMap.values().iterator().next()).a(eVar);
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public final Task b(boolean z11) {
        ConcurrentHashMap concurrentHashMap = this.f18060i;
        return (concurrentHashMap.isEmpty() ? c() : (FirebaseAuth) concurrentHashMap.values().iterator().next()).b(z11);
    }

    public final synchronized FirebaseAuth c() {
        if (this.f18060i.containsKey("default")) {
            FirebaseAuth firebaseAuth = (FirebaseAuth) this.f18060i.get("default");
            if (firebaseAuth != null) {
                return firebaseAuth;
            }
            this.f18060i.remove("default");
        }
        if (!this.f18060i.isEmpty()) {
            throw new IllegalStateException("FirebaseAuth instance has already been instantiated with different configuration.");
        }
        com.google.firebase.auth.internal.zzab zzabVar = new com.google.firebase.auth.internal.zzab(this.f18052a, this.f18053b, this.f18056e, this.f18057f, this.f18059h, this.f18058g);
        this.f18060i.put("default", zzabVar);
        return zzabVar;
    }
}

package com.google.firebase.auth;

import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.internal.InternalTokenResult;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzx implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f18080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InternalTokenResult f18081b;

    public zzx(FirebaseAuth firebaseAuth, InternalTokenResult internalTokenResult) {
        this.f18080a = firebaseAuth;
        this.f18081b = internalTokenResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = this.f18080a;
        Iterator it = firebaseAuth.f17881d.iterator();
        while (it.hasNext()) {
            ((IdTokenListener) it.next()).a(this.f18081b);
        }
        Iterator it2 = firebaseAuth.f17879b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.IdTokenListener) it2.next()).a();
        }
    }
}

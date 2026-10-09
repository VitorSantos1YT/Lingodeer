package com.google.firebase.auth;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f18079a;

    public zzw(FirebaseAuth firebaseAuth) {
        this.f18079a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f18079a.f17880c.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.AuthStateListener) it.next()).a();
        }
    }
}

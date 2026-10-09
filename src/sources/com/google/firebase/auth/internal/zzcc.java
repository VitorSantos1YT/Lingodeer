package com.google.firebase.auth.internal;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzcc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ zzca f18001a;

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f18001a.f17880c.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.AuthStateListener) it.next()).a();
        }
    }
}

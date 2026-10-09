package com.google.firebase.auth.internal;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.internal.InternalTokenResult;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzbz implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ zzca f17996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ InternalTokenResult f17997b;

    @Override // java.lang.Runnable
    public final void run() {
        zzca zzcaVar = this.f17996a;
        InternalTokenResult internalTokenResult = this.f17997b;
        Iterator it = zzcaVar.f17881d.iterator();
        while (it.hasNext()) {
            ((IdTokenListener) it.next()).a(internalTokenResult);
        }
        Iterator it2 = zzcaVar.f17879b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.IdTokenListener) it2.next()).a();
        }
    }
}

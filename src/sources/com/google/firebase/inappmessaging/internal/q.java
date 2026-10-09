package com.google.firebase.inappmessaging.internal;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fx.c f20252a;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        fx.c cVar = this.f20252a;
        cVar.b(exc);
        cVar.a();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ww.b bVar;
        fx.c cVar = this.f20252a;
        uw.i iVar = cVar.f28232a;
        Object obj2 = cVar.get();
        zw.a aVar = zw.a.DISPOSED;
        if (obj2 != aVar && (bVar = (ww.b) cVar.getAndSet(aVar)) != aVar) {
            try {
                if (obj == null) {
                    iVar.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    iVar.onSuccess(obj);
                }
                if (bVar != null) {
                    bVar.dispose();
                }
            } catch (Throwable th2) {
                if (bVar != null) {
                    bVar.dispose();
                }
                throw th2;
            }
        }
        cVar.a();
    }
}

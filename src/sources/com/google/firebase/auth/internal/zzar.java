package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzar implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzas f17956b;

    public zzar(zzas zzasVar, String str) {
        this.f17956b = zzasVar;
        Preconditions.d(str);
        this.f17955a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseApp firebaseAppF = FirebaseApp.f(this.f17955a);
        ((com.google.firebase.auth.zzad) firebaseAppF.c(com.google.firebase.auth.zzad.class)).getClass();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseAppF);
        if (firebaseAuth.o()) {
            Task taskB = firebaseAuth.b(true);
            zzas.f17957f.c("Token refreshing started", new Object[0]);
            taskB.addOnFailureListener(new zzau(this));
        }
    }
}

package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzahd;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzz implements com.google.firebase.auth.internal.zzaw, com.google.firebase.auth.internal.zzj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f18082a;

    public zzz(FirebaseAuth firebaseAuth) {
        this.f18082a = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzaw
    public final void a(Status status) {
        int i11 = status.f8706a;
        if (i11 == 17011 || i11 == 17021 || i11 == 17005) {
            this.f18082a.h();
        }
    }

    @Override // com.google.firebase.auth.internal.zzj
    public final void b(zzahd zzahdVar, FirebaseUser firebaseUser) {
        FirebaseAuth firebaseAuth = this.f18082a;
        firebaseAuth.getClass();
        FirebaseAuth.i(firebaseAuth, firebaseUser, zzahdVar, true, true);
    }
}

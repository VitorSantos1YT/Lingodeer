package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaet implements zzaey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9886a;

    public zzaet(zzaes zzaesVar, String str) {
        this.f9886a = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaey
    public final void a(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        onVerificationStateChangedCallbacks.a(this.f9886a);
    }
}

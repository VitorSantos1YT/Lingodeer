package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaer implements zzaey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9884a;

    public zzaer(zzaes zzaesVar, String str) {
        this.f9884a = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaey
    public final void a(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        onVerificationStateChangedCallbacks.b(this.f9884a, new PhoneAuthProvider.ForceResendingToken());
    }
}

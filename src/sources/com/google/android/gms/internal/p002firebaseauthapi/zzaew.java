package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaew implements zzaey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Status f9888a;

    public zzaew(zzaes zzaesVar, Status status) {
        this.f9888a = status;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaey
    public final void a(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        onVerificationStateChangedCallbacks.d(zzadz.a(this.f9888a));
    }
}

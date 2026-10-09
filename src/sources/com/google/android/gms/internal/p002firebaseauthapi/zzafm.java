package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzafm extends PhoneAuthProvider.OnVerificationStateChangedCallbacks {
    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    public final void a(String str) {
        zzafj.f9901a.remove(null);
        throw null;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    public final void b(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        throw null;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    public final void c(PhoneAuthCredential phoneAuthCredential) {
        zzafj.f9901a.remove(null);
        throw null;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    public final void d(FirebaseException firebaseException) {
        zzafj.f9901a.remove(null);
        throw null;
    }
}

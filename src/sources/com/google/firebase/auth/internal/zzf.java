package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.auth.FirebaseAuthException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzf implements OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        zza zzaVar = zza.f17932a;
        String message = exc.getMessage();
        StringBuilder sb2 = new StringBuilder("Failed to get reCAPTCHA token with error [");
        sb2.append(message);
        sb2.append("]- calling backend without app verification");
        if ((exc instanceof FirebaseAuthException) && ((FirebaseAuthException) exc).f17899a.endsWith("UNAUTHORIZED_DOMAIN")) {
            throw null;
        }
        new zzo().a();
        throw null;
    }
}

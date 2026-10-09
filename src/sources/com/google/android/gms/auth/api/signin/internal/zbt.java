package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.util.UidVerifier;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbt extends zbo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevocationBoundService f8550a;

    public zbt(RevocationBoundService revocationBoundService) {
        this.f8550a = revocationBoundService;
    }

    public final void h() {
        if (UidVerifier.a(this.f8550a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb2 = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb2.append("Calling UID ");
        sb2.append(callingUid);
        sb2.append(" is not Google Play services.");
        throw new SecurityException(sb2.toString());
    }
}

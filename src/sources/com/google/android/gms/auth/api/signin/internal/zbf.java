package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zbf extends zba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zbg f8544a;

    public zbf(zbg zbgVar) {
        this.f8544a = zbgVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void R(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            zbn zbnVarA = zbn.a(null);
            synchronized (zbnVarA) {
                zbnVarA.f8549a.c(googleSignInAccount, null);
            }
        }
        this.f8544a.a(new GoogleSignInResult(googleSignInAccount, status));
    }
}

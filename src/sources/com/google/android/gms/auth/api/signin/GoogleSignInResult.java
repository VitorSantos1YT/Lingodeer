package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInResult implements Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f8509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f8510b;

    public GoogleSignInResult(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f8510b = googleSignInAccount;
        this.f8509a = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f8509a;
    }
}

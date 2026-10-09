package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzai implements WorkAccountApi.AddAccountResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Account f9428b = new Account("DUMMY_NAME", "com.google");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f9429a;

    public zzai(Status status, Account account) {
        this.f9429a = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f9429a;
    }
}

package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzad extends zzah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzae f9426a;

    public zzad(zzae zzaeVar) {
        this.f9426a = zzaeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.zzb
    public final void T0(Account account) {
        this.f9426a.a(new zzai(account != null ? Status.f8703e : zzal.f9432a, account));
    }
}

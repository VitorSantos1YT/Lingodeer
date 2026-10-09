package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzt extends com.google.android.gms.internal.common.zza implements IAccountAccessor {
    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() {
        Parcel parcelG = g(h(), 2);
        Account account = (Account) com.google.android.gms.internal.common.zzc.a(parcelG, Account.CREATOR);
        parcelG.recycle();
        return account;
    }
}

package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zza extends com.google.android.gms.internal.auth.zzb implements zzb {
    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 == 1) {
            Account account = (Account) com.google.android.gms.internal.auth.zzc.a(parcel, Account.CREATOR);
            com.google.android.gms.internal.auth.zzc.b(parcel);
            T0(account);
            return true;
        }
        if (i11 != 2) {
            return false;
        }
        int i12 = com.google.android.gms.internal.auth.zzc.f9456a;
        int i13 = parcel.readInt();
        com.google.android.gms.internal.auth.zzc.b(parcel);
        o0(i13 != 0);
        return true;
    }
}

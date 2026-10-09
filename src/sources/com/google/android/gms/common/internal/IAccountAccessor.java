package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface IAccountAccessor extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IAccountAccessor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f8931a = 0;

        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
            if (i11 != 2) {
                return false;
            }
            throw null;
        }
    }

    Account zzb();
}

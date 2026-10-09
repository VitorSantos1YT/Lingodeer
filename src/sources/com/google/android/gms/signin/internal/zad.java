package com.google.android.gms.signin.internal;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean h1(int i11, Parcel parcel, Parcel parcel2) {
        switch (i11) {
            case 3:
                com.google.android.gms.internal.base.zac.d(parcel);
                break;
            case 4:
                com.google.android.gms.internal.base.zac.d(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                com.google.android.gms.internal.base.zac.d(parcel);
                break;
            case 7:
                com.google.android.gms.internal.base.zac.d(parcel);
                break;
            case 8:
                zak zakVar = (zak) com.google.android.gms.internal.base.zac.a(parcel, zak.CREATOR);
                com.google.android.gms.internal.base.zac.d(parcel);
                Q(zakVar);
                break;
            case 9:
                com.google.android.gms.internal.base.zac.d(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}

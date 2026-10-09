package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzw extends com.google.android.gms.internal.common.zzb implements zzx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9045a = 0;

    public zzw() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 == 1) {
            IObjectWrapper iObjectWrapperZzd = zzd();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.b(parcel2, iObjectWrapperZzd);
            return true;
        }
        if (i11 != 2) {
            return false;
        }
        int iZze = zze();
        parcel2.writeNoException();
        parcel2.writeInt(iZze);
        return true;
    }
}

package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
        switch (i11) {
            case 1:
                zzc.b(parcel);
                throw new UnsupportedOperationException();
            case 2:
                zzc.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                zzc.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                zze();
                throw null;
            case 5:
                Status status = (Status) zzc.a(parcel, Status.CREATOR);
                zzc.b(parcel);
                u(status);
                return true;
            case 6:
                byte[] bArrCreateByteArray = parcel.createByteArray();
                zzc.b(parcel);
                zzb(bArrCreateByteArray);
                return true;
            case 7:
                DeviceMetaData deviceMetaData = (DeviceMetaData) zzc.a(parcel, DeviceMetaData.CREATOR);
                zzc.b(parcel);
                w(deviceMetaData);
                return true;
            default:
                return false;
        }
    }
}

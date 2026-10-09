package com.google.android.gms.internal.fido;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 == 1) {
            ArrayList arrayList = parcel.readArrayList(zzc.f9678a);
            zzc.b(parcel);
            L(arrayList);
        } else {
            if (i11 != 2) {
                return false;
            }
            Status status = (Status) zzc.a(parcel, Status.CREATOR);
            zzc.b(parcel);
            k(status);
        }
        parcel2.writeNoException();
        return true;
    }
}

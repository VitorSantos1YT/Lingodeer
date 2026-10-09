package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 == 1) {
            ProxyResponse proxyResponse = (ProxyResponse) zzc.a(parcel, ProxyResponse.CREATOR);
            zzc.b(parcel);
            o(proxyResponse);
        } else {
            if (i11 != 2) {
                return false;
            }
            String string = parcel.readString();
            zzc.b(parcel);
            d(string);
        }
        parcel2.writeNoException();
        return true;
    }
}

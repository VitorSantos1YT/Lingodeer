package com.google.android.gms.internal.fido;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ClassLoader f9678a = zzc.class.getClassLoader();

    private zzc() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(p.j(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public static void c(Parcel parcel, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        if (publicKeyCredentialCreationOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            publicKeyCredentialCreationOptions.writeToParcel(parcel, 0);
        }
    }
}

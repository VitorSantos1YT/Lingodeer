package com.google.android.gms.dynamite;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzp extends com.google.android.gms.internal.common.zza implements IInterface {
    public final IObjectWrapper h1(ObjectWrapper objectWrapper, String str, int i11) {
        Parcel parcelH = h();
        com.google.android.gms.internal.common.zzc.b(parcelH, objectWrapper);
        parcelH.writeString(str);
        parcelH.writeInt(i11);
        Parcel parcelG = g(parcelH, 4);
        IObjectWrapper iObjectWrapperH = IObjectWrapper.Stub.h(parcelG.readStrongBinder());
        parcelG.recycle();
        return iObjectWrapperH;
    }

    public final IObjectWrapper i1(ObjectWrapper objectWrapper, String str, boolean z11, long j11) {
        Parcel parcelH = h();
        com.google.android.gms.internal.common.zzc.b(parcelH, objectWrapper);
        parcelH.writeString(str);
        parcelH.writeInt(z11 ? 1 : 0);
        parcelH.writeLong(j11);
        Parcel parcelG = g(parcelH, 7);
        IObjectWrapper iObjectWrapperH = IObjectWrapper.Stub.h(parcelG.readStrongBinder());
        parcelG.recycle();
        return iObjectWrapperH;
    }

    public final IObjectWrapper j(ObjectWrapper objectWrapper, String str, int i11) {
        Parcel parcelH = h();
        com.google.android.gms.internal.common.zzc.b(parcelH, objectWrapper);
        parcelH.writeString(str);
        parcelH.writeInt(i11);
        Parcel parcelG = g(parcelH, 2);
        IObjectWrapper iObjectWrapperH = IObjectWrapper.Stub.h(parcelG.readStrongBinder());
        parcelG.recycle();
        return iObjectWrapperH;
    }

    public final IObjectWrapper j1(ObjectWrapper objectWrapper, String str, int i11, ObjectWrapper objectWrapper2) {
        Parcel parcelH = h();
        com.google.android.gms.internal.common.zzc.b(parcelH, objectWrapper);
        parcelH.writeString(str);
        parcelH.writeInt(i11);
        com.google.android.gms.internal.common.zzc.b(parcelH, objectWrapper2);
        Parcel parcelG = g(parcelH, 8);
        IObjectWrapper iObjectWrapperH = IObjectWrapper.Stub.h(parcelG.readStrongBinder());
        parcelG.recycle();
        return iObjectWrapperH;
    }
}

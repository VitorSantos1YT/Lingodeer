package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zap extends com.google.android.gms.internal.base.zaa implements IInterface {
    public final IObjectWrapper j(ObjectWrapper objectWrapper, zaaa zaaaVar) {
        Parcel parcelG = g();
        com.google.android.gms.internal.base.zac.c(parcelG, objectWrapper);
        com.google.android.gms.internal.base.zac.b(parcelG, zaaaVar);
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f9585a.transact(2, parcelG, parcelObtain, 0);
                parcelObtain.readException();
                parcelG.recycle();
                IObjectWrapper iObjectWrapperH = IObjectWrapper.Stub.h(parcelObtain.readStrongBinder());
                parcelObtain.recycle();
                return iObjectWrapperH;
            } catch (RuntimeException e8) {
                parcelObtain.recycle();
                throw e8;
            }
        } catch (Throwable th2) {
            parcelG.recycle();
            throw th2;
        }
    }
}

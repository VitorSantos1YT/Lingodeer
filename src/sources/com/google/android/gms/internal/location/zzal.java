package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzal extends zza implements zzam {
    @Override // com.google.android.gms.internal.location.zzam
    public final void B(zzbc zzbcVar) {
        Parcel parcelG = g();
        zzc.b(parcelG, zzbcVar);
        h(parcelG, 59);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void C0(zzah zzahVar) {
        Parcel parcelG = g();
        zzc.c(parcelG, zzahVar);
        h(parcelG, 67);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void G0(zzao zzaoVar) {
        Parcel parcelG = g();
        int i11 = zzc.f11109a;
        parcelG.writeInt(0);
        zzc.c(parcelG, zzaoVar);
        parcelG.writeString(null);
        h(parcelG, 63);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final LocationAvailability H(String str) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f11065a.transact(34, parcelG, parcelObtain, 0);
                parcelObtain.readException();
                parcelG.recycle();
                LocationAvailability locationAvailability = (LocationAvailability) zzc.a(parcelObtain, LocationAvailability.CREATOR);
                parcelObtain.recycle();
                return locationAvailability;
            } catch (RuntimeException e8) {
                parcelObtain.recycle();
                throw e8;
            }
        } catch (Throwable th2) {
            parcelG.recycle();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void c() {
        Parcel parcelG = g();
        int i11 = zzc.f11109a;
        parcelG.writeInt(0);
        h(parcelG, 13);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void g1(IStatusCallback iStatusCallback) {
        Parcel parcelG = g();
        int i11 = zzc.f11109a;
        parcelG.writeInt(0);
        parcelG.writeInt(0);
        zzc.c(parcelG, iStatusCallback);
        h(parcelG, 79);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void n0(zzl zzlVar) {
        Parcel parcelG = g();
        zzc.b(parcelG, zzlVar);
        h(parcelG, 75);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void x(StatusCallback statusCallback) {
        Parcel parcelG = g();
        int i11 = zzc.f11109a;
        parcelG.writeInt(0);
        zzc.c(parcelG, statusCallback);
        h(parcelG, 73);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzp() {
        Parcel parcelG = g();
        int i11 = zzc.f11109a;
        parcelG.writeInt(0);
        h(parcelG, 12);
    }
}

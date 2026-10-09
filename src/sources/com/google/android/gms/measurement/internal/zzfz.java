package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfz extends com.google.android.gms.internal.measurement.zzbl implements zzgb {
    public zzfz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void F0(zzr zzrVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        j(parcelH, 4);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void M(long j11, String str, String str2, String str3) {
        Parcel parcelH = h();
        parcelH.writeLong(j11);
        parcelH.writeString(str);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        j(parcelH, 10);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void O(zzr zzrVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        j(parcelH, 18);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void O0(zzr zzrVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        j(parcelH, 27);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List R0(String str, String str2, boolean z11, zzr zzrVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.zzbn.f11473a;
        parcelH.writeInt(z11 ? 1 : 0);
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        Parcel parcelG = g(parcelH, 14);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(zzpl.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void W0(zzbh zzbhVar, zzr zzrVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzbhVar);
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        j(parcelH, 1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List X(String str, String str2, String str3) {
        Parcel parcelH = h();
        parcelH.writeString(null);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        Parcel parcelG = g(parcelH, 17);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(zzah.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final String Y0(zzr zzrVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        Parcel parcelG = g(parcelH, 11);
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List Z0(String str, String str2, zzr zzrVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        Parcel parcelG = g(parcelH, 16);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(zzah.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final byte[] d0(zzbh zzbhVar, String str) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzbhVar);
        parcelH.writeString(str);
        Parcel parcelG = g(parcelH, 9);
        byte[] bArrCreateByteArray = parcelG.createByteArray();
        parcelG.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void e0(zzr zzrVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        j(parcelH, 25);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void e1(zzr zzrVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        j(parcelH, 20);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void m0(zzr zzrVar, Bundle bundle, zzge zzgeVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, bundle);
        com.google.android.gms.internal.measurement.zzbn.c(parcelH, zzgeVar);
        j(parcelH, 31);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void n(zzr zzrVar, zzoo zzooVar, zzgh zzghVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzooVar);
        com.google.android.gms.internal.measurement.zzbn.c(parcelH, zzghVar);
        j(parcelH, 29);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void p0(zzr zzrVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        j(parcelH, 6);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List q(String str, String str2, String str3, boolean z11) {
        Parcel parcelH = h();
        parcelH.writeString(null);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.zzbn.f11473a;
        parcelH.writeInt(z11 ? 1 : 0);
        Parcel parcelG = g(parcelH, 15);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(zzpl.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void q0(zzr zzrVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        j(parcelH, 26);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void t(zzah zzahVar, zzr zzrVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzahVar);
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        j(parcelH, 12);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void t0(zzr zzrVar, zzaf zzafVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzafVar);
        j(parcelH, 30);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void w0(zzpl zzplVar, zzr zzrVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzplVar);
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        j(parcelH, 2);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final zzao y0(zzr zzrVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        Parcel parcelG = g(parcelH, 21);
        zzao zzaoVar = (zzao) com.google.android.gms.internal.measurement.zzbn.a(parcelG, zzao.CREATOR);
        parcelG.recycle();
        return zzaoVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void z0(Bundle bundle, zzr zzrVar) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, bundle);
        com.google.android.gms.internal.measurement.zzbn.b(parcelH, zzrVar);
        j(parcelH, 19);
    }
}

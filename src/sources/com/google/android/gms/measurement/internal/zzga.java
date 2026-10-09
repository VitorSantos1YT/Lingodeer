package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.api.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzga extends com.google.android.gms.internal.measurement.zzbm implements zzgb {
    public zzga() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
        boolean z11;
        List list;
        ArrayList arrayList = null;
        zzge zzgcVar = null;
        zzgh zzgfVar = null;
        switch (i11) {
            case 1:
                zzbh zzbhVar = (zzbh) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzbh.CREATOR);
                zzr zzrVar = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).W0(zzbhVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).w0(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
            default:
                return false;
            case 4:
                zzr zzrVar3 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).F0(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbh zzbhVar2 = (zzbh) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzbh.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                zzjd zzjdVar = (zzjd) this;
                Preconditions.g(zzbhVar2);
                Preconditions.d(string);
                zzjdVar.h1(string, true);
                zzjdVar.i1(new zzis(zzjdVar, zzbhVar2, string));
                parcel2.writeNoException();
                return true;
            case 6:
                zzr zzrVar4 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).p0(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzr zzrVar5 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                z11 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                zzjd zzjdVar2 = (zzjd) this;
                zzjdVar2.j(zzrVar5);
                String str = zzrVar5.f13655a;
                Preconditions.g(str);
                zzpg zzpgVar = zzjdVar2.f13199a;
                try {
                    List<zzpn> list2 = (List) ((FutureTask) zzpgVar.e().n(new zzid(zzjdVar2, str))).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (zzpn zzpnVar : list2) {
                        if (z11 || !zzpp.L(zzpnVar.f13642c)) {
                            arrayList2.add(new zzpl(zzpnVar));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e8) {
                    e = e8;
                    zzpgVar.b().f12942f.c(zzgu.o(str), e, "Failed to get user properties. appId");
                } catch (ExecutionException e10) {
                    e = e10;
                    zzpgVar.b().f12942f.c(zzgu.o(str), e, "Failed to get user properties. appId");
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                zzbh zzbhVar3 = (zzbh) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzbh.CREATOR);
                String string2 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                byte[] bArrD0 = ((zzjd) this).d0(zzbhVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrD0);
                return true;
            case 10:
                long j11 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).M(j11, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                String strY0 = ((zzjd) this).Y0(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(strY0);
                return true;
            case 12:
                zzah zzahVar = (zzah) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).t(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzah.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                zzjd zzjdVar3 = (zzjd) this;
                Preconditions.g(zzahVar2);
                Preconditions.g(zzahVar2.f12622c);
                Preconditions.d(zzahVar2.f12620a);
                zzjdVar3.h1(zzahVar2.f12620a, true);
                zzjdVar3.i1(new zzii(zzjdVar3, new zzah(zzahVar2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.zzbn.f11473a;
                z11 = parcel.readInt() != 0;
                zzr zzrVar8 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                List listR0 = ((zzjd) this).R0(string6, string7, z11, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listR0);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.zzbn.f11473a;
                z11 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                List listQ = ((zzjd) this).q(string8, string9, string10, z11);
                parcel2.writeNoException();
                parcel2.writeTypedList(listQ);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                zzr zzrVar9 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                List listZ0 = ((zzjd) this).Z0(string11, string12, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZ0);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                List listX = ((zzjd) this).X(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listX);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).O(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.zzbn.a(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).z0(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).e1(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                zzao zzaoVarY0 = ((zzjd) this).y0(zzrVar13);
                parcel2.writeNoException();
                if (zzaoVarY0 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                zzaoVarY0.writeToParcel(parcel2, 1);
                return true;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                zzr zzrVar14 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.zzbn.a(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                zzjd zzjdVar4 = (zzjd) this;
                zzjdVar4.j(zzrVar14);
                String str2 = zzrVar14.f13655a;
                Preconditions.g(str2);
                zzpg zzpgVar2 = zzjdVar4.f13199a;
                if (!zzpgVar2.f0().r(null, zzfy.T0)) {
                    try {
                        list = (List) ((FutureTask) zzpgVar2.e().n(new zziw(zzjdVar4, zzrVar14, bundle2))).get();
                    } catch (InterruptedException | ExecutionException e11) {
                        zzpgVar2.b().f12942f.c(zzgu.o(str2), e11, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) ((FutureTask) zzpgVar2.e().o(new zziv(zzjdVar4, zzrVar14, bundle2))).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e12) {
                        zzpgVar2.b().f12942f.c(zzgu.o(str2), e12, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                zzr zzrVar15 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).e0(zzrVar15);
                parcel2.writeNoException();
                return true;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                zzr zzrVar16 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).q0(zzrVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                zzr zzrVar17 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).O0(zzrVar17);
                parcel2.writeNoException();
                return true;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                zzr zzrVar18 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzoo.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    zzgfVar = iInterfaceQueryLocalInterface instanceof zzgh ? (zzgh) iInterfaceQueryLocalInterface : new zzgf(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                }
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).n(zzrVar18, zzooVar, zzgfVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzaf.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).t0(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case 31:
                zzr zzrVar20 = (zzr) com.google.android.gms.internal.measurement.zzbn.a(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.zzbn.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    zzgcVar = iInterfaceQueryLocalInterface2 instanceof zzge ? (zzge) iInterfaceQueryLocalInterface2 : new zzgc(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                }
                com.google.android.gms.internal.measurement.zzbn.d(parcel);
                ((zzjd) this).m0(zzrVar20, bundle3, zzgcVar);
                parcel2.writeNoException();
                return true;
        }
    }
}

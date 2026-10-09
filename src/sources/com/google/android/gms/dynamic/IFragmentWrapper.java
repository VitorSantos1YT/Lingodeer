package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzc;
import com.google.api.Service;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface IFragmentWrapper extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
            boolean z11;
            switch (i11) {
                case 2:
                    ObjectWrapper objectWrapperZzb = zzb();
                    parcel2.writeNoException();
                    zzc.b(parcel2, objectWrapperZzb);
                    return true;
                case 3:
                    Bundle bundleZzc = zzc();
                    parcel2.writeNoException();
                    int i12 = zzc.f9622a;
                    if (bundleZzc == null) {
                        parcel2.writeInt(0);
                    } else {
                        parcel2.writeInt(1);
                        bundleZzc.writeToParcel(parcel2, 1);
                    }
                    return true;
                case 4:
                    int iZzd = zzd();
                    parcel2.writeNoException();
                    parcel2.writeInt(iZzd);
                    return true;
                case 5:
                    IFragmentWrapper iFragmentWrapperZze = zze();
                    parcel2.writeNoException();
                    zzc.b(parcel2, iFragmentWrapperZze);
                    return true;
                case 6:
                    ObjectWrapper objectWrapperZzf = zzf();
                    parcel2.writeNoException();
                    zzc.b(parcel2, objectWrapperZzf);
                    return true;
                case 7:
                    boolean zZzg = zzg();
                    parcel2.writeNoException();
                    int i13 = zzc.f9622a;
                    parcel2.writeInt(zZzg ? 1 : 0);
                    return true;
                case 8:
                    String strZzh = zzh();
                    parcel2.writeNoException();
                    parcel2.writeString(strZzh);
                    return true;
                case 9:
                    IFragmentWrapper iFragmentWrapperZzi = zzi();
                    parcel2.writeNoException();
                    zzc.b(parcel2, iFragmentWrapperZzi);
                    return true;
                case 10:
                    int iZzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeInt(iZzj);
                    return true;
                case 11:
                    boolean zZzk = zzk();
                    parcel2.writeNoException();
                    int i14 = zzc.f9622a;
                    parcel2.writeInt(zZzk ? 1 : 0);
                    return true;
                case 12:
                    ObjectWrapper objectWrapperZzl = zzl();
                    parcel2.writeNoException();
                    zzc.b(parcel2, objectWrapperZzl);
                    return true;
                case 13:
                    boolean zZzm = zzm();
                    parcel2.writeNoException();
                    int i15 = zzc.f9622a;
                    parcel2.writeInt(zZzm ? 1 : 0);
                    return true;
                case 14:
                    boolean zZzn = zzn();
                    parcel2.writeNoException();
                    int i16 = zzc.f9622a;
                    parcel2.writeInt(zZzn ? 1 : 0);
                    return true;
                case 15:
                    boolean zZzo = zzo();
                    parcel2.writeNoException();
                    int i17 = zzc.f9622a;
                    parcel2.writeInt(zZzo ? 1 : 0);
                    return true;
                case 16:
                    boolean zZzp = zzp();
                    parcel2.writeNoException();
                    int i18 = zzc.f9622a;
                    parcel2.writeInt(zZzp ? 1 : 0);
                    return true;
                case 17:
                    boolean zC = c();
                    parcel2.writeNoException();
                    int i19 = zzc.f9622a;
                    parcel2.writeInt(zC ? 1 : 0);
                    return true;
                case 18:
                    boolean zZzr = zzr();
                    parcel2.writeNoException();
                    int i21 = zzc.f9622a;
                    parcel2.writeInt(zZzr ? 1 : 0);
                    return true;
                case 19:
                    boolean zZzs = zzs();
                    parcel2.writeNoException();
                    int i22 = zzc.f9622a;
                    parcel2.writeInt(zZzs ? 1 : 0);
                    return true;
                case 20:
                    IObjectWrapper iObjectWrapperH = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                    zzc.c(parcel);
                    X0(iObjectWrapperH);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    int i23 = zzc.f9622a;
                    z11 = parcel.readInt() != 0;
                    zzc.c(parcel);
                    r(z11);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    int i24 = zzc.f9622a;
                    z11 = parcel.readInt() != 0;
                    zzc.c(parcel);
                    G(z11);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    int i25 = zzc.f9622a;
                    z11 = parcel.readInt() != 0;
                    zzc.c(parcel);
                    N0(z11);
                    parcel2.writeNoException();
                    return true;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    int i26 = zzc.f9622a;
                    z11 = parcel.readInt() != 0;
                    zzc.c(parcel);
                    d1(z11);
                    parcel2.writeNoException();
                    return true;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    Intent intent = (Intent) zzc.a(parcel, Intent.CREATOR);
                    zzc.c(parcel);
                    I0(intent);
                    parcel2.writeNoException();
                    return true;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    Intent intent2 = (Intent) zzc.a(parcel, Intent.CREATOR);
                    int i27 = parcel.readInt();
                    zzc.c(parcel);
                    j0(intent2, i27);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper iObjectWrapperH2 = IObjectWrapper.Stub.h(parcel.readStrongBinder());
                    zzc.c(parcel);
                    a1(iObjectWrapperH2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void G(boolean z11);

    void I0(Intent intent);

    void N0(boolean z11);

    void X0(IObjectWrapper iObjectWrapper);

    void a1(IObjectWrapper iObjectWrapper);

    boolean c();

    void d1(boolean z11);

    void j0(Intent intent, int i11);

    void r(boolean z11);

    ObjectWrapper zzb();

    Bundle zzc();

    int zzd();

    IFragmentWrapper zze();

    ObjectWrapper zzf();

    boolean zzg();

    String zzh();

    IFragmentWrapper zzi();

    int zzj();

    boolean zzk();

    ObjectWrapper zzl();

    boolean zzm();

    boolean zzn();

    boolean zzo();

    boolean zzp();

    boolean zzr();

    boolean zzs();
}

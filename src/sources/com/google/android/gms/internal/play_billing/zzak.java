package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzak extends zzap implements zzam {
    @Override // com.google.android.gms.internal.play_billing.zzam
    public final Bundle A(String str, String str2, String str3) {
        Parcel parcelG = g();
        parcelG.writeInt(3);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        Parcel parcelH = h(parcelG, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzar.a(parcelH);
        parcelH.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final Bundle P0(int i11, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeInt(i11);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        int i12 = zzar.f12240a;
        parcelG.writeInt(1);
        bundle.writeToParcel(parcelG, 0);
        Parcel parcelH = h(parcelG, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) zzar.a(parcelH);
        parcelH.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final int T(int i11, Bundle bundle, String str, String str2) {
        Parcel parcelG = g();
        parcelG.writeInt(i11);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        int i12 = zzar.f12240a;
        parcelG.writeInt(1);
        bundle.writeToParcel(parcelG, 0);
        Parcel parcelH = h(parcelG, 10);
        int i13 = parcelH.readInt();
        parcelH.recycle();
        return i13;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final Bundle U0(String str, String str2, String str3) {
        Parcel parcelG = g();
        parcelG.writeInt(3);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        parcelG.writeString(null);
        Parcel parcelH = h(parcelG, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzar.a(parcelH);
        parcelH.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final Bundle V0(int i11, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelG = g();
        parcelG.writeInt(i11);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        int i12 = zzar.f12240a;
        parcelG.writeInt(1);
        bundle.writeToParcel(parcelG, 0);
        parcelG.writeInt(1);
        bundle2.writeToParcel(parcelG, 0);
        Parcel parcelH = h(parcelG, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) zzar.a(parcelH);
        parcelH.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final int f1(int i11, String str, String str2) {
        Parcel parcelG = g();
        parcelG.writeInt(i11);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        Parcel parcelH = h(parcelG, 1);
        int i12 = parcelH.readInt();
        parcelH.recycle();
        return i12;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final void k0(String str, Bundle bundle, z zVar) {
        Parcel parcelG = g();
        parcelG.writeInt(12);
        parcelG.writeString(str);
        int i11 = zzar.f12240a;
        parcelG.writeInt(1);
        bundle.writeToParcel(parcelG, 0);
        parcelG.writeStrongBinder(zVar);
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f12238a.transact(1201, parcelG, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcelG.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final Bundle s(int i11, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeInt(i11);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        parcelG.writeString(null);
        int i12 = zzar.f12240a;
        parcelG.writeInt(1);
        bundle.writeToParcel(parcelG, 0);
        Parcel parcelH = h(parcelG, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) zzar.a(parcelH);
        parcelH.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final Bundle y(String str, String str2, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeInt(9);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        int i11 = zzar.f12240a;
        parcelG.writeInt(1);
        bundle.writeToParcel(parcelG, 0);
        Parcel parcelH = h(parcelG, 902);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) zzar.a(parcelH);
        parcelH.recycle();
        return bundle2;
    }
}

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzm();
    public static final Scope[] Q = new Scope[0];
    public static final Feature[] R = new Feature[0];
    public Account H;
    public Feature[] K;
    public Feature[] L;
    public final boolean M;
    public final int N;
    public boolean O;
    public final String P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f8919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f8920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Scope[] f8921f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bundle f8922t;

    public GetServiceRequest(int i11, int i12, int i13, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z11, int i14, boolean z12, String str2) {
        scopeArr = scopeArr == null ? Q : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = R;
        featureArr = featureArr == null ? featureArr3 : featureArr;
        featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
        this.f8916a = i11;
        this.f8917b = i12;
        this.f8918c = i13;
        if ("com.google.android.gms".equals(str)) {
            this.f8919d = "com.google.android.gms";
        } else {
            this.f8919d = str;
        }
        if (i11 < 2) {
            Account accountZzb = null;
            if (iBinder != null) {
                int i15 = IAccountAccessor.Stub.f8931a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IAccountAccessor zztVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                int i16 = AccountAccessor.f8885b;
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    accountZzb = zztVar.zzb();
                } catch (RemoteException unused) {
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
            this.H = accountZzb;
        } else {
            this.f8920e = iBinder;
            this.H = account;
        }
        this.f8921f = scopeArr;
        this.f8922t = bundle;
        this.K = featureArr;
        this.L = featureArr2;
        this.M = z11;
        this.N = i14;
        this.O = z12;
        this.P = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        zzm.a(this, parcel, i11);
    }
}

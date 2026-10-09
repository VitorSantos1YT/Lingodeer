package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzm implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        int i12 = getServiceRequest.f8916a;
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(i12);
        int i13 = getServiceRequest.f8917b;
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(i13);
        int i14 = getServiceRequest.f8918c;
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(i14);
        SafeParcelWriter.k(parcel, 4, getServiceRequest.f8919d, false);
        SafeParcelWriter.f(parcel, 5, getServiceRequest.f8920e);
        SafeParcelWriter.n(parcel, 6, getServiceRequest.f8921f, i11);
        SafeParcelWriter.b(parcel, 7, getServiceRequest.f8922t);
        SafeParcelWriter.j(parcel, 8, getServiceRequest.H, i11, false);
        SafeParcelWriter.n(parcel, 10, getServiceRequest.K, i11);
        SafeParcelWriter.n(parcel, 11, getServiceRequest.L, i11);
        boolean z11 = getServiceRequest.M;
        SafeParcelWriter.p(parcel, 12, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i15 = getServiceRequest.N;
        SafeParcelWriter.p(parcel, 13, 4);
        parcel.writeInt(i15);
        boolean z12 = getServiceRequest.O;
        SafeParcelWriter.p(parcel, 14, 4);
        parcel.writeInt(z12 ? 1 : 0);
        SafeParcelWriter.k(parcel, 15, getServiceRequest.P, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iX = SafeParcelReader.x(parcel);
        Scope[] scopeArr = GetServiceRequest.Q;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.R;
        Feature[] featureArr2 = featureArr;
        String strG = null;
        IBinder iBinderQ = null;
        Account account = null;
        String strG2 = null;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        boolean zM = false;
        int iR4 = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iX) {
            int i11 = parcel.readInt();
            switch ((char) i11) {
                case 1:
                    iR = SafeParcelReader.r(parcel, i11);
                    break;
                case 2:
                    iR2 = SafeParcelReader.r(parcel, i11);
                    break;
                case 3:
                    iR3 = SafeParcelReader.r(parcel, i11);
                    break;
                case 4:
                    strG = SafeParcelReader.g(parcel, i11);
                    break;
                case 5:
                    iBinderQ = SafeParcelReader.q(parcel, i11);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.j(parcel, i11, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.b(parcel, i11);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.f(parcel, i11, Account.CREATOR);
                    break;
                case '\t':
                default:
                    SafeParcelReader.w(parcel, i11);
                    break;
                case '\n':
                    featureArr = (Feature[]) SafeParcelReader.j(parcel, i11, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.j(parcel, i11, Feature.CREATOR);
                    break;
                case '\f':
                    zM = SafeParcelReader.m(parcel, i11);
                    break;
                case '\r':
                    iR4 = SafeParcelReader.r(parcel, i11);
                    break;
                case 14:
                    zM2 = SafeParcelReader.m(parcel, i11);
                    break;
                case 15:
                    strG2 = SafeParcelReader.g(parcel, i11);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iX);
        return new GetServiceRequest(iR, iR2, iR3, strG, iBinderQ, scopeArr, bundle, account, featureArr, featureArr2, zM, iR4, zM2, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new GetServiceRequest[i11];
    }
}

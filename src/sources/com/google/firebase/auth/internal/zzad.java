package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzahd;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.UserInfo;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzad extends FirebaseUser {
    public static final Parcelable.Creator<zzad> CREATOR = new zzag();
    public Boolean H;
    public zzaf K;
    public boolean L;
    public com.google.firebase.auth.zzc M;
    public zzbl N;
    public List O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzahd f17933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzz f17934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f17937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f17938f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f17939t;

    public zzad(FirebaseApp firebaseApp, ArrayList arrayList) {
        Preconditions.g(firebaseApp);
        firebaseApp.b();
        this.f17935c = firebaseApp.f17715b;
        this.f17936d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f17939t = "2";
        I1(arrayList);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* synthetic */ zzah D1() {
        return new zzah(this);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List E1() {
        return this.f17937e;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String F1() {
        String str;
        Map map;
        zzahd zzahdVar = this.f17933a;
        if (zzahdVar == null || (str = zzahdVar.f9959b) == null || (map = (Map) zzbg.a(str).f17901b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String G1() {
        return this.f17934b.f18035a;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final boolean H1() {
        String str;
        Boolean bool = this.H;
        if (bool == null || bool.booleanValue()) {
            zzahd zzahdVar = this.f17933a;
            if (zzahdVar != null) {
                Map map = (Map) zzbg.a(zzahdVar.f9959b).f17901b.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = BuildConfig.VERSION_NAME;
            }
            boolean z11 = true;
            if (this.f17937e.size() > 1 || (str != null && str.equals("custom"))) {
                z11 = false;
            }
            this.H = Boolean.valueOf(z11);
        }
        return this.H.booleanValue();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final synchronized zzad I1(List list) {
        try {
            Preconditions.g(list);
            this.f17937e = new ArrayList(list.size());
            this.f17938f = new ArrayList(list.size());
            for (int i11 = 0; i11 < list.size(); i11++) {
                UserInfo userInfo = (UserInfo) list.get(i11);
                if (userInfo.p0().equals("firebase")) {
                    this.f17934b = (zzz) userInfo;
                } else {
                    this.f17938f.add(userInfo.p0());
                }
                this.f17937e.add((zzz) userInfo);
            }
            if (this.f17934b == null) {
                this.f17934b = (zzz) this.f17937e.get(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void J1(zzahd zzahdVar) {
        Preconditions.g(zzahdVar);
        this.f17933a = zzahdVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* synthetic */ zzad K1() {
        this.H = Boolean.FALSE;
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void L1(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.O = list;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final zzahd M1() {
        return this.f17933a;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void N1(List list) {
        zzbl zzblVar;
        Parcelable.Creator<zzbl> creator = zzbl.CREATOR;
        if (list == null || list.isEmpty()) {
            zzblVar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
                if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                    arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
                } else if (multiFactorInfo instanceof TotpMultiFactorInfo) {
                    arrayList2.add((TotpMultiFactorInfo) multiFactorInfo);
                }
            }
            zzblVar = new zzbl(arrayList, arrayList2);
        }
        this.N = zzblVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List O1() {
        return this.O;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String p0() {
        return this.f17934b.f18036b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 1, this.f17933a, i11, false);
        SafeParcelWriter.j(parcel, 2, this.f17934b, i11, false);
        SafeParcelWriter.k(parcel, 3, this.f17935c, false);
        SafeParcelWriter.k(parcel, 4, this.f17936d, false);
        SafeParcelWriter.o(parcel, 5, this.f17937e, false);
        SafeParcelWriter.m(parcel, 6, this.f17938f);
        SafeParcelWriter.k(parcel, 7, this.f17939t, false);
        SafeParcelWriter.a(parcel, 8, Boolean.valueOf(H1()));
        SafeParcelWriter.j(parcel, 9, this.K, i11, false);
        boolean z11 = this.L;
        SafeParcelWriter.p(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        SafeParcelWriter.j(parcel, 11, this.M, i11, false);
        SafeParcelWriter.j(parcel, 12, this.N, i11, false);
        SafeParcelWriter.o(parcel, 13, this.O, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zzd() {
        return this.f17933a.f9959b;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zze() {
        return this.f17933a.E1();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List zzg() {
        return this.f17938f;
    }
}

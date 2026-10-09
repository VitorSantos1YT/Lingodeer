package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import defpackage.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9105c;

    public zan(int i11, String str, ArrayList arrayList) {
        this.f9103a = i11;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            zal zalVar = (zal) arrayList.get(i12);
            String str2 = zalVar.f9098b;
            ArrayList arrayList2 = zalVar.f9099c;
            HashMap map2 = new HashMap();
            Preconditions.g(arrayList2);
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                zam zamVar = (zam) arrayList2.get(i13);
                map2.put(zamVar.f9101b, zamVar.f9102c);
            }
            map.put(str2, map2);
        }
        this.f9104b = map;
        Preconditions.g(str);
        this.f9105c = str;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Map map3 = (Map) map.get((String) it.next());
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse.Field) map3.get((String) it2.next())).L = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        HashMap map = this.f9104b;
        for (String str : map.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map2 = (Map) map.get(str);
            for (String str2 : map2.keySet()) {
                e.C(sb2, "  ", str2, ": ");
                sb2.append(map2.get(str2));
            }
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9103a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f9104b;
        for (String str : map.keySet()) {
            arrayList.add(new zal(str, (Map) map.get(str)));
        }
        SafeParcelWriter.o(parcel, 2, arrayList, false);
        SafeParcelWriter.k(parcel, 3, this.f9105c, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}

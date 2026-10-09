package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.internal.p002firebaseauthapi.zzaih;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbi {
    public static MultiFactorInfo a(zzahk zzahkVar) {
        if (zzahkVar == null) {
            return null;
        }
        zzaih zzaihVar = zzahkVar.f9980e;
        if (TextUtils.isEmpty(zzahkVar.f9976a)) {
            if (zzaihVar != null) {
                return new TotpMultiFactorInfo(zzahkVar.f9977b, zzahkVar.f9978c, zzahkVar.f9979d, zzaihVar);
            }
            return null;
        }
        String str = zzahkVar.f9977b;
        String str2 = zzahkVar.f9978c;
        long j11 = zzahkVar.f9979d;
        String str3 = zzahkVar.f9976a;
        Preconditions.d(str3);
        return new PhoneMultiFactorInfo(j11, str, str2, str3);
    }

    public static ArrayList b(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfoA = a((zzahk) it.next());
            if (multiFactorInfoA != null) {
                arrayList.add(multiFactorInfoA);
            }
        }
        return arrayList;
    }
}

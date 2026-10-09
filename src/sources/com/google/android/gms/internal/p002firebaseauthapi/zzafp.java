package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import defpackage.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzafp extends zzadx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzafo f9906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafp(zzafo zzafoVar, zzadx zzadxVar, String str) {
        super(zzadxVar.f9838a, zzadxVar.f9839b);
        Objects.requireNonNull(zzafoVar);
        this.f9906d = zzafoVar;
        this.f9905c = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadx, com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void a(Status status) {
        int i11 = 0;
        zzafo.f9902c.b(e.n("SMS verification code request failed: ", CommonStatusCodes.a(status.f8706a), " ", status.f8707b), new Object[0]);
        zzafo zzafoVar = this.f9906d;
        HashMap map = zzafoVar.f9904b;
        String str = this.f9905c;
        zzafr zzafrVar = (zzafr) map.get(str);
        if (zzafrVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(zzafrVar.f9907a);
        zzafoVar.c(str);
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((zzadx) obj).a(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadx, com.google.android.gms.internal.p002firebaseauthapi.zzadu
    public final void zzb(String str) {
        zzafr zzafrVar;
        int i11 = 0;
        zzafo.f9902c.a("onCodeSent", new Object[0]);
        zzafo zzafoVar = this.f9906d;
        HashMap map = zzafoVar.f9904b;
        String str2 = this.f9905c;
        zzafr zzafrVar2 = (zzafr) map.get(str2);
        if (zzafrVar2 == null) {
            return;
        }
        ArrayList arrayList = zzafrVar2.f9907a;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((zzadx) obj).zzb(str);
        }
        zzafrVar2.f9910d = true;
        zzafrVar2.f9908b = str;
        zzafr zzafrVar3 = (zzafr) zzafoVar.f9904b.get(str2);
        if (zzafrVar3 == null) {
            return;
        }
        if (!zzafrVar3.f9912f && (zzafrVar = (zzafr) zzafoVar.f9904b.get(str2)) != null && !zzafrVar.f9911e && !zzp.a(zzafrVar.f9908b)) {
            int i12 = 0;
            zzafo.f9902c.b("Timed out waiting for SMS.", new Object[0]);
            ArrayList arrayList2 = zzafrVar.f9907a;
            int size2 = arrayList2.size();
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                ((zzadx) obj2).zza(zzafrVar.f9908b);
            }
            zzafrVar.f9912f = true;
        }
        zzafoVar.c(str2);
    }
}

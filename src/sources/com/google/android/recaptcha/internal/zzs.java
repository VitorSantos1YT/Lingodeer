package com.google.android.recaptcha.internal;

import fz.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import qy.o;
import rz.b0;
import rz.e0;
import rz.g1;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzs extends i implements e {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, dVar);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.zza;
        com.bumptech.glide.e.F(obj);
        if (i11 == 0) {
            b0 b0Var = (b0) this.zzd;
            ArrayList arrayList = new ArrayList();
            this.zzb.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            int size = arrayList3.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj3 = arrayList3.get(i12);
                i12++;
                arrayList2.add(e0.B(b0Var, null, null, new zzr((zzy) obj3, this.zzc, arrayList, null), 3));
            }
            g1[] g1VarArr = (g1[]) arrayList2.toArray(new g1[0]);
            g1[] g1VarArr2 = (g1[]) Arrays.copyOf(g1VarArr, g1VarArr.length);
            this.zza = 1;
            if (e0.z(g1VarArr2, this) == aVar) {
                return aVar;
            }
        }
        return new o(this.zzb.zzq(this.zzc));
    }
}

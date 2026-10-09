package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzs extends zzai {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzt f11941e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z11, boolean z12) {
        super("log");
        this.f11941e = zztVar;
        this.f11939c = z11;
        this.f11940d = z12;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095 A[LOOP:0: B:23:0x008b->B:25:0x0095, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao a(zzg zzgVar, List list) {
        int i11;
        int i12;
        String strZzc;
        ArrayList arrayList;
        zzh.b(1, "log", list);
        int size = list.size();
        zzat zzatVar = zzao.f11445j;
        zzt zztVar = this.f11941e;
        if (size == 1) {
            zztVar.f11962c.a(3, zzgVar.f11600b.b(zzgVar, (zzao) list.get(0)).zzc(), Collections.EMPTY_LIST, this.f11939c, this.f11940d);
            return zzatVar;
        }
        zzao zzaoVar = (zzao) list.get(0);
        zzaw zzawVar = zzgVar.f11600b;
        zzaw zzawVar2 = zzgVar.f11600b;
        int iG = zzh.g(zzawVar.b(zzgVar, zzaoVar).zzd().doubleValue());
        if (iG != 2) {
            i11 = 3;
            if (iG == 3) {
                i12 = 1;
            } else if (iG == 5) {
                i12 = 5;
            } else if (iG == 6) {
                i12 = 2;
            }
            strZzc = zzawVar2.b(zzgVar, (zzao) list.get(1)).zzc();
            if (list.size() == 2) {
                zztVar.f11962c.a(i12, strZzc, Collections.EMPTY_LIST, this.f11939c, this.f11940d);
                return zzatVar;
            }
            arrayList = new ArrayList();
            for (int i13 = 2; i13 < Math.min(list.size(), 5); i13++) {
                arrayList.add(zzawVar2.b(zzgVar, (zzao) list.get(i13)).zzc());
            }
            zztVar.f11962c.a(i12, strZzc, arrayList, this.f11939c, this.f11940d);
            return zzatVar;
        }
        i11 = 4;
        i12 = i11;
        strZzc = zzawVar2.b(zzgVar, (zzao) list.get(1)).zzc();
        if (list.size() == 2) {
            zztVar.f11962c.a(i12, strZzc, Collections.EMPTY_LIST, this.f11939c, this.f11940d);
            return zzatVar;
        }
        arrayList = new ArrayList();
        while (i13 < Math.min(list.size(), 5)) {
            arrayList.add(zzawVar2.b(zzgVar, (zzao) list.get(i13)).zzc());
        }
        zztVar.f11962c.a(i12, strZzc, arrayList, this.f11939c, this.f11940d);
        return zzatVar;
    }
}

package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzan extends zzai implements zzak {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzg f11444e;

    public zzan(zzan zzanVar) {
        super(zzanVar.f11406a);
        ArrayList arrayList = new ArrayList(zzanVar.f11442c.size());
        this.f11442c = arrayList;
        arrayList.addAll(zzanVar.f11442c);
        ArrayList arrayList2 = new ArrayList(zzanVar.f11443d.size());
        this.f11443d = arrayList2;
        arrayList2.addAll(zzanVar.f11443d);
        this.f11444e = zzanVar.f11444e;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao a(zzg zzgVar, List list) {
        zzat zzatVar;
        zzg zzgVarC = this.f11444e.c();
        zzaw zzawVar = zzgVarC.f11600b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f11442c;
            int size = arrayList.size();
            zzatVar = zzao.f11445j;
            if (i12 >= size) {
                break;
            }
            if (i12 < list.size()) {
                zzgVarC.f((String) arrayList.get(i12), zzgVar.f11600b.b(zzgVar, (zzao) list.get(i12)));
            } else {
                zzgVarC.f((String) arrayList.get(i12), zzatVar);
            }
            i12++;
        }
        ArrayList arrayList2 = this.f11443d;
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj = arrayList2.get(i11);
            i11++;
            zzao zzaoVar = (zzao) obj;
            zzao zzaoVarB = zzawVar.b(zzgVarC, zzaoVar);
            if (zzaoVarB instanceof zzap) {
                zzaoVarB = zzawVar.b(zzgVarC, zzaoVar);
            }
            if (zzaoVarB instanceof zzag) {
                return ((zzag) zzaoVarB).f11343a;
            }
        }
        return zzatVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzao
    public final zzao b() {
        return new zzan(this);
    }

    public zzan(String str, ArrayList arrayList, List list, zzg zzgVar) {
        super(str);
        this.f11442c = new ArrayList();
        this.f11444e = zzgVar;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                this.f11442c.add(((zzao) obj).zzc());
            }
        }
        this.f11443d = new ArrayList(list);
    }
}

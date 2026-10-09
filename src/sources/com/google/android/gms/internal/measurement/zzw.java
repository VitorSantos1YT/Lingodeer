package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzw extends zzai {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzj f12099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f12100d;

    public zzw(zzj zzjVar) {
        super("require");
        this.f12100d = new HashMap();
        this.f12099c = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao a(zzg zzgVar, List list) {
        zzao zzaoVar;
        zzh.a(1, "require", list);
        String strZzc = zzgVar.f11600b.b(zzgVar, (zzao) list.get(0)).zzc();
        HashMap map = this.f12100d;
        if (map.containsKey(strZzc)) {
            return (zzao) map.get(strZzc);
        }
        HashMap map2 = this.f12099c.f11614a;
        if (map2.containsKey(strZzc)) {
            try {
                zzaoVar = (zzao) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            zzaoVar = zzao.f11445j;
        }
        if (zzaoVar instanceof zzai) {
            map.put(strZzc, (zzai) zzaoVar);
        }
        return zzaoVar;
    }
}

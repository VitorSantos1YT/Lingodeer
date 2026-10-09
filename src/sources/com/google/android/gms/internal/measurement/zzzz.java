package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzzz extends zzaaa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f12236b;

    public zzzz(zzzj zzzjVar, zzzj zzzjVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, zzzjVar);
        d(linkedHashMap, zzzjVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((zzyl) entry.getKey()).f12181c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.f12236b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, zzzj zzzjVar) {
        for (int i11 = 0; i11 < zzzjVar.a(); i11++) {
            zzyl zzylVarB = zzzjVar.b(i11);
            Object obj = linkedHashMap.get(zzylVarB);
            boolean z11 = zzylVarB.f12181c;
            Class cls = zzylVarB.f12180b;
            if (z11) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(zzylVarB, arrayList);
                }
                arrayList.add(cls.cast(zzzjVar.c(i11)));
            } else {
                linkedHashMap.put(zzylVarB, cls.cast(zzzjVar.c(i11)));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final void a(zzzq zzzqVar, zzzc zzzcVar) {
        for (Map.Entry entry : this.f12236b.entrySet()) {
            zzyl zzylVar = (zzyl) entry.getKey();
            Object value = entry.getValue();
            if (zzylVar.f12181c) {
                zzzqVar.b(zzylVar, ((List) value).iterator(), zzzcVar);
            } else {
                zzzqVar.a(zzylVar, value, zzzcVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final int b() {
        return this.f12236b.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final Set c() {
        return this.f12236b.keySet();
    }
}

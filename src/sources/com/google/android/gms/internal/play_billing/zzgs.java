package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgs {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzgs f12418c = new zzgs();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f12420b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzgd f12419a = new zzgd();

    private zzgs() {
    }

    public final zzgv a(Class cls) {
        Charset charset = zzfo.f12383a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f12420b;
        zzgv zzgpVar = (zzgv) concurrentHashMap.get(cls);
        if (zzgpVar == null) {
            zzgd zzgdVar = this.f12419a;
            zzgdVar.getClass();
            zzhj zzhjVar = zzgx.f12429a;
            zzfi.class.isAssignableFrom(cls);
            zzgi zzgiVarZzb = zzgdVar.f12396a.zzb(cls);
            if (zzgiVarZzb.zzb()) {
                zzgpVar = new zzgp(zzgx.f12429a, zzex.f12368a, zzgiVarZzb.zza());
            } else {
                int i11 = zzgr.f12417a;
                int i12 = zzfz.f12389a;
                zzhj zzhjVar2 = zzgx.f12429a;
                zzew zzewVar = zzgiVarZzb.zzc() + (-1) != 1 ? zzex.f12368a : null;
                int i13 = zzgh.f12399a;
                zzgpVar = zzgo.s(zzgiVarZzb, zzhjVar2, zzewVar);
            }
            zzgv zzgvVar = (zzgv) concurrentHashMap.putIfAbsent(cls, zzgpVar);
            if (zzgvVar != null) {
                return zzgvVar;
            }
        }
        return zzgpVar;
    }
}

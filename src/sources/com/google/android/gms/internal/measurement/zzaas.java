package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaas extends zzaag {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f11155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zzzq f11156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zzaaq f11157h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Level f11159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f11160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzzq f11161e;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzxx.f12152a, zzyw.f12196a, zzyx.f12197a)));
        f11155f = setUnmodifiableSet;
        zzzn zzznVar = new zzzn(zzzt.a(setUnmodifiableSet));
        f11156g = zzznVar;
        f11157h = new zzaaq(Level.ALL, setUnmodifiableSet, zzznVar);
    }

    public /* synthetic */ zzaas(String str, Level level, Set set, zzzq zzzqVar) {
        super(str);
        this.f11158b = zzaal.a(str);
        this.f11159c = level;
        this.f11160d = set;
        this.f11161e = zzzqVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:51:0x0113  */
    public static void e(zzxz zzxzVar, Level level, Set set, zzzq zzzqVar) {
        zzaaa zzzyVar;
        StringBuilder sb2;
        zzaaf zzaafVar;
        zzzc zzzcVar;
        int i11;
        Level level2 = zzxzVar.f12164a;
        Boolean bool = (Boolean) zzxzVar.j().d(zzyx.f12197a);
        if (bool == null || !bool.booleanValue()) {
            zzzj zzzjVarC = zzaab.f11129a.c().c();
            zzzj zzzjVarJ = zzxzVar.j();
            zzaaa zzaaaVar = zzaaa.f11128a;
            int iA = zzzjVarJ.a();
            if (iA == 0) {
                zzzyVar = zzaaa.f11128a;
            } else {
                zzzyVar = iA <= 28 ? new zzzy(zzzjVarC, zzzjVarJ) : new zzzz(zzzjVarC, zzzjVarJ);
            }
            boolean z11 = level2.intValue() < level.intValue();
            if (z11) {
                sb2 = new StringBuilder();
                if (zzze.a(2, zzxzVar.g(), sb2)) {
                    sb2.append(" ");
                }
                if (z11) {
                    zzaafVar = zzxzVar.f12169f;
                    if (zzaafVar != null) {
                        zzyy zzyyVar = new zzyy(zzaafVar, zzxzVar.h(), sb2);
                        zzaaf zzaafVar2 = zzyyVar.f11185a;
                        zzaafVar2.f11132a.a(zzyyVar);
                        i11 = zzyyVar.f11186b;
                        if (((i11 + 1) & i11) == 0) {
                        }
                        throw new zzabo(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i11))));
                    }
                    sb2.append(zzzh.a(zzxzVar.i()));
                    int i12 = zzaae.f11131a;
                    zzzcVar = new zzzc(sb2);
                    zzzyVar.a(zzzqVar, zzzcVar);
                    if (zzzcVar.f12210b) {
                        sb2.append(" ]");
                    }
                } else {
                    zzaafVar = zzxzVar.f12169f;
                    if (zzaafVar != null) {
                        zzyy zzyyVar2 = new zzyy(zzaafVar, zzxzVar.h(), sb2);
                        zzaaf zzaafVar3 = zzyyVar2.f11185a;
                        zzaafVar3.f11132a.a(zzyyVar2);
                        i11 = zzyyVar2.f11186b;
                        if (((i11 + 1) & i11) == 0) {
                        }
                        throw new zzabo(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i11))));
                    }
                    sb2.append(zzzh.a(zzxzVar.i()));
                    int i13 = zzaae.f11131a;
                    zzzcVar = new zzzc(sb2);
                    zzzyVar.a(zzzqVar, zzzcVar);
                    if (zzzcVar.f12210b) {
                        sb2.append(" ]");
                    }
                }
            } else {
                int i14 = zzaae.f11131a;
                if (zzxzVar.f12169f == null && zzzyVar.b() <= set.size() && set.containsAll(zzzyVar.c())) {
                    zzzh.a(zzxzVar.i());
                } else {
                    sb2 = new StringBuilder();
                    if (zzze.a(2, zzxzVar.g(), sb2)) {
                        sb2.append(" ");
                    }
                    if (z11 || zzxzVar.f12169f == null) {
                        zzaafVar = zzxzVar.f12169f;
                        if (zzaafVar != null) {
                            zzyy zzyyVar3 = new zzyy(zzaafVar, zzxzVar.h(), sb2);
                            zzaaf zzaafVar4 = zzyyVar3.f11185a;
                            zzaafVar4.f11132a.a(zzyyVar3);
                            i11 = zzyyVar3.f11186b;
                            if (((i11 + 1) & i11) == 0 || (zzyyVar3.f11187c > 31 && i11 != -1)) {
                                throw new zzabo(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i11))));
                            }
                            zzabn zzabnVar = zzaafVar4.f11132a;
                            String str = zzaafVar4.f11133b;
                            int i15 = zzyyVar3.f12200f;
                            int length = str.length();
                            StringBuilder sb3 = zzyyVar3.f12199e;
                            zzabnVar.b(i15, length, str, sb3);
                            if (zzxzVar.h().length > zzyyVar3.f11187c + 1) {
                                sb3.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                            }
                        } else {
                            sb2.append(zzzh.a(zzxzVar.i()));
                        }
                        int i16 = zzaae.f11131a;
                        zzzcVar = new zzzc(sb2);
                        zzzyVar.a(zzzqVar, zzzcVar);
                        if (zzzcVar.f12210b) {
                            sb2.append(" ]");
                        }
                    } else {
                        sb2.append("(REDACTED) ");
                        sb2.append(zzxzVar.f12169f.f11133b);
                    }
                }
            }
            zzaal.b(level2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final boolean b(Level level) {
        int iB = zzaal.b(level);
        return Log.isLoggable(this.f11158b, iB) || Log.isLoggable("all", iB);
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final void c(zzxz zzxzVar) {
        e(zzxzVar, this.f11159c, this.f11160d, this.f11161e);
    }
}

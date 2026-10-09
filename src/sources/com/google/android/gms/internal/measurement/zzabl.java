package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzabl extends zzabp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzabl f11184b = new zzabl();

    private zzabl() {
    }

    @Override // com.google.android.gms.internal.measurement.zzabp
    public final int c(zzyy zzyyVar, int i11, String str, int i12, int i13, int i14) {
        int i15;
        zzza zzzaVar;
        zzza zzzaVar2;
        zzabh zzabgVar;
        zzabh zzabkVar;
        char cCharAt = str.charAt(i14);
        boolean z11 = false;
        int i16 = 1;
        boolean z12 = (cCharAt & ' ') == 0;
        zzza zzzaVar3 = zzza.f12204e;
        char c11 = ' ';
        int i17 = i13;
        if (i17 != i14 || z12) {
            int i18 = true != z12 ? 0 : 128;
            while (true) {
                if (i17 != i14) {
                    int i19 = i17 + 1;
                    char cCharAt2 = str.charAt(i17);
                    i15 = i16;
                    if (cCharAt2 >= c11 && cCharAt2 <= '0') {
                        int i21 = ((int) ((zzza.f12203d >>> ((cCharAt2 - ' ') * 3)) & 7)) - 1;
                        if (i21 >= 0) {
                            int i22 = i15 << i21;
                            if ((i18 & i22) != 0) {
                                throw zzabo.b(i17, "repeated flag", str);
                            }
                            i18 |= i22;
                            i17 = i19;
                            i16 = i15;
                            c11 = ' ';
                        } else {
                            if (cCharAt2 != '.') {
                                throw zzabo.b(i17, "invalid flag", str);
                            }
                            zzzaVar2 = new zzza(i18, -1, zzza.e(i19, i14, str));
                        }
                    } else {
                        if (cCharAt2 > '9') {
                            throw zzabo.b(i17, "invalid flag", str);
                        }
                        int i23 = cCharAt2 - '0';
                        while (true) {
                            if (i19 == i14) {
                                zzzaVar2 = new zzza(i18, i23, -1);
                                break;
                            }
                            int i24 = i19 + 1;
                            char cCharAt3 = str.charAt(i19);
                            if (cCharAt3 == '.') {
                                zzzaVar2 = new zzza(i18, i23, zzza.e(i24, i14, str));
                                break;
                            }
                            char c12 = (char) (cCharAt3 - '0');
                            if (c12 >= '\n') {
                                throw zzabo.b(i19, "invalid width character", str);
                            }
                            i23 = (i23 * 10) + c12;
                            if (i23 > 999999) {
                                throw zzabo.a("width too large", i17, i14, str);
                            }
                            i19 = i24;
                            z11 = false;
                        }
                    }
                    zzzaVar = zzzaVar2;
                    break;
                }
                i15 = i16;
                zzzaVar = new zzza(i18, -1, -1);
                break;
            }
        }
        zzzaVar = zzza.f12204e;
        i15 = 1;
        zzyz zzyzVarA = zzyz.a(cCharAt);
        int i25 = i14 + 1;
        if (zzyzVarA != null) {
            zzzaVar.getClass();
            if (!zzzaVar.b(zzyzVarA.e(), zzyzVarA.c().a())) {
                throw zzabo.a("invalid format specifier", i12, i25, str);
            }
            if (i11 < 10) {
                Map map = zzabj.f11182d;
                if (zzzaVar.a()) {
                    zzabh[] zzabhVarArr = (zzabj[]) zzabj.f11182d.get(zzyzVarA);
                    zzabr.a(zzabhVarArr, "default parameter");
                    zzabgVar = zzabhVarArr[i11];
                }
            }
            zzabkVar = new zzabj(i11, zzyzVarA, zzzaVar);
            zzabgVar = zzabkVar;
        } else if (cCharAt == 't' || cCharAt == 'T') {
            if (!zzzaVar.b(160, z11)) {
                throw zzabo.a("invalid format specification", i12, i25, str);
            }
            int i26 = i14 + 2;
            if (i26 > str.length()) {
                throw zzabo.b(i12, "truncated format specifier", str);
            }
            zzabf zzabfVarA = zzabf.a(str.charAt(i25));
            if (zzabfVarA == null) {
                throw zzabo.b(i25, "illegal date/time conversion", str);
            }
            zzabgVar = new zzabg(zzzaVar, i11, zzabfVarA);
            i25 = i26;
        } else {
            if (cCharAt != 'h' && cCharAt != 'H') {
                throw zzabo.a("invalid format specification", i12, i25, str);
            }
            if (!zzzaVar.b(160, z11)) {
                throw zzabo.a("invalid format specification", i12, i25, str);
            }
            zzabkVar = new zzabk(zzzaVar, i11);
            zzabgVar = zzabkVar;
        }
        int i27 = zzabgVar.f11180a;
        if (i27 < 32) {
            zzyyVar.f11186b |= i15 << i27;
        }
        zzyyVar.f11187c = Math.max(zzyyVar.f11187c, i27);
        zzaaf zzaafVar = zzyyVar.f11185a;
        zzabn zzabnVar = zzaafVar.f11132a;
        StringBuilder sb2 = zzyyVar.f12199e;
        zzabnVar.b(zzyyVar.f12200f, i12, zzaafVar.f11133b, sb2);
        Object[] objArr = zzyyVar.f12198d;
        int i28 = zzabgVar.f11180a;
        if (i28 < objArr.length) {
            Object obj = objArr[i28];
            if (obj != null) {
                zzabgVar.a(zzyyVar, obj);
            } else {
                sb2.append("null");
            }
        } else {
            sb2.append("[ERROR: MISSING LOG ARGUMENT]");
        }
        zzyyVar.f12200f = i25;
        return i25;
    }
}

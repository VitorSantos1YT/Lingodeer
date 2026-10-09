package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.material.datepicker.d;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzvn implements zzws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzws f12075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f12076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f12079e;

    public zzvn(String str, zzws zzwsVar, zzwq zzwqVar) {
        str.getClass();
        this.f12078d = str;
        this.f12075a = zzwsVar;
        zzvn zzvnVar = (zzvn) zzwsVar;
        this.f12076b = zzvnVar.f12076b;
        this.f12077c = zzvnVar.f12077c;
        this.f12079e = Thread.currentThread();
    }

    public static String a(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzwq zzwqVarC = zzvy.c();
        zzws zzwsVar = zzwqVarC.f12135b;
        String str = this.f12078d;
        if (zzwsVar == null) {
            throw new zzvv(p.u(new StringBuilder(String.valueOf(str).length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == zzwsVar) {
            zzvy.b(zzwqVarC, zzwsVar.zzb());
            this.f12079e = null;
            return;
        }
        String strZze = zzwsVar.zze();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(strZze).length() + 1);
        d.w(sb2, "Tried to end span ", str, ", but that span is not the current span. The current span is ", strZze);
        sb2.append(".");
        throw new zzvw(sb2.toString());
    }

    /* JADX WARN: Code duplicated, block: B:134:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f8  */
    public final String toString() {
        int i11;
        int i12;
        zzwo zzwoVar;
        Iterator it;
        zzwm zzwmVar;
        int i13;
        AtomicReference atomicReference = zzvy.f12092a;
        int i14 = 0;
        int length = 0;
        zzws zzwsVarZzb = this;
        while (zzwsVarZzb != null) {
            i14++;
            length += zzwsVarZzb.zze().length();
            zzwsVarZzb = zzwsVarZzb.zzb();
            if (zzwsVarZzb != null) {
                length += 4;
            }
        }
        if (i14 > 250) {
            String[] strArr = new String[i14];
            zzws zzwsVarZzb2 = this;
            for (int i15 = i14 - 1; i15 >= 0; i15--) {
                strArr[i15] = zzwsVarZzb2.zze();
                zzwsVarZzb2 = zzwsVarZzb2.zzb();
            }
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            UnmodifiableIterator it2 = ImmutableSet.n(strArr).iterator();
            int i16 = 0;
            while (it2.hasNext()) {
                builder.c(it2.next(), Integer.valueOf(i16));
                i16++;
            }
            int i17 = 1;
            ImmutableMap immutableMapA = builder.a(true);
            int i18 = i14 >> 2;
            if (immutableMapA.size() > i18) {
                zzwoVar = null;
            } else {
                int i19 = i14 + 1;
                int[] iArr = new int[i19];
                for (int i21 = 0; i21 < i14; i21++) {
                    iArr[i21] = ((Integer) immutableMapA.get(strArr[i21])).intValue();
                }
                iArr[i14] = immutableMapA.size();
                zzwp zzwpVar = new zzwp(iArr);
                int i22 = 0;
                while (true) {
                    int i23 = -1;
                    if (i22 >= i19) {
                        break;
                    }
                    zzwpVar.f12133f += i17;
                    int i24 = iArr[i22];
                    while (true) {
                        zzwn zzwnVar = null;
                        while (true) {
                            if (zzwpVar.f12133f <= 0) {
                                i13 = i17;
                                break;
                            }
                            if (zzwpVar.f12132e == 0) {
                                break;
                            }
                            i13 = i17;
                            int i25 = ((zzwn) zzwpVar.f12130c.f12124d.get(Integer.valueOf(iArr[zzwpVar.f12131d]))).f12121a;
                            int i26 = zzwpVar.f12132e;
                            if (iArr[i25 + i26] == i24) {
                                if (zzwnVar != null) {
                                    zzwnVar.f12123c = zzwpVar.f12130c;
                                }
                                zzwpVar.f12132e = i26 + 1;
                                zzwpVar.a();
                                break;
                            }
                            zzwn zzwnVar2 = (zzwn) zzwpVar.f12130c.f12124d.get(Integer.valueOf(iArr[zzwpVar.f12131d]));
                            int i27 = zzwnVar2.f12121a;
                            int i28 = i23;
                            zzwn zzwnVar3 = new zzwn(i27, (zzwpVar.f12132e + i27) - 1);
                            zzwpVar.f12130c.f12124d.put(Integer.valueOf(iArr[zzwpVar.f12131d]), zzwnVar3);
                            int i29 = zzwnVar3.f12122b + 1;
                            Integer numValueOf = Integer.valueOf(iArr[i29]);
                            HashMap map = zzwnVar3.f12124d;
                            map.put(numValueOf, zzwnVar2);
                            zzwnVar2.f12121a = i29;
                            if (zzwnVar != null) {
                                zzwnVar.f12123c = zzwnVar3;
                            }
                            map.put(Integer.valueOf(i24), new zzwn(i22, 1073741824));
                            zzwpVar.f12133f--;
                            zzwpVar.b();
                            zzwnVar = zzwnVar3;
                            i17 = i13;
                            i23 = i28;
                        }
                        HashMap map2 = zzwpVar.f12130c.f12124d;
                        i13 = i17;
                        Integer numValueOf2 = Integer.valueOf(i24);
                        if (map2.containsKey(numValueOf2)) {
                            if (zzwnVar != null) {
                                zzwnVar.f12123c = zzwpVar.f12130c;
                            }
                            zzwpVar.f12131d = i22;
                            zzwpVar.f12132e++;
                            zzwpVar.a();
                            break;
                        }
                        zzwpVar.f12130c.f12124d.put(numValueOf2, new zzwn(i22, 1073741824));
                        if (zzwnVar != null) {
                            zzwnVar.f12123c = zzwpVar.f12130c;
                        }
                        zzwpVar.f12133f += i23;
                        zzwpVar.b();
                        i17 = i13;
                    }
                    i22++;
                    i17 = i13;
                }
                int i30 = i17;
                ArrayDeque arrayDeque = new ArrayDeque();
                zzwn zzwnVar4 = zzwpVar.f12129b;
                zzwm zzwmVar2 = new zzwm(zzwnVar4, 0, -1, -1);
                arrayDeque.push(zzwmVar2);
                while (!arrayDeque.isEmpty()) {
                    zzwm zzwmVar3 = (zzwm) arrayDeque.pop();
                    Iterator it3 = zzwmVar3.f12120d.f12124d.values().iterator();
                    while (it3.hasNext()) {
                        zzwn zzwnVar5 = (zzwn) it3.next();
                        int i31 = zzwmVar3.f12118b;
                        int i32 = zzwmVar3.f12119c;
                        int i33 = zzwnVar5.f12121a;
                        zzwn zzwnVar6 = zzwnVar4;
                        int i34 = zzwnVar5.f12122b;
                        if (zzwpVar.d(i31, i32, i33, i34)) {
                            it = it3;
                        } else {
                            if (zzwnVar5.f12124d.isEmpty()) {
                                int i35 = zzwnVar5.f12121a;
                                it = it3;
                                if (zzwpVar.d(i31, i32, i35, (i35 + i32) - i31)) {
                                }
                                if (zzwmVar2.f12117a < zzwmVar.f12117a) {
                                    zzwmVar2 = zzwmVar;
                                }
                                arrayDeque.push(zzwmVar);
                                zzwnVar4 = zzwnVar6;
                                it3 = it;
                                i30 = 1;
                            } else {
                                it = it3;
                            }
                            zzwmVar = new zzwm(zzwnVar5, i30, zzwnVar5.f12121a, i34);
                            if (zzwmVar2.f12117a < zzwmVar.f12117a) {
                                zzwmVar2 = zzwmVar;
                            }
                            arrayDeque.push(zzwmVar);
                            zzwnVar4 = zzwnVar6;
                            it3 = it;
                            i30 = 1;
                        }
                        zzwmVar = new zzwm(zzwnVar5, zzwmVar3.f12117a + i30, i31, i32);
                        if (zzwmVar2.f12117a < zzwmVar.f12117a) {
                            zzwmVar2 = zzwmVar;
                        }
                        arrayDeque.push(zzwmVar);
                        zzwnVar4 = zzwnVar6;
                        it3 = it;
                        i30 = 1;
                    }
                    i30 = 1;
                }
                int iMin = Math.min(iArr.length, zzwmVar2.f12119c + 1);
                int i36 = 0;
                loop9: while (true) {
                    i11 = zzwmVar2.f12118b;
                    i12 = iMin - i11;
                    zzwnVar4 = (zzwn) zzwnVar4.f12124d.get(Integer.valueOf(iArr[(i36 % i12) + i11]));
                    if (zzwnVar4 == null) {
                        break;
                    }
                    for (int i37 = zzwnVar4.f12121a; i37 < zzwnVar4.f12122b + 1 && i37 < iArr.length; i37++) {
                        if (iArr[(i36 % i12) + i11] != iArr[i37]) {
                            break loop9;
                        }
                        i36++;
                    }
                }
                int i38 = i36 / i12;
                zzwo zzwoVar2 = new zzwo(i11, iMin, i38);
                if (i12 * i38 < i18) {
                    zzwoVar = null;
                } else {
                    zzwoVar = zzwoVar2;
                }
            }
            String strConcat = BuildConfig.VERSION_NAME;
            if (zzwoVar != null) {
                int i39 = zzwoVar.f12125a;
                String strConcat2 = i39 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i39))).concat(" -> ") : BuildConfig.VERSION_NAME;
                int i40 = zzwoVar.f12126b;
                int i41 = zzwoVar.f12127c;
                int i42 = ((i40 - i39) * i41) + i39;
                if (i42 < i14) {
                    strConcat = " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i42, i14))));
                }
                String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i39, i40));
                Locale locale = Locale.US;
                strConcat = strConcat2 + "{" + strJoin + "}x" + i41 + strConcat;
            }
            if (!strConcat.isEmpty()) {
                return strConcat;
            }
        }
        char[] cArr = new char[length];
        zzws zzwsVarZzb3 = this;
        while (zzwsVarZzb3 != null) {
            String strZze = zzwsVarZzb3.zze();
            length -= strZze.length();
            strZze.getChars(0, strZze.length(), cArr, length);
            zzwsVarZzb3 = zzwsVarZzb3.zzb();
            if (zzwsVarZzb3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final Thread zza() {
        return this.f12079e;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws zzb() {
        return this.f12075a;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final UUID zzc() {
        return this.f12076b;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final String zzd() {
        return this.f12077c;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final String zze() {
        return this.f12078d;
    }

    public zzvn(String str, UUID uuid, String str2, zzwq zzwqVar) {
        str.getClass();
        this.f12078d = str;
        this.f12075a = null;
        this.f12076b = uuid;
        this.f12077c = str2;
        zzwqVar.getClass();
        this.f12079e = Thread.currentThread();
    }
}

package com.google.android.gms.internal.measurement;

import hh.p0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzyz {
    public static final zzyz zza;
    public static final zzyz zzb;
    public static final zzyz zzc;
    public static final zzyz zzd;
    public static final zzyz zze;
    public static final zzyz zzf;
    public static final zzyz zzg;
    public static final zzyz zzh;
    public static final zzyz zzi;
    public static final zzyz zzj;
    private static final zzyz[] zzk;
    private static final /* synthetic */ zzyz[] zzp;
    private final char zzl;
    private final zzzb zzm;
    private final int zzn;
    private final String zzo;

    static {
        zzyz zzyzVar = new zzyz("STRING", 0, 's', zzzb.GENERAL, "-#", true);
        zza = zzyzVar;
        zzyz zzyzVar2 = new zzyz("BOOLEAN", 1, 'b', zzzb.BOOLEAN, "-", true);
        zzb = zzyzVar2;
        zzyz zzyzVar3 = new zzyz("CHAR", 2, 'c', zzzb.CHARACTER, "-", true);
        zzc = zzyzVar3;
        zzzb zzzbVar = zzzb.INTEGRAL;
        zzyz zzyzVar4 = new zzyz("DECIMAL", 3, 'd', zzzbVar, "-0+ ,(", false);
        zzd = zzyzVar4;
        zzyz zzyzVar5 = new zzyz("OCTAL", 4, 'o', zzzbVar, "-#0(", false);
        zze = zzyzVar5;
        zzyz zzyzVar6 = new zzyz("HEX", 5, 'x', zzzbVar, "-#0(", true);
        zzf = zzyzVar6;
        zzzb zzzbVar2 = zzzb.FLOAT;
        zzyz zzyzVar7 = new zzyz("FLOAT", 6, 'f', zzzbVar2, "-#0+ ,(", false);
        zzg = zzyzVar7;
        zzyz zzyzVar8 = new zzyz("EXPONENT", 7, 'e', zzzbVar2, "-#0+ (", true);
        zzh = zzyzVar8;
        zzyz zzyzVar9 = new zzyz("GENERAL", 8, 'g', zzzbVar2, "-0+ ,(", true);
        zzi = zzyzVar9;
        zzyz zzyzVar10 = new zzyz("EXPONENT_HEX", 9, 'a', zzzbVar2, "-#0+ ", true);
        zzj = zzyzVar10;
        zzp = new zzyz[]{zzyzVar, zzyzVar2, zzyzVar3, zzyzVar4, zzyzVar5, zzyzVar6, zzyzVar7, zzyzVar8, zzyzVar9, zzyzVar10};
        zzk = new zzyz[26];
        for (zzyz zzyzVar11 : values()) {
            zzk[(zzyzVar11.zzl | ' ') - 97] = zzyzVar11;
        }
    }

    public zzyz(String str, int i11, char c11, zzzb zzzbVar, String str2, boolean z11) {
        super(str, i11);
        this.zzl = c11;
        this.zzm = zzzbVar;
        zzza zzzaVar = zzza.f12204e;
        int i12 = true != z11 ? 0 : 128;
        for (int i13 = 0; i13 < str2.length(); i13++) {
            int iCharAt = ((int) ((zzza.f12203d >>> ((str2.charAt(i13) - ' ') * 3)) & 7)) - 1;
            if (iCharAt < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str2));
            }
            i12 |= 1 << iCharAt;
        }
        this.zzn = i12;
        this.zzo = p0.o(new StringBuilder(String.valueOf(c11).length() + 1), "%", c11);
    }

    public static zzyz a(char c11) {
        zzyz zzyzVar = zzk[(c11 | ' ') - 97];
        if ((c11 & ' ') != 0) {
            return zzyzVar;
        }
        if (zzyzVar == null || (zzyzVar.zzn & 128) == 0) {
            return null;
        }
        return zzyzVar;
    }

    public static zzyz[] values() {
        return (zzyz[]) zzp.clone();
    }

    public final char b() {
        return this.zzl;
    }

    public final zzzb c() {
        return this.zzm;
    }

    public final int e() {
        return this.zzn;
    }

    public final String f() {
        return this.zzo;
    }
}

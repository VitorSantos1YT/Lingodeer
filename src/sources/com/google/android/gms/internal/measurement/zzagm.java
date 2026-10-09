package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
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
public final class zzagm {
    public static final zzagm zza;
    public static final zzagm zzb;
    public static final zzagm zzc;
    public static final zzagm zzd;
    public static final zzagm zze;
    public static final zzagm zzf;
    public static final zzagm zzg;
    public static final zzagm zzh;
    public static final zzagm zzi;
    public static final zzagm zzj;
    public static final zzagm zzk;
    public static final zzagm zzl;
    public static final zzagm zzm;
    public static final zzagm zzn;
    public static final zzagm zzo;
    public static final zzagm zzp;
    public static final zzagm zzq;
    public static final zzagm zzr;
    private static final /* synthetic */ zzagm[] zzu;
    private final zzagn zzs;
    private final int zzt;

    static {
        zzagm zzagmVar = new zzagm("DOUBLE", 0, zzagn.zzd, 1);
        zza = zzagmVar;
        zzagm zzagmVar2 = new zzagm("FLOAT", 1, zzagn.zzc, 5);
        zzb = zzagmVar2;
        zzagn zzagnVar = zzagn.zzb;
        zzagm zzagmVar3 = new zzagm("INT64", 2, zzagnVar, 0);
        zzc = zzagmVar3;
        zzagm zzagmVar4 = new zzagm("UINT64", 3, zzagnVar, 0);
        zzd = zzagmVar4;
        zzagn zzagnVar2 = zzagn.zza;
        zzagm zzagmVar5 = new zzagm("INT32", 4, zzagnVar2, 0);
        zze = zzagmVar5;
        zzagm zzagmVar6 = new zzagm("FIXED64", 5, zzagnVar, 1);
        zzf = zzagmVar6;
        zzagm zzagmVar7 = new zzagm("FIXED32", 6, zzagnVar2, 5);
        zzg = zzagmVar7;
        zzagm zzagmVar8 = new zzagm("BOOL", 7, zzagn.zze, 0);
        zzh = zzagmVar8;
        zzagm zzagmVar9 = new zzagm("STRING", 8, zzagn.zzf, 2);
        zzi = zzagmVar9;
        zzagn zzagnVar3 = zzagn.zzi;
        zzagm zzagmVar10 = new zzagm("GROUP", 9, zzagnVar3, 3);
        zzj = zzagmVar10;
        zzagm zzagmVar11 = new zzagm("MESSAGE", 10, zzagnVar3, 2);
        zzk = zzagmVar11;
        zzagm zzagmVar12 = new zzagm("BYTES", 11, zzagn.zzg, 2);
        zzl = zzagmVar12;
        zzagm zzagmVar13 = new zzagm("UINT32", 12, zzagnVar2, 0);
        zzm = zzagmVar13;
        zzagm zzagmVar14 = new zzagm("ENUM", 13, zzagn.zzh, 0);
        zzn = zzagmVar14;
        zzagm zzagmVar15 = new zzagm("SFIXED32", 14, zzagnVar2, 5);
        zzo = zzagmVar15;
        zzagm zzagmVar16 = new zzagm("SFIXED64", 15, zzagnVar, 1);
        zzp = zzagmVar16;
        zzagm zzagmVar17 = new zzagm("SINT32", 16, zzagnVar2, 0);
        zzq = zzagmVar17;
        zzagm zzagmVar18 = new zzagm("SINT64", 17, zzagnVar, 0);
        zzr = zzagmVar18;
        zzu = new zzagm[]{zzagmVar, zzagmVar2, zzagmVar3, zzagmVar4, zzagmVar5, zzagmVar6, zzagmVar7, zzagmVar8, zzagmVar9, zzagmVar10, zzagmVar11, zzagmVar12, zzagmVar13, zzagmVar14, zzagmVar15, zzagmVar16, zzagmVar17, zzagmVar18};
    }

    public zzagm(String str, int i11, zzagn zzagnVar, int i12) {
        super(str, i11);
        this.zzs = zzagnVar;
        this.zzt = i12;
    }

    public static zzagm[] values() {
        return (zzagm[]) zzu.clone();
    }

    public final zzagn a() {
        return this.zzs;
    }

    public final int b() {
        return this.zzt;
    }
}

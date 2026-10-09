package com.google.android.gms.internal.p002firebaseauthapi;

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
/* JADX INFO: loaded from: classes.dex */
public class zzanr {
    public static final zzanr zza;
    public static final zzanr zzb;
    public static final zzanr zzc;
    public static final zzanr zzd;
    public static final zzanr zze;
    public static final zzanr zzf;
    public static final zzanr zzg;
    public static final zzanr zzh;
    public static final zzanr zzi;
    public static final zzanr zzj;
    public static final zzanr zzk;
    public static final zzanr zzl;
    public static final zzanr zzm;
    public static final zzanr zzn;
    public static final zzanr zzo;
    public static final zzanr zzp;
    public static final zzanr zzq;
    public static final zzanr zzr;
    private static final /* synthetic */ zzanr[] zzs;
    private final zzanu zzt;
    private final int zzu;

    static {
        zzanr zzanrVar = new zzanr("DOUBLE", 0, zzanu.zzd, 1);
        zza = zzanrVar;
        zzanr zzanrVar2 = new zzanr("FLOAT", 1, zzanu.zzc, 5);
        zzb = zzanrVar2;
        zzanu zzanuVar = zzanu.zzb;
        zzanr zzanrVar3 = new zzanr("INT64", 2, zzanuVar, 0);
        zzc = zzanrVar3;
        zzanr zzanrVar4 = new zzanr("UINT64", 3, zzanuVar, 0);
        zzd = zzanrVar4;
        zzanu zzanuVar2 = zzanu.zza;
        zzanr zzanrVar5 = new zzanr("INT32", 4, zzanuVar2, 0);
        zze = zzanrVar5;
        zzanr zzanrVar6 = new zzanr("FIXED64", 5, zzanuVar, 1);
        zzf = zzanrVar6;
        zzanr zzanrVar7 = new zzanr("FIXED32", 6, zzanuVar2, 5);
        zzg = zzanrVar7;
        zzanr zzanrVar8 = new zzanr("BOOL", 7, zzanu.zze, 0);
        zzh = zzanrVar8;
        zzanq zzanqVar = new zzanq("STRING", 8, zzanu.zzf, 2);
        zzi = zzanqVar;
        zzanu zzanuVar3 = zzanu.zzi;
        zzant zzantVar = new zzant("GROUP", 9, zzanuVar3, 3);
        zzj = zzantVar;
        zzans zzansVar = new zzans("MESSAGE", 10, zzanuVar3, 2);
        zzk = zzansVar;
        zzanv zzanvVar = new zzanv("BYTES", 11, zzanu.zzg, 2);
        zzl = zzanvVar;
        zzanr zzanrVar9 = new zzanr("UINT32", 12, zzanuVar2, 0);
        zzm = zzanrVar9;
        zzanr zzanrVar10 = new zzanr("ENUM", 13, zzanu.zzh, 0);
        zzn = zzanrVar10;
        zzanr zzanrVar11 = new zzanr("SFIXED32", 14, zzanuVar2, 5);
        zzo = zzanrVar11;
        zzanr zzanrVar12 = new zzanr("SFIXED64", 15, zzanuVar, 1);
        zzp = zzanrVar12;
        zzanr zzanrVar13 = new zzanr("SINT32", 16, zzanuVar2, 0);
        zzq = zzanrVar13;
        zzanr zzanrVar14 = new zzanr("SINT64", 17, zzanuVar, 0);
        zzr = zzanrVar14;
        zzs = new zzanr[]{zzanrVar, zzanrVar2, zzanrVar3, zzanrVar4, zzanrVar5, zzanrVar6, zzanrVar7, zzanrVar8, zzanqVar, zzantVar, zzansVar, zzanvVar, zzanrVar9, zzanrVar10, zzanrVar11, zzanrVar12, zzanrVar13, zzanrVar14};
    }

    public zzanr(String str, int i11, zzanu zzanuVar, int i12) {
        super(str, i11);
        this.zzt = zzanuVar;
        this.zzu = i12;
    }

    public static zzanr[] values() {
        return (zzanr[]) zzs.clone();
    }
}

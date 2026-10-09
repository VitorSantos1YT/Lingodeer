package com.google.android.gms.internal.auth;

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
public final class zzho {
    public static final zzho zza;
    public static final zzho zzb;
    public static final zzho zzc;
    public static final zzho zzd;
    public static final zzho zze;
    public static final zzho zzf;
    public static final zzho zzg;
    public static final zzho zzh;
    public static final zzho zzi;
    public static final zzho zzj;
    public static final zzho zzk;
    public static final zzho zzl;
    public static final zzho zzm;
    public static final zzho zzn;
    public static final zzho zzo;
    public static final zzho zzp;
    public static final zzho zzq;
    public static final zzho zzr;
    private static final /* synthetic */ zzho[] zzs;
    private final zzhp zzt;

    static {
        zzho zzhoVar = new zzho("DOUBLE", 0, zzhp.DOUBLE);
        zza = zzhoVar;
        zzho zzhoVar2 = new zzho("FLOAT", 1, zzhp.FLOAT);
        zzb = zzhoVar2;
        zzhp zzhpVar = zzhp.LONG;
        zzho zzhoVar3 = new zzho("INT64", 2, zzhpVar);
        zzc = zzhoVar3;
        zzho zzhoVar4 = new zzho("UINT64", 3, zzhpVar);
        zzd = zzhoVar4;
        zzhp zzhpVar2 = zzhp.INT;
        zzho zzhoVar5 = new zzho("INT32", 4, zzhpVar2);
        zze = zzhoVar5;
        zzho zzhoVar6 = new zzho("FIXED64", 5, zzhpVar);
        zzf = zzhoVar6;
        zzho zzhoVar7 = new zzho("FIXED32", 6, zzhpVar2);
        zzg = zzhoVar7;
        zzho zzhoVar8 = new zzho("BOOL", 7, zzhp.BOOLEAN);
        zzh = zzhoVar8;
        zzho zzhoVar9 = new zzho("STRING", 8, zzhp.STRING);
        zzi = zzhoVar9;
        zzhp zzhpVar3 = zzhp.MESSAGE;
        zzho zzhoVar10 = new zzho("GROUP", 9, zzhpVar3);
        zzj = zzhoVar10;
        zzho zzhoVar11 = new zzho("MESSAGE", 10, zzhpVar3);
        zzk = zzhoVar11;
        zzho zzhoVar12 = new zzho("BYTES", 11, zzhp.BYTE_STRING);
        zzl = zzhoVar12;
        zzho zzhoVar13 = new zzho("UINT32", 12, zzhpVar2);
        zzm = zzhoVar13;
        zzho zzhoVar14 = new zzho("ENUM", 13, zzhp.ENUM);
        zzn = zzhoVar14;
        zzho zzhoVar15 = new zzho("SFIXED32", 14, zzhpVar2);
        zzo = zzhoVar15;
        zzho zzhoVar16 = new zzho("SFIXED64", 15, zzhpVar);
        zzp = zzhoVar16;
        zzho zzhoVar17 = new zzho("SINT32", 16, zzhpVar2);
        zzq = zzhoVar17;
        zzho zzhoVar18 = new zzho("SINT64", 17, zzhpVar);
        zzr = zzhoVar18;
        zzs = new zzho[]{zzhoVar, zzhoVar2, zzhoVar3, zzhoVar4, zzhoVar5, zzhoVar6, zzhoVar7, zzhoVar8, zzhoVar9, zzhoVar10, zzhoVar11, zzhoVar12, zzhoVar13, zzhoVar14, zzhoVar15, zzhoVar16, zzhoVar17, zzhoVar18};
    }

    public zzho(String str, int i11, zzhp zzhpVar) {
        super(str, i11);
        this.zzt = zzhpVar;
    }

    public static zzho[] values() {
        return (zzho[]) zzs.clone();
    }

    public final zzhp a() {
        return this.zzt;
    }
}

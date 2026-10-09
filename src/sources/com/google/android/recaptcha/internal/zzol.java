package com.google.android.recaptcha.internal;

import b7.e0;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.android.material.datepicker.d;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import defpackage.e;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i11, int i12, zzoi zzoiVar, boolean z11, int[] iArr2, int i13, int i14, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i11;
        this.zzf = i12;
        this.zzi = zzoiVar instanceof zznd;
        boolean z12 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzj = iArr2;
        this.zzk = i13;
        this.zzl = i14;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i11) {
        zzow zzowVarZzx = zzx(i11);
        int iZzu = zzu(i11) & 1048575;
        if (!zzN(obj, i11)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i11, int i12) {
        zzow zzowVarZzx = zzx(i12);
        if (!zzR(obj, i11, i12)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i12) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbS = e.s("Field ", str, " for ", name, " not found. Known fields are ");
            sbS.append(string);
            throw new RuntimeException(sbS.toString());
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i11) {
        if (zzN(obj2, i11)) {
            int iZzu = zzu(i11) & 1048575;
            Unsafe unsafe = zzb;
            long j11 = iZzu;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i11] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i11);
            if (!zzN(obj, i11)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j11, objZze);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zzH(obj, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j11, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i11, zzov zzovVar) {
        long j11 = i11 & 1048575;
        if (zzM(i11)) {
            zzps.zzs(obj, j11, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j11, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j11, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i11) {
        int iZzr = zzr(i11);
        long j11 = 1048575 & iZzr;
        if (j11 == 1048575) {
            return;
        }
        zzps.zzq(obj, j11, (1 << (iZzr >>> 20)) | zzps.zzc(obj, j11));
    }

    private final void zzI(Object obj, int i11, int i12) {
        zzps.zzq(obj, zzr(i12) & 1048575, i11);
    }

    private final void zzJ(Object obj, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzH(obj, i11);
    }

    private final void zzK(Object obj, int i11, int i12, Object obj2) {
        zzb.putObject(obj, zzu(i12) & 1048575, obj2);
        zzI(obj, i11, i12);
    }

    private final boolean zzL(Object obj, Object obj2, int i11) {
        return zzN(obj, i11) == zzN(obj2, i11);
    }

    private static boolean zzM(int i11) {
        return (i11 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i11) {
        int iZzr = zzr(i11);
        long j11 = iZzr & 1048575;
        if (j11 != 1048575) {
            return (zzps.zzc(obj, j11) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i11);
        long j12 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j12)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j12)) != 0;
            case 2:
                return zzps.zzd(obj, j12) != 0;
            case 3:
                return zzps.zzd(obj, j12) != 0;
            case 4:
                return zzps.zzc(obj, j12) != 0;
            case 5:
                return zzps.zzd(obj, j12) != 0;
            case 6:
                return zzps.zzc(obj, j12) != 0;
            case 7:
                return zzps.zzw(obj, j12);
            case 8:
                Object objZzf = zzps.zzf(obj, j12);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzle) {
                    return !zzle.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzps.zzf(obj, j12) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j12));
            case 11:
                return zzps.zzc(obj, j12) != 0;
            case 12:
                return zzps.zzc(obj, j12) != 0;
            case 13:
                return zzps.zzc(obj, j12) != 0;
            case 14:
                return zzps.zzd(obj, j12) != 0;
            case 15:
                return zzps.zzc(obj, j12) != 0;
            case 16:
                return zzps.zzd(obj, j12) != 0;
            case 17:
                return zzps.zzf(obj, j12) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return zzN(obj, i11);
        }
        return (i13 & i14) != 0;
    }

    private static boolean zzP(Object obj, int i11, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i11 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i11, int i12) {
        return zzps.zzc(obj, (long) (zzr(i12) & 1048575)) == i11;
    }

    private static boolean zzS(Object obj, long j11) {
        return ((Boolean) zzps.zzf(obj, j11)).booleanValue();
    }

    private static final void zzT(int i11, Object obj, zzpy zzpyVar) {
        if (obj instanceof String) {
            zzpyVar.zzG(i11, (String) obj);
        } else {
            zzpyVar.zzd(i11, (zzle) obj);
        }
    }

    public static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzpmVarZzf = zzpm.zzf();
        zzndVar.zzc = zzpmVarZzf;
        return zzpmVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:187:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:193:0x03e2  */
    public static zzol zzm(Class cls, zzof zzofVar, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        int i11;
        int iCharAt;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        char cCharAt;
        int i19;
        char cCharAt2;
        int i21;
        char cCharAt3;
        int i22;
        char cCharAt4;
        int i23;
        char cCharAt5;
        int i24;
        char cCharAt6;
        int i25;
        char cCharAt7;
        int i26;
        char cCharAt8;
        int i27;
        zzou zzouVar;
        int i28;
        Object[] objArr;
        int i29;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        char c11;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Field fieldZzC;
        char cCharAt9;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        Field fieldZzC2;
        Field fieldZzC3;
        int i41;
        char cCharAt10;
        int i42;
        int i43;
        char cCharAt11;
        int i44;
        char cCharAt12;
        int i45;
        char cCharAt13;
        if (!(zzofVar instanceof zzou)) {
            throw null;
        }
        zzou zzouVar2 = (zzou) zzofVar;
        String strZzd = zzouVar2.zzd();
        int length = strZzd.length();
        char c12 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i46 = 1;
            while (true) {
                i11 = i46 + 1;
                if (strZzd.charAt(i46) < 55296) {
                    break;
                }
                i46 = i11;
            }
        } else {
            i11 = 1;
        }
        int i47 = i11 + 1;
        int iCharAt2 = strZzd.charAt(i11);
        if (iCharAt2 >= 55296) {
            int i48 = iCharAt2 & 8191;
            int i49 = 13;
            while (true) {
                i45 = i47 + 1;
                cCharAt13 = strZzd.charAt(i47);
                if (cCharAt13 < 55296) {
                    break;
                }
                i48 |= (cCharAt13 & 8191) << i49;
                i49 += 13;
                i47 = i45;
            }
            iCharAt2 = i48 | (cCharAt13 << i49);
            i47 = i45;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            i16 = 0;
            iCharAt = 0;
            i12 = 0;
            i14 = 0;
            i15 = 0;
            iArr = zza;
            i17 = 0;
        } else {
            int i50 = i47 + 1;
            int iCharAt3 = strZzd.charAt(i47);
            if (iCharAt3 >= 55296) {
                int i51 = iCharAt3 & 8191;
                int i52 = 13;
                while (true) {
                    i26 = i50 + 1;
                    cCharAt8 = strZzd.charAt(i50);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i26;
                }
                iCharAt3 = i51 | (cCharAt8 << i52);
                i50 = i26;
            }
            int i53 = i50 + 1;
            int iCharAt4 = strZzd.charAt(i50);
            if (iCharAt4 >= 55296) {
                int i54 = iCharAt4 & 8191;
                int i55 = 13;
                while (true) {
                    i25 = i53 + 1;
                    cCharAt7 = strZzd.charAt(i53);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i25;
                }
                iCharAt4 = i54 | (cCharAt7 << i55);
                i53 = i25;
            }
            int i56 = i53 + 1;
            int iCharAt5 = strZzd.charAt(i53);
            if (iCharAt5 >= 55296) {
                int i57 = iCharAt5 & 8191;
                int i58 = 13;
                while (true) {
                    i24 = i56 + 1;
                    cCharAt6 = strZzd.charAt(i56);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i24;
                }
                iCharAt5 = i57 | (cCharAt6 << i58);
                i56 = i24;
            }
            int i59 = i56 + 1;
            int iCharAt6 = strZzd.charAt(i56);
            if (iCharAt6 >= 55296) {
                int i60 = iCharAt6 & 8191;
                int i61 = 13;
                while (true) {
                    i23 = i59 + 1;
                    cCharAt5 = strZzd.charAt(i59);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i23;
                }
                iCharAt6 = i60 | (cCharAt5 << i61);
                i59 = i23;
            }
            int i62 = i59 + 1;
            iCharAt = strZzd.charAt(i59);
            if (iCharAt >= 55296) {
                int i63 = iCharAt & 8191;
                int i64 = 13;
                while (true) {
                    i22 = i62 + 1;
                    cCharAt4 = strZzd.charAt(i62);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i22;
                }
                iCharAt = i63 | (cCharAt4 << i64);
                i62 = i22;
            }
            int i65 = i62 + 1;
            int iCharAt7 = strZzd.charAt(i62);
            if (iCharAt7 >= 55296) {
                int i66 = iCharAt7 & 8191;
                int i67 = 13;
                while (true) {
                    i21 = i65 + 1;
                    cCharAt3 = strZzd.charAt(i65);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt3 & 8191) << i67;
                    i67 += 13;
                    i65 = i21;
                }
                iCharAt7 = i66 | (cCharAt3 << i67);
                i65 = i21;
            }
            int i68 = i65 + 1;
            int iCharAt8 = strZzd.charAt(i65);
            if (iCharAt8 >= 55296) {
                int i69 = iCharAt8 & 8191;
                int i70 = 13;
                while (true) {
                    i19 = i68 + 1;
                    cCharAt2 = strZzd.charAt(i68);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt2 & 8191) << i70;
                    i70 += 13;
                    i68 = i19;
                }
                iCharAt8 = i69 | (cCharAt2 << i70);
                i68 = i19;
            }
            int i71 = i68 + 1;
            int iCharAt9 = strZzd.charAt(i68);
            if (iCharAt9 >= 55296) {
                int i72 = iCharAt9 & 8191;
                int i73 = 13;
                while (true) {
                    i18 = i71 + 1;
                    cCharAt = strZzd.charAt(i71);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i72 |= (cCharAt & 8191) << i73;
                    i73 += 13;
                    i71 = i18;
                }
                iCharAt9 = i72 | (cCharAt << i73);
                i71 = i18;
            }
            int i74 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i75 = iCharAt7;
            i12 = iCharAt5;
            i13 = i75;
            i14 = iCharAt6;
            i15 = iCharAt9;
            i16 = i74;
            iArr = iArr2;
            i17 = iCharAt3;
            i47 = i71;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzouVar2.zze();
        Class<?> cls2 = zzouVar2.zza().getClass();
        int i76 = i15 + i13;
        int i77 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[i77];
        int i78 = i15;
        int i79 = i76;
        int i80 = 0;
        int i81 = 0;
        while (i47 < length) {
            int i82 = i47 + 1;
            int iCharAt10 = strZzd.charAt(i47);
            if (iCharAt10 >= c12) {
                int i83 = iCharAt10 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i44 = i84 + 1;
                    cCharAt12 = strZzd.charAt(i84);
                    if (cCharAt12 < c12) {
                        break;
                    }
                    i83 |= (cCharAt12 & 8191) << i85;
                    i85 += 13;
                    i84 = i44;
                }
                iCharAt10 = i83 | (cCharAt12 << i85);
                i27 = i44;
            } else {
                i27 = i82;
            }
            int i86 = i27 + 1;
            int iCharAt11 = strZzd.charAt(i27);
            if (iCharAt11 >= c12) {
                int i87 = iCharAt11 & 8191;
                int i88 = i86;
                int i89 = 13;
                while (true) {
                    i43 = i88 + 1;
                    cCharAt11 = strZzd.charAt(i88);
                    zzouVar = zzouVar2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i87 |= (cCharAt11 & 8191) << i89;
                    i89 += 13;
                    i88 = i43;
                    zzouVar2 = zzouVar;
                }
                iCharAt11 = i87 | (cCharAt11 << i89);
                i28 = i43;
            } else {
                zzouVar = zzouVar2;
                i28 = i86;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i81] = i80;
                i81++;
            }
            int i90 = iCharAt11 & 255;
            int i91 = length;
            int i92 = iCharAt11 & 2048;
            if (i90 >= 51) {
                int i93 = i28 + 1;
                int iCharAt12 = strZzd.charAt(i28);
                if (iCharAt12 >= 55296) {
                    int i94 = iCharAt12 & 8191;
                    int i95 = i93;
                    int i96 = 13;
                    while (true) {
                        i41 = i95 + 1;
                        cCharAt10 = strZzd.charAt(i95);
                        i42 = i94;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i94 = i42 | ((cCharAt10 & 8191) << i96);
                        i96 += 13;
                        i95 = i41;
                    }
                    iCharAt12 = i42 | (cCharAt10 << i96);
                    i39 = i41;
                } else {
                    i39 = i93;
                }
                int i97 = iCharAt12;
                int i98 = i90 - 51;
                int i99 = i39;
                if (i98 == 9 || i98 == 17) {
                    objArr2[e0.a(i80, 3, 1)] = objArrZze[i16];
                    i40 = i92;
                    i16++;
                } else if (i98 != 12) {
                    i40 = i92;
                } else if (zzouVar.zzc() == 1 || i92 != 0) {
                    objArr2[e0.a(i80, 3, 1)] = objArrZze[i16];
                    i16++;
                    i40 = i92;
                } else {
                    i40 = 0;
                }
                int i100 = i97 + i97;
                Object obj = objArrZze[i100];
                int i101 = i40;
                if (obj instanceof Field) {
                    fieldZzC2 = (Field) obj;
                } else {
                    fieldZzC2 = zzC(cls2, (String) obj);
                    objArrZze[i100] = fieldZzC2;
                }
                Object[] objArr3 = objArr2;
                int i102 = i16;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC2);
                int i103 = i100 + 1;
                Object obj2 = objArrZze[i103];
                if (obj2 instanceof Field) {
                    fieldZzC3 = (Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (String) obj2);
                    objArrZze[i103] = fieldZzC3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzC3);
                i17 = i17;
                i34 = i102;
                i80 = i80;
                c11 = 55296;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i33 = iObjectFieldOffset3;
                i92 = i101;
                i29 = iCharAt10;
                i47 = i99;
                objArr = objArr3;
                i32 = 0;
            } else {
                Object[] objArr4 = objArr2;
                int i104 = i16 + 1;
                objArr = objArr4;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i16]);
                i29 = iCharAt10;
                if (i90 == 9 || i90 == 17) {
                    i17 = i17;
                    objArr[e0.a(i80, 3, 1)] = fieldZzC4.getType();
                } else {
                    if (i90 != 27) {
                        if (i90 == 49) {
                            i38 = i16 + 2;
                            i36 = 3;
                            i37 = 1;
                        } else if (i90 == 12 || i90 == 30 || i90 == 44) {
                            i17 = i17;
                            if (zzouVar.zzc() == 1 || i92 != 0) {
                                i38 = i16 + 2;
                                objArr[e0.a(i80, 3, 1)] = objArrZze[i104];
                                i104 = i38;
                            } else {
                                i80 = i80;
                                i92 = 0;
                            }
                        } else if (i90 == 50) {
                            int i105 = i16 + 2;
                            i78++;
                            iArr[i78] = i80;
                            int i106 = i80 / 3;
                            int i107 = i106 + i106;
                            objArr[i107] = objArrZze[i104];
                            if (i92 != 0) {
                                i104 = i16 + 3;
                                objArr[i107 + 1] = objArrZze[i105];
                            } else {
                                i104 = i105;
                                i92 = 0;
                            }
                            i17 = i17;
                        } else {
                            i17 = i17;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i90 > 17) {
                            c11 = 55296;
                            i30 = i28;
                            i31 = 0;
                        } else {
                            int i108 = i28 + 1;
                            int iCharAt13 = strZzd.charAt(i28);
                            if (iCharAt13 >= 55296) {
                                int i109 = iCharAt13 & 8191;
                                int i110 = 13;
                                while (true) {
                                    i35 = i108 + 1;
                                    cCharAt9 = strZzd.charAt(i108);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i109 |= (cCharAt9 & 8191) << i110;
                                    i110 += 13;
                                    i108 = i35;
                                }
                                iCharAt13 = i109 | (cCharAt9 << i110);
                            } else {
                                i35 = i108;
                            }
                            int i111 = (iCharAt13 / 32) + i17 + i17;
                            Object obj3 = objArrZze[i111];
                            if (obj3 instanceof Field) {
                                fieldZzC = (Field) obj3;
                            } else {
                                fieldZzC = zzC(cls2, (String) obj3);
                                objArrZze[i111] = fieldZzC;
                            }
                            i31 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC);
                            i30 = i35;
                            c11 = 55296;
                        }
                        if (i90 >= 18 || i90 > 49) {
                            i32 = i31;
                            i33 = iObjectFieldOffset;
                            int i112 = i30;
                            i34 = i104;
                            i47 = i112;
                        } else {
                            int i113 = i79 + 1;
                            iArr[i79] = iObjectFieldOffset;
                            i32 = i31;
                            i33 = iObjectFieldOffset;
                            int i114 = i30;
                            i34 = i104;
                            i47 = i114;
                            i79 = i113;
                        }
                    } else {
                        i36 = 3;
                        i37 = 1;
                        i38 = i16 + 2;
                    }
                    objArr[e0.a(i80, i36, i37)] = objArrZze[i104];
                    i104 = i38;
                }
                i80 = i80;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    c11 = 55296;
                    i30 = i28;
                    i31 = 0;
                } else {
                    c11 = 55296;
                    i30 = i28;
                    i31 = 0;
                }
                if (i90 >= 18) {
                    i32 = i31;
                    i33 = iObjectFieldOffset;
                    int i115 = i30;
                    i34 = i104;
                    i47 = i115;
                } else {
                    i32 = i31;
                    i33 = iObjectFieldOffset;
                    int i116 = i30;
                    i34 = i104;
                    i47 = i116;
                }
            }
            int i117 = i80 + 1;
            iArr3[i80] = i29;
            int i118 = i80 + 2;
            iArr3[i117] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i92 != 0 ? Integer.MIN_VALUE : 0) | (i90 << 20) | i33;
            iArr3[i118] = (i32 << 20) | iObjectFieldOffset2;
            i80 += 3;
            i16 = i34;
            length = i91;
            c12 = c11;
            zzouVar2 = zzouVar;
            i17 = i17;
            objArr2 = objArr;
        }
        return new zzol(iArr3, objArr2, i12, i14, zzouVar2.zza(), false, iArr, i15, i76, zzooVar, zznvVar, zzplVar, zzmpVar, zzodVar);
    }

    private static double zzn(Object obj, long j11) {
        return ((Double) zzps.zzf(obj, j11)).doubleValue();
    }

    private static float zzo(Object obj, long j11) {
        return ((Float) zzps.zzf(obj, j11)).floatValue();
    }

    private static int zzp(Object obj, long j11) {
        return ((Integer) zzps.zzf(obj, j11)).intValue();
    }

    private final int zzq(int i11) {
        if (i11 < this.zze || i11 > this.zzf) {
            return -1;
        }
        return zzs(i11, 0);
    }

    private final int zzr(int i11) {
        return this.zzc[i11 + 2];
    }

    private final int zzs(int i11, int i12) {
        int length = (this.zzc.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int i15 = this.zzc[i14];
            if (i11 == i15) {
                return i14;
            }
            if (i11 < i15) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i11) {
        return (i11 >>> 20) & 255;
    }

    private final int zzu(int i11) {
        return this.zzc[i11 + 1];
    }

    private static long zzv(Object obj, long j11) {
        return ((Long) zzps.zzf(obj, j11)).longValue();
    }

    private final zznh zzw(int i11) {
        int i12 = i11 / 3;
        return (zznh) this.zzd[i12 + i12 + 1];
    }

    private final zzow zzx(int i11) {
        Object[] objArr = this.zzd;
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        zzow zzowVar = (zzow) objArr[i13];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzowVarZzb = zzos.zza().zzb((Class) objArr[i13 + 1]);
        this.zzd[i13] = zzowVarZzb;
        return zzowVarZzb;
    }

    private final Object zzy(Object obj, int i11, Object obj2, zzpl zzplVar, Object obj3) {
        int i12 = this.zzc[i11];
        Object objZzf = zzps.zzf(obj, zzu(i11) & 1048575);
        if (objZzf == null || zzw(i11) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i11) {
        int i12 = i11 / 3;
        return this.zzd[i12 + i12];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:152:0x03df  */
    /* JADX WARN: Code duplicated, block: B:206:0x0522  */
    /* JADX WARN: Code duplicated, block: B:90:0x0211  */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int i11;
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzd;
        int iZzA3;
        int iZzh;
        int iZzA4;
        int size;
        int iZzl;
        int iZzA5;
        int iZzd2;
        boolean z11;
        int iZzb;
        int iZzz;
        int iZzA6;
        int iZzA7;
        int size2;
        int iZzk;
        int iZzA8;
        int size3;
        int iZzi;
        int iZzA9;
        int i12;
        int iZze;
        int iZzA10;
        int iZzA11;
        int iZzA12;
        int iZzB2;
        zzol<T> zzolVar = this;
        Unsafe unsafe = zzb;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int iA = 0;
        while (i15 < zzolVar.zzc.length) {
            int iZzu = zzolVar.zzu(i15);
            int iZzt = zzt(iZzu);
            int[] iArr = zzolVar.zzc;
            int i17 = iArr[i15];
            int i18 = iArr[i15 + 2];
            int i19 = i18 & i13;
            if (iZzt <= 17) {
                if (i19 != i14) {
                    i16 = i19 == i13 ? 0 : unsafe.getInt(obj, i19);
                    i14 = i19;
                }
                i11 = 1 << (i18 >>> 20);
            } else {
                i11 = 0;
            }
            int i21 = iZzu & i13;
            if (iZzt >= zzmu.zzJ.zza()) {
                zzmu.zzW.zza();
            }
            long j11 = i21;
            switch (iZzt) {
                case 0:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        iA = d.a(i17 << 3, 8, iA);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 1:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        iA = d.a(i17 << 3, 4, iA);
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 2:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        long j12 = unsafe.getLong(obj, j11);
                        iZzA = zzln.zzA(i17 << 3);
                        iZzB = zzln.zzB(j12);
                        iA += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 3:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        long j13 = unsafe.getLong(obj, j11);
                        iZzA = zzln.zzA(i17 << 3);
                        iZzB = zzln.zzB(j13);
                        iA += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 4:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        long j14 = unsafe.getInt(obj, j11);
                        iZzA = zzln.zzA(i17 << 3);
                        iZzB = zzln.zzB(j14);
                        iA += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 5:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        iA = d.a(i17 << 3, 8, iA);
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 6:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        iA = d.a(i17 << 3, 4, iA);
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 7:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        iA = d.a(i17 << 3, 1, iA);
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 8:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        int i22 = i17 << 3;
                        Object object = unsafe.getObject(obj, j11);
                        if (object instanceof zzle) {
                            iZzA2 = zzln.zzA(i22);
                            iZzd = ((zzle) object).zzd();
                            iZzA3 = zzln.zzA(iZzd);
                            iA += iZzA3 + iZzd + iZzA2;
                        } else {
                            iZzA = zzln.zzA(i22);
                            iZzB = zzln.zzz((String) object);
                            iA += iZzB + iZzA;
                        }
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 9:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        iZzh = zzoy.zzh(i17, unsafe.getObject(obj, j11), zzolVar.zzx(i15));
                        iA += iZzh;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 10:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        zzle zzleVar = (zzle) unsafe.getObject(obj, j11);
                        iZzA2 = zzln.zzA(i17 << 3);
                        iZzd = zzleVar.zzd();
                        iZzA3 = zzln.zzA(iZzd);
                        iA += iZzA3 + iZzd + iZzA2;
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 11:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        iA = d.a(unsafe.getInt(obj, j11), zzln.zzA(i17 << 3), iA);
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 12:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        long j15 = unsafe.getInt(obj, j11);
                        iZzA = zzln.zzA(i17 << 3);
                        iZzB = zzln.zzB(j15);
                        iA += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 13:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        iA = d.a(i17 << 3, 4, iA);
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 14:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        iA = d.a(i17 << 3, 8, iA);
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 15:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        int i23 = unsafe.getInt(obj, j11);
                        iA = d.a((i23 >> 31) ^ (i23 + i23), zzln.zzA(i17 << 3), iA);
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 16:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        long j16 = unsafe.getLong(obj, j11);
                        iZzA = zzln.zzA(i17 << 3);
                        iZzB = zzln.zzB((j16 >> 63) ^ (j16 + j16));
                        iA += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 17:
                    if (zzolVar.zzO(obj, i15, i14, i16, i11)) {
                        iA += zzln.zzw(i17, (zzoi) unsafe.getObject(obj, j11), zzolVar.zzx(i15));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 18:
                    iZzh = zzoy.zzd(i17, (List) unsafe.getObject(obj, j11), false);
                    iA += iZzh;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 19:
                    iZzh = zzoy.zzb(i17, (List) unsafe.getObject(obj, j11), false);
                    iA += iZzh;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j11);
                    int i24 = zzoy.zza;
                    if (list.size() == 0) {
                        iZzA4 = 0;
                    } else {
                        iZzA4 = (zzln.zzA(i17 << 3) * list.size()) + zzoy.zzg(list);
                    }
                    iA += iZzA4;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j11);
                    int i25 = zzoy.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzA4 = 0;
                    } else {
                        iZzl = zzoy.zzl(list2);
                        iZzA5 = zzln.zzA(i17 << 3);
                        iZzA4 = (iZzA5 * size) + iZzl;
                    }
                    iA += iZzA4;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j11);
                    int i26 = zzoy.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzA4 = 0;
                    } else {
                        iZzl = zzoy.zzf(list3);
                        iZzA5 = zzln.zzA(i17 << 3);
                        iZzA4 = (iZzA5 * size) + iZzl;
                    }
                    iA += iZzA4;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 23:
                    iZzd2 = zzoy.zzd(i17, (List) unsafe.getObject(obj, j11), false);
                    iA += iZzd2;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    z11 = false;
                    iZzb = zzoy.zzb(i17, (List) unsafe.getObject(obj, j11), false);
                    iA += iZzb;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    List list4 = (List) unsafe.getObject(obj, j11);
                    int i27 = zzoy.zza;
                    int size4 = list4.size();
                    if (size4 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzd2 = size4 * (zzln.zzA(i17 << 3) + 1);
                    }
                    iA += iZzd2;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    List list5 = (List) unsafe.getObject(obj, j11);
                    int i28 = zzoy.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iZzz = 0;
                    } else {
                        int iZzA13 = zzln.zzA(i17 << 3) * size5;
                        if (list5 instanceof zznu) {
                            zznu zznuVar = (zznu) list5;
                            iZzz = iZzA13;
                            for (int i29 = 0; i29 < size5; i29++) {
                                Object objZzc = zznuVar.zzc();
                                if (objZzc instanceof zzle) {
                                    int iZzd3 = ((zzle) objZzc).zzd();
                                    iZzz = d.a(iZzd3, iZzd3, iZzz);
                                } else {
                                    iZzz = zzln.zzz((String) objZzc) + iZzz;
                                }
                            }
                        } else {
                            iZzz = iZzA13;
                            for (int i30 = 0; i30 < size5; i30++) {
                                Object obj2 = list5.get(i30);
                                if (obj2 instanceof zzle) {
                                    int iZzd4 = ((zzle) obj2).zzd();
                                    iZzz = d.a(iZzd4, iZzd4, iZzz);
                                } else {
                                    iZzz = zzln.zzz((String) obj2) + iZzz;
                                }
                            }
                        }
                    }
                    iA += iZzz;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j11);
                    zzow zzowVarZzx = zzolVar.zzx(i15);
                    int i31 = zzoy.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzA6 = zzln.zzA(i17 << 3) * size6;
                        for (int i32 = 0; i32 < size6; i32++) {
                            Object obj3 = list6.get(i32);
                            if (obj3 instanceof zznt) {
                                int iZza = ((zznt) obj3).zza();
                                iZzA6 = d.a(iZza, iZza, iZzA6);
                            } else {
                                iZzA6 = zzln.zzy((zzoi) obj3, zzowVarZzx) + iZzA6;
                            }
                        }
                    }
                    iA += iZzA6;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    List list7 = (List) unsafe.getObject(obj, j11);
                    int i33 = zzoy.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZzA7 = 0;
                    } else {
                        iZzA7 = zzln.zzA(i17 << 3) * size7;
                        for (int i34 = 0; i34 < list7.size(); i34++) {
                            int iZzd5 = ((zzle) list7.get(i34)).zzd();
                            iZzA7 = d.a(iZzd5, iZzd5, iZzA7);
                        }
                    }
                    iA += iZzA7;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    List list8 = (List) unsafe.getObject(obj, j11);
                    int i35 = zzoy.zza;
                    size2 = list8.size();
                    if (size2 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzk = zzoy.zzk(list8);
                        iZzA8 = zzln.zzA(i17 << 3);
                        iZzd2 = iZzk + (iZzA8 * size2);
                    }
                    iA += iZzd2;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j11);
                    int i36 = zzoy.zza;
                    size2 = list9.size();
                    if (size2 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzk = zzoy.zza(list9);
                        iZzA8 = zzln.zzA(i17 << 3);
                        iZzd2 = iZzk + (iZzA8 * size2);
                    }
                    iA += iZzd2;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 31:
                    iZzd2 = zzoy.zzb(i17, (List) unsafe.getObject(obj, j11), false);
                    iA += iZzd2;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case Consts.SP /* 32 */:
                    z11 = false;
                    iZzb = zzoy.zzd(i17, (List) unsafe.getObject(obj, j11), false);
                    iA += iZzb;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j11);
                    int i37 = zzoy.zza;
                    size3 = list10.size();
                    if (size3 == 0) {
                        i12 = 0;
                    } else {
                        iZzi = zzoy.zzi(list10);
                        iZzA9 = zzln.zzA(i17 << 3);
                        i12 = (iZzA9 * size3) + iZzi;
                    }
                    iA += i12;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    List list11 = (List) unsafe.getObject(obj, j11);
                    int i38 = zzoy.zza;
                    size3 = list11.size();
                    if (size3 == 0) {
                        i12 = 0;
                    } else {
                        iZzi = zzoy.zzj(list11);
                        iZzA9 = zzln.zzA(i17 << 3);
                        i12 = (iZzA9 * size3) + iZzi;
                    }
                    iA += i12;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 35:
                    iZze = zzoy.zze((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i17 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iZze = zzoy.zzc((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i17 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 37:
                    iZze = zzoy.zzg((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i17 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 38:
                    iZze = zzoy.zzl((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i17 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iZze = zzoy.zzf((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i17 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    iZze = zzoy.zze((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i17 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    iZze = zzoy.zzc((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i17 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    List list12 = (List) unsafe.getObject(obj, j11);
                    int i39 = zzoy.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i17 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 43:
                    iZze = zzoy.zzk((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i17 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iZze = zzoy.zza((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i17 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    iZze = zzoy.zzc((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i17 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 46:
                    iZze = zzoy.zze((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i17 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 47:
                    iZze = zzoy.zzi((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i17 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 48:
                    iZze = zzoy.zzj((List) unsafe.getObject(obj, j11));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i17 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j11);
                    zzow zzowVarZzx2 = zzolVar.zzx(i15);
                    int i40 = zzoy.zza;
                    int size8 = list13.size();
                    if (size8 == 0) {
                        i12 = 0;
                    } else {
                        int iZzw = 0;
                        for (int i41 = 0; i41 < size8; i41++) {
                            iZzw += zzln.zzw(i17, (zzoi) list13.get(i41), zzowVarZzx2);
                        }
                        i12 = iZzw;
                    }
                    iA += i12;
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 50:
                    zzoc zzocVar = (zzoc) unsafe.getObject(obj, j11);
                    if (!zzocVar.isEmpty()) {
                        Iterator it = zzocVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 51:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        iA = d.a(i17 << 3, 8, iA);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 52:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        iA = d.a(i17 << 3, 4, iA);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 53:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        long jZzv = zzv(obj, j11);
                        iZzA12 = zzln.zzA(i17 << 3);
                        iZzB2 = zzln.zzB(jZzv);
                        iA += iZzB2 + iZzA12;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 54:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        long jZzv2 = zzv(obj, j11);
                        iZzA12 = zzln.zzA(i17 << 3);
                        iZzB2 = zzln.zzB(jZzv2);
                        iA += iZzB2 + iZzA12;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 55:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        long jZzp = zzp(obj, j11);
                        iZzA12 = zzln.zzA(i17 << 3);
                        iZzB2 = zzln.zzB(jZzp);
                        iA += iZzB2 + iZzA12;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 56:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        iA = d.a(i17 << 3, 8, iA);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 57:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        iA = d.a(i17 << 3, 4, iA);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 58:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        iA = d.a(i17 << 3, 1, iA);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 59:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        int i42 = i17 << 3;
                        Object object2 = unsafe.getObject(obj, j11);
                        if (object2 instanceof zzle) {
                            iZze = zzln.zzA(i42);
                            iZzA10 = ((zzle) object2).zzd();
                            iZzA11 = zzln.zzA(iZzA10);
                            iA += iZzA11 + iZzA10 + iZze;
                        } else {
                            iZzA12 = zzln.zzA(i42);
                            iZzB2 = zzln.zzz((String) object2);
                            iA += iZzB2 + iZzA12;
                        }
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 60:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        iZzd2 = zzoy.zzh(i17, unsafe.getObject(obj, j11), zzolVar.zzx(i15));
                        iA += iZzd2;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 61:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        zzle zzleVar2 = (zzle) unsafe.getObject(obj, j11);
                        iZze = zzln.zzA(i17 << 3);
                        iZzA10 = zzleVar2.zzd();
                        iZzA11 = zzln.zzA(iZzA10);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 62:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        iA = d.a(zzp(obj, j11), zzln.zzA(i17 << 3), iA);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 63:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        long jZzp2 = zzp(obj, j11);
                        iZzA12 = zzln.zzA(i17 << 3);
                        iZzB2 = zzln.zzB(jZzp2);
                        iA += iZzB2 + iZzA12;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 64:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        iA = d.a(i17 << 3, 4, iA);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 65:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        iA = d.a(i17 << 3, 8, iA);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 66:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        int iZzp = zzp(obj, j11);
                        iA = d.a((iZzp >> 31) ^ (iZzp + iZzp), zzln.zzA(i17 << 3), iA);
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 67:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        long jZzv3 = zzv(obj, j11);
                        iZzA12 = zzln.zzA(i17 << 3);
                        iZzB2 = zzln.zzB((jZzv3 >> 63) ^ (jZzv3 + jZzv3));
                        iA += iZzB2 + iZzA12;
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                case 68:
                    if (zzolVar.zzR(obj, i17, i15)) {
                        iA += zzln.zzw(i17, (zzoi) unsafe.getObject(obj, j11), zzolVar.zzx(i15));
                    }
                    i15 += 3;
                    i13 = 1048575;
                    break;
                default:
                    i15 += 3;
                    i13 = 1048575;
                    break;
            }
        }
        int iZza2 = 0;
        int iZza3 = ((zznd) obj).zzc.zza() + iA;
        if (!zzolVar.zzh) {
            return iZza3;
        }
        zzmt zzmtVar = ((zzna) obj).zzb;
        int iZzc = zzmtVar.zza.zzc();
        for (int i43 = 0; i43 < iZzc; i43++) {
            Map.Entry entryZzg = zzmtVar.zza.zzg(i43);
            iZza2 += zzmt.zza((zzms) ((zzpa) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzmtVar.zza.zzd()) {
            iZza2 += zzmt.zza((zzms) entry2.getKey(), entry2.getValue());
        }
        return iZza3 + iZza2;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i11;
        long jDoubleToLongBits;
        int i12;
        int iFloatToIntBits;
        int iZzc;
        int i13;
        int i14 = 0;
        for (int i15 = 0; i15 < this.zzc.length; i15 += 3) {
            int iZzu = zzu(i15);
            int[] iArr = this.zzc;
            int i16 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i17 = iArr[i15];
            long j11 = i16;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i11 = i14 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j11));
                    byte[] bArr = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iZzc;
                    break;
                case 1:
                    i12 = i14 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j11));
                    i14 = iFloatToIntBits + i12;
                    break;
                case 2:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j11);
                    byte[] bArr2 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iZzc;
                    break;
                case 3:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j11);
                    byte[] bArr3 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iZzc;
                    break;
                case 4:
                    i11 = i14 * 53;
                    iZzc = zzps.zzc(obj, j11);
                    i14 = i11 + iZzc;
                    break;
                case 5:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j11);
                    byte[] bArr4 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iZzc;
                    break;
                case 6:
                    i11 = i14 * 53;
                    iZzc = zzps.zzc(obj, j11);
                    i14 = i11 + iZzc;
                    break;
                case 7:
                    i12 = i14 * 53;
                    iFloatToIntBits = zznl.zza(zzps.zzw(obj, j11));
                    i14 = iFloatToIntBits + i12;
                    break;
                case 8:
                    i12 = i14 * 53;
                    iFloatToIntBits = ((String) zzps.zzf(obj, j11)).hashCode();
                    i14 = iFloatToIntBits + i12;
                    break;
                case 9:
                    i13 = i14 * 53;
                    Object objZzf = zzps.zzf(obj, j11);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i14 = i13 + iHashCode;
                    break;
                case 10:
                    i12 = i14 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j11).hashCode();
                    i14 = iFloatToIntBits + i12;
                    break;
                case 11:
                    i11 = i14 * 53;
                    iZzc = zzps.zzc(obj, j11);
                    i14 = i11 + iZzc;
                    break;
                case 12:
                    i11 = i14 * 53;
                    iZzc = zzps.zzc(obj, j11);
                    i14 = i11 + iZzc;
                    break;
                case 13:
                    i11 = i14 * 53;
                    iZzc = zzps.zzc(obj, j11);
                    i14 = i11 + iZzc;
                    break;
                case 14:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j11);
                    byte[] bArr5 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iZzc;
                    break;
                case 15:
                    i11 = i14 * 53;
                    iZzc = zzps.zzc(obj, j11);
                    i14 = i11 + iZzc;
                    break;
                case 16:
                    i11 = i14 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j11);
                    byte[] bArr6 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i11 + iZzc;
                    break;
                case 17:
                    i13 = i14 * 53;
                    Object objZzf2 = zzps.zzf(obj, j11);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i14 = i13 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                case 27:
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                case 30:
                case 31:
                case Consts.SP /* 32 */:
                case 33:
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i12 = i14 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j11).hashCode();
                    i14 = iFloatToIntBits + i12;
                    break;
                case 50:
                    i12 = i14 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j11).hashCode();
                    i14 = iFloatToIntBits + i12;
                    break;
                case 51:
                    if (zzR(obj, i17, i15)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j11));
                        byte[] bArr7 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iZzc;
                    }
                    break;
                case 52:
                    if (zzR(obj, i17, i15)) {
                        i12 = i14 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j11));
                        i14 = iFloatToIntBits + i12;
                    }
                    break;
                case 53:
                    if (zzR(obj, i17, i15)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = zzv(obj, j11);
                        byte[] bArr8 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iZzc;
                    }
                    break;
                case 54:
                    if (zzR(obj, i17, i15)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = zzv(obj, j11);
                        byte[] bArr9 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iZzc;
                    }
                    break;
                case 55:
                    if (zzR(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iZzc = zzp(obj, j11);
                        i14 = i11 + iZzc;
                    }
                    break;
                case 56:
                    if (zzR(obj, i17, i15)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = zzv(obj, j11);
                        byte[] bArr10 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iZzc;
                    }
                    break;
                case 57:
                    if (zzR(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iZzc = zzp(obj, j11);
                        i14 = i11 + iZzc;
                    }
                    break;
                case 58:
                    if (zzR(obj, i17, i15)) {
                        i12 = i14 * 53;
                        iFloatToIntBits = zznl.zza(zzS(obj, j11));
                        i14 = iFloatToIntBits + i12;
                    }
                    break;
                case 59:
                    if (zzR(obj, i17, i15)) {
                        i12 = i14 * 53;
                        iFloatToIntBits = ((String) zzps.zzf(obj, j11)).hashCode();
                        i14 = iFloatToIntBits + i12;
                    }
                    break;
                case 60:
                    if (zzR(obj, i17, i15)) {
                        i12 = i14 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j11).hashCode();
                        i14 = iFloatToIntBits + i12;
                    }
                    break;
                case 61:
                    if (zzR(obj, i17, i15)) {
                        i12 = i14 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j11).hashCode();
                        i14 = iFloatToIntBits + i12;
                    }
                    break;
                case 62:
                    if (zzR(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iZzc = zzp(obj, j11);
                        i14 = i11 + iZzc;
                    }
                    break;
                case 63:
                    if (zzR(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iZzc = zzp(obj, j11);
                        i14 = i11 + iZzc;
                    }
                    break;
                case 64:
                    if (zzR(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iZzc = zzp(obj, j11);
                        i14 = i11 + iZzc;
                    }
                    break;
                case 65:
                    if (zzR(obj, i17, i15)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = zzv(obj, j11);
                        byte[] bArr11 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iZzc;
                    }
                    break;
                case 66:
                    if (zzR(obj, i17, i15)) {
                        i11 = i14 * 53;
                        iZzc = zzp(obj, j11);
                        i14 = i11 + iZzc;
                    }
                    break;
                case 67:
                    if (zzR(obj, i17, i15)) {
                        i11 = i14 * 53;
                        jDoubleToLongBits = zzv(obj, j11);
                        byte[] bArr12 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i11 + iZzc;
                    }
                    break;
                case 68:
                    if (zzR(obj, i17, i15)) {
                        i12 = i14 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j11).hashCode();
                        i14 = iFloatToIntBits + i12;
                    }
                    break;
            }
        }
        int iHashCode2 = ((zznd) obj).zzc.hashCode() + (i14 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzna) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38521. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzc(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.recaptcha.internal.zzkt r36) {
        /*
            Method dump skipped, instruction units count: 3852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zznd) {
                zznd zzndVar = (zznd) obj;
                zzndVar.zzJ(Integer.MAX_VALUE);
                zzndVar.zza = 0;
                zzndVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i11 = 0; i11 < iArr.length; i11 += 3) {
                int iZzu = zzu(i11);
                int i12 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j11 = i12;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
                            case 17:
                                if (zzN(obj, i11)) {
                                    zzx(i11).zzf(zzb.getObject(obj, j11));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case Service.METRICS_FIELD_NUMBER /* 24 */:
                            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                            case Service.BILLING_FIELD_NUMBER /* 26 */:
                            case 27:
                            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                            case 30:
                            case 31:
                            case Consts.SP /* 32 */:
                            case 33:
                            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            case 35:
                            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            case 37:
                            case 38:
                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            case 43:
                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zznk) zzps.zzf(obj, j11)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j11);
                                if (object != null) {
                                    ((zzoc) object).zzc();
                                    unsafe.putObject(obj, j11, object);
                                }
                                break;
                        }
                    } else if (zzR(obj, this.zzc[i11], i11)) {
                        zzx(i11).zzf(zzb.getObject(obj, j11));
                    }
                } else if (zzN(obj, i11)) {
                    zzx(i11).zzf(zzb.getObject(obj, j11));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int iZzu = zzu(i11);
            int i12 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i13 = iArr[i11];
            long j11 = i12;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i11)) {
                        zzps.zzo(obj, j11, zzps.zza(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i11)) {
                        zzps.zzp(obj, j11, zzps.zzb(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i11)) {
                        zzps.zzr(obj, j11, zzps.zzd(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i11)) {
                        zzps.zzr(obj, j11, zzps.zzd(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i11)) {
                        zzps.zzq(obj, j11, zzps.zzc(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i11)) {
                        zzps.zzr(obj, j11, zzps.zzd(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i11)) {
                        zzps.zzq(obj, j11, zzps.zzc(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i11)) {
                        zzps.zzm(obj, j11, zzps.zzw(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i11)) {
                        zzps.zzs(obj, j11, zzps.zzf(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i11);
                    break;
                case 10:
                    if (zzN(obj2, i11)) {
                        zzps.zzs(obj, j11, zzps.zzf(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i11)) {
                        zzps.zzq(obj, j11, zzps.zzc(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i11)) {
                        zzps.zzq(obj, j11, zzps.zzc(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i11)) {
                        zzps.zzq(obj, j11, zzps.zzc(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i11)) {
                        zzps.zzr(obj, j11, zzps.zzd(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i11)) {
                        zzps.zzq(obj, j11, zzps.zzc(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i11)) {
                        zzps.zzr(obj, j11, zzps.zzd(obj2, j11));
                        zzH(obj, i11);
                    }
                    break;
                case 17:
                    zzE(obj, obj2, i11);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                case 27:
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                case 30:
                case 31:
                case Consts.SP /* 32 */:
                case 33:
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    zznk zznkVarZzd = (zznk) zzps.zzf(obj, j11);
                    zznk zznkVar = (zznk) zzps.zzf(obj2, j11);
                    int size = zznkVarZzd.size();
                    int size2 = zznkVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVarZzd.zzc()) {
                            zznkVarZzd = zznkVarZzd.zzd(size2 + size);
                        }
                        zznkVarZzd.addAll(zznkVar);
                    }
                    if (size > 0) {
                        zznkVar = zznkVarZzd;
                    }
                    zzps.zzs(obj, j11, zznkVar);
                    break;
                case 50:
                    int i14 = zzoy.zza;
                    zzps.zzs(obj, j11, zzod.zzb(zzps.zzf(obj, j11), zzps.zzf(obj2, j11)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i13, i11)) {
                        zzps.zzs(obj, j11, zzps.zzf(obj2, j11));
                        zzI(obj, i13, i11);
                    }
                    break;
                case 60:
                    zzF(obj, obj2, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i13, i11)) {
                        zzps.zzs(obj, j11, zzps.zzf(obj2, j11));
                        zzI(obj, i13, i11);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i11);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:243:0x0731 A[LOOP:2: B:241:0x072d->B:243:0x0731, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:245:0x073f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0750 A[LOOP:3: B:251:0x074c->B:253:0x0750, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:255:0x075f  */
    /* JADX WARN: Code duplicated, block: B:258:0x071d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x072b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x016a  */
    /* JADX WARN: Code duplicated, block: B:65:0x016f A[Catch: all -> 0x0054, TryCatch #11 {all -> 0x0054, blocks: (B:20:0x004b, B:24:0x005c, B:26:0x0064, B:27:0x0068, B:60:0x015e, B:68:0x0189, B:65:0x016f, B:67:0x0177, B:29:0x006e, B:30:0x0078, B:31:0x0082, B:32:0x008c, B:33:0x0096, B:34:0x009d, B:35:0x009e, B:36:0x00a8, B:37:0x00ae, B:39:0x00b8, B:41:0x00cd, B:42:0x00da, B:43:0x00df, B:44:0x00e0, B:46:0x00ea, B:48:0x00ff, B:49:0x010c, B:50:0x0111, B:51:0x0112, B:52:0x0117, B:53:0x0120, B:54:0x0129, B:55:0x0132, B:56:0x013b, B:57:0x0144, B:58:0x014d, B:59:0x0156, B:71:0x0192, B:72:0x0195, B:74:0x0198), top: B:269:0x004b }] */
    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) throws Throwable {
        Object obj2;
        Object obj3;
        zzol<T> zzolVar;
        Throwable th2;
        int i11;
        zzpl zzplVar;
        Object obj4;
        Object obj5;
        Object objValueOf;
        int iOrdinal;
        Object objZze;
        int i12;
        zzmoVar.getClass();
        zzD(obj);
        zzpl zzplVar2 = this.zzm;
        Object objZza = null;
        zzmt zzmtVarZzi = null;
        while (true) {
            try {
                int iZzc = zzovVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    obj5 = obj;
                    zzplVar = zzplVar2;
                    zzolVar = this;
                    obj4 = objZza;
                    try {
                        int iZzu = zzu(iZzq);
                        try {
                            switch (zzt(iZzu)) {
                                case 0:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzps.zzo(obj2, iZzu & 1048575, zzovVar.zza());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 1:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzps.zzp(obj2, iZzu & 1048575, zzovVar.zzb());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 2:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzps.zzr(obj2, iZzu & 1048575, zzovVar.zzl());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 3:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzps.zzr(obj2, iZzu & 1048575, zzovVar.zzo());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 4:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzps.zzq(obj2, iZzu & 1048575, zzovVar.zzg());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 5:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzps.zzr(obj2, iZzu & 1048575, zzovVar.zzk());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 6:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzps.zzq(obj2, iZzu & 1048575, zzovVar.zzf());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 7:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzps.zzm(obj2, iZzu & 1048575, zzovVar.zzN());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 8:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzG(obj2, iZzu, zzovVar);
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 9:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzoi zzoiVar = (zzoi) zzA(obj2, iZzq);
                                    zzovVar.zzu(zzoiVar, zzx(iZzq), zzmoVar);
                                    zzJ(obj2, iZzq, zzoiVar);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 10:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzps.zzs(obj2, iZzu & 1048575, zzovVar.zzp());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 11:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzps.zzq(obj2, iZzu & 1048575, zzovVar.zzj());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 12:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    int iZze = zzovVar.zze();
                                    zznh zznhVarZzw = zzw(iZzq);
                                    if (zznhVarZzw == null || zznhVarZzw.zza(iZze)) {
                                        zzps.zzq(obj2, iZzu & 1048575, iZze);
                                        zzH(obj2, iZzq);
                                        objZza = obj3;
                                    } else {
                                        objZza = zzoy.zzo(obj2, iZzc, iZze, obj3, zzplVar2);
                                    }
                                    obj = obj2;
                                    break;
                                case 13:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzps.zzq(obj2, iZzu & 1048575, zzovVar.zzh());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 14:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzps.zzr(obj2, iZzu & 1048575, zzovVar.zzm());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 15:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzps.zzq(obj2, iZzu & 1048575, zzovVar.zzi());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 16:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzps.zzr(obj2, iZzu & 1048575, zzovVar.zzn());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 17:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzoi zzoiVar2 = (zzoi) zzA(obj2, iZzq);
                                    zzovVar.zzt(zzoiVar2, zzx(iZzq), zzmoVar);
                                    zzJ(obj2, iZzq, zzoiVar2);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 18:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzx(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 19:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzB(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 20:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzE(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 21:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzM(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 22:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzD(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 23:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzA(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case Service.METRICS_FIELD_NUMBER /* 24 */:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzz(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzv(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case Service.BILLING_FIELD_NUMBER /* 26 */:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    if (zzM(iZzu)) {
                                        ((zzlj) zzovVar).zzK(zznv.zza(obj2, iZzu & 1048575), true);
                                    } else {
                                        ((zzlj) zzovVar).zzK(zznv.zza(obj2, iZzu & 1048575), false);
                                    }
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 27:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzF(zznv.zza(obj2, iZzu & 1048575), zzx(iZzq), zzmoVar);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzw(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzL(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 30:
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    try {
                                        List listZza = zznv.zza(obj5, iZzu & 1048575);
                                        zzovVar.zzy(listZza);
                                        objZza = zzoy.zzn(obj5, iZzc, listZza, zzw(iZzq), obj3, zzplVar2);
                                        obj2 = obj5;
                                        zzplVar2 = zzplVar2;
                                    } catch (zznm unused) {
                                        obj2 = obj5;
                                        objZza = obj3;
                                        if (objZza == null) {
                                            try {
                                                objZza = zzplVar2.zza(obj2);
                                            } catch (Throwable th3) {
                                                th2 = th3;
                                            }
                                        }
                                        if (!zzplVar2.zzk(objZza, zzovVar, 0)) {
                                            for (i12 = zzolVar.zzk; i12 < zzolVar.zzl; i12++) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i12], objZza, zzplVar2, obj2);
                                            }
                                            if (objZza != null) {
                                                zzplVar2.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj5;
                                        th2 = th;
                                        objZza = obj3;
                                        i11 = zzolVar.zzk;
                                        while (i11 < zzolVar.zzl) {
                                            zzolVar.zzy(obj2, zzolVar.zzj[i11], objZza, zzplVar2, obj2);
                                            i11++;
                                            zzolVar = this;
                                        }
                                        if (objZza == null) {
                                            throw th2;
                                        }
                                        zzplVar2.zzj(obj2, objZza);
                                        throw th2;
                                    }
                                    obj = obj2;
                                    break;
                                case 31:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzG(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case Consts.SP /* 32 */:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzH(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 33:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzI(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzJ(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 35:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzx(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzB(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 37:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzE(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 38:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzM(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzD(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzA(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzz(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    zzovVar.zzv(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 43:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    try {
                                        zzovVar.zzL(zznv.zza(obj2, iZzu & 1048575));
                                        objZza = obj3;
                                    } catch (zznm unused2) {
                                        objZza = obj3;
                                        if (objZza == null) {
                                            objZza = zzplVar2.zza(obj2);
                                        }
                                        if (!zzplVar2.zzk(objZza, zzovVar, 0)) {
                                            while (i12 < zzolVar.zzl) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i12], objZza, zzplVar2, obj2);
                                            }
                                            if (objZza != null) {
                                                zzplVar2.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th2 = th;
                                        objZza = obj3;
                                        i11 = zzolVar.zzk;
                                        while (i11 < zzolVar.zzl) {
                                            zzolVar.zzy(obj2, zzolVar.zzj[i11], objZza, zzplVar2, obj2);
                                            i11++;
                                            zzolVar = this;
                                        }
                                        if (objZza == null) {
                                            throw th2;
                                        }
                                        zzplVar2.zzj(obj2, objZza);
                                        throw th2;
                                    }
                                    obj = obj2;
                                    break;
                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                    List listZza2 = zznv.zza(obj5, iZzu & 1048575);
                                    zzovVar.zzy(listZza2);
                                    try {
                                        objZza = zzoy.zzn(obj5, iZzc, listZza2, zzw(iZzq), obj4, zzplVar);
                                        obj2 = obj5;
                                        zzplVar2 = zzplVar;
                                    } catch (zznm unused3) {
                                        obj2 = obj5;
                                        obj3 = obj4;
                                        zzplVar2 = zzplVar;
                                        objZza = obj3;
                                        if (objZza == null) {
                                            objZza = zzplVar2.zza(obj2);
                                        }
                                        if (!zzplVar2.zzk(objZza, zzovVar, 0)) {
                                            while (i12 < zzolVar.zzl) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i12], objZza, zzplVar2, obj2);
                                            }
                                            if (objZza != null) {
                                                zzplVar2.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        obj2 = obj5;
                                        obj3 = obj4;
                                        zzplVar2 = zzplVar;
                                        th2 = th;
                                        objZza = obj3;
                                        i11 = zzolVar.zzk;
                                        while (i11 < zzolVar.zzl) {
                                            zzolVar.zzy(obj2, zzolVar.zzj[i11], objZza, zzplVar2, obj2);
                                            i11++;
                                            zzolVar = this;
                                        }
                                        if (objZza == null) {
                                            throw th2;
                                        }
                                        zzplVar2.zzj(obj2, objZza);
                                        throw th2;
                                    }
                                    obj = obj2;
                                    break;
                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    zzovVar.zzG(zznv.zza(obj5, iZzu & 1048575));
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 46:
                                    zzovVar.zzH(zznv.zza(obj5, iZzu & 1048575));
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 47:
                                    zzovVar.zzI(zznv.zza(obj5, iZzu & 1048575));
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 48:
                                    zzovVar.zzJ(zznv.zza(obj5, iZzu & 1048575));
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 49:
                                    zzovVar.zzC(zznv.zza(obj5, iZzu & 1048575), zzx(iZzq), zzmoVar);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 50:
                                    Object objZzz = zzz(iZzq);
                                    long jZzu = zzu(iZzq) & 1048575;
                                    Object objZzf = zzps.zzf(obj5, jZzu);
                                    if (objZzf == null) {
                                        objZzf = zzoc.zza().zzb();
                                        zzps.zzs(obj5, jZzu, objZzf);
                                    } else if (zzod.zza(objZzf)) {
                                        Object objZzb = zzoc.zza().zzb();
                                        zzod.zzb(objZzb, objZzf);
                                        zzps.zzs(obj5, jZzu, objZzb);
                                        objZzf = objZzb;
                                    }
                                    throw null;
                                case 51:
                                    zzps.zzs(obj5, iZzu & 1048575, Double.valueOf(zzovVar.zza()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 52:
                                    zzps.zzs(obj5, iZzu & 1048575, Float.valueOf(zzovVar.zzb()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 53:
                                    zzps.zzs(obj5, iZzu & 1048575, Long.valueOf(zzovVar.zzl()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 54:
                                    zzps.zzs(obj5, iZzu & 1048575, Long.valueOf(zzovVar.zzo()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 55:
                                    zzps.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzovVar.zzg()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 56:
                                    zzps.zzs(obj5, iZzu & 1048575, Long.valueOf(zzovVar.zzk()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 57:
                                    zzps.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzovVar.zzf()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 58:
                                    zzps.zzs(obj5, iZzu & 1048575, Boolean.valueOf(zzovVar.zzN()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 59:
                                    zzG(obj5, iZzu, zzovVar);
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 60:
                                    zzoi zzoiVar3 = (zzoi) zzB(obj5, iZzc, iZzq);
                                    zzovVar.zzu(zzoiVar3, zzx(iZzq), zzmoVar);
                                    zzK(obj5, iZzc, iZzq, zzoiVar3);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 61:
                                    zzps.zzs(obj5, iZzu & 1048575, zzovVar.zzp());
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 62:
                                    zzps.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzovVar.zzj()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 63:
                                    int iZze2 = zzovVar.zze();
                                    zznh zznhVarZzw2 = zzw(iZzq);
                                    if (zznhVarZzw2 != null && !zznhVarZzw2.zza(iZze2)) {
                                        objZza = zzoy.zzo(obj5, iZzc, iZze2, obj4, zzplVar);
                                        obj = obj5;
                                        zzplVar2 = zzplVar;
                                    }
                                    zzps.zzs(obj5, iZzu & 1048575, Integer.valueOf(iZze2));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 64:
                                    zzps.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzovVar.zzh()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 65:
                                    zzps.zzs(obj5, iZzu & 1048575, Long.valueOf(zzovVar.zzm()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 66:
                                    zzps.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzovVar.zzi()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 67:
                                    zzps.zzs(obj5, iZzu & 1048575, Long.valueOf(zzovVar.zzn()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 68:
                                    zzoi zzoiVar4 = (zzoi) zzB(obj5, iZzc, iZzq);
                                    zzovVar.zzt(zzoiVar4, zzx(iZzq), zzmoVar);
                                    zzK(obj5, iZzc, iZzq, zzoiVar4);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                default:
                                    if (obj4 == null) {
                                        try {
                                            objZza = zzplVar.zza(obj5);
                                        } catch (Throwable th7) {
                                            th = th7;
                                            th2 = th;
                                            obj2 = obj5;
                                            obj3 = obj4;
                                            zzplVar2 = zzplVar;
                                            objZza = obj3;
                                            i11 = zzolVar.zzk;
                                            while (i11 < zzolVar.zzl) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i11], objZza, zzplVar2, obj2);
                                                i11++;
                                                zzolVar = this;
                                            }
                                            if (objZza == null) {
                                                throw th2;
                                            }
                                            zzplVar2.zzj(obj2, objZza);
                                            throw th2;
                                        }
                                    } else {
                                        objZza = obj4;
                                    }
                                    try {
                                        if (!zzplVar.zzk(objZza, zzovVar, 0)) {
                                            for (int i13 = zzolVar.zzk; i13 < zzolVar.zzl; i13++) {
                                                zzpl zzplVar3 = zzplVar;
                                                Object obj6 = obj5;
                                                zzolVar.zzy(obj6, zzolVar.zzj[i13], objZza, zzplVar3, obj5);
                                                obj5 = obj6;
                                                zzplVar = zzplVar3;
                                            }
                                            obj2 = obj5;
                                            zzplVar2 = zzplVar;
                                        }
                                        obj = obj5;
                                        zzplVar2 = zzplVar;
                                    } catch (zznm unused4) {
                                        obj2 = obj5;
                                        zzplVar2 = zzplVar;
                                        if (objZza == null) {
                                            objZza = zzplVar2.zza(obj2);
                                        }
                                        if (!zzplVar2.zzk(objZza, zzovVar, 0)) {
                                            while (i12 < zzolVar.zzl) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i12], objZza, zzplVar2, obj2);
                                            }
                                        }
                                        obj = obj2;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        th2 = th;
                                        obj2 = obj5;
                                        zzplVar2 = zzplVar;
                                        i11 = zzolVar.zzk;
                                        while (i11 < zzolVar.zzl) {
                                            zzolVar.zzy(obj2, zzolVar.zzj[i11], objZza, zzplVar2, obj2);
                                            i11++;
                                            zzolVar = this;
                                        }
                                        if (objZza == null) {
                                            throw th2;
                                        }
                                        zzplVar2.zzj(obj2, objZza);
                                        throw th2;
                                    }
                                    break;
                            }
                        } catch (zznm unused5) {
                            obj2 = obj5;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        obj2 = obj5;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    int i14 = this.zzk;
                    while (i14 < this.zzl) {
                        zzy(obj, this.zzj[i14], objZza, zzplVar2, obj);
                        i14++;
                        zzplVar2 = zzplVar2;
                    }
                    obj2 = obj;
                    zzplVar2 = zzplVar2;
                } else {
                    zzplVar = zzplVar2;
                    obj4 = objZza;
                    try {
                        zznc zzncVarZza = !this.zzh ? null : zzmoVar.zza(this.zzg, iZzc);
                        if (zzncVarZza != null) {
                            if (zzmtVarZzi == null) {
                                try {
                                    zzmtVarZzi = ((zzna) obj).zzi();
                                } catch (Throwable th10) {
                                    th2 = th10;
                                    obj2 = obj;
                                    zzolVar = this;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    i11 = zzolVar.zzk;
                                    while (i11 < zzolVar.zzl) {
                                        zzolVar.zzy(obj2, zzolVar.zzj[i11], objZza, zzplVar2, obj2);
                                        i11++;
                                        zzolVar = this;
                                    }
                                    if (objZza == null) {
                                        throw th2;
                                    }
                                    zzplVar2.zzj(obj2, objZza);
                                    throw th2;
                                }
                            }
                            zznb zznbVar = zzncVarZza.zza;
                            zzpw zzpwVar = zzpw.zzn;
                            zzpw zzpwVar2 = zznbVar.zzb;
                            if (zzpwVar2 == zzpwVar) {
                                zzovVar.zzg();
                                throw null;
                            }
                            switch (zzpwVar2.ordinal()) {
                                case 0:
                                    objValueOf = Double.valueOf(zzovVar.zza());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if ((iOrdinal != 9 || iOrdinal == 10) && (objZze = zzmtVarZzi.zze(zzncVarZza.zza)) != null) {
                                        byte[] bArr = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                case 1:
                                    objValueOf = Float.valueOf(zzovVar.zzb());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr2 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr3 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                case 2:
                                    objValueOf = Long.valueOf(zzovVar.zzl());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr4 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr5 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                case 3:
                                    objValueOf = Long.valueOf(zzovVar.zzo());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr6 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr7 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                case 4:
                                    objValueOf = Integer.valueOf(zzovVar.zzg());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr8 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr9 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                case 5:
                                    objValueOf = Long.valueOf(zzovVar.zzk());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr10 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr11 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                case 6:
                                    objValueOf = Integer.valueOf(zzovVar.zzf());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr12 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr13 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                case 7:
                                    objValueOf = Boolean.valueOf(zzovVar.zzN());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr14 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr15 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                case 8:
                                    objValueOf = zzovVar.zzr();
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr16 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr17 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                case 9:
                                    Object objZze2 = zzmtVarZzi.zze(zzncVarZza.zza);
                                    if (!(objZze2 instanceof zznd)) {
                                        throw null;
                                    }
                                    zzow zzowVarZzb = zzos.zza().zzb(objZze2.getClass());
                                    if (!((zznd) objZze2).zzL()) {
                                        Object objZze3 = zzowVarZzb.zze();
                                        zzowVarZzb.zzg(objZze3, objZze2);
                                        zzmtVarZzi.zzi(zzncVarZza.zza, objZze3);
                                        objZze2 = objZze3;
                                    }
                                    zzovVar.zzt(objZze2, zzowVarZzb, zzmoVar);
                                    objZza = obj4;
                                    break;
                                    break;
                                case 10:
                                    Object objZze4 = zzmtVarZzi.zze(zzncVarZza.zza);
                                    if (!(objZze4 instanceof zznd)) {
                                        throw null;
                                    }
                                    zzow zzowVarZzb2 = zzos.zza().zzb(objZze4.getClass());
                                    if (!((zznd) objZze4).zzL()) {
                                        Object objZze5 = zzowVarZzb2.zze();
                                        zzowVarZzb2.zzg(objZze5, objZze4);
                                        zzmtVarZzi.zzi(zzncVarZza.zza, objZze5);
                                        objZze4 = objZze5;
                                    }
                                    zzovVar.zzu(objZze4, zzowVarZzb2, zzmoVar);
                                    objZza = obj4;
                                    break;
                                    break;
                                case 11:
                                    objValueOf = zzovVar.zzp();
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr18 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr19 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                case 12:
                                    objValueOf = Integer.valueOf(zzovVar.zzj());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr110 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr111 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case 14:
                                    objValueOf = Integer.valueOf(zzovVar.zzh());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr112 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr113 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                case 15:
                                    objValueOf = Long.valueOf(zzovVar.zzm());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr114 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr115 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                case 16:
                                    objValueOf = Integer.valueOf(zzovVar.zzi());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr116 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr117 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                case 17:
                                    objValueOf = Long.valueOf(zzovVar.zzn());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr118 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr119 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                                default:
                                    objValueOf = null;
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr1110 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    } else {
                                        byte[] bArr1111 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    break;
                            }
                        } else {
                            objZza = obj4 == null ? zzplVar.zza(obj) : obj4;
                            try {
                                if (zzplVar.zzk(objZza, zzovVar, 0)) {
                                    obj5 = obj;
                                    obj = obj5;
                                } else {
                                    int i15 = this.zzk;
                                    while (i15 < this.zzl) {
                                        zzpl zzplVar4 = zzplVar;
                                        Object obj7 = obj;
                                        zzy(obj7, this.zzj[i15], objZza, zzplVar4, obj);
                                        zzplVar = zzplVar4;
                                        i15++;
                                        obj = obj7;
                                    }
                                    obj5 = obj;
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                obj5 = obj;
                                zzolVar = this;
                                th2 = th;
                                obj2 = obj5;
                                zzplVar2 = zzplVar;
                                i11 = zzolVar.zzk;
                                while (i11 < zzolVar.zzl) {
                                    zzolVar.zzy(obj2, zzolVar.zzj[i11], objZza, zzplVar2, obj2);
                                    i11++;
                                    zzolVar = this;
                                }
                                if (objZza == null) {
                                    throw th2;
                                }
                                zzplVar2.zzj(obj2, objZza);
                                throw th2;
                            }
                        }
                        zzplVar2 = zzplVar;
                    } catch (Throwable th12) {
                        th = th12;
                        obj5 = obj;
                        zzolVar = this;
                        th2 = th;
                        obj2 = obj5;
                        obj3 = obj4;
                        zzplVar2 = zzplVar;
                        objZza = obj3;
                        i11 = zzolVar.zzk;
                        while (i11 < zzolVar.zzl) {
                            zzolVar.zzy(obj2, zzolVar.zzj[i11], objZza, zzplVar2, obj2);
                            i11++;
                            zzolVar = this;
                        }
                        if (objZza == null) {
                            throw th2;
                        }
                        zzplVar2.zzj(obj2, objZza);
                        throw th2;
                    }
                }
            } catch (Throwable th13) {
                th = th13;
                obj2 = obj;
                obj3 = objZza;
                zzolVar = this;
            }
            i11 = zzolVar.zzk;
            while (i11 < zzolVar.zzl) {
                zzolVar.zzy(obj2, zzolVar.zzj[i11], objZza, zzplVar2, obj2);
                i11++;
                zzolVar = this;
            }
            if (objZza == null) {
                throw th2;
            }
            zzplVar2.zzj(obj2, objZza);
            throw th2;
        }
        if (objZza != null) {
            zzplVar2.zzj(obj2, objZza);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i11, int i12, zzkt zzktVar) {
        zzc(obj, bArr, i11, i12, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzj(Object obj, zzpy zzpyVar) {
        Map.Entry entry;
        Iterator it;
        int i11;
        int i12;
        int i13;
        int i14;
        zzol<T> zzolVar = this;
        if (zzolVar.zzh) {
            zzmt zzmtVar = ((zzna) obj).zzb;
            if (zzmtVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzmtVar.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zzolVar.zzc;
        Unsafe unsafe = zzb;
        int i15 = 0;
        int i16 = 1048575;
        int i17 = 0;
        while (i15 < iArr.length) {
            int iZzu = zzolVar.zzu(i15);
            int[] iArr2 = zzolVar.zzc;
            int iZzt = zzt(iZzu);
            int i18 = iArr2[i15];
            if (iZzt <= 17) {
                int i19 = iArr2[i15 + 2];
                int i21 = i19 & 1048575;
                if (i21 != i16) {
                    i11 = 1;
                    i17 = i21 == 1048575 ? 0 : unsafe.getInt(obj, i21);
                    i16 = i21;
                } else {
                    i11 = 1;
                }
                i12 = i16;
                i13 = i17;
                i14 = i11 << (i19 >>> 20);
            } else {
                i11 = 1;
                i12 = i16;
                i13 = i17;
                i14 = 0;
            }
            while (entry != null && ((zznb) entry.getKey()).zza <= i18) {
                zzolVar.zzn.zzb(zzpyVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j11 = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzf(i18, zzps.zza(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 1:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzo(i18, zzps.zzb(obj, j11));
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 2:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzt(i18, unsafe.getLong(obj, j11));
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 3:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzK(i18, unsafe.getLong(obj, j11));
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 4:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzr(i18, unsafe.getInt(obj, j11));
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 5:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzm(i18, unsafe.getLong(obj, j11));
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 6:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzk(i18, unsafe.getInt(obj, j11));
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 7:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzb(i18, zzps.zzw(obj, j11));
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 8:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzT(i18, unsafe.getObject(obj, j11), zzpyVar);
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 9:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzv(i18, unsafe.getObject(obj, j11), zzolVar.zzx(i15));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 10:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzd(i18, (zzle) unsafe.getObject(obj, j11));
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 11:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzI(i18, unsafe.getInt(obj, j11));
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 12:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzi(i18, unsafe.getInt(obj, j11));
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 13:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzx(i18, unsafe.getInt(obj, j11));
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 14:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzz(i18, unsafe.getLong(obj, j11));
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 15:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzB(i18, unsafe.getInt(obj, j11));
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 16:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzD(i18, unsafe.getLong(obj, j11));
                    }
                    zzolVar = this;
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 17:
                    if (zzolVar.zzO(obj, i15, i12, i13, i14)) {
                        zzpyVar.zzq(i18, unsafe.getObject(obj, j11), zzolVar.zzx(i15));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 18:
                    zzoy.zzs(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 19:
                    zzoy.zzw(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 20:
                    zzoy.zzy(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 21:
                    zzoy.zzE(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 22:
                    zzoy.zzx(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 23:
                    zzoy.zzv(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    zzoy.zzu(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    zzoy.zzr(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    int i22 = zzolVar.zzc[i15];
                    List list = (List) unsafe.getObject(obj, j11);
                    int i23 = zzoy.zza;
                    if (list != null && !list.isEmpty()) {
                        zzpyVar.zzH(i22, list);
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 27:
                    int i24 = zzolVar.zzc[i15];
                    List list2 = (List) unsafe.getObject(obj, j11);
                    zzow zzowVarZzx = zzolVar.zzx(i15);
                    int i25 = zzoy.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i26 = 0; i26 < list2.size(); i26++) {
                            ((zzlo) zzpyVar).zzv(i24, list2.get(i26), zzowVarZzx);
                        }
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    int i27 = zzolVar.zzc[i15];
                    List list3 = (List) unsafe.getObject(obj, j11);
                    int i28 = zzoy.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzpyVar.zze(i27, list3);
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    zzoy.zzD(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 30:
                    zzoy.zzt(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 31:
                    zzoy.zzz(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case Consts.SP /* 32 */:
                    zzoy.zzA(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 33:
                    zzoy.zzB(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    zzoy.zzC(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, false);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 35:
                    zzoy.zzs(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    zzoy.zzw(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 37:
                    zzoy.zzy(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 38:
                    zzoy.zzE(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    zzoy.zzx(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    zzoy.zzv(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    zzoy.zzu(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    zzoy.zzr(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 43:
                    zzoy.zzD(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    zzoy.zzt(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    zzoy.zzz(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 46:
                    zzoy.zzA(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 47:
                    zzoy.zzB(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 48:
                    zzoy.zzC(zzolVar.zzc[i15], (List) unsafe.getObject(obj, j11), zzpyVar, i11);
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 49:
                    int i29 = zzolVar.zzc[i15];
                    List list4 = (List) unsafe.getObject(obj, j11);
                    zzow zzowVarZzx2 = zzolVar.zzx(i15);
                    int i30 = zzoy.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i31 = 0; i31 < list4.size(); i31++) {
                            ((zzlo) zzpyVar).zzq(i29, list4.get(i31), zzowVarZzx2);
                        }
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j11) != null) {
                        throw null;
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 51:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzf(i18, zzn(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 52:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzo(i18, zzo(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 53:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzt(i18, zzv(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 54:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzK(i18, zzv(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 55:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzr(i18, zzp(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 56:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzm(i18, zzv(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 57:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzk(i18, zzp(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 58:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzb(i18, zzS(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 59:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzT(i18, unsafe.getObject(obj, j11), zzpyVar);
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 60:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzv(i18, unsafe.getObject(obj, j11), zzolVar.zzx(i15));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 61:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzd(i18, (zzle) unsafe.getObject(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 62:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzI(i18, zzp(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 63:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzi(i18, zzp(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 64:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzx(i18, zzp(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 65:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzz(i18, zzv(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 66:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzB(i18, zzp(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 67:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzD(i18, zzv(obj, j11));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                case 68:
                    if (zzolVar.zzR(obj, i18, i15)) {
                        zzpyVar.zzq(i18, unsafe.getObject(obj, j11), zzolVar.zzx(i15));
                    }
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
                default:
                    i15 += 3;
                    i17 = i13;
                    i16 = i12;
                    entry = entry;
                    break;
            }
        }
        while (entry != null) {
            zzolVar.zzn.zzb(zzpyVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zznd) obj).zzc.zzl(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzF;
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int iZzu = zzu(i11);
            long j11 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i11) || Double.doubleToLongBits(zzps.zza(obj, j11)) != Double.doubleToLongBits(zzps.zza(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i11) || Float.floatToIntBits(zzps.zzb(obj, j11)) != Float.floatToIntBits(zzps.zzb(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i11) || zzps.zzd(obj, j11) != zzps.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i11) || zzps.zzd(obj, j11) != zzps.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i11) || zzps.zzc(obj, j11) != zzps.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i11) || zzps.zzd(obj, j11) != zzps.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i11) || zzps.zzc(obj, j11) != zzps.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i11) || zzps.zzw(obj, j11) != zzps.zzw(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i11) || !zzoy.zzF(zzps.zzf(obj, j11), zzps.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i11) || !zzoy.zzF(zzps.zzf(obj, j11), zzps.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i11) || !zzoy.zzF(zzps.zzf(obj, j11), zzps.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i11) || zzps.zzc(obj, j11) != zzps.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i11) || zzps.zzc(obj, j11) != zzps.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i11) || zzps.zzc(obj, j11) != zzps.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i11) || zzps.zzd(obj, j11) != zzps.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i11) || zzps.zzc(obj, j11) != zzps.zzc(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i11) || zzps.zzd(obj, j11) != zzps.zzd(obj2, j11)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i11) || !zzoy.zzF(zzps.zzf(obj, j11), zzps.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                case 27:
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                case 30:
                case 31:
                case Consts.SP /* 32 */:
                case 33:
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 37:
                case 38:
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzF = zzoy.zzF(zzps.zzf(obj, j11), zzps.zzf(obj2, j11));
                    break;
                case 50:
                    zZzF = zzoy.zzF(zzps.zzf(obj, j11), zzps.zzf(obj2, j11));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzr = zzr(i11) & 1048575;
                    if (zzps.zzc(obj, jZzr) != zzps.zzc(obj2, jZzr) || !zzoy.zzF(zzps.zzf(obj, j11), zzps.zzf(obj2, j11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        int i11;
        int i12;
        List list;
        zzow zzowVarZzx;
        int i13;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i14 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i17 = iArr[i14];
            int i18 = iArr2[i17];
            int iZzu = zzu(i17);
            int i19 = this.zzc[i17 + 2];
            int i21 = i19 & 1048575;
            int i22 = 1 << (i19 >>> 20);
            if (i21 != i16) {
                if (i21 != 1048575) {
                    i15 = zzb.getInt(obj, i21);
                }
                i12 = i15;
                i11 = i21;
            } else {
                i11 = i16;
                i12 = i15;
            }
            Object obj2 = obj;
            if ((268435456 & iZzu) != 0 && !zzO(obj2, i17, i11, i12, i22)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj2, i17, i11, i12, i22) && !zzP(obj2, iZzu, zzx(i17))) {
                    return false;
                }
            } else if (iZzt == 27) {
                list = (List) zzps.zzf(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzowVarZzx = zzx(i17);
                    for (i13 = 0; i13 < list.size(); i13++) {
                        if (!zzowVarZzx.zzl(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj2, i18, i17) && !zzP(obj2, iZzu, zzx(i17))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzps.zzf(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzowVarZzx = zzx(i17);
                    while (i13 < list.size()) {
                        if (!zzowVarZzx.zzl(list.get(i13))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((zzoc) zzps.zzf(obj2, iZzu & 1048575)).isEmpty()) {
                throw null;
            }
            i14++;
            obj = obj2;
            i16 = i11;
            i15 = i12;
        }
        return !this.zzh || ((zzna) obj).zzb.zzk();
    }

    private final void zzF(Object obj, Object obj2, int i11) {
        int i12 = this.zzc[i11];
        if (zzR(obj2, i12, i11)) {
            int iZzu = zzu(i11) & 1048575;
            Unsafe unsafe = zzb;
            long j11 = iZzu;
            Object object = unsafe.getObject(obj2, j11);
            if (object == null) {
                throw new IllegalStateException(ypOOxsaJG.dnzUm + this.zzc[i11] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i11);
            if (!zzR(obj, i12, i11)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j11, objZze);
                } else {
                    unsafe.putObject(obj, j11, object);
                }
                zzI(obj, i12, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, j11);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j11, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }
}

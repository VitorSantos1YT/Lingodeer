package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f12606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f12607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f12608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f12609f;

    public zzab(String str, int i11) {
        this.f12604a = str;
        this.f12605b = i11;
    }

    public static Boolean d(Boolean bool, boolean z11) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean e(String str, com.google.android.gms.internal.measurement.zzfr zzfrVar, zzgu zzguVar) {
        List listD;
        Preconditions.g(zzfrVar);
        if (str != null && zzfrVar.y() && zzfrVar.G() != 1 && (zzfrVar.G() != 7 ? zzfrVar.z() : zzfrVar.E() != 0)) {
            int iG = zzfrVar.G();
            boolean zC = zzfrVar.C();
            String strA = (zC || iG == 2 || iG == 7) ? zzfrVar.A() : zzfrVar.A().toUpperCase(Locale.ENGLISH);
            if (zzfrVar.E() == 0) {
                listD = null;
            } else {
                listD = zzfrVar.D();
                if (!zC) {
                    ArrayList arrayList = new ArrayList(listD.size());
                    Iterator it = listD.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listD = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iG == 2 ? strA : null;
            if (iG != 7 ? strA != null : listD != null && !listD.isEmpty()) {
                if (!zC && iG != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iG - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zC ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (zzguVar != null) {
                                    zzguVar.f12945i.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strA));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strA));
                    case 4:
                        return Boolean.valueOf(str.contains(strA));
                    case 5:
                        return Boolean.valueOf(str.equals(strA));
                    case 6:
                        if (listD != null) {
                            return Boolean.valueOf(listD.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    public static Boolean f(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.zzfl zzflVar, double d5) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i11;
        Preconditions.g(zzflVar);
        if (zzflVar.y()) {
            if (zzflVar.I() != 1 && (zzflVar.I() != 5 ? zzflVar.B() : zzflVar.D() && zzflVar.F())) {
                int I = zzflVar.I();
                try {
                    if (zzflVar.I() == 5) {
                        if (zzpk.K(zzflVar.E()) && zzpk.K(zzflVar.G())) {
                            BigDecimal bigDecimal5 = new BigDecimal(zzflVar.E());
                            bigDecimal4 = new BigDecimal(zzflVar.G());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (I == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i11 = I - 1;
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        if (i11 != 3) {
                                            if (i11 == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d5 != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d5).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d5).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (zzpk.K(zzflVar.C())) {
                        bigDecimal2 = new BigDecimal(zzflVar.C());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (I == 5) {
                            i11 = I - 1;
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        if (i11 == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d5 != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d5).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d5).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i11 = I - 1;
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        if (i11 == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d5 != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d5).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d5).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}

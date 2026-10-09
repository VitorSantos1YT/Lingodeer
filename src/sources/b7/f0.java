package b7;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.ParserException;
import b0.h2;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.api.Service;
import com.google.common.base.Ascii;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import com.lingodeer.data.model.AchievementLevelType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dl.ExOZ.xItStCyvVEZ;
import hh.p0;
import j$.util.DesugarTimeZone;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import y6.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3975a = defpackage.e.g(Build.VERSION.SDK_INT, ", ", e0.q(Build.DEVICE, ", ", Build.MODEL, ", ", Build.MANUFACTURER));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f3976b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long[] f3977c = new long[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f3978d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f3979e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f3980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static HashMap f3981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f3982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f3983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f3984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f3985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f3986l;

    static {
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f3980f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f3982h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f3983i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f3984j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f3985k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f3986l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, AchievementLevelType.KNOWLEDGE_POINT_LV_4, 166, 161, AchievementLevelType.DAY_STREAK_LV_8, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, ModuleDescriptor.MODULE_VERSION, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, AchievementLevelType.DAY_STREAK_LV_7, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static String A(int i11) {
        switch (i11) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i11 >= 10000 ? p0.h(i11, "custom (", ")") : "?";
        }
    }

    public static String B(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        return ep.a.k(p0.q("com.lingodeer/", str, " (Linux;Android "), Build.VERSION.RELEASE, ") AndroidXMedia3/1.8.0");
    }

    public static boolean C(j0 j0Var) {
        if (j0Var != null) {
            h2 h2Var = (h2) j0Var;
            if (h2Var.e0(1)) {
                h2Var.r(false);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040 A[RETURN] */
    public static boolean D(j0 j0Var) {
        h2 h2Var;
        boolean z11 = false;
        if (j0Var == null) {
            return false;
        }
        int iU = j0Var.u();
        if (iU != 1 || !((h2) j0Var).e0(2)) {
            if (iU == 4) {
                h2 h2Var2 = (h2) j0Var;
                if (h2Var2.e0(4)) {
                    h2Var2.k0(h2Var2.y(), 4, -9223372036854775807L, false);
                }
            }
            h2Var = (h2) j0Var;
            if (h2Var.e0(1)) {
                return z11;
            }
            h2Var.r(true);
            return true;
        }
        j0Var.a();
        z11 = true;
        h2Var = (h2) j0Var;
        if (h2Var.e0(1)) {
            return z11;
        }
        h2Var.r(true);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00e1 A[RETURN] */
    public static int E(Uri uri, String str) {
        int i11;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme == null || (!Ascii.a("rtsp", scheme) && !Ascii.a("rtspt", scheme))) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    String strC = Ascii.c(lastPathSegment.substring(iLastIndexOf + 1));
                    strC.getClass();
                    switch (strC.hashCode()) {
                        case 104579:
                            if (strC.equals("ism")) {
                            }
                            break;
                        case 108321:
                            if (strC.equals("mpd")) {
                            }
                            break;
                        case 3242057:
                            if (strC.equals("isml")) {
                            }
                            break;
                        case 3299913:
                            if (strC.equals("m3u8")) {
                            }
                            break;
                    }
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Switch insn not found in header
                        	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        */
                    /*
                        Method dump skipped, instruction units count: 286
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: b7.f0.E(android.net.Uri, java.lang.String):int");
                }

                public static boolean F(w wVar, w wVar2, Inflater inflater) {
                    if (wVar.a() == 0) {
                        return false;
                    }
                    if (wVar2.f4039a.length < wVar.a()) {
                        wVar2.c(wVar.a() * 2);
                    }
                    if (inflater == null) {
                        inflater = new Inflater();
                    }
                    inflater.setInput(wVar.f4039a, wVar.f4040b, wVar.a());
                    int iInflate = 0;
                    while (true) {
                        try {
                            byte[] bArr = wVar2.f4039a;
                            iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                            if (inflater.finished()) {
                                wVar2.H(iInflate);
                                inflater.reset();
                                return true;
                            }
                            if (!inflater.needsDictionary() && !inflater.needsInput()) {
                                byte[] bArr2 = wVar2.f4039a;
                                if (iInflate == bArr2.length) {
                                    wVar2.c(bArr2.length * 2);
                                }
                            }
                            inflater.reset();
                            return false;
                        } catch (DataFormatException unused) {
                            inflater.reset();
                            return false;
                        } catch (Throwable th2) {
                            inflater.reset();
                            throw th2;
                        }
                    }
                }

                public static void G(int i11) {
                    Integer.toString(i11, 36);
                }

                public static boolean H(int i11) {
                    return i11 == 3 || i11 == 2 || i11 == 268435456 || i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4;
                }

                public static boolean I(Context context) {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
                        return true;
                    }
                    if (i11 == 30) {
                        String str = Build.MODEL;
                        if (Ascii.a(str, "moto g(20)") || Ascii.a(str, "rmx3231")) {
                            return true;
                        }
                    }
                    return i11 == 34 && Ascii.a(Build.MODEL, "sm-x200");
                }

                public static boolean J(Context context) {
                    UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                    return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
                }

                public static long K(long j11) {
                    return (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? j11 : j11 * 1000;
                }

                public static String L(String str) {
                    if (str == null) {
                        return null;
                    }
                    String strReplace = str.replace('_', '-');
                    if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                        str = strReplace;
                    }
                    String strC = Ascii.c(str);
                    int i11 = 0;
                    String str2 = strC.split("-", 2)[0];
                    if (f3981g == null) {
                        String[] iSOLanguages = Locale.getISOLanguages();
                        int length = iSOLanguages.length;
                        String[] strArr = f3982h;
                        HashMap map = new HashMap(length + strArr.length);
                        for (String str3 : iSOLanguages) {
                            try {
                                String iSO3Language = new Locale(str3).getISO3Language();
                                if (!TextUtils.isEmpty(iSO3Language)) {
                                    map.put(iSO3Language, str3);
                                }
                            } catch (MissingResourceException unused) {
                            }
                        }
                        for (int i12 = 0; i12 < strArr.length; i12 += 2) {
                            map.put(strArr[i12], strArr[i12 + 1]);
                        }
                        f3981g = map;
                    }
                    String str4 = (String) f3981g.get(str2);
                    if (str4 != null) {
                        StringBuilder sbN = ep.a.n(str4);
                        sbN.append(strC.substring(str2.length()));
                        strC = sbN.toString();
                        str2 = str4;
                    }
                    if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
                        return strC;
                    }
                    while (true) {
                        String[] strArr2 = f3983i;
                        if (i11 >= strArr2.length) {
                            return strC;
                        }
                        if (strC.startsWith(strArr2[i11])) {
                            return strArr2[i11 + 1] + strC.substring(strArr2[i11].length());
                        }
                        i11 += 2;
                    }
                }

                public static Object[] M(int i11, Object[] objArr) {
                    a.d(i11 <= objArr.length);
                    return Arrays.copyOf(objArr, i11);
                }

                public static long N(String str) throws ParserException {
                    Matcher matcher = f3978d.matcher(str);
                    if (!matcher.matches()) {
                        throw ParserException.a(null, "Invalid date/time format: " + str);
                    }
                    int i11 = 0;
                    if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                        i11 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                        if ("-".equals(matcher.group(11))) {
                            i11 *= -1;
                        }
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
                    gregorianCalendar.clear();
                    gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                    if (!TextUtils.isEmpty(matcher.group(8))) {
                        gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                    }
                    long timeInMillis = gregorianCalendar.getTimeInMillis();
                    return i11 != 0 ? timeInMillis - (((long) i11) * 60000) : timeInMillis;
                }

                public static void O(Handler handler, Runnable runnable) {
                    Looper looper = handler.getLooper();
                    if (looper.getThread().isAlive()) {
                        if (looper == Looper.myLooper()) {
                            runnable.run();
                        } else {
                            handler.post(runnable);
                        }
                    }
                }

                public static long P(int i11, long j11) {
                    return R(j11, 1000000L, i11, RoundingMode.DOWN);
                }

                public static void Q(long[] jArr, long j11) {
                    long j12;
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    int i11 = 0;
                    if (j11 >= 1000000 && j11 % 1000000 == 0) {
                        long jB = LongMath.b(j11, 1000000L, RoundingMode.UNNECESSARY);
                        while (i11 < jArr.length) {
                            jArr[i11] = LongMath.b(jArr[i11], jB, roundingMode);
                            i11++;
                        }
                        return;
                    }
                    if (j11 < 1000000 && 1000000 % j11 == 0) {
                        long jB2 = LongMath.b(1000000L, j11, RoundingMode.UNNECESSARY);
                        while (i11 < jArr.length) {
                            jArr[i11] = LongMath.d(jArr[i11], jB2);
                            i11++;
                        }
                        return;
                    }
                    int i12 = 0;
                    while (i12 < jArr.length) {
                        long j13 = jArr[i12];
                        if (j13 != 0) {
                            if (j11 >= j13 && j11 % j13 == 0) {
                                jArr[i12] = LongMath.b(1000000L, LongMath.b(j11, j13, RoundingMode.UNNECESSARY), roundingMode);
                            } else if (j11 >= j13 || j13 % j11 != 0) {
                                j12 = j11;
                                jArr[i12] = S(j13, 1000000L, j12, roundingMode);
                            } else {
                                jArr[i12] = LongMath.d(1000000L, LongMath.b(j13, j11, RoundingMode.UNNECESSARY));
                            }
                            j12 = j11;
                        } else {
                            j12 = j11;
                        }
                        i12++;
                        j11 = j12;
                    }
                }

                public static long R(long j11, long j12, long j13, RoundingMode roundingMode) {
                    if (j11 == 0 || j12 == 0) {
                        return 0L;
                    }
                    if (j13 >= j12 && j13 % j12 == 0) {
                        return LongMath.b(j11, LongMath.b(j13, j12, RoundingMode.UNNECESSARY), roundingMode);
                    }
                    if (j13 < j12 && j12 % j13 == 0) {
                        return LongMath.d(j11, LongMath.b(j12, j13, RoundingMode.UNNECESSARY));
                    }
                    if (j13 < j11 || j13 % j11 != 0) {
                        return (j13 >= j11 || j11 % j13 != 0) ? S(j11, j12, j13, roundingMode) : LongMath.d(j12, LongMath.b(j11, j13, RoundingMode.UNNECESSARY));
                    }
                    return LongMath.b(j12, LongMath.b(j13, j11, RoundingMode.UNNECESSARY), roundingMode);
                }

                public static long S(long j11, long j12, long j13, RoundingMode roundingMode) {
                    long jD = LongMath.d(j11, j12);
                    if (jD != Long.MAX_VALUE && jD != Long.MIN_VALUE) {
                        return LongMath.b(jD, j13, roundingMode);
                    }
                    long jC = LongMath.c(Math.abs(j12), Math.abs(j13));
                    RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
                    long jB = LongMath.b(j12, jC, roundingMode2);
                    long jB2 = LongMath.b(j13, jC, roundingMode2);
                    long jC2 = LongMath.c(Math.abs(j11), Math.abs(jB2));
                    long jB3 = LongMath.b(j11, jC2, roundingMode2);
                    long jB4 = LongMath.b(jB2, jC2, roundingMode2);
                    long jD2 = LongMath.d(jB3, jB);
                    if (jD2 != Long.MAX_VALUE && jD2 != Long.MIN_VALUE) {
                        return LongMath.b(jD2, jB4, roundingMode);
                    }
                    double d5 = jB3 * (jB / jB4);
                    if (d5 > 9.223372036854776E18d) {
                        return Long.MAX_VALUE;
                    }
                    if (d5 < -9.223372036854776E18d) {
                        return Long.MIN_VALUE;
                    }
                    return DoubleMath.d(d5, roundingMode);
                }

                public static boolean T(j0 j0Var, boolean z11) {
                    return j0Var == null || !j0Var.g() || j0Var.u() == 1 || j0Var.u() == 4 || !(!z11 || j0Var.C() == 0 || j0Var.C() == 4);
                }

                public static String[] U(String str) {
                    return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
                }

                public static long V(long j11) {
                    return (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? j11 : j11 / 1000;
                }

                public static int a(long[] jArr, long j11, boolean z11) {
                    int i11;
                    int iBinarySearch = Arrays.binarySearch(jArr, j11);
                    if (iBinarySearch < 0) {
                        return ~iBinarySearch;
                    }
                    while (true) {
                        i11 = iBinarySearch + 1;
                        if (i11 >= jArr.length || jArr[i11] != j11) {
                            break;
                        }
                        iBinarySearch = i11;
                    }
                    return z11 ? iBinarySearch : i11;
                }

                public static int b(o oVar, long j11) {
                    int i11 = oVar.f4013b - 1;
                    int i12 = 0;
                    while (i12 <= i11) {
                        int i13 = (i12 + i11) >>> 1;
                        if (oVar.d(i13) < j11) {
                            i12 = i13 + 1;
                        } else {
                            i11 = i13 - 1;
                        }
                    }
                    int i14 = i11 + 1;
                    if (i14 < oVar.f4013b && oVar.d(i14) == j11) {
                        return i14;
                    }
                    if (i11 == -1) {
                        return 0;
                    }
                    return i11;
                }

                public static int c(int[] iArr, int i11, boolean z11, boolean z12) {
                    int i12;
                    int i13;
                    int iBinarySearch = Arrays.binarySearch(iArr, i11);
                    if (iBinarySearch < 0) {
                        i13 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            i12 = iBinarySearch - 1;
                            if (i12 < 0 || iArr[i12] != i11) {
                                break;
                            }
                            iBinarySearch = i12;
                        }
                        i13 = z11 ? iBinarySearch : i12;
                    }
                    return z12 ? Math.max(0, i13) : i13;
                }

                public static int d(long[] jArr, long j11, boolean z11) {
                    int i11;
                    int iBinarySearch = Arrays.binarySearch(jArr, j11);
                    if (iBinarySearch < 0) {
                        i11 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i12 = iBinarySearch - 1;
                            if (i12 < 0 || jArr[i12] != j11) {
                                break;
                            }
                            iBinarySearch = i12;
                        }
                        i11 = iBinarySearch;
                    }
                    return z11 ? Math.max(0, i11) : i11;
                }

                public static int e(int i11, int i12) {
                    return ((i11 + i12) - 1) / i12;
                }

                public static float f(float f5, float f11, float f12) {
                    return Math.max(f11, Math.min(f5, f12));
                }

                public static int g(int i11, int i12, int i13) {
                    return Math.max(i12, Math.min(i11, i13));
                }

                public static long h(long j11, long j12, long j13) {
                    return Math.max(j12, Math.min(j11, j13));
                }

                public static boolean i(SparseArray sparseArray, int i11) {
                    return sparseArray.indexOfKey(i11) >= 0;
                }

                public static boolean j(SparseArray sparseArray, SparseArray sparseArray2) {
                    if (sparseArray == null) {
                        return sparseArray2 == null;
                    }
                    if (sparseArray2 == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        return sparseArray.contentEquals(sparseArray2);
                    }
                    int size = sparseArray.size();
                    if (size != sparseArray2.size()) {
                        return false;
                    }
                    for (int i11 = 0; i11 < size; i11++) {
                        if (!Objects.equals(sparseArray.valueAt(i11), sparseArray2.get(sparseArray.keyAt(i11)))) {
                            return false;
                        }
                    }
                    return true;
                }

                public static int k(SparseArray sparseArray) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        return sparseArray.contentHashCode();
                    }
                    int iHashCode = 17;
                    for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                        iHashCode = Objects.hashCode(sparseArray.valueAt(i11)) + ((sparseArray.keyAt(i11) + (iHashCode * 31)) * 31);
                    }
                    return iHashCode;
                }

                public static int l(int i11, byte[] bArr, int i12, int i13) {
                    while (i11 < i12) {
                        i13 = f3984j[((i13 >>> 24) ^ (bArr[i11] & 255)) & 255] ^ (i13 << 8);
                        i11++;
                    }
                    return i13;
                }

                public static Handler m(Handler.Callback callback) {
                    Looper looperMyLooper = Looper.myLooper();
                    a.k(looperMyLooper);
                    return new Handler(looperMyLooper, callback);
                }

                public static String n(byte[] bArr) {
                    return new String(bArr, StandardCharsets.UTF_8);
                }

                public static int o(int i11) {
                    if (i11 == 30) {
                        return 34;
                    }
                    switch (i11) {
                        case 2:
                        case 3:
                            return 3;
                        case 4:
                        case 5:
                        case 6:
                            return 21;
                        case 7:
                        case 8:
                            return 23;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            return 28;
                        default:
                            switch (i11) {
                                case 14:
                                    return 25;
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                    return 28;
                                default:
                                    switch (i11) {
                                        case 20:
                                            return 30;
                                        case 21:
                                        case 22:
                                            return 31;
                                        default:
                                            return Integer.MAX_VALUE;
                                    }
                            }
                    }
                }

                public static int p(int i11) {
                    if (i11 == 10) {
                        return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
                    }
                    if (i11 == 12) {
                        return 743676;
                    }
                    if (i11 == 24) {
                        return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
                    }
                    switch (i11) {
                        case 1:
                            return 4;
                        case 2:
                            return 12;
                        case 3:
                            return 28;
                        case 4:
                            return 204;
                        case 5:
                            return 220;
                        case 6:
                            return 252;
                        case 7:
                            return 1276;
                        case 8:
                            return 6396;
                        default:
                            return 0;
                    }
                }

                public static int q(int i11) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            return 1;
                        }
                        if (i11 != 4) {
                            if (i11 != 21) {
                                if (i11 != 22) {
                                    if (i11 != 268435456) {
                                        if (i11 != 1342177280) {
                                            if (i11 != 1610612736) {
                                                throw new IllegalArgumentException();
                                            }
                                        }
                                    }
                                }
                            }
                            return 3;
                        }
                        return 4;
                    }
                    return 2;
                }

                public static int s(int i11) {
                    if (i11 == 2 || i11 == 4) {
                        return 6005;
                    }
                    if (i11 == 10) {
                        return 6004;
                    }
                    if (i11 == 7) {
                        return 6005;
                    }
                    if (i11 == 8) {
                        return 6003;
                    }
                    switch (i11) {
                        case 15:
                            return 6003;
                        case 16:
                        case 18:
                            return 6005;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            return 6004;
                        default:
                            switch (i11) {
                                case Service.METRICS_FIELD_NUMBER /* 24 */:
                                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                                case Service.BILLING_FIELD_NUMBER /* 26 */:
                                case 27:
                                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                                    return 6002;
                                default:
                                    return 6006;
                            }
                    }
                }

                public static int t(String str) {
                    String[] strArrSplit;
                    int length;
                    int i11 = 0;
                    if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                        return 0;
                    }
                    String str2 = strArrSplit[length - 1];
                    boolean z11 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
                    try {
                        str2.getClass();
                        i11 = Integer.parseInt(str2);
                        if (z11) {
                            return -i11;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return i11;
                }

                public static long u(long j11, float f5) {
                    return f5 == 1.0f ? j11 : Math.round(j11 * ((double) f5));
                }

                public static long v(long j11) {
                    return j11 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j11;
                }

                public static int w(int i11, ByteOrder byteOrder) {
                    if (i11 == 8) {
                        return 3;
                    }
                    if (i11 == 16) {
                        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
                    }
                    if (i11 == 24) {
                        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
                    }
                    if (i11 != 32) {
                        return 0;
                    }
                    return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
                }

                public static long x(long j11, float f5) {
                    return f5 == 1.0f ? j11 : Math.round(j11 / ((double) f5));
                }

                public static String y(StringBuilder sb2, Formatter formatter, long j11) {
                    if (j11 == -9223372036854775807L) {
                        j11 = 0;
                    }
                    String str = j11 < 0 ? "-" : BuildConfig.VERSION_NAME;
                    long jAbs = (Math.abs(j11) + 500) / 1000;
                    long j12 = jAbs % 60;
                    long j13 = (jAbs / 60) % 60;
                    long j14 = jAbs / 3600;
                    sb2.setLength(0);
                    return j14 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j14), Long.valueOf(j13), Long.valueOf(j12)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12)).toString();
                }

                public static String z(String str) {
                    try {
                        Class<?> cls = Class.forName("android.os.SystemProperties");
                        return (String) cls.getMethod("get", String.class).invoke(cls, str);
                    } catch (Exception e8) {
                        a.p("Failed to read system property ".concat(str), e8);
                        return null;
                    }
                }

                public static Point r(Context context) {
                    DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                    Display display = displayManager != null ? displayManager.getDisplay(0) : null;
                    if (display == null) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.getClass();
                        display = windowManager.getDefaultDisplay();
                    }
                    if (display.getDisplayId() == 0 && J(context)) {
                        String strZ = Build.VERSION.SDK_INT < 28 ? z("sys.display-size") : z("vendor.display-size");
                        if (!TextUtils.isEmpty(strZ)) {
                            try {
                                String[] strArrSplit = strZ.trim().split("x", -1);
                                if (strArrSplit.length == 2) {
                                    int i11 = Integer.parseInt(strArrSplit[0]);
                                    int i12 = Integer.parseInt(strArrSplit[1]);
                                    if (i11 > 0 && i12 > 0) {
                                        return new Point(i11, i12);
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                            a.o("Invalid display size: " + strZ);
                        }
                        if (xItStCyvVEZ.juzsg.equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                            return new Point(3840, 2160);
                        }
                    }
                    Point point = new Point();
                    Display.Mode mode = display.getMode();
                    point.x = mode.getPhysicalWidth();
                    point.y = mode.getPhysicalHeight();
                    return point;
                }
            }

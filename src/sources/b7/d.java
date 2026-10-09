package b7;

import android.util.Pair;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lt.AJC.PQgum;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f3966a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f3967b = {BuildConfig.VERSION_NAME, "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f3968c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i11, boolean z11, int i12, int i13, int[] iArr, int i14) {
        Object[] objArr = {f3967b[i11], Integer.valueOf(i12), Integer.valueOf(i13), Character.valueOf(z11 ? 'H' : 'L'), Integer.valueOf(i14)};
        String str = f0.f3975a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    public static Pair c(String str, String[] strArr, y6.g gVar) {
        int i11;
        Integer numValueOf;
        if (strArr.length < 4) {
            defpackage.e.B("Ignoring malformed HEVC codec string: ", str);
            return null;
        }
        Matcher matcher = f3968c.matcher(strArr[1]);
        if (!matcher.matches()) {
            defpackage.e.B("Ignoring malformed HEVC codec string: ", str);
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i11 = 1;
        } else if ("2".equals(strGroup)) {
            i11 = (gVar == null || gVar.f57197c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                defpackage.e.B("Unknown HEVC profile string: ", strGroup);
                return null;
            }
            i11 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "H30":
                    numValueOf = 2;
                    break;
                case "H60":
                    numValueOf = 8;
                    break;
                case "H63":
                    numValueOf = 32;
                    break;
                case "H90":
                    numValueOf = 128;
                    break;
                case "H93":
                    numValueOf = 512;
                    break;
                case "L30":
                    numValueOf = 1;
                    break;
                case "L60":
                    numValueOf = 4;
                    break;
                case "L63":
                    numValueOf = 16;
                    break;
                case "L90":
                    numValueOf = 64;
                    break;
                case "L93":
                    numValueOf = 256;
                    break;
                case "H120":
                    numValueOf = 2048;
                    break;
                case "H123":
                    numValueOf = Integer.valueOf(OSSConstants.DEFAULT_BUFFER_SIZE);
                    break;
                case "H150":
                    numValueOf = 32768;
                    break;
                case "H153":
                    numValueOf = Integer.valueOf(OSSConstants.DEFAULT_STREAM_BUFFER_SIZE);
                    break;
                case "H156":
                    numValueOf = 524288;
                    break;
                case "H180":
                    numValueOf = 2097152;
                    break;
                case "H183":
                    numValueOf = 8388608;
                    break;
                case "H186":
                    numValueOf = 33554432;
                    break;
                case "L120":
                    numValueOf = 1024;
                    break;
                case "L123":
                    numValueOf = 4096;
                    break;
                case "L150":
                    numValueOf = 16384;
                    break;
                case "L153":
                    numValueOf = 65536;
                    break;
                case "L156":
                    numValueOf = 262144;
                    break;
                case "L180":
                    numValueOf = 1048576;
                    break;
                case "L183":
                    numValueOf = 4194304;
                    break;
                case "L186":
                    numValueOf = 16777216;
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new Pair(Integer.valueOf(i11), numValueOf);
        }
        defpackage.e.B("Unknown HEVC level string: ", str2);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x019b  */
    /* JADX WARN: Code duplicated, block: B:102:0x019f  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:114:0x01be  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:141:0x0203  */
    /* JADX WARN: Code duplicated, block: B:144:0x020a  */
    /* JADX WARN: Code duplicated, block: B:145:0x020f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0214  */
    /* JADX WARN: Code duplicated, block: B:147:0x0217  */
    /* JADX WARN: Code duplicated, block: B:148:0x021a  */
    /* JADX WARN: Code duplicated, block: B:149:0x021d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0220  */
    /* JADX WARN: Code duplicated, block: B:151:0x0223  */
    /* JADX WARN: Code duplicated, block: B:152:0x0225  */
    /* JADX WARN: Code duplicated, block: B:153:0x0227  */
    /* JADX WARN: Code duplicated, block: B:154:0x022a  */
    /* JADX WARN: Code duplicated, block: B:155:0x022d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0231  */
    /* JADX WARN: Code duplicated, block: B:159:0x0237  */
    /* JADX WARN: Code duplicated, block: B:163:0x024f  */
    /* JADX WARN: Code duplicated, block: B:321:0x0437  */
    /* JADX WARN: Code duplicated, block: B:502:0x0689  */
    /* JADX WARN: Code duplicated, block: B:523:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:525:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0164  */
    /* JADX WARN: Code duplicated, block: B:85:0x0168  */
    /* JADX WARN: Code duplicated, block: B:86:0x016c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177  */
    /* JADX WARN: Code duplicated, block: B:92:0x0180  */
    /* JADX WARN: Code duplicated, block: B:93:0x0183  */
    /* JADX WARN: Code duplicated, block: B:96:0x018c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0192  */
    public static Pair b(y6.p pVar) {
        byte b3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Integer num;
        byte b11;
        Integer num2;
        String str;
        byte b12;
        byte b13;
        Integer num3 = 1;
        String str2 = pVar.f57289k;
        y6.g gVar = pVar.D;
        if (str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split("\\.");
        if ("video/dolby-vision".equals(pVar.f57291n)) {
            if (strArrSplit.length < 3) {
                defpackage.e.B("Ignoring malformed Dolby Vision codec string: ", str2);
                return null;
            }
            Matcher matcher = f3968c.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                defpackage.e.B("Ignoring malformed Dolby Vision codec string: ", str2);
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                switch (strGroup.hashCode()) {
                    case 1536:
                        num = 8;
                        b11 = !strGroup.equals("00") ? (byte) -1 : (byte) 0;
                        break;
                    case 1537:
                        if (!strGroup.equals("01")) {
                            num = 8;
                        } else {
                            num = 8;
                            b11 = 1;
                        }
                        break;
                    case 1538:
                        if (!strGroup.equals("02")) {
                            num = 8;
                        } else {
                            num = 8;
                            b11 = 2;
                        }
                        break;
                    case 1539:
                        if (!strGroup.equals("03")) {
                            num = 8;
                        } else {
                            num = 8;
                            b11 = 3;
                        }
                        break;
                    case 1540:
                        if (!strGroup.equals("04")) {
                            num = 8;
                        } else {
                            num = 8;
                            b11 = 4;
                        }
                        break;
                    case 1541:
                        if (!strGroup.equals("05")) {
                            num = 8;
                        } else {
                            num = 8;
                            b11 = 5;
                        }
                        break;
                    case 1542:
                        if (!strGroup.equals("06")) {
                            num = 8;
                        } else {
                            num = 8;
                            b11 = 6;
                        }
                        break;
                    case 1543:
                        if (!strGroup.equals("07")) {
                            num = 8;
                        } else {
                            num = 8;
                            b11 = 7;
                        }
                        break;
                    case 1544:
                        if (!strGroup.equals("08")) {
                            num = 8;
                        } else {
                            num = 8;
                            b11 = 8;
                        }
                        break;
                    case 1545:
                        if (!strGroup.equals("09")) {
                            num = 8;
                        } else {
                            num = 8;
                            b11 = 9;
                        }
                        break;
                    case 1567:
                        if (!strGroup.equals("10")) {
                            num = 8;
                        } else {
                            num = 8;
                            b11 = 10;
                        }
                        break;
                    default:
                        num = 8;
                        break;
                }
                switch (b11) {
                    case 0:
                        num2 = num3;
                        break;
                    case 1:
                        num2 = 2;
                        break;
                    case 2:
                        num2 = 4;
                        break;
                    case 3:
                        num2 = num;
                        break;
                    case 4:
                        num2 = 16;
                        break;
                    case 5:
                        num2 = 32;
                        break;
                    case 6:
                        num2 = 64;
                        break;
                    case 7:
                        num2 = 128;
                        break;
                    case 8:
                        num2 = 256;
                        break;
                    case 9:
                        num2 = 512;
                        break;
                    case 10:
                        num2 = 1024;
                        break;
                }
                if (num2 == null) {
                    defpackage.e.B("Unknown Dolby Vision profile string: ", strGroup);
                    return null;
                }
                str = strArrSplit[2];
                if (str == null) {
                    switch (str.hashCode()) {
                        case 1537:
                            if (str.equals("01")) {
                                b12 = -1;
                            } else {
                                b12 = 0;
                            }
                            break;
                        case 1538:
                            if (str.equals("02")) {
                                b12 = -1;
                            } else {
                                b12 = 1;
                            }
                            break;
                        case 1539:
                            if (str.equals("03")) {
                                b12 = -1;
                            } else {
                                b12 = 2;
                            }
                            break;
                        case 1540:
                            if (str.equals("04")) {
                                b12 = -1;
                            } else {
                                b12 = 3;
                            }
                            break;
                        case 1541:
                            if (str.equals("05")) {
                                b12 = -1;
                            } else {
                                b12 = 4;
                            }
                            break;
                        case 1542:
                            if (str.equals("06")) {
                                b12 = -1;
                            } else {
                                b12 = 5;
                            }
                            break;
                        case 1543:
                            if (str.equals("07")) {
                                b12 = -1;
                            } else {
                                b12 = 6;
                            }
                            break;
                        case 1544:
                            if (str.equals("08")) {
                                b12 = -1;
                            } else {
                                b12 = 7;
                            }
                            break;
                        case 1545:
                            if (str.equals("09")) {
                                b12 = -1;
                            } else {
                                b12 = 8;
                            }
                            break;
                        case 1567:
                            if (str.equals("10")) {
                                b12 = -1;
                            } else {
                                b12 = 9;
                            }
                            break;
                        case 1568:
                            if (str.equals("11")) {
                                b12 = -1;
                            } else {
                                b12 = 10;
                            }
                            break;
                        case 1569:
                            if (str.equals("12")) {
                                b12 = -1;
                            } else {
                                b13 = 11;
                                b12 = b13;
                            }
                            break;
                        case 1570:
                            if (str.equals("13")) {
                                b12 = -1;
                            } else {
                                b13 = 12;
                                b12 = b13;
                            }
                            break;
                        default:
                            b12 = -1;
                            break;
                    }
                    switch (b12) {
                        case 0:
                            break;
                        case 1:
                            num3 = 2;
                            break;
                        case 2:
                            num3 = 4;
                            break;
                        case 3:
                            num3 = num;
                            break;
                        case 4:
                            num3 = 16;
                            break;
                        case 5:
                            num3 = 32;
                            break;
                        case 6:
                            num3 = 64;
                            break;
                        case 7:
                            num3 = 128;
                            break;
                        case 8:
                            num3 = 256;
                            break;
                        case 9:
                            num3 = 512;
                            break;
                        case 10:
                            num3 = 1024;
                            break;
                        case 11:
                            num3 = 2048;
                            break;
                        case 12:
                            num3 = 4096;
                            break;
                        default:
                            num3 = null;
                            break;
                    }
                } else {
                    num3 = null;
                }
                if (num3 == null) {
                    return new Pair(num2, num3);
                }
                defpackage.e.B("Unknown Dolby Vision level string: ", str);
                return null;
            }
            num = 8;
            num2 = null;
            if (num2 == null) {
                defpackage.e.B("Unknown Dolby Vision profile string: ", strGroup);
                return null;
            }
            str = strArrSplit[2];
            if (str == null) {
                switch (str.hashCode()) {
                    case 1537:
                        if (str.equals("01")) {
                            b12 = 0;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1538:
                        if (str.equals("02")) {
                            b12 = 1;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1539:
                        if (str.equals("03")) {
                            b12 = 2;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1540:
                        if (str.equals("04")) {
                            b12 = 3;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1541:
                        if (str.equals("05")) {
                            b12 = 4;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1542:
                        if (str.equals("06")) {
                            b12 = 5;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1543:
                        if (str.equals("07")) {
                            b12 = 6;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1544:
                        if (str.equals("08")) {
                            b12 = 7;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1545:
                        if (str.equals("09")) {
                            b12 = 8;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1567:
                        if (str.equals("10")) {
                            b12 = 9;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1568:
                        if (str.equals("11")) {
                            b12 = 10;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1569:
                        if (str.equals("12")) {
                            b13 = 11;
                            b12 = b13;
                        } else {
                            b12 = -1;
                        }
                        break;
                    case 1570:
                        if (str.equals("13")) {
                            b13 = 12;
                            b12 = b13;
                        } else {
                            b12 = -1;
                        }
                        break;
                    default:
                        b12 = -1;
                        break;
                }
                switch (b12) {
                    case 0:
                        break;
                    case 1:
                        num3 = 2;
                        break;
                    case 2:
                        num3 = 4;
                        break;
                    case 3:
                        num3 = num;
                        break;
                    case 4:
                        num3 = 16;
                        break;
                    case 5:
                        num3 = 32;
                        break;
                    case 6:
                        num3 = 64;
                        break;
                    case 7:
                        num3 = 128;
                        break;
                    case 8:
                        num3 = 256;
                        break;
                    case 9:
                        num3 = 512;
                        break;
                    case 10:
                        num3 = 1024;
                        break;
                    case 11:
                        num3 = 2048;
                        break;
                    case 12:
                        num3 = 4096;
                        break;
                    default:
                        num3 = null;
                        break;
                }
            } else {
                num3 = null;
            }
            if (num3 == null) {
                return new Pair(num2, num3);
            }
            defpackage.e.B("Unknown Dolby Vision level string: ", str);
            return null;
        }
        String str3 = strArrSplit[0];
        str3.getClass();
        switch (str3.hashCode()) {
            case 2986313:
                if (!str3.equals("ac-4")) {
                    b3 = -1;
                } else {
                    b3 = 0;
                }
                break;
            case 3004662:
                if (!str3.equals("av01")) {
                    b3 = -1;
                } else {
                    b3 = 1;
                }
                break;
            case 3006243:
                if (!str3.equals("avc1")) {
                    b3 = -1;
                } else {
                    b3 = 2;
                }
                break;
            case 3006244:
                if (!str3.equals("avc2")) {
                    b3 = -1;
                } else {
                    b3 = 3;
                }
                break;
            case 3199032:
                if (!str3.equals("hev1")) {
                    b3 = -1;
                } else {
                    b3 = 4;
                }
                break;
            case 3214780:
                if (!str3.equals("hvc1")) {
                    b3 = -1;
                } else {
                    b3 = 5;
                }
                break;
            case 3224753:
                if (!str3.equals("iamf")) {
                    b3 = -1;
                } else {
                    b3 = 6;
                }
                break;
            case 3356560:
                if (!str3.equals("mp4a")) {
                    b3 = -1;
                } else {
                    b3 = 7;
                }
                break;
            case 3475740:
                if (!str3.equals(tcppUUQxZjFdy.EMPmi)) {
                    b3 = -1;
                } else {
                    b3 = 8;
                }
                break;
            case 3624515:
                if (!str3.equals("vp09")) {
                    b3 = -1;
                } else {
                    b3 = 9;
                }
                break;
            default:
                b3 = -1;
                break;
        }
        int i27 = 65536;
        switch (b3) {
            case 0:
                if (strArrSplit.length != 4) {
                    defpackage.e.B("Ignoring malformed AC-4 codec string: ", str2);
                    return null;
                }
                try {
                    int i28 = Integer.parseInt(strArrSplit[1]);
                    int i29 = Integer.parseInt(strArrSplit[2]);
                    int i30 = Integer.parseInt(strArrSplit[3]);
                    if (i28 != 0) {
                        if (i28 != 1) {
                            if (i28 != 2) {
                                i12 = -1;
                            } else if (i29 == 1) {
                                i12 = 1026;
                            } else if (i29 == 2) {
                                i12 = 1028;
                            } else {
                                i12 = -1;
                            }
                        } else if (i29 == 0) {
                            i12 = 513;
                        } else if (i29 == 1) {
                            i11 = 514;
                            i12 = i11;
                        } else {
                            i12 = -1;
                        }
                    } else if (i29 == 0) {
                        i11 = 257;
                        i12 = i11;
                    } else {
                        i12 = -1;
                    }
                    if (i12 == -1) {
                        a.B("Unknown AC-4 profile: " + i28 + PQgum.XpUrhHknvh + i29);
                        return null;
                    }
                    if (i30 == 0) {
                        i13 = 1;
                    } else if (i30 == 1) {
                        i13 = 2;
                    } else if (i30 == 2) {
                        i13 = 4;
                    } else {
                        if (i30 != 3) {
                            if (i30 != 4) {
                                i14 = -1;
                                i13 = -1;
                            } else {
                                i13 = 16;
                            }
                            if (i13 == i14) {
                                return new Pair(Integer.valueOf(i12), Integer.valueOf(i13));
                            }
                            defpackage.e.y(i30, "Unknown AC-4 level: ");
                            return null;
                        }
                        i13 = 8;
                    }
                    i14 = -1;
                    if (i13 == i14) {
                        return new Pair(Integer.valueOf(i12), Integer.valueOf(i13));
                    }
                    defpackage.e.y(i30, "Unknown AC-4 level: ");
                    return null;
                } catch (NumberFormatException unused) {
                    defpackage.e.B("Ignoring malformed AC-4 codec string: ", str2);
                    return null;
                }
            case 1:
                if (strArrSplit.length < 4) {
                    defpackage.e.B("Ignoring malformed AV1 codec string: ", str2);
                    return null;
                }
                try {
                    int i31 = Integer.parseInt(strArrSplit[1]);
                    int i32 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i33 = Integer.parseInt(strArrSplit[3]);
                    if (i31 != 0) {
                        defpackage.e.y(i31, "Unknown AV1 profile: ");
                        return null;
                    }
                    if (i33 != 8 && i33 != 10) {
                        defpackage.e.y(i33, "Unknown AV1 bit depth: ");
                        return null;
                    }
                    int i34 = i33 == 8 ? 1 : (gVar == null || !(gVar.f57198d != null || (i15 = gVar.f57197c) == 7 || i15 == 6)) ? 2 : 4096;
                    switch (i32) {
                        case 0:
                            i16 = -1;
                            i27 = 1;
                            break;
                        case 1:
                            i16 = -1;
                            i27 = 2;
                            break;
                        case 2:
                            i16 = -1;
                            i27 = 4;
                            break;
                        case 3:
                            i27 = 8;
                            i16 = -1;
                            break;
                        case 4:
                            i27 = 16;
                            i16 = -1;
                            break;
                        case 5:
                            i27 = 32;
                            i16 = -1;
                            break;
                        case 6:
                            i27 = 64;
                            i16 = -1;
                            break;
                        case 7:
                            i27 = 128;
                            i16 = -1;
                            break;
                        case 8:
                            i27 = 256;
                            i16 = -1;
                            break;
                        case 9:
                            i27 = 512;
                            i16 = -1;
                            break;
                        case 10:
                            i27 = 1024;
                            i16 = -1;
                            break;
                        case 11:
                            i27 = 2048;
                            i16 = -1;
                            break;
                        case 12:
                            i27 = 4096;
                            i16 = -1;
                            break;
                        case 13:
                            i27 = 8192;
                            i16 = -1;
                            break;
                        case 14:
                            i27 = 16384;
                            i16 = -1;
                            break;
                        case 15:
                            i27 = 32768;
                            i16 = -1;
                            break;
                        case 16:
                            i16 = -1;
                            break;
                        case 17:
                            i27 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                            i16 = -1;
                            break;
                        case 18:
                            i27 = 262144;
                            i16 = -1;
                            break;
                        case 19:
                            i27 = 524288;
                            i16 = -1;
                            break;
                        case 20:
                            i27 = 1048576;
                            i16 = -1;
                            break;
                        case 21:
                            i27 = 2097152;
                            i16 = -1;
                            break;
                        case 22:
                            i27 = 4194304;
                            i16 = -1;
                            break;
                        case 23:
                            i27 = 8388608;
                            i16 = -1;
                            break;
                        default:
                            i16 = -1;
                            i27 = -1;
                            break;
                    }
                    if (i27 != i16) {
                        return new Pair(Integer.valueOf(i34), Integer.valueOf(i27));
                    }
                    defpackage.e.y(i32, "Unknown AV1 level: ");
                    return null;
                } catch (NumberFormatException unused2) {
                    defpackage.e.B("Ignoring malformed AV1 codec string: ", str2);
                    return null;
                }
            case 2:
            case 3:
                if (strArrSplit.length < 2) {
                    defpackage.e.B("Ignoring malformed AVC codec string: ", str2);
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i17 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i18 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        if (strArrSplit.length < 3) {
                            a.B("Ignoring malformed AVC codec string: " + str2);
                            return null;
                        }
                        i17 = Integer.parseInt(strArrSplit[1]);
                        i18 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i17 == 66) {
                        i19 = 1;
                    } else if (i17 == 77) {
                        i19 = 2;
                    } else if (i17 == 88) {
                        i19 = 4;
                    } else if (i17 == 100) {
                        i19 = 8;
                    } else if (i17 == 110) {
                        i19 = 16;
                    } else if (i17 != 122) {
                        i19 = i17 != 244 ? -1 : 64;
                    } else {
                        i19 = 32;
                    }
                    if (i19 == -1) {
                        defpackage.e.y(i17, "Unknown AVC profile: ");
                        return null;
                    }
                    switch (i18) {
                        case 10:
                            i21 = -1;
                            i27 = 1;
                            break;
                        case 11:
                            i21 = -1;
                            i27 = 4;
                            break;
                        case 12:
                            i21 = -1;
                            i27 = 8;
                            break;
                        case 13:
                            i27 = 16;
                            i21 = -1;
                            break;
                        default:
                            switch (i18) {
                                case 20:
                                    i27 = 32;
                                    i21 = -1;
                                    break;
                                case 21:
                                    i27 = 64;
                                    i21 = -1;
                                    break;
                                case 22:
                                    i27 = 128;
                                    i21 = -1;
                                    break;
                                default:
                                    switch (i18) {
                                        case 30:
                                            i27 = 256;
                                            i21 = -1;
                                            break;
                                        case 31:
                                            i27 = 512;
                                            i21 = -1;
                                            break;
                                        case Consts.SP /* 32 */:
                                            i27 = 1024;
                                            i21 = -1;
                                            break;
                                        default:
                                            switch (i18) {
                                                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                                    i27 = 2048;
                                                    i21 = -1;
                                                    break;
                                                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                                    i27 = 4096;
                                                    i21 = -1;
                                                    break;
                                                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                                    i27 = 8192;
                                                    i21 = -1;
                                                    break;
                                                default:
                                                    switch (i18) {
                                                        case 50:
                                                            i27 = 16384;
                                                            i21 = -1;
                                                            break;
                                                        case 51:
                                                            i27 = 32768;
                                                            i21 = -1;
                                                            break;
                                                        case 52:
                                                            i21 = -1;
                                                            break;
                                                        default:
                                                            i21 = -1;
                                                            i27 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i27 != i21) {
                        return new Pair(Integer.valueOf(i19), Integer.valueOf(i27));
                    }
                    defpackage.e.y(i18, "Unknown AVC level: ");
                    return null;
                } catch (NumberFormatException unused3) {
                    defpackage.e.B("Ignoring malformed AVC codec string: ", str2);
                    return null;
                }
            case 4:
            case 5:
                return c(str2, strArrSplit, gVar);
            case 6:
                if (strArrSplit.length < 4) {
                    defpackage.e.B("Ignoring malformed IAMF codec string: ", str2);
                    return null;
                }
                try {
                    int i35 = 1 << (Integer.parseInt(strArrSplit[1]) + 16);
                    String str4 = strArrSplit[3];
                    str4.getClass();
                    switch (str4) {
                        case "Opus":
                            i22 = 1;
                            break;
                        case "fLaC":
                            i22 = 4;
                            break;
                        case "ipcm":
                            i22 = 8;
                            break;
                        case "mp4a":
                            i22 = 2;
                            break;
                        default:
                            a.B("Ignoring unknown codec identifier for IAMF auxiliary profile: " + strArrSplit[3]);
                            return null;
                    }
                    return new Pair(Integer.valueOf(i35 | 16777216 | i22), 0);
                } catch (NumberFormatException e8) {
                    a.C("Ignoring malformed primary profile in IAMF codec string: " + strArrSplit[1], e8);
                    return null;
                }
            case 7:
                if (strArrSplit.length != 3) {
                    defpackage.e.B("Ignoring malformed MP4A codec string: ", str2);
                    return null;
                }
                try {
                    if (!"audio/mp4a-latm".equals(y6.d0.f(Integer.parseInt(strArrSplit[1], 16)))) {
                        return null;
                    }
                    int i36 = Integer.parseInt(strArrSplit[2]);
                    int i37 = 17;
                    if (i36 == 17) {
                        i23 = -1;
                    } else {
                        if (i36 != 20) {
                            i37 = 23;
                            if (i36 != 23) {
                                i37 = 29;
                                if (i36 != 29) {
                                    i37 = 39;
                                    if (i36 != 39) {
                                        i37 = 42;
                                        if (i36 != 42) {
                                            switch (i36) {
                                                case 1:
                                                    i23 = -1;
                                                    i37 = 1;
                                                    break;
                                                case 2:
                                                    i23 = -1;
                                                    i37 = 2;
                                                    break;
                                                case 3:
                                                    i23 = -1;
                                                    i37 = 3;
                                                    break;
                                                case 4:
                                                    i23 = -1;
                                                    i37 = 4;
                                                    break;
                                                case 5:
                                                    i23 = -1;
                                                    i37 = 5;
                                                    break;
                                                case 6:
                                                    i23 = -1;
                                                    i37 = 6;
                                                    break;
                                                default:
                                                    i23 = -1;
                                                    i37 = -1;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            i37 = 20;
                        }
                        i23 = -1;
                    }
                    if (i37 != i23) {
                        return new Pair(Integer.valueOf(i37), 0);
                    }
                    return null;
                } catch (NumberFormatException unused4) {
                    defpackage.e.B("Ignoring malformed MP4A codec string: ", str2);
                    return null;
                }
            case 8:
                Pair pair = new Pair(num3, num3);
                if (strArrSplit.length < 3) {
                    defpackage.e.B("Ignoring malformed H263 codec string: ", str2);
                    return pair;
                }
                try {
                    return new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                } catch (NumberFormatException unused5) {
                    defpackage.e.B("Ignoring malformed H263 codec string: ", str2);
                    return pair;
                }
            case 9:
                if (strArrSplit.length < 3) {
                    defpackage.e.B("Ignoring malformed VP9 codec string: ", str2);
                    return null;
                }
                try {
                    int i38 = Integer.parseInt(strArrSplit[1]);
                    int i39 = Integer.parseInt(strArrSplit[2]);
                    if (i38 == 0) {
                        i24 = 1;
                    } else if (i38 == 1) {
                        i24 = 2;
                    } else if (i38 != 2) {
                        i24 = i38 != 3 ? -1 : 8;
                    } else {
                        i24 = 4;
                    }
                    if (i24 == -1) {
                        defpackage.e.y(i38, "Unknown VP9 profile: ");
                        return null;
                    }
                    if (i39 == 10) {
                        i25 = -1;
                        i26 = 1;
                    } else if (i39 == 11) {
                        i25 = -1;
                        i26 = 2;
                    } else if (i39 == 20) {
                        i25 = -1;
                        i26 = 4;
                    } else if (i39 != 21) {
                        if (i39 == 30) {
                            i26 = 16;
                        } else if (i39 == 31) {
                            i26 = 32;
                        } else if (i39 == 40) {
                            i26 = 64;
                        } else if (i39 == 41) {
                            i26 = 128;
                        } else if (i39 == 50) {
                            i26 = 256;
                        } else if (i39 != 51) {
                            switch (i39) {
                                case 60:
                                    i26 = 2048;
                                    break;
                                case 61:
                                    i26 = 4096;
                                    break;
                                case 62:
                                    i26 = 8192;
                                    break;
                                default:
                                    i25 = -1;
                                    i26 = -1;
                                    break;
                            }
                        } else {
                            i26 = 512;
                        }
                        i25 = -1;
                    } else {
                        i25 = -1;
                        i26 = 8;
                    }
                    if (i26 != i25) {
                        return new Pair(Integer.valueOf(i24), Integer.valueOf(i26));
                    }
                    defpackage.e.y(i39, "Unknown VP9 level: ");
                    return null;
                } catch (NumberFormatException unused6) {
                    defpackage.e.B("Ignoring malformed VP9 codec string: ", str2);
                    return null;
                }
            default:
                return null;
        }
    }
}

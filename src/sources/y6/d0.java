package y6;

import android.text.TextUtils;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.google.common.base.Ascii;
import com.yalantis.ucrop.UCrop;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f57182a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f57183b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        a9.e eVarG;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (eVarG = g(str2)) == null || (iA = eVarG.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean b(String str, String str2) {
        String string = null;
        if (str != null) {
            String[] strArrU = b7.f0.U(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : strArrU) {
                if (str2.equals(e(str3))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str3);
                }
            }
            if (sb2.length() > 0) {
                string = sb2.toString();
            }
        }
        return string != null;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : b7.f0.U(str)) {
            String strE = e(str2);
            if (strE != null && k(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static int d(String str, String str2) {
        a9.e eVarG;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (eVarG = g(str2)) == null) {
                    return 0;
                }
                return eVarG.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        a9.e eVarG;
        String strF = null;
        if (str != null) {
            String strC = Ascii.c(str.trim());
            if (strC.startsWith("avc1") || strC.startsWith("avc3")) {
                return "video/avc";
            }
            if (strC.startsWith("hev1") || strC.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strC.startsWith("dvav") || strC.startsWith("dva1") || strC.startsWith("dvhe") || strC.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strC.startsWith("av01")) {
                return "video/av01";
            }
            if (strC.startsWith("vp9") || strC.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strC.startsWith("vp8") || strC.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strC.startsWith("mp4a")) {
                if (strC.startsWith("mp4a.") && (eVarG = g(strC)) != null) {
                    strF = f(eVarG.f478b);
                }
                return strF == null ? "audio/mp4a-latm" : strF;
            }
            if (strC.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strC.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strC.startsWith("ac-3") || strC.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strC.startsWith("ec-3") || strC.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strC.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strC.startsWith("ac-4") || strC.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strC.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strC.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strC.startsWith("dtsh") || strC.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strC.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strC.startsWith("opus")) {
                return "audio/opus";
            }
            if (strC.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strC.startsWith("flac")) {
                return "audio/flac";
            }
            if (strC.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strC.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strC.contains("cea708")) {
                return "application/cea-708";
            }
            if (strC.contains("eia608") || strC.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = f57182a;
            if (arrayList.size() > 0) {
                throw hh.p0.e(0, arrayList);
            }
        }
        return null;
    }

    public static String f(int i11) {
        if (i11 == 32) {
            return "video/mp4v-es";
        }
        if (i11 == 33) {
            return "video/avc";
        }
        if (i11 == 35) {
            return "video/hevc";
        }
        if (i11 == 64) {
            return "audio/mp4a-latm";
        }
        if (i11 == 163) {
            return "video/wvc1";
        }
        if (i11 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i11 == 221) {
            return "audio/vorbis";
        }
        if (i11 == 165) {
            return "audio/ac3";
        }
        if (i11 == 166) {
            return "audio/eac3";
        }
        switch (i11) {
            case UCrop.RESULT_ERROR /* 96 */:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i11) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static a9.e g(String str) {
        Matcher matcher = f57183b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new a9.e(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 6);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (n(str)) {
            return 2;
        }
        if (m(str)) {
            return 3;
        }
        if (l(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f57182a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        throw hh.p0.e(0, arrayList);
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : b7.f0.U(str)) {
            String strE = e(str2);
            if (strE != null && n(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return "audio".equals(h(str));
    }

    public static boolean l(String str) {
        return "image".equals(h(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean m(String str) {
        return "text".equals(h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean n(String str) {
        return "video".equals(h(str));
    }

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        String strC = Ascii.c(str);
        strC.getClass();
        switch (strC) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return ualZoVVCQs.KRclXU;
            default:
                return strC;
        }
    }
}

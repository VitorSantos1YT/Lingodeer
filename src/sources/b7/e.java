package b7;

import android.graphics.Color;
import android.text.TextUtils;
import bw.ORXQ.ADSb;
import com.google.common.base.Ascii;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f3969a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f3970b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f3971c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f3972d;

    public static int a(String str, boolean z11) {
        int i11;
        a.d(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", BuildConfig.VERSION_NAME);
        if (strReplace.charAt(0) == '#') {
            int i12 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i12;
            }
            if (strReplace.length() == 9) {
                return ((i12 & 255) << 24) | (i12 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z11 ? f3971c : f3970b).matcher(strReplace);
            if (matcher.matches()) {
                if (z11) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i11 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i11 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i13 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i14 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i11, i13, i14, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f3969a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i15 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i16 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i15, i16, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f3972d.get(Ascii.c(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    static {
        HashMap map = new HashMap();
        f3972d = map;
        defpackage.e.z(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put(ADSb.yeXu, -16711681);
        map.put("aquamarine", -8388652);
        defpackage.e.z(-983041, map, "azure", -657956, "beige");
        defpackage.e.z(-6972, map, "bisque", -16777216, "black");
        defpackage.e.z(-5171, map, "blanchedalmond", -16776961, "blue");
        defpackage.e.z(-7722014, map, "blueviolet", -5952982, "brown");
        defpackage.e.z(-2180985, map, "burlywood", -10510688, "cadetblue");
        defpackage.e.z(-8388864, map, "chartreuse", -2987746, "chocolate");
        defpackage.e.z(-32944, map, "coral", -10185235, "cornflowerblue");
        defpackage.e.z(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        defpackage.e.z(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        defpackage.e.z(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        defpackage.e.z(-29696, map, "darkorange", -6737204, "darkorchid");
        defpackage.e.z(-7667712, map, "darkred", -1468806, "darksalmon");
        defpackage.e.z(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        defpackage.e.z(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        defpackage.e.z(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        defpackage.e.z(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        defpackage.e.z(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        defpackage.e.z(-38476, map, "hotpink", -3318692, "indianred");
        defpackage.e.z(-11861886, map, "indigo", -16, "ivory");
        defpackage.e.z(-989556, map, "khaki", -1644806, "lavender");
        defpackage.e.z(-3851, map, "lavenderblush", -8586240, "lawngreen");
        defpackage.e.z(-1331, map, "lemonchiffon", -5383962, "lightblue");
        defpackage.e.z(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        defpackage.e.z(-18751, map, "lightpink", -24454, "lightsalmon");
        defpackage.e.z(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        defpackage.e.z(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        defpackage.e.z(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        defpackage.e.z(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        defpackage.e.z(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        defpackage.e.z(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        defpackage.e.z(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        defpackage.e.z(-15132304, map, "midnightblue", -655366, "mintcream");
        defpackage.e.z(-6943, map, "mistyrose", -6987, "moccasin");
        defpackage.e.z(-8531, map, "navajowhite", -16777088, "navy");
        defpackage.e.z(-133658, map, "oldlace", -8355840, "olive");
        defpackage.e.z(-9728477, map, "olivedrab", -23296, "orange");
        defpackage.e.z(-47872, map, "orangered", -2461482, "orchid");
        defpackage.e.z(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        defpackage.e.z(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        defpackage.e.z(-4139, map, "papayawhip", -9543, "peachpuff");
        defpackage.e.z(-3308225, map, "peru", -16181, "pink");
        defpackage.e.z(-2252579, map, "plum", -5185306, "powderblue");
        defpackage.e.z(-8388480, map, "purple", -10079335, "rebeccapurple");
        defpackage.e.z(-65536, map, "red", -4419697, "rosybrown");
        defpackage.e.z(-12490271, map, "royalblue", -7650029, "saddlebrown");
        defpackage.e.z(-360334, map, "salmon", -744352, "sandybrown");
        defpackage.e.z(-13726889, map, "seagreen", -2578, "seashell");
        defpackage.e.z(-6270419, map, "sienna", -4144960, "silver");
        defpackage.e.z(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        defpackage.e.z(-12156236, map, "steelblue", -2968436, "tan");
        defpackage.e.z(-16744320, map, "teal", -2572328, "thistle");
        defpackage.e.z(-40121, map, "tomato", 0, "transparent");
        defpackage.e.z(-12525360, map, "turquoise", -1146130, "violet");
        defpackage.e.z(-663885, map, "wheat", -1, "white");
        defpackage.e.z(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }
}

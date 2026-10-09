package d9;

import a7.j;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import b7.f0;
import b7.w;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f23330a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f23331b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f23332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f23333d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f23332c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f23333d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i11;
        int i12;
        int i13;
        int i14 = eVar.f23314b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.f23313a;
        str2.getClass();
        int i15 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i14, length, 33);
                break;
            case "c":
                for (String str3 : eVar.f23316d) {
                    Map map = f23332c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i14, length, 33);
                    } else {
                        Map map2 = f23333d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i14, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i14, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i14, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new j(eVar.f23315c), i14, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.f23310c);
                int i16 = eVar.f23314b;
                int i17 = 0;
                int length2 = 0;
                while (i17 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i17)).f23311a.f23313a)) {
                        d dVar = (d) arrayList.get(i17);
                        int iC2 = c(list2, str, dVar.f23311a);
                        if (iC2 == i15) {
                            iC2 = iC != i15 ? iC : 1;
                        }
                        int i18 = dVar.f23311a.f23314b - length2;
                        int i19 = dVar.f23312b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i18, i19);
                        spannableStringBuilder.delete(i18, i19);
                        spannableStringBuilder.setSpan(new a7.h(charSequenceSubSequence.toString(), iC2), i16, i18, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i16 = i18;
                    }
                    i17++;
                    i15 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, eVar);
        for (int i21 = 0; i21 < arrayListB.size(); i21++) {
            b bVar = ((f) arrayListB.get(i21)).f23318b;
            int i22 = bVar.f23302l;
            if (i22 == -1 && bVar.m == -1) {
                i11 = -1;
            } else {
                i11 = (bVar.m == 1 ? (char) 2 : (char) 0) | (i22 == 1 ? (char) 1 : (char) 0);
            }
            if (i11 != -1) {
                int i23 = bVar.f23302l;
                if (i23 == -1 && bVar.m == -1) {
                    i13 = -1;
                    i12 = 1;
                } else {
                    i12 = 1;
                    i13 = (i23 == 1 ? 1 : 0) | (bVar.m == 1 ? 2 : 0);
                }
                ew.a.h(spannableStringBuilder, new StyleSpan(i13), i14, length);
            } else {
                i12 = 1;
            }
            if (bVar.f23300j == i12) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i14, length, 33);
            }
            if (bVar.f23301k == i12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i14, length, 33);
            }
            if (bVar.f23297g) {
                if (!bVar.f23297g) {
                    throw new IllegalStateException("Font color not defined");
                }
                ew.a.h(spannableStringBuilder, new ForegroundColorSpan(bVar.f23296f), i14, length);
            }
            if (bVar.f23299i) {
                if (!bVar.f23299i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                ew.a.h(spannableStringBuilder, new BackgroundColorSpan(bVar.f23298h), i14, length);
            }
            if (bVar.f23295e != null) {
                ew.a.h(spannableStringBuilder, new TypefaceSpan(bVar.f23295e), i14, length);
            }
            int i24 = bVar.f23303n;
            if (i24 == 1) {
                ew.a.h(spannableStringBuilder, new AbsoluteSizeSpan((int) bVar.f23304o, true), i14, length);
            } else if (i24 == 2) {
                ew.a.h(spannableStringBuilder, new RelativeSizeSpan(bVar.f23304o), i14, length);
            } else if (i24 == 3) {
                ew.a.h(spannableStringBuilder, new RelativeSizeSpan(bVar.f23304o / 100.0f), i14, length);
            }
            if (bVar.f23306q) {
                spannableStringBuilder.setSpan(new a7.f(), i14, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, e eVar) {
        ?? r9;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            b bVar = (b) list.get(i11);
            String str2 = eVar.f23313a;
            Set set = eVar.f23316d;
            String str3 = eVar.f23315c;
            if (bVar.f23291a.isEmpty() && bVar.f23292b.isEmpty() && bVar.f23293c.isEmpty() && bVar.f23294d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iA = b.a(bVar.f23294d, b.a(bVar.f23292b, b.a(bVar.f23291a, 0, 1073741824, str), 2, str2), 4, str3);
                if (iA == -1 || !set.containsAll(bVar.f23293c)) {
                    r9 = 0;
                } else {
                    size = iA + (bVar.f23293c.size() * 4);
                }
            }
            if (r9 > 0) {
                r9 = size;
                r9 = zIsEmpty;
                arrayList.add(new f(r9, bVar));
            } else {
                r9 = size;
                r9 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList arrayListB = b(list, str, eVar);
        for (int i11 = 0; i11 < arrayListB.size(); i11++) {
            int i12 = ((f) arrayListB.get(i11)).f23318b.f23305p;
            if (i12 != -1) {
                return i12;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, w wVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            gVar.f23319a = i.b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            gVar.f23320b = i.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, gVar);
            StringBuilder sb2 = new StringBuilder();
            wVar.getClass();
            String strK = wVar.k(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strK)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strK.trim());
                strK = wVar.k(StandardCharsets.UTF_8);
            }
            gVar.f23321c = f(arrayList, str, sb2.toString());
            return new c(gVar.a().a(), gVar.f23319a, gVar.f23320b);
        } catch (IllegalArgumentException unused) {
            b7.a.B("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static SpannedString f(List list, String str, String str2) {
        char c11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            int length = str2.length();
            String strTrim = BuildConfig.VERSION_NAME;
            if (i11 >= length) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e(BuildConfig.VERSION_NAME, 0, BuildConfig.VERSION_NAME, Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i11);
            if (cCharAt == '&') {
                i11++;
                int iIndexOf = str2.indexOf(59, i11);
                int iIndexOf2 = str2.indexOf(32, i11);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i11, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            b7.a.B("ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i11 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i11++;
            } else {
                int length2 = i11 + 1;
                if (length2 < str2.length()) {
                    boolean z11 = str2.charAt(length2) == '/';
                    int iIndexOf3 = str2.indexOf(62, length2);
                    length2 = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i12 = length2 - 2;
                    boolean z12 = str2.charAt(i12) == '/';
                    int i13 = i11 + (z11 ? 2 : 1);
                    if (!z12) {
                        i12 = length2 - 1;
                    }
                    String strSubstring2 = str2.substring(i13, i12);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        b7.a.d(!strTrim2.isEmpty());
                        String str3 = f0.f3975a;
                        String str4 = strTrim2.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z11) {
                                    if (!z12) {
                                        int length3 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        b7.a.d(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c11 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c11 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str5 = strArrSplit[c11];
                                        HashSet hashSet = new HashSet();
                                        for (int i14 = 1; i14 < strArrSplit.length; i14++) {
                                            hashSet.add(strArrSplit[i14]);
                                        }
                                        arrayDeque.push(new e(str5, length3, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        e eVar = (e) arrayDeque.pop();
                                        a(str, eVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new d(eVar, spannableStringBuilder.length()));
                                        }
                                        if (eVar.f23313a.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i11 = length2;
            }
        }
    }

    public static void g(String str, g gVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            int i11 = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i11 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i11 = 0;
                    break;
                default:
                    b7.a.B("Invalid anchor value: ".concat(strSubstring));
                    i11 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f23325g = i11;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            gVar.f23323e = i.a(str);
            gVar.f23324f = 0;
        } else {
            gVar.f23323e = Integer.parseInt(str);
            gVar.f23324f = 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, g gVar) {
        Matcher matcher = f23331b.matcher(str);
        while (matcher.find()) {
            int i11 = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, gVar);
                } else {
                    boolean zEquals = "align".equals(strGroup);
                    String str2 = ypOOxsaJG.beteD;
                    byte b3 = 5;
                    byte b11 = 0;
                    if (zEquals) {
                        switch (strGroup2.hashCode()) {
                            case -1364013995:
                                if (!strGroup2.equals("center")) {
                                    b11 = -1;
                                }
                                break;
                            case -1074341483:
                                b11 = !strGroup2.equals("middle") ? (byte) -1 : (byte) 1;
                                break;
                            case 100571:
                                b11 = !strGroup2.equals(str2) ? (byte) -1 : (byte) 2;
                                break;
                            case 3317767:
                                b11 = !strGroup2.equals("left") ? (byte) -1 : (byte) 3;
                                break;
                            case 108511772:
                                b11 = !strGroup2.equals("right") ? (byte) -1 : (byte) 4;
                                break;
                            case 109757538:
                                b11 = !strGroup2.equals("start") ? (byte) -1 : (byte) 5;
                                break;
                            default:
                                b11 = -1;
                                break;
                        }
                        switch (b11) {
                            case 0:
                            case 1:
                                i11 = 2;
                                break;
                            case 2:
                                i11 = 3;
                                break;
                            case 3:
                                i11 = 4;
                                break;
                            case 4:
                                i11 = 5;
                                break;
                            case 5:
                                break;
                            default:
                                b7.a.B("Invalid alignment value: ".concat(strGroup2));
                                i11 = 2;
                                break;
                        }
                        gVar.f23322d = i11;
                    } else if (RequestParameters.POSITION.equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            strSubstring.getClass();
                            switch (strSubstring.hashCode()) {
                                case -1842484672:
                                    b3 = !strSubstring.equals("line-left") ? (byte) -1 : (byte) 0;
                                    break;
                                case -1364013995:
                                    b3 = !strSubstring.equals("center") ? (byte) -1 : (byte) 1;
                                    break;
                                case -1276788989:
                                    b3 = !strSubstring.equals("line-right") ? (byte) -1 : (byte) 2;
                                    break;
                                case -1074341483:
                                    b3 = !strSubstring.equals("middle") ? (byte) -1 : (byte) 3;
                                    break;
                                case 100571:
                                    b3 = !strSubstring.equals(str2) ? (byte) -1 : (byte) 4;
                                    break;
                                case 109757538:
                                    if (!strSubstring.equals("start")) {
                                        b3 = -1;
                                    }
                                    break;
                                default:
                                    b3 = -1;
                                    break;
                            }
                            switch (b3) {
                                case 0:
                                case 5:
                                    i11 = 0;
                                    break;
                                case 1:
                                case 3:
                                    break;
                                case 2:
                                case 4:
                                    i11 = 2;
                                    break;
                                default:
                                    b7.a.B("Invalid anchor value: ".concat(strSubstring));
                                    i11 = Integer.MIN_VALUE;
                                    break;
                            }
                            gVar.f23327i = i11;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        gVar.f23326h = i.a(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        gVar.f23328j = i.a(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i11 = 2;
                        } else if (!strGroup2.equals("rl")) {
                            b7.a.B("Invalid 'vertical' value: ".concat(strGroup2));
                            i11 = Integer.MIN_VALUE;
                        }
                        gVar.f23329k = i11;
                    } else {
                        b7.a.B("Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                b7.a.B(aYZzTH.nwHSQyWziYGJCi + matcher.group());
            }
        }
    }
}

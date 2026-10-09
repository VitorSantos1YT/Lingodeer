package a9;

import android.text.Layout;
import android.text.TextUtils;
import androidx.media3.extractor.text.SubtitleDecoderException;
import app.rive.runtime.kotlin.fonts.Fonts;
import b7.f0;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dl.ExOZ.xItStCyvVEZ;
import hh.p0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lt.AJC.PQgum;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import u8.j;
import u8.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f480b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f481c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f482d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f483e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f484f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f485t = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern H = Pattern.compile("^(\\d+) (\\d+)$");
    public static final d K = new d(1, 30.0f, 1);

    public f() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f486a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e8) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e8);
        }
    }

    public static h a(h hVar) {
        return hVar == null ? new h() : hVar;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = H.matcher(attributeValue);
        if (!matcher.matches()) {
            b7.a.B("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z11 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i11 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i12 = Integer.parseInt(strGroup2);
            if (i11 == 0 || i12 == 0) {
                z11 = false;
            }
            b7.a.c("Invalid cell resolution " + i11 + " " + i12, z11);
            return i12;
        } catch (NumberFormatException unused) {
            b7.a.B("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, h hVar) throws SubtitleDecoderException {
        Matcher matcher;
        String str2 = f0.f3975a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f482d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(p0.i(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            b7.a.B("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(ep.a.g("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                hVar.f506j = 3;
                break;
            case "em":
                hVar.f506j = 2;
                break;
            case "px":
                hVar.f506j = 1;
                break;
            default:
                throw new SubtitleDecoderException(ep.a.g("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        hVar.f507k = Float.parseFloat(strGroup2);
    }

    public static d e(XmlPullParser xmlPullParser) {
        float f5;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i11 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = f0.f3975a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            b7.a.c("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f5 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f5 = 1.0f;
        }
        d dVar = K;
        int i12 = dVar.f475b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = dVar.f476c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new d(i12, i11 * f5, i13);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
    public static c g(XmlPullParser xmlPullParser, c cVar, HashMap map, d dVar) throws SubtitleDecoderException {
        long j11;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        h hVarI = i(xmlPullParser, null);
        String strSubstring = null;
        String str = BuildConfig.VERSION_NAME;
        long jK = -9223372036854775807L;
        long jK2 = -9223372036854775807L;
        long jK3 = -9223372036854775807L;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlPullParser.getAttributeName(i11);
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jK3 = k(attributeValue, dVar);
                    break;
                case "end":
                    jK2 = k(attributeValue, dVar);
                    break;
                case "begin":
                    jK = k(attributeValue, dVar);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str2 = f0.f3975a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (cVar != null) {
            long j12 = cVar.f465d;
            if (j12 != -9223372036854775807L) {
                if (jK != -9223372036854775807L) {
                    jK += j12;
                }
                if (jK2 != -9223372036854775807L) {
                    jK2 += j12;
                }
            }
        }
        if (jK2 != -9223372036854775807L) {
            j11 = jK2;
        } else {
            if (jK3 != -9223372036854775807L) {
                jK2 = jK + jK3;
            } else if (cVar != null) {
                long j13 = cVar.f466e;
                if (j13 != -9223372036854775807L) {
                    j11 = j13;
                }
            }
            j11 = jK2;
        }
        return new c(xmlPullParser.getName(), null, jK, j11, hVarI, strArr, str, strSubstring, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:141:0x0207  */
    /* JADX WARN: Code duplicated, block: B:143:0x021a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0228  */
    /* JADX WARN: Code duplicated, block: B:152:0x0236  */
    /* JADX WARN: Code duplicated, block: B:157:0x0256  */
    /* JADX WARN: Code duplicated, block: B:159:0x026b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0271  */
    /* JADX WARN: Code duplicated, block: B:165:0x027b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0295  */
    /* JADX WARN: Code duplicated, block: B:171:0x029a  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:177:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:179:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:180:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:6:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x011f  */
    public static h i(XmlPullParser xmlPullParser, h hVar) {
        byte b3;
        int i11;
        Sets.SetView setViewF;
        Sets.SetView setViewF2;
        Sets.SetView setViewF3;
        String str;
        int iHashCode;
        String str2;
        int iHashCode2;
        int i12;
        b bVar;
        String str3;
        int iHashCode3;
        int attributeCount = xmlPullParser.getAttributeCount();
        h hVarA = hVar;
        for (int i13 = 0; i13 < attributeCount; i13++) {
            String attributeValue = xmlPullParser.getAttributeValue(i13);
            String attributeName = xmlPullParser.getAttributeName(i13);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    b3 = 0;
                    break;
                case "extent":
                    b3 = 1;
                    break;
                case "fontFamily":
                    b3 = 2;
                    break;
                case "textAlign":
                    b3 = 3;
                    break;
                case "origin":
                    b3 = 4;
                    break;
                case "textDecoration":
                    b3 = 5;
                    break;
                case "fontWeight":
                    b3 = 6;
                    break;
                case "id":
                    b3 = 7;
                    break;
                case "ruby":
                    b3 = 8;
                    break;
                case "color":
                    b3 = 9;
                    break;
                case "shear":
                    b3 = 10;
                    break;
                case "textCombine":
                    b3 = 11;
                    break;
                case "fontSize":
                    b3 = 12;
                    break;
                case "textEmphasis":
                    b3 = 13;
                    break;
                case "rubyPosition":
                    b3 = 14;
                    break;
                case "backgroundColor":
                    b3 = 15;
                    break;
                case "multiRowAlign":
                    b3 = 16;
                    break;
                default:
                    b3 = -1;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (b3) {
                case 0:
                    hVarA = a(hVarA);
                    hVarA.f505i = Fonts.Font.STYLE_ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    hVarA = a(hVarA);
                    hVarA.f516u = attributeValue;
                    break;
                case 2:
                    hVarA = a(hVarA);
                    hVarA.f497a = attributeValue;
                    break;
                case 3:
                    hVarA = a(hVarA);
                    String strC = Ascii.c(attributeValue);
                    strC.getClass();
                    switch (strC) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    hVarA.f510o = alignment;
                    break;
                case 4:
                    hVarA = a(hVarA);
                    hVarA.f515t = attributeValue;
                    break;
                case 5:
                    String strC2 = Ascii.c(attributeValue);
                    strC2.getClass();
                    switch (strC2) {
                        case "nounderline":
                            hVarA = a(hVarA);
                            hVarA.f503g = 0;
                            break;
                        case "underline":
                            hVarA = a(hVarA);
                            hVarA.f503g = 1;
                            break;
                        case "nolinethrough":
                            hVarA = a(hVarA);
                            hVarA.f502f = 0;
                            break;
                        case "linethrough":
                            hVarA = a(hVarA);
                            hVarA.f502f = 1;
                            break;
                    }
                    break;
                case 6:
                    hVarA = a(hVarA);
                    hVarA.f504h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        hVarA = a(hVarA);
                        hVarA.f508l = attributeValue;
                    }
                    break;
                case 8:
                    String strC3 = Ascii.c(attributeValue);
                    strC3.getClass();
                    switch (strC3) {
                        case "baseContainer":
                        case "base":
                            hVarA = a(hVarA);
                            hVarA.m = 2;
                            break;
                        case "container":
                            hVarA = a(hVarA);
                            hVarA.m = 1;
                            break;
                        case "delimiter":
                            hVarA = a(hVarA);
                            hVarA.m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            hVarA = a(hVarA);
                            hVarA.m = 3;
                            break;
                    }
                    break;
                case 9:
                    hVarA = a(hVarA);
                    try {
                        hVarA.f498b = b7.e.a(attributeValue, false);
                        hVarA.f499c = true;
                    } catch (IllegalArgumentException unused) {
                        defpackage.e.B("Failed parsing color value: ", attributeValue);
                    }
                    break;
                case 10:
                    h hVarA2 = a(hVarA);
                    Matcher matcher = f483e.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e8) {
                            b7.a.C("Failed to parse shear: " + attributeValue, e8);
                        }
                    } else {
                        defpackage.e.B("Invalid value for shear: ", attributeValue);
                    }
                    hVarA2.f514s = fMin;
                    hVarA = hVarA2;
                    break;
                case 11:
                    String strC4 = Ascii.c(attributeValue);
                    strC4.getClass();
                    if (strC4.equals("all")) {
                        hVarA = a(hVarA);
                        hVarA.f512q = 1;
                    } else if (strC4.equals("none")) {
                        hVarA = a(hVarA);
                        hVarA.f512q = 0;
                    }
                    break;
                case 12:
                    try {
                        hVarA = a(hVarA);
                        d(attributeValue, hVarA);
                    } catch (SubtitleDecoderException unused2) {
                        defpackage.e.B("Failed parsing fontSize value: ", attributeValue);
                    }
                    break;
                case 13:
                    hVarA = a(hVarA);
                    Pattern pattern = b.f454d;
                    if (attributeValue == null) {
                        bVar = null;
                    } else {
                        String strC5 = Ascii.c(attributeValue.trim());
                        if (strC5.isEmpty()) {
                            bVar = null;
                        } else {
                            ImmutableSet immutableSetN = ImmutableSet.n(TextUtils.split(strC5, b.f454d));
                            String str4 = (String) Iterators.h(Sets.f(b.f458h, immutableSetN).iterator(), "outside");
                            int iHashCode4 = str4.hashCode();
                            if (iHashCode4 != -1392885889) {
                                if (iHashCode4 != -1106037339) {
                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                        i11 = 2;
                                    }
                                } else if (str4.equals("outside")) {
                                    i11 = -2;
                                }
                                setViewF = Sets.f(b.f455e, immutableSetN);
                                if (setViewF.isEmpty()) {
                                    setViewF2 = Sets.f(b.f457g, immutableSetN);
                                    setViewF3 = Sets.f(b.f456f, immutableSetN);
                                    if (setViewF2.isEmpty() || !setViewF3.isEmpty()) {
                                        str = (String) Iterators.h(setViewF2.iterator(), "filled");
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1274499742) {
                                            int i14 = (iHashCode != 3417674 && str.equals("open")) ? 2 : 1;
                                            str2 = (String) Iterators.h(setViewF3.iterator(), "circle");
                                            iHashCode2 = str2.hashCode();
                                            if (iHashCode2 != -1360216880) {
                                                if (iHashCode2 != -905816648) {
                                                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                                                        i12 = 2;
                                                    }
                                                } else if (str2.equals("sesame")) {
                                                    i12 = 3;
                                                }
                                                bVar = new b(i12, i14, i11);
                                            } else {
                                                str2.equals("circle");
                                            }
                                            i12 = 1;
                                            bVar = new b(i12, i14, i11);
                                        } else {
                                            str.equals("filled");
                                        }
                                        str2 = (String) Iterators.h(setViewF3.iterator(), "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i12 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i12 = 3;
                                            }
                                            bVar = new b(i12, i14, i11);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i12 = 1;
                                        bVar = new b(i12, i14, i11);
                                    } else {
                                        bVar = new b(-1, 0, i11);
                                    }
                                } else {
                                    str3 = (String) setViewF.iterator().next();
                                    iHashCode3 = str3.hashCode();
                                    if (iHashCode3 != 3005871) {
                                        int i15 = (iHashCode3 != 3387192 && str3.equals("none")) ? 0 : -1;
                                        bVar = new b(i15, 0, i11);
                                    } else {
                                        str3.equals("auto");
                                    }
                                    bVar = new b(i15, 0, i11);
                                }
                            } else {
                                str4.equals("before");
                            }
                            i11 = 1;
                            setViewF = Sets.f(b.f455e, immutableSetN);
                            if (setViewF.isEmpty()) {
                                str3 = (String) setViewF.iterator().next();
                                iHashCode3 = str3.hashCode();
                                if (iHashCode3 != 3005871) {
                                    if (iHashCode3 != 3387192) {
                                    }
                                    bVar = new b(i15, 0, i11);
                                } else {
                                    str3.equals("auto");
                                }
                                bVar = new b(i15, 0, i11);
                            } else {
                                setViewF2 = Sets.f(b.f457g, immutableSetN);
                                setViewF3 = Sets.f(b.f456f, immutableSetN);
                                if (setViewF2.isEmpty()) {
                                    str = (String) Iterators.h(setViewF2.iterator(), "filled");
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        str2 = (String) Iterators.h(setViewF3.iterator(), "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i12 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i12 = 3;
                                            }
                                            bVar = new b(i12, i14, i11);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i12 = 1;
                                        bVar = new b(i12, i14, i11);
                                    } else {
                                        str.equals("filled");
                                    }
                                    str2 = (String) Iterators.h(setViewF3.iterator(), "circle");
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i12 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i12 = 3;
                                        }
                                        bVar = new b(i12, i14, i11);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i12 = 1;
                                    bVar = new b(i12, i14, i11);
                                } else {
                                    str = (String) Iterators.h(setViewF2.iterator(), "filled");
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        str2 = (String) Iterators.h(setViewF3.iterator(), "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i12 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i12 = 3;
                                            }
                                            bVar = new b(i12, i14, i11);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i12 = 1;
                                        bVar = new b(i12, i14, i11);
                                    } else {
                                        str.equals("filled");
                                    }
                                    str2 = (String) Iterators.h(setViewF3.iterator(), "circle");
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i12 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i12 = 3;
                                        }
                                        bVar = new b(i12, i14, i11);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i12 = 1;
                                    bVar = new b(i12, i14, i11);
                                }
                            }
                        }
                    }
                    hVarA.f513r = bVar;
                    break;
                case 14:
                    String strC6 = Ascii.c(attributeValue);
                    strC6.getClass();
                    if (strC6.equals("before")) {
                        hVarA = a(hVarA);
                        hVarA.f509n = 1;
                    } else if (strC6.equals("after")) {
                        hVarA = a(hVarA);
                        hVarA.f509n = 2;
                    }
                    break;
                case 15:
                    hVarA = a(hVarA);
                    try {
                        hVarA.f500d = b7.e.a(attributeValue, false);
                        hVarA.f501e = true;
                    } catch (IllegalArgumentException unused3) {
                        defpackage.e.B("Failed parsing background value: ", attributeValue);
                    }
                    break;
                case 16:
                    hVarA = a(hVarA);
                    String strC7 = Ascii.c(attributeValue);
                    strC7.getClass();
                    switch (strC7) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    hVarA.f511p = alignment;
                    break;
            }
        }
        return hVarA;
    }

    public static e m(XmlPullParser xmlPullParser) {
        String strR = b7.a.r(xmlPullParser, "extent");
        if (strR == null) {
            return null;
        }
        Matcher matcher = f485t.matcher(strR);
        if (!matcher.matches()) {
            b7.a.B("Ignoring non-pixel tts extent: ".concat(strR));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i11 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new e(i11, Integer.parseInt(strGroup2), 0);
        } catch (NumberFormatException unused) {
            b7.a.B("Ignoring malformed tts extent: ".concat(strR));
            return null;
        }
    }

    @Override // u8.k
    public final void j(byte[] bArr, int i11, int i12, j jVar, b7.g gVar) {
        vc.a.B(h(bArr, i11, i12), jVar, gVar);
    }

    @Override // u8.k
    public final int l() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x020a  */
    /* JADX WARN: Code duplicated, block: B:81:0x01be  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d9  */
    public static void f(XmlPullParser xmlPullParser, HashMap map, int i11, e eVar, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strR;
        float f5;
        float f11;
        float f12;
        float f13;
        float f14;
        int i12;
        int i13;
        g gVar;
        byte b3;
        float f15;
        float f16;
        String strR2;
        h hVar;
        String strR3;
        h hVar2;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (b7.a.x(xmlPullParser, "style")) {
                String strR4 = b7.a.r(xmlPullParser, "style");
                h hVarI = i(xmlPullParser, new h());
                if (strR4 != null) {
                    String strTrim = strR4.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str = f0.f3975a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str2 : strArrSplit) {
                        hVarI.a((h) map.get(str2));
                    }
                }
                String str3 = hVarI.f508l;
                if (str3 != null) {
                    map.put(str3, hVarI);
                }
            } else if (b7.a.x(xmlPullParser, "region")) {
                String strR5 = b7.a.r(xmlPullParser, "id");
                if (strR5 != null) {
                    String strR6 = b7.a.r(xmlPullParser, OSSHeaders.ORIGIN);
                    if (strR6 == null && (strR3 = b7.a.r(xmlPullParser, "style")) != null && (hVar2 = (h) map.get(strR3)) != null) {
                        strR6 = hVar2.f515t;
                    }
                    int i14 = 2;
                    Pattern pattern = f485t;
                    Pattern pattern2 = f484f;
                    if (strR6 != null) {
                        Matcher matcher = pattern2.matcher(strR6);
                        Matcher matcher2 = pattern.matcher(strR6);
                        if (matcher.matches()) {
                            try {
                                String strGroup = matcher.group(1);
                                strGroup.getClass();
                                f5 = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher.group(2);
                                strGroup2.getClass();
                                f11 = Float.parseFloat(strGroup2) / 100.0f;
                            } catch (NumberFormatException unused) {
                                b7.a.B("Ignoring region with malformed origin: ".concat(strR6));
                            }
                        } else if (!matcher2.matches()) {
                            b7.a.B("Ignoring region with unsupported origin: ".concat(strR6));
                        } else if (eVar == null) {
                            b7.a.B("Ignoring region with missing tts:extent: ".concat(strR6));
                        } else {
                            try {
                                String strGroup3 = matcher2.group(1);
                                strGroup3.getClass();
                                int i15 = Integer.parseInt(strGroup3);
                                String strGroup4 = matcher2.group(2);
                                strGroup4.getClass();
                                int i16 = Integer.parseInt(strGroup4);
                                float f17 = i15 / eVar.f478b;
                                f11 = i16 / eVar.f479c;
                                f5 = f17;
                            } catch (NumberFormatException unused2) {
                                b7.a.B("Ignoring region with malformed origin: ".concat(strR6));
                            }
                        }
                        gVar = null;
                    } else {
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        f11 = 0.0f;
                    }
                    String strR7 = b7.a.r(xmlPullParser, "extent");
                    if (strR7 == null && (strR2 = b7.a.r(xmlPullParser, "style")) != null && (hVar = (h) map.get(strR2)) != null) {
                        strR7 = hVar.f516u;
                    }
                    if (strR7 != null) {
                        Matcher matcher3 = pattern2.matcher(strR7);
                        Matcher matcher4 = pattern.matcher(strR7);
                        if (matcher3.matches()) {
                            try {
                                String strGroup5 = matcher3.group(1);
                                strGroup5.getClass();
                                f15 = Float.parseFloat(strGroup5) / 100.0f;
                                String strGroup6 = matcher3.group(2);
                                strGroup6.getClass();
                                f16 = Float.parseFloat(strGroup6) / 100.0f;
                            } catch (NumberFormatException unused3) {
                                defpackage.e.B("Ignoring region with malformed extent: ", strR6);
                                gVar = null;
                            }
                        } else {
                            if (!matcher4.matches()) {
                                defpackage.e.B("Ignoring region with unsupported extent: ", strR6);
                            } else if (eVar == null) {
                                defpackage.e.B("Ignoring region with missing tts:extent: ", strR6);
                            } else {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i17 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i18 = Integer.parseInt(strGroup8);
                                float f18 = i17 / eVar.f478b;
                                f16 = i18 / eVar.f479c;
                                f15 = f18;
                            }
                            gVar = null;
                        }
                        f12 = f15;
                        f13 = f16;
                    } else {
                        f12 = 1.0f;
                        f13 = 1.0f;
                    }
                    String strR8 = b7.a.r(xmlPullParser, "displayAlign");
                    if (strR8 != null) {
                        String strC = Ascii.c(strR8);
                        strC.getClass();
                        if (strC.equals("center")) {
                            f14 = f11 + (f13 / 2.0f);
                            i12 = 1;
                        } else if (strC.equals("after")) {
                            f14 = f11 + f13;
                            i12 = 2;
                        } else {
                            f14 = f11;
                            i12 = 0;
                        }
                    } else {
                        f14 = f11;
                        i12 = 0;
                    }
                    float f19 = 1.0f / i11;
                    String strR9 = b7.a.r(xmlPullParser, "writingMode");
                    if (strR9 != null) {
                        String strC2 = Ascii.c(strR9);
                        strC2.getClass();
                        switch (strC2.hashCode()) {
                            case 3694:
                                if (strC2.equals("tb")) {
                                    b3 = 0;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 3553396:
                                if (strC2.equals(gkbGsXmgaxRjJ.yITHR)) {
                                    b3 = 1;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 3553576:
                                if (strC2.equals("tbrl")) {
                                    b3 = 2;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            case 0:
                            case 1:
                                i13 = i14;
                                break;
                            case 2:
                                i13 = 1;
                                break;
                            default:
                                i14 = Integer.MIN_VALUE;
                                i13 = i14;
                                break;
                        }
                    } else {
                        i14 = Integer.MIN_VALUE;
                        i13 = i14;
                    }
                    gVar = new g(strR5, f5, f14, 0, i12, f12, f13, 1, f19, i13);
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    map2.put(gVar.f487a, gVar);
                }
            } else if (b7.a.x(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (b7.a.x(xmlPullParser, "image") && (strR = b7.a.r(xmlPullParser, "id")) != null) {
                        map3.put(strR, xmlPullParser.nextText());
                    }
                } while (!b7.a.v(xmlPullParser, "metadata"));
            }
        } while (!b7.a.v(xmlPullParser, "head"));
    }

    public static long k(String str, d dVar) throws SubtitleDecoderException {
        double d5;
        double d11;
        Matcher matcher = f480b.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d12 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            double d13 = d12 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d14 = d13 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d15 = d14 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d16 = d15 + (strGroup5 != null ? Long.parseLong(strGroup5) / dVar.f474a : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d16 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) dVar.f475b)) / ((double) dVar.f474a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f481c.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(ep.a.e(PQgum.sKnfEPJSFOuBh, str));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d17 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        switch (strGroup8) {
            case "f":
                d5 = dVar.f474a;
                d17 /= d5;
                return (long) (d17 * 1000000.0d);
            case "h":
                d11 = 3600.0d;
                break;
            case "m":
                d11 = 60.0d;
                break;
            case "t":
                d5 = dVar.f476c;
                d17 /= d5;
                return (long) (d17 * 1000000.0d);
            case "ms":
                d5 = 1000.0d;
                d17 /= d5;
                return (long) (d17 * 1000000.0d);
            default:
                return (long) (d17 * 1000000.0d);
        }
        d17 *= d11;
        return (long) (d17 * 1000000.0d);
    }

    @Override // u8.k
    public final u8.d h(byte[] bArr, int i11, int i12) {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f486a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put(BuildConfig.VERSION_NAME, new g(BuildConfig.VERSION_NAME, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            e eVarM = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i11, i12), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVarE = K;
            int i13 = 0;
            int iC = 15;
            i iVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i13 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVarE = e(xmlPullParserNewPullParser);
                            iC = c(xmlPullParserNewPullParser);
                            eVarM = m(xmlPullParserNewPullParser);
                        }
                        d dVar = dVarE;
                        e eVar = eVarM;
                        int i14 = iC;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                f(xmlPullParserNewPullParser, map, i14, eVar, map2, map3);
                            } else {
                                try {
                                    c cVarG = g(xmlPullParserNewPullParser, cVar, map2, dVar);
                                    arrayDeque.push(cVarG);
                                    if (cVar != null) {
                                        if (cVar.m == null) {
                                            cVar.m = new ArrayList();
                                        }
                                        cVar.m.add(cVarG);
                                    }
                                } catch (SubtitleDecoderException e8) {
                                    b7.a.C("Suppressing parser error", e8);
                                    i13++;
                                }
                            }
                            iC = i14;
                            eVarM = eVar;
                            dVarE = dVar;
                        } else {
                            b7.a.u("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i13++;
                        iC = i14;
                        eVarM = eVar;
                        dVarE = dVar;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c cVarA = c.a(xmlPullParserNewPullParser.getText());
                        if (cVar.m == null) {
                            cVar.m = new ArrayList();
                        }
                        cVar.m.add(cVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            iVar = new i(cVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i13++;
                } else if (eventType == 3) {
                    i13--;
                }
                xmlPullParserNewPullParser.next();
            }
            iVar.getClass();
            return iVar;
        } catch (IOException e10) {
            throw new IllegalStateException(xItStCyvVEZ.CroFeZycZoQvTE, e10);
        } catch (XmlPullParserException e11) {
            throw new IllegalStateException("Unable to decode source", e11);
        }
    }
}

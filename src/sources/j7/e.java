package j7;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.ParserException;
import b7.f0;
import com.google.common.base.Ascii;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o20.w;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import su.Mbl.tcppUUQxZjFdy;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends DefaultHandler implements t7.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f36118b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f36119c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f36120d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f36121e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f36122f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f36123a;

    public e() {
        try {
            this.f36123a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e8) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e8);
        }
    }

    public static long a(ArrayList arrayList, long j11, long j12, int i11, long j13) {
        int i12;
        if (i11 >= 0) {
            i12 = i11 + 1;
        } else {
            String str = f0.f3975a;
            i12 = (int) ((((j13 - j11) + j12) - 1) / j12);
        }
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(new q(j11, j12));
            j11 += j12;
        }
        return j11;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i11 = 1;
            while (i11 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i11++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i11--;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0093 A[PHI: r13
      0x0093: PHI (r13v30 int) = (r13v5 int), (r13v8 int), (r13v33 int) binds: [B:128:0x01a3, B:120:0x0190, B:47:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    public static int c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i11 = 5;
        byte b3 = 4;
        int i12 = 0;
        int i13 = -1;
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                iBitCount = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (iBitCount > 0 && iBitCount < 33) {
                    i13 = iBitCount;
                    break;
                }
                break;
            case "tag:dolby.com,2015:dash:audio_channel_configuration:2015":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null && attributeValue3.length() == 6) {
                    int i14 = Integer.parseInt(attributeValue3, 16);
                    if ((8388608 & i14) == 0) {
                        iBitCount = 0;
                        while (true) {
                            int[] iArr = f36121e;
                            if (i12 < iArr.length) {
                                iBitCount += ((i14 >> i12) & 1) * iArr[i12];
                                i12++;
                            } else if (iBitCount != 0) {
                                i13 = iBitCount;
                            }
                        }
                    } else {
                        String[] strArrU = f0.U(str);
                        if (strArrU.length != 0) {
                            List listE = Splitter.a('.').e(Ascii.c(strArrU[0].trim()));
                            if (listE.size() == 4 && ((String) listE.get(0)).equals("ac-4")) {
                                String str2 = (String) listE.get(3);
                                str2.getClass();
                                if (str2.equals("03")) {
                                    i13 = 18;
                                } else if (str2.equals("04")) {
                                    i13 = 21;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 != null) {
                    i13 = Integer.parseInt(attributeValue4);
                    break;
                }
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue5 != null) {
                    String strC = Ascii.c(attributeValue5);
                    strC.getClass();
                    switch (strC.hashCode()) {
                        case 1596796:
                            b3 = !strC.equals("4000") ? (byte) -1 : (byte) 0;
                            break;
                        case 2937391:
                            b3 = !strC.equals("a000") ? (byte) -1 : (byte) 1;
                            break;
                        case 3094034:
                            b3 = !strC.equals("f800") ? (byte) -1 : (byte) 2;
                            break;
                        case 3094035:
                            b3 = !strC.equals("f801") ? (byte) -1 : (byte) 3;
                            break;
                        case 3133436:
                            if (!strC.equals("fa01")) {
                                b3 = -1;
                            }
                            break;
                        default:
                            b3 = -1;
                            break;
                    }
                    switch (b3) {
                        case 0:
                            i11 = 1;
                            break;
                        case 1:
                            i11 = 2;
                            break;
                        case 2:
                            break;
                        case 3:
                            i11 = 6;
                            break;
                        case 4:
                            i11 = 8;
                            break;
                        default:
                            i11 = -1;
                            break;
                    }
                } else {
                    i11 = -1;
                }
                i13 = i11;
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                int i15 = attributeValue6 == null ? -1 : Integer.parseInt(attributeValue6);
                if (i15 >= 0) {
                    int[] iArr2 = f36122f;
                    if (i15 < iArr2.length) {
                        i13 = iArr2[i15];
                    }
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue7 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue7 != null && (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue7, 16))) != 0) {
                    i13 = iBitCount;
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!b7.a.v(xmlPullParser, "AudioChannelConfiguration"));
        return i13;
    }

    public static long d(XmlPullParser xmlPullParser, long j11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j11;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList f(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z11) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i11 = attributeValue != null ? Integer.parseInt(attributeValue) : z11 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i12 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = BuildConfig.VERSION_NAME;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!b7.a.v(xmlPullParser, "BaseURL"));
        if (text != null && b7.a.t(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return Lists.b(new b(text, i11, i12, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            b bVar = (b) arrayList.get(i13);
            String strZ = b7.a.z(bVar.f36094a, text);
            String str = attributeValue3 == null ? strZ : attributeValue3;
            if (z11) {
                i11 = bVar.f36096c;
                i12 = bVar.f36097d;
                str = bVar.f36095b;
            }
            arrayList2.add(new b(strZ, i11, i12, str));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:81:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x013d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static Pair g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? text;
        ?? A;
        UUID uuid3;
        String attributeValue2;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String strC = Ascii.c(attributeValue3);
            strC.getClass();
            switch (strC) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = y6.f.f57190c;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    A = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = y6.f.f57192e;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    A = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = y6.f.f57191d;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    A = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= attributeCount) {
                            attributeValue2 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i11);
                            int iIndexOf = attributeName.indexOf(58);
                            if (iIndexOf != -1) {
                                attributeName = attributeName.substring(iIndexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                attributeValue2 = xmlPullParser.getAttributeValue(i11);
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(attributeValue2) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue2)) {
                        String[] strArrSplit = attributeValue2.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                            uuidArr[i12] = UUID.fromString(strArrSplit[i12]);
                        }
                        uuid = y6.f.f57189b;
                        text = 0;
                        A = r8.m.a(uuid, uuidArr, null);
                        break;
                    } else {
                        b7.a.B("Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        uuid = null;
                        uuid2 = uuid;
                        text = uuid2;
                        A = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    text = uuid2;
                    A = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            text = uuid2;
            A = uuid2;
        }
        do {
            xmlPullParser.next();
            if ((b7.a.x(xmlPullParser, "clearkey:Laurl") || b7.a.x(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                A = A;
                text = xmlPullParser.getText();
            } else if (b7.a.x(xmlPullParser, "ms:laurl")) {
                A = A;
                text = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (A == 0 && xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                int iIndexOf2 = name.indexOf(58);
                if (iIndexOf2 != -1) {
                    name = name.substring(iIndexOf2 + 1);
                }
                if (name.equals("pssh") && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    w wVarI = r8.m.i(bArrDecode);
                    UUID uuid4 = wVarI == null ? null : (UUID) wVarI.f44617b;
                    if (uuid4 == null) {
                        b7.a.B("Skipping malformed cenc:pssh data");
                        uuid = uuid4;
                        A = 0;
                        text = text;
                    } else {
                        UUID uuid5 = uuid4;
                        A = bArrDecode;
                        uuid = uuid5;
                        text = text;
                    }
                } else if (A == 0) {
                    uuid3 = y6.f.f57192e;
                    if (!uuid3.equals(uuid)) {
                        b(xmlPullParser);
                        A = A;
                        text = text;
                    } else {
                        b(xmlPullParser);
                        A = A;
                        text = text;
                    }
                } else {
                    b(xmlPullParser);
                    A = A;
                    text = text;
                }
            } else if (A == 0) {
                uuid3 = y6.f.f57192e;
                if (!uuid3.equals(uuid) && b7.a.x(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    A = r8.m.a(uuid3, null, Base64.decode(xmlPullParser.getText(), 0));
                    text = text;
                } else {
                    b(xmlPullParser);
                    A = A;
                    text = text;
                }
            } else {
                b(xmlPullParser);
                A = A;
                text = text;
            }
        } while (!b7.a.v(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new y6.k(uuid, text, "video/mp4", A) : null);
    }

    public static int h(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if (tcppUUQxZjFdy.hOZ.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static f i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = EHjhWcesDUIsIw.EqpWyoBvF;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!b7.a.v(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j11) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j11;
        }
        Matcher matcher = f0.f3979e.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d5 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d11 = d5 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d12 = d11 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d13 = d12 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d14 = d13 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j12 = (long) ((d14 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j12 : j12;
    }

    public static float k(XmlPullParser xmlPullParser, float f5) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f36118b.matcher(attributeValue);
            if (matcher.matches()) {
                int i11 = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                return !TextUtils.isEmpty(strGroup) ? i11 / Integer.parseInt(strGroup) : i11;
            }
        }
        return f5;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.instructions.PhiInsn.getResult()" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:117)
        	at jadx.core.dex.visitors.InitCodeVariables.lambda$collectConnectedVars$1(InitCodeVariables.java:124)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:121)
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        */
    public static j7.c l(org.xmlpull.v1.XmlPullParser r164, android.net.Uri r165) {
        /*
            Method dump skipped, instruction units count: 5192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.e.l(org.xmlpull.v1.XmlPullParser, android.net.Uri):j7.c");
    }

    public static j m(XmlPullParser xmlPullParser, String str, String str2) {
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j12 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j11 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j12 = (Long.parseLong(strArrSplit[1]) - j11) + 1;
            }
        } else {
            j11 = 0;
        }
        return new j(attributeValue, j11, j12);
    }

    public static int n(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return 256;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int o(ArrayList arrayList) {
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (Ascii.a("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i12)).f36124a)) {
                i11 = 16384;
            }
        }
        return i11;
    }

    public static r p(XmlPullParser xmlPullParser, r rVar) throws XmlPullParserException, IOException {
        long j11 = rVar != null ? rVar.f36166b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j11 = Long.parseLong(attributeValue);
        }
        long j12 = j11;
        long j13 = rVar != null ? rVar.f36167c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j13 = Long.parseLong(attributeValue2);
        }
        long j14 = j13;
        long j15 = rVar != null ? rVar.f36163d : 0L;
        long j16 = rVar != null ? rVar.f36164e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j15 = Long.parseLong(strArrSplit[0]);
            j16 = (Long.parseLong(strArrSplit[1]) - j15) + 1;
        }
        long j17 = j16;
        long j18 = j15;
        j jVarM = rVar != null ? rVar.f36165a : null;
        while (true) {
            xmlPullParser.next();
            if (b7.a.x(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar = jVarM;
            if (b7.a.v(xmlPullParser, "SegmentBase")) {
                return new r(jVar, j12, j14, j18, j17);
            }
            jVarM = jVar;
        }
    }

    public static o q(XmlPullParser xmlPullParser, o oVar, long j11, long j12, long j13, long j14, long j15) throws XmlPullParserException, IOException {
        long j16 = oVar != null ? oVar.f36166b : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j16 = Long.parseLong(attributeValue);
        }
        long j17 = j16;
        long j18 = oVar != null ? oVar.f36167c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j18 = Long.parseLong(attributeValue2);
        }
        long j19 = j18;
        long j21 = oVar != null ? oVar.f36152e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j21 = Long.parseLong(attributeValue3);
        }
        long j22 = j21;
        long j23 = oVar != null ? oVar.f36151d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j23 = Long.parseLong(attributeValue4);
        }
        long j24 = j23;
        long j25 = j14 == -9223372036854775807L ? j13 : j14;
        long j26 = j25 == Long.MAX_VALUE ? -9223372036854775807L : j25;
        j jVarM = null;
        List listS = null;
        do {
            xmlPullParser.next();
            if (b7.a.x(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else if (b7.a.x(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j17, j12);
            } else if (b7.a.x(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!b7.a.v(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVarM == null) {
                jVarM = oVar.f36165a;
            }
            if (listS == null) {
                listS = oVar.f36153f;
            }
            if (arrayList == null) {
                arrayList = oVar.f36157j;
            }
        }
        return new o(jVarM, j17, j19, j24, j22, listS, j26, arrayList, f0.K(j15), f0.K(j11));
    }

    public static p r(XmlPullParser xmlPullParser, p pVar, List list, long j11, long j12, long j13, long j14, long j15) throws XmlPullParserException, IOException {
        long j16;
        long j17 = pVar != null ? pVar.f36166b : 1L;
        j jVarM = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j17 = Long.parseLong(attributeValue);
        }
        long j18 = j17;
        long j19 = pVar != null ? pVar.f36167c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j19 = Long.parseLong(attributeValue2);
        }
        long j21 = j19;
        long j22 = pVar != null ? pVar.f36152e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j22 = Long.parseLong(attributeValue3);
        }
        long j23 = j22;
        long j24 = pVar != null ? pVar.f36151d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j24 = Long.parseLong(attributeValue4);
        }
        long j25 = j24;
        int i11 = 0;
        while (true) {
            if (i11 >= list.size()) {
                j16 = -1;
                break;
            }
            f fVar = (f) list.get(i11);
            if (Ascii.a("http://dashif.org/guidelines/last-segment-number", fVar.f36124a)) {
                j16 = Long.parseLong(fVar.f36125b);
                break;
            }
            i11++;
        }
        long j26 = j16;
        long j27 = j14 == -9223372036854775807L ? j13 : j14;
        long j28 = j27 == Long.MAX_VALUE ? -9223372036854775807L : j27;
        xq.c cVarT = t(xmlPullParser, "media", pVar != null ? pVar.f36159k : null);
        xq.c cVarT2 = t(xmlPullParser, "initialization", pVar != null ? pVar.f36158j : null);
        List listS = null;
        do {
            xmlPullParser.next();
            if (b7.a.x(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else if (b7.a.x(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j18, j12);
            } else {
                b(xmlPullParser);
            }
        } while (!b7.a.v(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVarM == null) {
                jVarM = pVar.f36165a;
            }
            if (listS == null) {
                listS = pVar.f36153f;
            }
        }
        return new p(jVarM, j18, j21, j25, j26, j23, listS, j28, cVarT2, cVarT, f0.K(j15), f0.K(j11));
    }

    public static ArrayList s(XmlPullParser xmlPullParser, long j11, long j12) throws XmlPullParserException, IOException {
        long j13;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j14 = -9223372036854775807L;
        boolean z11 = false;
        int i11 = 0;
        do {
            xmlPullParser.next();
            if (b7.a.x(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j15 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z11) {
                    int i12 = i11;
                    j13 = j15;
                    jA = a(arrayList, jA, j14, i12, j13);
                } else {
                    j13 = j15;
                }
                if (j13 != -9223372036854775807L) {
                    jA = j13;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j14 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i11 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z11 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!b7.a.v(xmlPullParser, "SegmentTimeline"));
        if (z11) {
            String str = f0.f3975a;
            a(arrayList, jA, j14, i11, f0.R(j12, j11, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00ff. Please report as an issue. */
    public static xq.c t(XmlPullParser xmlPullParser, String str, xq.c cVar) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return cVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add(BuildConfig.VERSION_NAME);
        int length = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length));
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                length += 2;
            } else {
                arrayList3.add(BuildConfig.VERSION_NAME);
                int i11 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i11);
                String strSubstring2 = attributeValue.substring(i11, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, strSubstring);
                }
                arrayList.add(BuildConfig.VERSION_NAME);
                length = iIndexOf2 + 1;
            }
        }
        return new xq.c(arrayList, arrayList2, arrayList3, 15);
    }

    @Override // t7.p
    public final Object e(Uri uri, d7.g gVar) throws ParserException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f36123a.newPullParser();
            xmlPullParserNewPullParser.setInput(gVar, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return l(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e8) {
            throw ParserException.b(null, e8);
        }
    }
}

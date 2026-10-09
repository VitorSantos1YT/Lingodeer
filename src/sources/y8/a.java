package y8;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import app.rive.runtime.kotlin.fonts.Fonts;
import b7.f0;
import b7.g;
import b7.w;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u8.j;
import u8.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f57429t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f57430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w8.b f57431b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedHashMap f57433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f57434e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f57435f = -3.4028235E38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f57432c = new w();

    public a(List list) {
        if (list == null || list.isEmpty()) {
            this.f57430a = false;
            this.f57431b = null;
            return;
        }
        this.f57430a = true;
        String strN = f0.n((byte[]) list.get(0));
        b7.a.d(strN.startsWith("Format:"));
        w8.b bVarA = w8.b.a(strN);
        bVarA.getClass();
        this.f57431b = bVarA;
        b(new w((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j11, ArrayList arrayList, ArrayList arrayList2) {
        int i11;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i11 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j11) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j11) {
                i11 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i11, Long.valueOf(j11));
        arrayList2.add(i11, i11 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i11 - 1)));
        return i11;
    }

    public static long c(String str) {
        Matcher matcher = f57429t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = f0.f3975a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Code duplicated, block: B:169:0x02e0  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void b(w wVar, Charset charset) {
        int i11;
        d dVar;
        while (true) {
            String strK = wVar.k(charset);
            if (strK == null) {
                return;
            }
            int i12 = 2;
            int i13 = 0;
            if ("[Script Info]".equalsIgnoreCase(strK)) {
                while (true) {
                    String strK2 = wVar.k(charset);
                    if (strK2 == null) {
                        break;
                    }
                    if (wVar.a() != 0) {
                        int iG = wVar.g(charset);
                        if ((iG != 0 ? Ints.b(iG >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] strArrSplit = strK2.split(":");
                    if (strArrSplit.length == 2) {
                        String strC = Ascii.c(strArrSplit[0].trim());
                        strC.getClass();
                        if (strC.equals("playresx")) {
                            this.f57434e = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strC.equals("playresy")) {
                            try {
                                this.f57435f = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strK)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    b bVar = null;
                    while (true) {
                        String strK3 = wVar.k(charset);
                        if (strK3 != null) {
                            if (wVar.a() != 0) {
                                int iG2 = wVar.g(charset);
                                if ((iG2 != 0 ? Ints.b(iG2 >>> 8) : 1114112) == 91) {
                                }
                            }
                            int i14 = -1;
                            if (strK3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strK3.substring(7), ",");
                                int i15 = -1;
                                int i16 = -1;
                                int i17 = -1;
                                int i18 = -1;
                                int i19 = -1;
                                int i21 = -1;
                                int i22 = -1;
                                int i23 = -1;
                                int i24 = -1;
                                int i25 = -1;
                                for (int i26 = i13; i26 < strArrSplit2.length; i26++) {
                                    String strC2 = Ascii.c(strArrSplit2[i26].trim());
                                    strC2.getClass();
                                    switch (strC2.hashCode()) {
                                        case -1178781136:
                                            i11 = strC2.equals(Fonts.Font.STYLE_ITALIC) ? i13 : -1;
                                            break;
                                        case -1026963764:
                                            i11 = strC2.equals("underline") ? 1 : -1;
                                            break;
                                        case -192095652:
                                            i11 = strC2.equals("strikeout") ? i12 : -1;
                                            break;
                                        case -70925746:
                                            i11 = strC2.equals("primarycolour") ? 3 : -1;
                                            break;
                                        case 3029637:
                                            i11 = strC2.equals("bold") ? 4 : -1;
                                            break;
                                        case 3373707:
                                            i11 = strC2.equals("name") ? 5 : -1;
                                            break;
                                        case 366554320:
                                            i11 = strC2.equals("fontsize") ? 6 : -1;
                                            break;
                                        case 767321349:
                                            i11 = strC2.equals("borderstyle") ? 7 : -1;
                                            break;
                                        case 1767875043:
                                            i11 = strC2.equals("alignment") ? 8 : -1;
                                            break;
                                        case 1988365454:
                                            i11 = strC2.equals("outlinecolour") ? 9 : -1;
                                            break;
                                        default:
                                            i11 = -1;
                                            break;
                                    }
                                    switch (i11) {
                                        case 0:
                                            i22 = i26;
                                            break;
                                        case 1:
                                            i23 = i26;
                                            break;
                                        case 2:
                                            i24 = i26;
                                            break;
                                        case 3:
                                            i17 = i26;
                                            break;
                                        case 4:
                                            i21 = i26;
                                            break;
                                        case 5:
                                            i15 = i26;
                                            break;
                                        case 6:
                                            i19 = i26;
                                            break;
                                        case 7:
                                            i25 = i26;
                                            break;
                                        case 8:
                                            i16 = i26;
                                            break;
                                        case 9:
                                            i18 = i26;
                                            break;
                                    }
                                }
                                if (i15 != -1) {
                                    bVar = new b(i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, strArrSplit2.length);
                                }
                            } else {
                                if (strK3.startsWith("Style:")) {
                                    if (bVar == null) {
                                        b7.a.B("Skipping 'Style:' line before 'Format:' line: ".concat(strK3));
                                    } else {
                                        b7.a.d(strK3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strK3.substring(6), ",");
                                        int length = strArrSplit3.length;
                                        int i27 = bVar.f57446k;
                                        if (length != i27) {
                                            int length2 = strArrSplit3.length;
                                            String str = f0.f3975a;
                                            Locale locale = Locale.US;
                                            StringBuilder sbK = w4.c.k("Skipping malformed 'Style:' line (expected ", i27, " values, found ", length2, "): '");
                                            sbK.append(strK3);
                                            sbK.append("'");
                                            b7.a.B(sbK.toString());
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[bVar.f57436a].trim();
                                                int i28 = bVar.f57437b;
                                                int iA = i28 != -1 ? d.a(strArrSplit3[i28].trim()) : -1;
                                                int i29 = bVar.f57438c;
                                                Integer numC = i29 != -1 ? d.c(strArrSplit3[i29].trim()) : null;
                                                int i30 = bVar.f57439d;
                                                Integer numC2 = i30 != -1 ? d.c(strArrSplit3[i30].trim()) : null;
                                                int i31 = bVar.f57440e;
                                                float f5 = -3.4028235E38f;
                                                if (i31 != -1) {
                                                    String strTrim2 = strArrSplit3[i31].trim();
                                                    try {
                                                        f5 = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e8) {
                                                        b7.a.C("Failed to parse font size: '" + strTrim2 + "'", e8);
                                                    }
                                                }
                                                float f11 = f5;
                                                int i32 = bVar.f57441f;
                                                boolean z11 = i32 != -1 && d.b(strArrSplit3[i32].trim());
                                                int i33 = bVar.f57442g;
                                                boolean z12 = i33 != -1 && d.b(strArrSplit3[i33].trim());
                                                int i34 = bVar.f57443h;
                                                boolean z13 = i34 != -1 && d.b(strArrSplit3[i34].trim());
                                                int i35 = bVar.f57444i;
                                                boolean z14 = i35 != -1 && d.b(strArrSplit3[i35].trim());
                                                int i36 = bVar.f57445j;
                                                if (i36 != -1) {
                                                    String strTrim3 = strArrSplit3[i36].trim();
                                                    try {
                                                        int i37 = Integer.parseInt(strTrim3.trim());
                                                        if (i37 == 1 || i37 == 3) {
                                                            i14 = i37;
                                                        } else {
                                                            b7.a.B("Ignoring unknown BorderStyle: " + strTrim3);
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                }
                                                dVar = new d(strTrim, iA, numC, numC2, f11, z11, z12, z13, z14, i14);
                                            } catch (RuntimeException e10) {
                                                b7.a.C("Skipping malformed 'Style:' line: '" + strK3 + "'", e10);
                                                dVar = null;
                                            }
                                            if (dVar != null) {
                                                linkedHashMap.put(dVar.f57451a, dVar);
                                            }
                                        }
                                        dVar = null;
                                        if (dVar != null) {
                                            linkedHashMap.put(dVar.f57451a, dVar);
                                        }
                                    }
                                }
                                i12 = 2;
                                i13 = 0;
                            }
                        }
                    }
                }
                this.f57433d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strK)) {
                b7.a.u("[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strK)) {
                return;
            }
        }
    }

    @Override // u8.k
    public final void j(byte[] bArr, int i11, int i12, j jVar, g gVar) {
        long j11;
        w8.b bVar;
        w wVar;
        int i13;
        int i14;
        float f5;
        int i15;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i16;
        int i17;
        int i18;
        float f11;
        float f12;
        float f13;
        int i19;
        int i21;
        float f14;
        int i22;
        int i23;
        float f15;
        int i24;
        int iA;
        int i25;
        a aVar = this;
        long j12 = jVar.f52841a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        w wVar2 = aVar.f57432c;
        wVar2.G(bArr, i11 + i12);
        wVar2.I(i11);
        Charset charsetE = wVar2.E();
        if (charsetE == null) {
            charsetE = StandardCharsets.UTF_8;
        }
        boolean z11 = aVar.f57430a;
        if (!z11) {
            aVar.b(wVar2, charsetE);
        }
        w8.b bVarA = z11 ? aVar.f57431b : null;
        while (true) {
            String strK = wVar2.k(charsetE);
            if (strK == null) {
                long j13 = j12;
                ArrayList arrayList3 = (j13 == -9223372036854775807L || !jVar.f52842b) ? null : new ArrayList();
                for (int i26 = 0; i26 < arrayList.size(); i26++) {
                    List list = (List) arrayList.get(i26);
                    if (!list.isEmpty() || i26 == 0) {
                        if (i26 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i26)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i26 + 1)).longValue();
                        u8.a aVar2 = new u8.a(jLongValue, jLongValue2 - jLongValue, list);
                        if (j13 == -9223372036854775807L || jLongValue2 >= j13) {
                            gVar.accept(aVar2);
                        } else if (arrayList3 != null) {
                            arrayList3.add(aVar2);
                        }
                    }
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i27 = 0;
                    while (i27 < size) {
                        Object obj = arrayList3.get(i27);
                        i27++;
                        gVar.accept((u8.a) obj);
                    }
                    return;
                }
                return;
            }
            if (strK.startsWith("Format:")) {
                bVarA = w8.b.a(strK);
            } else {
                if (strK.startsWith("Dialogue:")) {
                    if (bVarA == null) {
                        b7.a.B("Skipping dialogue line before complete format: ".concat(strK));
                    } else {
                        int i28 = bVarA.f54713f;
                        b7.a.d(strK.startsWith("Dialogue:"));
                        String strSubstring = strK.substring(9);
                        int i29 = bVarA.f54708a;
                        String[] strArrSplit = strSubstring.split(",", i28);
                        if (strArrSplit.length != i28) {
                            b7.a.B("Skipping dialogue line with fewer columns than format: ".concat(strK));
                        } else {
                            if (i29 != -1) {
                                try {
                                    i13 = Integer.parseInt(strArrSplit[i29].trim());
                                } catch (RuntimeException unused) {
                                    b7.a.B("Fail to parse layer: " + strArrSplit[i29]);
                                    i13 = 0;
                                }
                            } else {
                                i13 = 0;
                            }
                            long jC = c(strArrSplit[bVarA.f54709b]);
                            if (jC == -9223372036854775807L) {
                                b7.a.B("Skipping invalid timing: ".concat(strK));
                            } else {
                                j11 = j12;
                                long jC2 = c(strArrSplit[bVarA.f54710c]);
                                if (jC2 == -9223372036854775807L || jC2 <= jC) {
                                    bVar = bVarA;
                                    wVar = wVar2;
                                    b7.a.B("Skipping invalid timing: ".concat(strK));
                                } else {
                                    LinkedHashMap linkedHashMap = aVar.f57433d;
                                    d dVar = (linkedHashMap == null || (i25 = bVarA.f54711d) == -1) ? null : (d) linkedHashMap.get(strArrSplit[i25].trim());
                                    String str = strArrSplit[bVarA.f54712e];
                                    Matcher matcher = c.f57447a.matcher(str);
                                    PointF pointF = null;
                                    int i30 = -1;
                                    while (matcher.find()) {
                                        w8.b bVar2 = bVarA;
                                        w wVar3 = wVar2;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFA = c.a(strGroup);
                                            if (pointFA != null) {
                                                pointF = pointFA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        try {
                                            Matcher matcher2 = c.f57450d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iA = d.a(strGroup2);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i30 = iA;
                                            }
                                        } catch (RuntimeException unused3) {
                                        }
                                        bVarA = bVar2;
                                        wVar2 = wVar3;
                                    }
                                    bVar = bVarA;
                                    wVar = wVar2;
                                    String strReplace = c.f57447a.matcher(str).replaceAll(BuildConfig.VERSION_NAME).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f16 = aVar.f57434e;
                                    float f17 = aVar.f57435f;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (dVar != null) {
                                        boolean z12 = dVar.f57457g;
                                        Integer num = dVar.f57454d;
                                        Integer num2 = dVar.f57453c;
                                        if (num2 != null) {
                                            i19 = 33;
                                            i21 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i19 = 33;
                                            i21 = 0;
                                        }
                                        if (dVar.f57460j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i21, spannableString.length(), i19);
                                        }
                                        float f18 = dVar.f57455e;
                                        if (f18 == -3.4028235E38f || f17 == -3.4028235E38f) {
                                            f14 = -3.4028235E38f;
                                            i22 = Integer.MIN_VALUE;
                                        } else {
                                            f14 = f18 / f17;
                                            i22 = 1;
                                        }
                                        boolean z13 = dVar.f57456f;
                                        if (z13 && z12) {
                                            i23 = i22;
                                            f15 = f14;
                                            i24 = 33;
                                            i14 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i23 = i22;
                                            f15 = f14;
                                            i24 = 33;
                                            i14 = 0;
                                            if (z13) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z12 != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (dVar.f57458h) {
                                            spannableString.setSpan(new UnderlineSpan(), i14, spannableString.length(), i24);
                                        }
                                        if (dVar.f57459i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i14, spannableString.length(), i24);
                                        }
                                        i15 = i23;
                                        f5 = f15;
                                    } else {
                                        f16 = f16;
                                        f17 = f17;
                                        i14 = 0;
                                        f5 = -3.4028235E38f;
                                        i15 = Integer.MIN_VALUE;
                                    }
                                    if (i30 == -1) {
                                        i30 = dVar != null ? dVar.f57452b : -1;
                                    }
                                    switch (i30) {
                                        case 0:
                                        default:
                                            e.y(i30, "Unknown alignment: ");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i31 = Integer.MIN_VALUE;
                                    switch (i30) {
                                        case 0:
                                        default:
                                            e.y(i30, "Unknown alignment: ");
                                        case -1:
                                            i16 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i16 = i14;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i16 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i16 = 2;
                                            break;
                                    }
                                    switch (i30) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            e.y(i30, "Unknown alignment: ");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i31 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i31 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i31 = i14;
                                            break;
                                    }
                                    if (pointF == null || f17 == -3.4028235E38f || f16 == -3.4028235E38f) {
                                        float f19 = 0.95f;
                                        if (i16 != 0) {
                                            i18 = 1;
                                            if (i16 != 1) {
                                                i17 = 2;
                                                f11 = i16 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i17 = 2;
                                                f11 = 0.5f;
                                            }
                                        } else {
                                            i17 = 2;
                                            i18 = 1;
                                            f11 = 0.05f;
                                        }
                                        if (i31 == 0) {
                                            f19 = 0.05f;
                                        } else if (i31 == i18) {
                                            f19 = 0.5f;
                                        } else if (i31 != i17) {
                                            f19 = -3.4028235E38f;
                                        }
                                        f12 = f19;
                                        f13 = f11;
                                    } else {
                                        f13 = pointF.x / f16;
                                        f12 = pointF.y / f17;
                                    }
                                    a7.b bVar3 = new a7.b(spannableString, alignment2, null, null, f12, i14, i31, f13, i16, i15, f5, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, CropImageView.DEFAULT_ASPECT_RATIO, i13);
                                    int iA2 = a(jC2, arrayList2, arrayList);
                                    for (int iA3 = a(jC, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                        ((List) arrayList.get(iA3)).add(bVar3);
                                    }
                                }
                            }
                        }
                    }
                    j11 = j12;
                    bVar = bVarA;
                    wVar = wVar2;
                } else {
                    j11 = j12;
                    bVar = bVarA;
                    wVar = wVar2;
                }
                aVar = this;
                j12 = j11;
                charsetE = charsetE;
                bVarA = bVar;
                wVar2 = wVar;
            }
        }
    }

    @Override // u8.k
    public final int l() {
        return 1;
    }
}

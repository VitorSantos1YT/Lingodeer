package z8;

import a7.b;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import b7.g;
import b7.w;
import com.google.common.collect.ImmutableList;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u8.j;
import u8.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f59028d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f59029e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f59030a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f59031b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f59032c = new w();

    public static long b(Matcher matcher, int i11) {
        String strGroup = matcher.group(i11 + 1);
        long j11 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i11 + 2);
        strGroup2.getClass();
        long j12 = (Long.parseLong(strGroup2) * 60000) + j11;
        String strGroup3 = matcher.group(i11 + 3);
        strGroup3.getClass();
        long j13 = (Long.parseLong(strGroup3) * 1000) + j12;
        String strGroup4 = matcher.group(i11 + 4);
        if (strGroup4 != null) {
            j13 += Long.parseLong(strGroup4);
        }
        return j13 * 1000;
    }

    @Override // u8.k
    public final void j(byte[] bArr, int i11, int i12, j jVar, g gVar) {
        String str;
        a aVar = this;
        long j11 = jVar.f52841a;
        w wVar = aVar.f59032c;
        wVar.G(bArr, i11 + i12);
        wVar.I(i11);
        Charset charsetE = wVar.E();
        if (charsetE == null) {
            charsetE = StandardCharsets.UTF_8;
        }
        long j12 = -9223372036854775807L;
        ArrayList arrayList = (j11 == -9223372036854775807L || !jVar.f52842b) ? null : new ArrayList();
        while (true) {
            String strK = wVar.k(charsetE);
            if (strK == null) {
                break;
            }
            if (!strK.isEmpty()) {
                try {
                    Integer.parseInt(strK);
                    String strK2 = wVar.k(charsetE);
                    if (strK2 == null) {
                        b7.a.B("Unexpected end");
                        break;
                    }
                    Matcher matcher = f59028d.matcher(strK2);
                    if (matcher.matches()) {
                        long jB = b(matcher, 1);
                        long jB2 = b(matcher, 6);
                        StringBuilder sb2 = aVar.f59030a;
                        sb2.setLength(0);
                        long j13 = j12;
                        ArrayList arrayList2 = aVar.f59031b;
                        arrayList2.clear();
                        for (String strK3 = wVar.k(charsetE); !TextUtils.isEmpty(strK3); strK3 = wVar.k(charsetE)) {
                            if (sb2.length() > 0) {
                                sb2.append("<br>");
                            }
                            String strTrim = strK3.trim();
                            StringBuilder sb3 = new StringBuilder(strTrim);
                            Matcher matcher2 = f59029e.matcher(strTrim);
                            int i13 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i13;
                                int length = strGroup.length();
                                sb3.replace(iStart, iStart + length, BuildConfig.VERSION_NAME);
                                i13 += length;
                                j11 = j11;
                            }
                            sb2.append(sb3.toString());
                        }
                        long j14 = j11;
                        Spanned spannedFromHtml = Html.fromHtml(sb2.toString());
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i14);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                        if (j14 == j13 || jB2 >= j14) {
                            gVar.accept(new u8.a(jB, jB2 - jB, ImmutableList.u(a(spannedFromHtml, str))));
                        } else if (arrayList != null) {
                            arrayList.add(new u8.a(jB, jB2 - jB, ImmutableList.u(a(spannedFromHtml, str))));
                        }
                        aVar = this;
                        j12 = j13;
                        j11 = j14;
                    } else {
                        b7.a.B("Skipping invalid timing: ".concat(strK2));
                        aVar = this;
                    }
                } catch (NumberFormatException unused) {
                    b7.a.B("Skipping invalid index: ".concat(strK));
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                i15++;
                gVar.accept((u8.a) obj);
            }
        }
    }

    @Override // u8.k
    public final int l() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c4  */
    public static b a(Spanned spanned, String str) {
        int i11;
        int i12;
        float f5;
        if (str == null) {
            return new b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, CropImageView.DEFAULT_ASPECT_RATIO, 0);
        }
        int iHashCode = str.hashCode();
        String str2 = scqhIrGXy.RonKzUT;
        switch (iHashCode) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                i11 = 1;
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                break;
            case -685620617:
                if (!str.equals(str2)) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                i11 = 1;
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                i11 = 1;
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                break;
            default:
                i11 = 1;
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                break;
            case -685620617:
                str.equals(str2);
                i12 = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                i12 = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                i12 = 1;
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                break;
            default:
                i12 = 1;
                break;
        }
        float f11 = 0.08f;
        if (i11 == 0) {
            f5 = 0.08f;
        } else if (i11 == 1) {
            f5 = 0.5f;
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException();
            }
            f5 = 0.92f;
        }
        if (i12 != 0) {
            if (i12 == 1) {
                f11 = 0.5f;
            } else {
                if (i12 != 2) {
                    throw new IllegalArgumentException();
                }
                f11 = 0.92f;
            }
        }
        return new b(spanned, null, null, null, f11, 0, i12, f5, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, CropImageView.DEFAULT_ASPECT_RATIO, 0);
    }
}

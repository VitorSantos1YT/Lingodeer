package b9;

import a7.b;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import b7.f0;
import b7.g;
import b7.w;
import com.google.common.collect.ImmutableList;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import u8.j;
import u8.k;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f4049a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4054f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f4055t;

    public a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f4051c = 0;
            this.f4052d = -1;
            this.f4053e = "sans-serif";
            this.f4050b = false;
            this.f4054f = 0.85f;
            this.f4055t = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f4051c = bArr[24];
        this.f4052d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f4053e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i11 = bArr[25] * 20;
        this.f4055t = i11;
        boolean z11 = (bArr[0] & 32) != 0;
        this.f4050b = z11;
        if (z11) {
            this.f4054f = f0.f(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i11, CropImageView.DEFAULT_ASPECT_RATIO, 0.95f);
        } else {
            this.f4054f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13, int i14, int i15) {
        if (i11 != i12) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i11 >>> 8) | ((i11 & 255) << 24)), i13, i14, i15 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13, int i14, int i15) {
        if (i11 != i12) {
            int i16 = i15 | 33;
            boolean z11 = (i11 & 1) != 0;
            boolean z12 = (i11 & 2) != 0;
            if (z11) {
                if (z12) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i13, i14, i16);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i13, i14, i16);
                }
            } else if (z12) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i13, i14, i16);
            }
            boolean z13 = (i11 & 4) != 0;
            if (z13) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, i14, i16);
            }
            if (z13 || z11 || z12) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i13, i14, i16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u8.k
    public final void j(byte[] bArr, int i11, int i12, j jVar, g gVar) {
        String strU;
        w wVar = this.f4049a;
        wVar.G(bArr, i11 + i12);
        wVar.I(i11);
        int i13 = 1;
        int i14 = 0;
        b7.a.d(wVar.a() >= 2);
        int iC = wVar.C();
        if (iC == 0) {
            strU = BuildConfig.VERSION_NAME;
        } else {
            int i15 = wVar.f4040b;
            Charset charsetE = wVar.E();
            int i16 = iC - (wVar.f4040b - i15);
            if (charsetE == null) {
                charsetE = StandardCharsets.UTF_8;
            }
            strU = wVar.u(i16, charsetE);
        }
        if (strU.isEmpty()) {
            gVar.accept(new u8.a(-9223372036854775807L, -9223372036854775807L, ImmutableList.s()));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strU);
        b(spannableStringBuilder, this.f4051c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f4052d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f4053e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f5 = this.f4054f;
        while (wVar.a() >= 8) {
            int i17 = wVar.f4040b;
            int iJ = wVar.j();
            int iJ2 = wVar.j();
            if (iJ2 == 1937013100) {
                b7.a.d(wVar.a() >= 2 ? i13 : i14);
                int iC2 = wVar.C();
                int i18 = i14;
                while (i18 < iC2) {
                    b7.a.d(wVar.a() >= 12 ? i13 : i14);
                    int iC3 = wVar.C();
                    int iC4 = wVar.C();
                    wVar.J(2);
                    int i19 = i18;
                    int iW = wVar.w();
                    wVar.J(i13);
                    int iJ3 = wVar.j();
                    if (iC4 > spannableStringBuilder.length()) {
                        StringBuilder sbI = c.i(iC4, "Truncating styl end (", ") to cueText.length() (");
                        sbI.append(spannableStringBuilder.length());
                        sbI.append(").");
                        b7.a.B(sbI.toString());
                        iC4 = spannableStringBuilder.length();
                    }
                    if (iC3 >= iC4) {
                        b7.a.B("Ignoring styl with start (" + iC3 + ") >= end (" + iC4 + ").");
                    } else {
                        int i21 = iC4;
                        b(spannableStringBuilder, iW, this.f4051c, iC3, i21, 0);
                        a(spannableStringBuilder, iJ3, this.f4052d, iC3, i21, 0);
                    }
                    i18 = i19 + 1;
                    i13 = 1;
                    i14 = 0;
                }
            } else if (iJ2 == 1952608120 && this.f4050b) {
                b7.a.d(wVar.a() >= 2);
                f5 = f0.f(wVar.C() / this.f4055t, CropImageView.DEFAULT_ASPECT_RATIO, 0.95f);
            }
            wVar.I(i17 + iJ);
            i13 = 1;
            i14 = 0;
        }
        gVar.accept(new u8.a(-9223372036854775807L, -9223372036854775807L, ImmutableList.u(new b(spannableStringBuilder, null, null, null, f5, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, CropImageView.DEFAULT_ASPECT_RATIO, 0))));
    }

    @Override // u8.k
    public final int l() {
        return 2;
    }
}

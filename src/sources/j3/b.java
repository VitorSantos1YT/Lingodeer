package j3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r3.c f35661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3.r f35664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f35665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f35666f;

    /* JADX WARN: Code duplicated, block: B:102:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x014a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0196  */
    /* JADX WARN: Code duplicated, block: B:136:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:139:0x0209  */
    /* JADX WARN: Code duplicated, block: B:140:0x020b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0227  */
    /* JADX WARN: Code duplicated, block: B:144:0x0241  */
    /* JADX WARN: Code duplicated, block: B:146:0x0245 A[LOOP:1: B:145:0x0243->B:146:0x0245, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x0270  */
    /* JADX WARN: Code duplicated, block: B:150:0x0274  */
    /* JADX WARN: Code duplicated, block: B:152:0x028c  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:164:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0117  */
    /* JADX WARN: Code duplicated, block: B:93:0x0120  */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    /* JADX WARN: Code duplicated, block: B:96:0x0126  */
    /* JADX WARN: Code duplicated, block: B:98:0x0129  */
    /* JADX WARN: Code duplicated, block: B:99:0x012c  */
    /* JADX WARN: Instruction removed from duplicated block: B:144:0x0241, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:150:0x0274, please report this as an issue */
    public b(r3.c cVar, int i11, int i12, long j11) {
        int i13;
        CharSequence charSequence;
        int i14;
        int i15;
        int i16;
        char c11;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        k3.r rVarA;
        int i17;
        int i18;
        b bVar;
        int i19;
        int i21;
        Layout layout;
        Spanned spanned;
        t3.d[] dVarArr;
        CharSequence charSequence2;
        Spanned spanned2;
        ArrayList arrayList;
        int i22;
        Object obj;
        int spanEnd;
        int lineForOffset;
        boolean z11;
        boolean z12;
        boolean z13;
        f2.c cVar2;
        float fH;
        float fD;
        int iB;
        float fG;
        float fB;
        float fD2;
        int i23;
        int i24;
        this.f35661a = cVar;
        this.f35662b = i11;
        this.f35663c = j11;
        if (v3.a.i(j11) != 0 || v3.a.j(j11) != 0) {
            p3.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i11 < 1) {
            p3.a.a("maxLines should be greater than 0");
        }
        y0 y0Var = cVar.f48768b;
        CharSequence charSequence3 = cVar.H;
        if (i12 == 2) {
            i13 = 0;
            if (!v3.o.a(y0Var.f35827a.f35761h, j3.A(0)) && !v3.o.a(y0Var.f35827a.f35761h, v3.o.f53501c) && (i24 = y0Var.f35828b.f35668a) != 0 && i24 != 5 && i24 != 4 && charSequence3.length() != 0) {
                Spannable spannableString = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                if (spannableString == null) {
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    spannableString = new SpannableString(charSequence3);
                }
                charSequence = charSequence3;
                charSequence = charSequence3;
                Spannable spannable = spannableString;
                boolean zF = k3.o.f(spannable, m3.c.class);
                charSequence = spannable;
                if (!zF) {
                    spannable.setSpan(new m3.c(), spannable.length() - 1, spannable.length() - 1, 33);
                    charSequence = spannable;
                }
            }
        } else {
            i13 = 0;
            charSequence = charSequence3;
        }
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        CharSequence charSequence4 = charSequence;
        this.f35665e = charSequence4;
        c0 c0Var = y0Var.f35828b;
        p0 p0Var = y0Var.f35827a;
        int i25 = c0Var.f35668a;
        int i26 = 3;
        int i27 = i25 == 1 ? 3 : i25 == 2 ? 4 : i25 == 3 ? 2 : (i25 != 5 && i25 == 6) ? 1 : i13;
        int i28 = i25 == 4 ? 1 : i13;
        int i29 = c0Var.f35675h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i13;
        int i30 = c0Var.f35674g;
        int i31 = i30 & 255;
        if (i31 == 1) {
            i14 = i13;
        } else if (i31 == 2) {
            i14 = 1;
        } else if (i31 == 3) {
            i14 = 2;
        } else {
            i14 = i13;
        }
        int i32 = (i30 >> 8) & 255;
        if (i32 == 1) {
            i26 = i13;
        } else if (i32 == 2) {
            i26 = 1;
        } else if (i32 == 3) {
            i26 = 2;
        } else if (i32 != 4) {
            i26 = i13;
        }
        int i33 = (i30 >> 16) & 255;
        if (i33 != 1) {
            i15 = 2;
            i16 = i33 == 2 ? 1 : i16;
            if (i12 == i15) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else {
                if (i12 == 5) {
                    if (i12 == 4) {
                        truncateAt2 = TextUtils.TruncateAt.START;
                    } else {
                        c11 = ' ';
                        truncateAt = null;
                    }
                    rVarA = a(i27, i28, truncateAt, i11, i29, i14, i26, i16, charSequence4);
                    Layout layout2 = rVarA.f37894f;
                    i17 = i27;
                    if (Build.VERSION.SDK_INT < 35 || cVar.f48773t.getLetterSpacing() == CropImageView.DEFAULT_ASPECT_RATIO || (!(i12 == 4 || i12 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        i18 = 2;
                        bVar = this;
                        i19 = i11;
                        i21 = i17;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i18 = 2;
                        CharSequence[] charSequenceArr = {charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length())};
                        b bVar2 = this;
                        i19 = i11;
                        i21 = i17;
                        rVarA = bVar2.a(i21, i28, truncateAt, i19, i29, i14, i26, i16, TextUtils.concat(charSequenceArr));
                        bVar = bVar2;
                    }
                    int i34 = rVarA.f37895g;
                    if (i12 == i18 || rVarA.a() <= v3.a.g(j11) || i19 <= 1) {
                        bVar.f35664d = rVarA;
                    } else {
                        int iG = v3.a.g(j11);
                        int i35 = 0;
                        while (true) {
                            if (i35 >= i34) {
                                i35 = i34;
                                break;
                            } else if (rVarA.e(i35) > iG) {
                                break;
                            } else {
                                i35++;
                            }
                        }
                        if (i35 >= 0 && i35 != bVar.f35662b) {
                            rVarA = bVar.a(i21, i28, truncateAt, i35 < 1 ? 1 : i35, i29, i14, i26, i16, bVar.f35665e);
                        }
                        bVar.f35664d = rVarA;
                    }
                    bVar.f35661a.f48773t.c(p0Var.f35754a.c(), (((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c11), p0Var.f35754a.a());
                    layout = bVar.f35664d.f37894f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        kotlin.jvm.internal.m.d(text, "null cannot be cast to non-null type android.text.Spanned");
                        spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), t3.d.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            kotlin.jvm.internal.m.d(text2, "null cannot be cast to non-null type android.text.Spanned");
                            dVarArr = (t3.d[]) ((Spanned) text2).getSpans(0, layout.getText().length(), t3.d.class);
                        } else {
                            dVarArr = null;
                        }
                    } else {
                        dVarArr = null;
                    }
                    if (dVarArr != null) {
                        for (t3.d dVar : dVarArr) {
                            dVar.f52034c.setValue(new f2.e((((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c11)));
                        }
                    }
                    charSequence2 = bVar.f35665e;
                    if (charSequence2 instanceof Spanned) {
                        spanned2 = (Spanned) charSequence2;
                        Object[] spans = spanned2.getSpans(0, charSequence2.length(), m3.i.class);
                        arrayList = new ArrayList(spans.length);
                        for (Object obj2 : spans) {
                            m3.i iVar = (m3.i) obj2;
                            int spanStart = spanned2.getSpanStart(iVar);
                            spanEnd = spanned2.getSpanEnd(iVar);
                            lineForOffset = bVar.f35664d.f37894f.getLineForOffset(spanStart);
                            if (lineForOffset >= bVar.f35662b) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (bVar.f35664d.f37894f.getEllipsisCount(lineForOffset) > 0 || spanEnd <= bVar.f35664d.f37894f.getEllipsisStart(lineForOffset) + bVar.f35664d.f37894f.getLineStart(lineForOffset)) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (spanEnd > bVar.f35664d.f(lineForOffset)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z12 && !z13 && !z11) {
                                int i36 = a.f35656a[(bVar.f35664d.f37894f.isRtlCharAt(spanStart) ? u3.j.Rtl : u3.j.Ltr).ordinal()];
                                if (i36 == 1) {
                                    fH = bVar.f35664d.h(spanStart, false);
                                } else {
                                    if (i36 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    float fH2 = bVar.f35664d.h(spanStart, false);
                                    if (!iVar.M) {
                                        p3.a.c("PlaceholderSpan is not laid out yet.");
                                    }
                                    fH = fH2 - iVar.K;
                                }
                                if (!iVar.M) {
                                    p3.a.c("PlaceholderSpan is not laid out yet.");
                                }
                                float f5 = iVar.K + fH;
                                k3.r rVar = bVar.f35664d;
                                switch (iVar.f40852t) {
                                    case 0:
                                        fD = rVar.d(lineForOffset);
                                        iB = iVar.b();
                                        fG = fD - iB;
                                        cVar2 = new f2.c(fH, fG, f5, iVar.b() + fG);
                                        break;
                                    case 1:
                                        fG = rVar.g(lineForOffset);
                                        cVar2 = new f2.c(fH, fG, f5, iVar.b() + fG);
                                        break;
                                    case 2:
                                        fD = rVar.e(lineForOffset);
                                        iB = iVar.b();
                                        fG = fD - iB;
                                        cVar2 = new f2.c(fH, fG, f5, iVar.b() + fG);
                                        break;
                                    case 3:
                                        fG = ((rVar.e(lineForOffset) + rVar.g(lineForOffset)) - iVar.b()) / 2;
                                        cVar2 = new f2.c(fH, fG, f5, iVar.b() + fG);
                                        break;
                                    case 4:
                                        fB = iVar.a().ascent;
                                        fD2 = rVar.d(lineForOffset);
                                        fG = fD2 + fB;
                                        cVar2 = new f2.c(fH, fG, f5, iVar.b() + fG);
                                        break;
                                    case 5:
                                        fG = (rVar.d(lineForOffset) + iVar.a().descent) - iVar.b();
                                        cVar2 = new f2.c(fH, fG, f5, iVar.b() + fG);
                                        break;
                                    case 6:
                                        Paint.FontMetricsInt fontMetricsIntA = iVar.a();
                                        fB = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - iVar.b()) / 2;
                                        fD2 = rVar.d(lineForOffset);
                                        fG = fD2 + fB;
                                        cVar2 = new f2.c(fH, fG, f5, iVar.b() + fG);
                                        break;
                                    default:
                                        throw new IllegalStateException("unexpected verticalAlignment");
                                }
                            }
                            arrayList.add(cVar2);
                        }
                        obj = arrayList;
                    } else {
                        obj = ry.r.f50854a;
                    }
                    bVar.f35666f = obj;
                }
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            }
            c11 = ' ';
            truncateAt = truncateAt2;
            rVarA = a(i27, i28, truncateAt, i11, i29, i14, i26, i16, charSequence4);
            Layout layout3 = rVarA.f37894f;
            i17 = i27;
            if (Build.VERSION.SDK_INT < 35) {
                i18 = 2;
                bVar = this;
                i19 = i11;
                i21 = i17;
            } else {
                i18 = 2;
                bVar = this;
                i19 = i11;
                i21 = i17;
            }
            int i37 = rVarA.f37895g;
            if (i12 == i18) {
                bVar.f35664d = rVarA;
            } else {
                bVar.f35664d = rVarA;
            }
            bVar.f35661a.f48773t.c(p0Var.f35754a.c(), (((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c11), p0Var.f35754a.a());
            layout = bVar.f35664d.f37894f;
            if (layout.getText() instanceof Spanned) {
                dVarArr = null;
            } else {
                CharSequence text3 = layout.getText();
                kotlin.jvm.internal.m.d(text3, "null cannot be cast to non-null type android.text.Spanned");
                spanned = (Spanned) text3;
                if (spanned.nextSpanTransition(-1, spanned.length(), t3.d.class) != spanned.length()) {
                    CharSequence text4 = layout.getText();
                    kotlin.jvm.internal.m.d(text4, "null cannot be cast to non-null type android.text.Spanned");
                    dVarArr = (t3.d[]) ((Spanned) text4).getSpans(0, layout.getText().length(), t3.d.class);
                } else {
                    dVarArr = null;
                }
            }
            if (dVarArr != null) {
                while (i23 < r2) {
                    dVar.f52034c.setValue(new f2.e((((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c11)));
                }
            }
            charSequence2 = bVar.f35665e;
            if (charSequence2 instanceof Spanned) {
                obj = ry.r.f50854a;
            } else {
                spanned2 = (Spanned) charSequence2;
                Object[] spans2 = spanned2.getSpans(0, charSequence2.length(), m3.i.class);
                arrayList = new ArrayList(spans2.length);
                while (i22 < r4) {
                    m3.i iVar2 = (m3.i) obj2;
                    int spanStart2 = spanned2.getSpanStart(iVar2);
                    spanEnd = spanned2.getSpanEnd(iVar2);
                    lineForOffset = bVar.f35664d.f37894f.getLineForOffset(spanStart2);
                    if (lineForOffset >= bVar.f35662b) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (bVar.f35664d.f37894f.getEllipsisCount(lineForOffset) > 0) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    if (spanEnd > bVar.f35664d.f(lineForOffset)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cVar2 = z12 ? null : null;
                    arrayList.add(cVar2);
                }
                obj = arrayList;
            }
            bVar.f35666f = obj;
        }
        i15 = 2;
        i16 = i13;
        if (i12 == i15) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (i12 == 5) {
                if (i12 == 4) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    c11 = ' ';
                    truncateAt = null;
                }
                rVarA = a(i27, i28, truncateAt, i11, i29, i14, i26, i16, charSequence4);
                Layout layout4 = rVarA.f37894f;
                i17 = i27;
                if (Build.VERSION.SDK_INT < 35) {
                    i18 = 2;
                    bVar = this;
                    i19 = i11;
                    i21 = i17;
                } else {
                    i18 = 2;
                    bVar = this;
                    i19 = i11;
                    i21 = i17;
                }
                int i38 = rVarA.f37895g;
                if (i12 == i18) {
                    bVar.f35664d = rVarA;
                } else {
                    bVar.f35664d = rVarA;
                }
                bVar.f35661a.f48773t.c(p0Var.f35754a.c(), (((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c11), p0Var.f35754a.a());
                layout = bVar.f35664d.f37894f;
                if (layout.getText() instanceof Spanned) {
                    dVarArr = null;
                } else {
                    CharSequence text5 = layout.getText();
                    kotlin.jvm.internal.m.d(text5, "null cannot be cast to non-null type android.text.Spanned");
                    spanned = (Spanned) text5;
                    if (spanned.nextSpanTransition(-1, spanned.length(), t3.d.class) != spanned.length()) {
                        CharSequence text6 = layout.getText();
                        kotlin.jvm.internal.m.d(text6, "null cannot be cast to non-null type android.text.Spanned");
                        dVarArr = (t3.d[]) ((Spanned) text6).getSpans(0, layout.getText().length(), t3.d.class);
                    } else {
                        dVarArr = null;
                    }
                }
                if (dVarArr != null) {
                    while (i23 < r2) {
                        dVar.f52034c.setValue(new f2.e((((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c11)));
                    }
                }
                charSequence2 = bVar.f35665e;
                if (charSequence2 instanceof Spanned) {
                    obj = ry.r.f50854a;
                } else {
                    spanned2 = (Spanned) charSequence2;
                    Object[] spans3 = spanned2.getSpans(0, charSequence2.length(), m3.i.class);
                    arrayList = new ArrayList(spans3.length);
                    while (i22 < r4) {
                        m3.i iVar3 = (m3.i) obj2;
                        int spanStart3 = spanned2.getSpanStart(iVar3);
                        spanEnd = spanned2.getSpanEnd(iVar3);
                        lineForOffset = bVar.f35664d.f37894f.getLineForOffset(spanStart3);
                        if (lineForOffset >= bVar.f35662b) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (bVar.f35664d.f37894f.getEllipsisCount(lineForOffset) > 0) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (spanEnd > bVar.f35664d.f(lineForOffset)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12) {
                        }
                        arrayList.add(cVar2);
                    }
                    obj = arrayList;
                }
                bVar.f35666f = obj;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        c11 = ' ';
        truncateAt = truncateAt2;
        rVarA = a(i27, i28, truncateAt, i11, i29, i14, i26, i16, charSequence4);
        Layout layout5 = rVarA.f37894f;
        i17 = i27;
        if (Build.VERSION.SDK_INT < 35) {
            i18 = 2;
            bVar = this;
            i19 = i11;
            i21 = i17;
        } else {
            i18 = 2;
            bVar = this;
            i19 = i11;
            i21 = i17;
        }
        int i39 = rVarA.f37895g;
        if (i12 == i18) {
            bVar.f35664d = rVarA;
        } else {
            bVar.f35664d = rVarA;
        }
        bVar.f35661a.f48773t.c(p0Var.f35754a.c(), (((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c11), p0Var.f35754a.a());
        layout = bVar.f35664d.f37894f;
        if (layout.getText() instanceof Spanned) {
            dVarArr = null;
        } else {
            CharSequence text7 = layout.getText();
            kotlin.jvm.internal.m.d(text7, "null cannot be cast to non-null type android.text.Spanned");
            spanned = (Spanned) text7;
            if (spanned.nextSpanTransition(-1, spanned.length(), t3.d.class) != spanned.length()) {
                CharSequence text8 = layout.getText();
                kotlin.jvm.internal.m.d(text8, "null cannot be cast to non-null type android.text.Spanned");
                dVarArr = (t3.d[]) ((Spanned) text8).getSpans(0, layout.getText().length(), t3.d.class);
            } else {
                dVarArr = null;
            }
        }
        if (dVarArr != null) {
            while (i23 < r2) {
                dVar.f52034c.setValue(new f2.e((((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c11)));
            }
        }
        charSequence2 = bVar.f35665e;
        if (charSequence2 instanceof Spanned) {
            obj = ry.r.f50854a;
        } else {
            spanned2 = (Spanned) charSequence2;
            Object[] spans4 = spanned2.getSpans(0, charSequence2.length(), m3.i.class);
            arrayList = new ArrayList(spans4.length);
            while (i22 < r4) {
                m3.i iVar4 = (m3.i) obj2;
                int spanStart4 = spanned2.getSpanStart(iVar4);
                spanEnd = spanned2.getSpanEnd(iVar4);
                lineForOffset = bVar.f35664d.f37894f.getLineForOffset(spanStart4);
                if (lineForOffset >= bVar.f35662b) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (bVar.f35664d.f37894f.getEllipsisCount(lineForOffset) > 0) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                if (spanEnd > bVar.f35664d.f(lineForOffset)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12) {
                }
                arrayList.add(cVar2);
            }
            obj = arrayList;
        }
        bVar.f35666f = obj;
    }

    public final k3.r a(int i11, int i12, TextUtils.TruncateAt truncateAt, int i13, int i14, int i15, int i16, int i17, CharSequence charSequence) {
        f0 f0Var;
        float fD = d();
        r3.c cVar = this.f35661a;
        r3.d dVar = cVar.f48773t;
        int i18 = cVar.N;
        k3.l lVar = cVar.K;
        y0 y0Var = cVar.f48768b;
        r3.a aVar = r3.b.f48766a;
        h0 h0Var = y0Var.f35829c;
        return new k3.r(charSequence, fD, dVar, i11, truncateAt, i18, (h0Var == null || (f0Var = h0Var.f35704b) == null) ? false : f0Var.f35694a, i13, i15, i16, i17, i14, i12, lVar);
    }

    public final float b() {
        return this.f35664d.a();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    public final long c(f2.c cVar, int i11, h2.d dVar) {
        l3.d bVar;
        int i12;
        int[] iArrA;
        RectF rectFC = g2.f0.C(cVar);
        int i13 = (i11 != 0 && i11 == 1) ? 1 : 0;
        ch.b0 b0Var = new ch.b0(dVar, 16);
        k3.r rVar = this.f35664d;
        Layout layout = rVar.f37894f;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            iArrA = k3.b.a(rVar, rectFC, i13, b0Var);
        } else {
            a9.i iVarC = rVar.c();
            if (i13 == 1) {
                bVar = new ob.l(19, layout.getText(), rVar.j());
            } else {
                CharSequence text = layout.getText();
                bVar = i14 >= 29 ? new l3.b(text, rVar.f37889a) : new l3.c(text);
            }
            l3.d dVar2 = bVar;
            int lineForVertical = layout.getLineForVertical((int) rectFC.top);
            if (rectFC.top <= rVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < rVar.f37895g) {
                int i15 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFC.bottom);
                if (lineForVertical2 != 0 || rectFC.bottom >= rVar.g(0)) {
                    int iE = k3.o.e(rVar, layout, iVarC, i15, rectFC, dVar2, b0Var, true);
                    while (true) {
                        i12 = i15;
                        if (iE != -1 || i12 >= lineForVertical2) {
                            break;
                        }
                        i15 = i12 + 1;
                        iE = k3.o.e(rVar, layout, iVarC, i15, rectFC, dVar2, b0Var, true);
                    }
                    if (iE == -1) {
                        iArrA = null;
                    } else {
                        int i16 = lineForVertical2;
                        int iE2 = k3.o.e(rVar, layout, iVarC, i16, rectFC, dVar2, b0Var, false);
                        while (iE2 == -1 && i12 < i16) {
                            i16--;
                            iE2 = k3.o.e(rVar, layout, iVarC, i16, rectFC, dVar2, b0Var, false);
                        }
                        if (iE2 == -1) {
                            iArrA = null;
                        } else {
                            iArrA = new int[]{dVar2.p(iE + 1), dVar2.q(iE2 - 1)};
                        }
                    }
                } else {
                    iArrA = null;
                }
            } else {
                iArrA = null;
            }
        }
        return iArrA == null ? x0.f35821b : t.b(iArrA[0], iArrA[1]);
    }

    public final float d() {
        return v3.a.h(this.f35663c);
    }

    public final void e(g2.v vVar) {
        Canvas canvasA = g2.d.a(vVar);
        k3.r rVar = this.f35664d;
        if (rVar.f37892d) {
            canvasA.save();
            canvasA.clipRect(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, d(), b());
        }
        int i11 = rVar.f37896h;
        if (canvasA.getClipBounds(rVar.f37903p)) {
            if (i11 != 0) {
                canvasA.translate(CropImageView.DEFAULT_ASPECT_RATIO, i11);
            }
            ThreadLocal threadLocal = k3.s.f37905a;
            Object qVar = threadLocal.get();
            if (qVar == null) {
                qVar = new k3.q();
                threadLocal.set(qVar);
            }
            k3.q qVar2 = (k3.q) qVar;
            qVar2.f37888a = canvasA;
            try {
                rVar.f37894f.draw(qVar2);
                qVar2.f37888a = null;
                if (i11 != 0) {
                    canvasA.translate(CropImageView.DEFAULT_ASPECT_RATIO, (-1) * i11);
                }
            } catch (Throwable th2) {
                qVar2.f37888a = null;
                throw th2;
            }
        }
        if (rVar.f37892d) {
            canvasA.restore();
        }
    }

    public final void f(g2.v vVar, long j11, g2.v0 v0Var, u3.l lVar, i2.e eVar, int i11) {
        r3.c cVar = this.f35661a;
        r3.d dVar = cVar.f48773t;
        int i12 = dVar.f48776c;
        dVar.d(j11);
        dVar.f(v0Var);
        dVar.g(lVar);
        dVar.e(eVar);
        dVar.b(i11);
        e(vVar);
        cVar.f48773t.b(i12);
    }

    public final void g(g2.v vVar, g2.t tVar, float f5, g2.v0 v0Var, u3.l lVar, i2.e eVar) {
        r3.d dVar = this.f35661a.f48773t;
        int i11 = dVar.f48776c;
        float fD = d();
        dVar.c(tVar, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f5);
        dVar.f(v0Var);
        dVar.g(lVar);
        dVar.e(eVar);
        dVar.b(3);
        e(vVar);
        dVar.b(i11);
    }
}

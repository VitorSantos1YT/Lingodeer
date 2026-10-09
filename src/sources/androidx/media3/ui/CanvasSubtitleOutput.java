package androidx.media3.ui;

import a7.a;
import a7.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import gb.r;
import h9.c;
import h9.g0;
import h9.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class CanvasSubtitleOutput extends View implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f2159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f2161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2162e;

    public CanvasSubtitleOutput(Context context, int i11) {
        super(context, null);
        this.f2158a = new ArrayList();
        this.f2159b = Collections.EMPTY_LIST;
        this.f2160c = 0.0533f;
        this.f2161d = c.f32009g;
        this.f2162e = 0.08f;
    }

    @Override // h9.h0
    public final void a(List list, c cVar, float f5, float f11) {
        this.f2159b = list;
        this.f2161d = cVar;
        this.f2160c = f5;
        this.f2162e = f11;
        while (true) {
            ArrayList arrayList = this.f2158a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new g0(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:187:0x045a  */
    /* JADX WARN: Code duplicated, block: B:189:0x045d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0460  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f5;
        int i11;
        int i12;
        boolean z11;
        float f11;
        int i13;
        float f12;
        int i14;
        int iMax;
        int iMin;
        int iRound;
        int i15;
        CanvasSubtitleOutput canvasSubtitleOutput = this;
        List list = canvasSubtitleOutput.f2159b;
        if (list.isEmpty()) {
            return;
        }
        int height = canvasSubtitleOutput.getHeight();
        int paddingLeft = canvasSubtitleOutput.getPaddingLeft();
        int paddingTop = canvasSubtitleOutput.getPaddingTop();
        int width = canvasSubtitleOutput.getWidth() - canvasSubtitleOutput.getPaddingRight();
        int paddingBottom = height - canvasSubtitleOutput.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i16 = paddingBottom - paddingTop;
        float fP = r.P(0, height, i16, canvasSubtitleOutput.f2160c);
        float f13 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (fP <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        int size = list.size();
        int i17 = 0;
        while (i17 < size) {
            b bVarA = (b) list.get(i17);
            float f14 = f13;
            if (bVarA.f427p != Integer.MIN_VALUE) {
                a aVarA = bVarA.a();
                float f15 = bVarA.f417e;
                aVarA.f395h = -3.4028235E38f;
                aVarA.f396i = Integer.MIN_VALUE;
                aVarA.f390c = null;
                if (bVarA.f418f == 0) {
                    aVarA.f392e = 1.0f - f15;
                    i15 = 0;
                    aVarA.f393f = 0;
                } else {
                    i15 = 0;
                    aVarA.f392e = (-f15) - 1.0f;
                    aVarA.f393f = 1;
                }
                int i18 = bVarA.f419g;
                if (i18 == 0) {
                    aVarA.f394g = 2;
                } else if (i18 == 2) {
                    aVarA.f394g = i15;
                }
                bVarA = aVarA.a();
            }
            float fP2 = r.P(bVarA.f425n, height, i16, bVarA.f426o);
            g0 g0Var = (g0) canvasSubtitleOutput.f2158a.get(i17);
            c cVar = canvasSubtitleOutput.f2161d;
            float f16 = canvasSubtitleOutput.f2162e;
            TextPaint textPaint = g0Var.f32042f;
            int i19 = height;
            Bitmap bitmap = bVarA.f416d;
            int i21 = i16;
            float f17 = bVarA.f423k;
            int i22 = size;
            float f18 = bVarA.f422j;
            int i23 = i17;
            int i24 = bVarA.f421i;
            float f19 = bVarA.f420h;
            int i25 = bVarA.f419g;
            float f21 = fP;
            int i26 = bVarA.f418f;
            float f22 = bVarA.f417e;
            Layout.Alignment alignment = bVarA.f414b;
            CharSequence charSequence = bVarA.f413a;
            boolean z12 = bitmap == null;
            if (z12) {
                if (TextUtils.isEmpty(charSequence)) {
                    paddingLeft = paddingLeft;
                    z11 = false;
                } else {
                    f5 = f19;
                    i11 = bVarA.f424l ? bVarA.m : cVar.f32012c;
                }
                i17 = i23 + 1;
                canvasSubtitleOutput = this;
                f13 = f14;
                list = list;
                height = i19;
                i16 = i21;
                size = i22;
                fP = f21;
                paddingLeft = paddingLeft;
            } else {
                f5 = f19;
                i11 = -16777216;
            }
            CharSequence charSequence2 = g0Var.f32045i;
            if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && Objects.equals(g0Var.f32046j, alignment) && g0Var.f32047k == bitmap && g0Var.f32048l == f22 && g0Var.m == i26) {
                i12 = i25;
                if (Integer.valueOf(g0Var.f32049n).equals(Integer.valueOf(i12)) && g0Var.f32050o == f5 && Integer.valueOf(g0Var.f32051p).equals(Integer.valueOf(i24)) && g0Var.f32052q == f18 && g0Var.f32053r == f17 && g0Var.f32054s == cVar.f32010a && g0Var.f32055t == cVar.f32011b && g0Var.f32056u == i11 && g0Var.f32058w == cVar.f32013d && g0Var.f32057v == cVar.f32014e && Objects.equals(textPaint.getTypeface(), cVar.f32015f) && g0Var.f32059x == f21 && g0Var.f32060y == fP2 && g0Var.f32061z == f16 && g0Var.A == paddingLeft && g0Var.B == paddingTop && g0Var.C == width && g0Var.D == paddingBottom) {
                    g0Var.a(canvas, z12);
                    paddingLeft = paddingLeft;
                    z11 = false;
                }
                i17 = i23 + 1;
                canvasSubtitleOutput = this;
                f13 = f14;
                list = list;
                height = i19;
                i16 = i21;
                size = i22;
                fP = f21;
                paddingLeft = paddingLeft;
            } else {
                i12 = i25;
            }
            g0Var.f32045i = charSequence;
            g0Var.f32046j = alignment;
            g0Var.f32047k = bitmap;
            g0Var.f32048l = f22;
            g0Var.m = i26;
            g0Var.f32049n = i12;
            g0Var.f32050o = f5;
            g0Var.f32051p = i24;
            g0Var.f32052q = f18;
            g0Var.f32053r = f17;
            g0Var.f32054s = cVar.f32010a;
            g0Var.f32055t = cVar.f32011b;
            g0Var.f32056u = i11;
            g0Var.f32058w = cVar.f32013d;
            g0Var.f32057v = cVar.f32014e;
            textPaint.setTypeface(cVar.f32015f);
            f21 = f21;
            g0Var.f32059x = f21;
            g0Var.f32060y = fP2;
            g0Var.f32061z = f16;
            g0Var.A = paddingLeft;
            g0Var.B = paddingTop;
            g0Var.C = width;
            g0Var.D = paddingBottom;
            if (z12) {
                g0Var.f32045i.getClass();
                CharSequence charSequence3 = g0Var.f32045i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(g0Var.f32045i);
                int i27 = g0Var.C - g0Var.A;
                int i28 = g0Var.D - g0Var.B;
                textPaint.setTextSize(g0Var.f32059x);
                int i29 = (int) ((g0Var.f32059x * 0.125f) + 0.5f);
                int i30 = i29 * 2;
                int i31 = i27 - i30;
                float f23 = g0Var.f32052q;
                if (f23 != -3.4028235E38f) {
                    i31 = (int) (i31 * f23);
                }
                int i32 = i31;
                if (i32 <= 0) {
                    b7.a.B("Skipped drawing subtitle cue (insufficient space)");
                    f21 = f21;
                    paddingLeft = paddingLeft;
                } else {
                    if (g0Var.f32060y > f14) {
                        i14 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) g0Var.f32060y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        i14 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (g0Var.f32058w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i14, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i33 = 0;
                        for (int length = foregroundColorSpanArr.length; i33 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i33]);
                            i33++;
                        }
                    }
                    if (Color.alpha(g0Var.f32055t) > 0) {
                        int i34 = g0Var.f32058w;
                        if (i34 == 0 || i34 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(g0Var.f32055t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(g0Var.f32055t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = g0Var.f32046j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, r2, i32, alignment3, g0Var.f32040d, g0Var.f32041e, true);
                    g0Var.E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = g0Var.E.getLineCount();
                    int i35 = 0;
                    int iMax2 = 0;
                    while (i35 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(g0Var.E.getLineWidth(i35)), iMax2);
                        i35++;
                        height2 = height2;
                        lineCount = lineCount;
                        spannableStringBuilder2 = spannableStringBuilder2;
                    }
                    int i36 = height2;
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    int i37 = ((g0Var.f32052q == -3.4028235E38f || iMax2 >= i32) ? iMax2 : i32) + i30;
                    float f24 = g0Var.f32050o;
                    if (f24 != -3.4028235E38f) {
                        int iRound2 = Math.round(i27 * f24);
                        int i38 = g0Var.A;
                        int i39 = iRound2 + i38;
                        int i40 = g0Var.f32051p;
                        if (i40 == 1) {
                            i39 = ((i39 * 2) - i37) / 2;
                        } else if (i40 == 2) {
                            i39 -= i37;
                        }
                        iMax = Math.max(i39, i38);
                        iMin = Math.min(iMax + i37, g0Var.C);
                    } else {
                        iMax = g0Var.A + ((i27 - i37) / 2);
                        iMin = iMax + i37;
                    }
                    int i41 = iMin - iMax;
                    if (i41 <= 0) {
                        b7.a.B("Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f25 = g0Var.f32048l;
                        if (f25 != -3.4028235E38f) {
                            if (g0Var.m == 0) {
                                iRound = Math.round(i28 * f25) + g0Var.B;
                                int i42 = g0Var.f32049n;
                                if (i42 == 2) {
                                    iRound -= i36;
                                } else if (i42 == 1) {
                                    iRound = ((iRound * 2) - i36) / 2;
                                }
                                z11 = false;
                            } else {
                                z11 = false;
                                int lineBottom = g0Var.E.getLineBottom(0) - g0Var.E.getLineTop(0);
                                float f26 = g0Var.f32048l;
                                iRound = f26 >= f14 ? Math.round(f26 * lineBottom) + g0Var.B : (Math.round((f26 + 1.0f) * lineBottom) + g0Var.D) - i36;
                            }
                            int i43 = iRound + i36;
                            int i44 = g0Var.D;
                            if (i43 > i44) {
                                iRound = i44 - i36;
                            } else {
                                int i45 = g0Var.B;
                                if (iRound < i45) {
                                    iRound = i45;
                                }
                            }
                        } else {
                            z11 = false;
                            iRound = (g0Var.D - i36) - ((int) (i28 * g0Var.f32061z));
                        }
                        g0Var.E = new StaticLayout(spannableStringBuilder3, r2, i41, alignment3, g0Var.f32040d, g0Var.f32041e, true);
                        g0Var.F = new StaticLayout(spannableStringBuilder4, textPaint, i41, alignment3, g0Var.f32040d, g0Var.f32041e, true);
                        g0Var.G = iMax;
                        g0Var.H = iRound;
                        g0Var.I = i29;
                    }
                }
                z11 = false;
            } else {
                f21 = f21;
                paddingLeft = paddingLeft;
                z11 = false;
                g0Var.f32047k.getClass();
                Bitmap bitmap2 = g0Var.f32047k;
                int i46 = g0Var.C;
                int i47 = g0Var.A;
                int i48 = g0Var.D;
                int i49 = g0Var.B;
                float f27 = i46 - i47;
                float f28 = (g0Var.f32050o * f27) + i47;
                float f29 = i48 - i49;
                float f30 = (g0Var.f32048l * f29) + i49;
                int iRound3 = Math.round(f27 * g0Var.f32052q);
                float f31 = g0Var.f32053r;
                int iRound4 = f31 != -3.4028235E38f ? Math.round(f29 * f31) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound3);
                int i50 = g0Var.f32051p;
                if (i50 == 2) {
                    f11 = iRound3;
                } else {
                    if (i50 == 1) {
                        f11 = iRound3 / 2;
                    }
                    int iRound5 = Math.round(f28);
                    i13 = g0Var.f32049n;
                    if (i13 == 2) {
                        f12 = iRound4;
                    } else {
                        if (i13 == 1) {
                            f12 = iRound4 / 2;
                        }
                        int iRound6 = Math.round(f30);
                        g0Var.J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                    }
                    f30 -= f12;
                    int iRound7 = Math.round(f30);
                    g0Var.J = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                }
                f28 -= f11;
                int iRound8 = Math.round(f28);
                i13 = g0Var.f32049n;
                if (i13 == 2) {
                    f12 = iRound4;
                } else {
                    if (i13 == 1) {
                        f12 = iRound4 / 2;
                    }
                    int iRound9 = Math.round(f30);
                    g0Var.J = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                }
                f30 -= f12;
                int iRound10 = Math.round(f30);
                g0Var.J = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
            }
            g0Var.a(canvas, z12);
            i17 = i23 + 1;
            canvasSubtitleOutput = this;
            f13 = f14;
            list = list;
            height = i19;
            i16 = i21;
            size = i22;
            fP = f21;
            paddingLeft = paddingLeft;
        }
    }
}

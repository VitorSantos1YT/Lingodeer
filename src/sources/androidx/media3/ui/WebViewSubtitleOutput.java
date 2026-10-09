package androidx.media3.ui;

import a7.b;
import a7.f;
import a7.h;
import a7.i;
import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import b1.p;
import b7.f0;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.common.collect.ImmutableMap;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import ep.a;
import fr.j3;
import gb.r;
import h9.c;
import h9.d0;
import h9.e0;
import h9.h0;
import h9.n0;
import hh.p0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class WebViewSubtitleOutput extends FrameLayout implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CanvasSubtitleOutput f2297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f2298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f2299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f2300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2302f;

    /* JADX INFO: renamed from: androidx.media3.ui.WebViewSubtitleOutput$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends WebView {
        @Override // android.webkit.WebView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            super.performClick();
            return false;
        }
    }

    public WebViewSubtitleOutput(Context context) {
        super(context, null);
        this.f2299c = Collections.EMPTY_LIST;
        this.f2300d = c.f32009g;
        this.f2301e = 0.0533f;
        this.f2302f = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, 0);
        this.f2297a = canvasSubtitleOutput;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, null);
        this.f2298b = anonymousClass1;
        anonymousClass1.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(anonymousClass1);
    }

    @Override // h9.h0
    public final void a(List list, c cVar, float f5, float f11) {
        this.f2300d = cVar;
        this.f2301e = f5;
        this.f2302f = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            b bVar = (b) list.get(i11);
            if (bVar.f416d != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f2299c.isEmpty() || !arrayList2.isEmpty()) {
            this.f2299c = arrayList2;
            c();
        }
        this.f2297a.a(arrayList, cVar, f5, f11);
        invalidate();
    }

    public final String b(int i11, float f5) {
        float fP = r.P(i11, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom(), f5);
        if (fP == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fP / getContext().getResources().getDisplayMetrics().density)};
        String str = f0.f3975a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (!z11 || this.f2299c.isEmpty()) {
            return;
        }
        c();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x022e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0247  */
    /* JADX WARN: Code duplicated, block: B:106:0x024d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0264  */
    /* JADX WARN: Code duplicated, block: B:109:0x0282 A[LOOP:2: B:108:0x0280->B:109:0x0282, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02a5 A[LOOP:3: B:111:0x029f->B:113:0x02a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:118:0x0307  */
    /* JADX WARN: Code duplicated, block: B:121:0x0317  */
    /* JADX WARN: Code duplicated, block: B:123:0x031d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0335  */
    /* JADX WARN: Code duplicated, block: B:126:0x033b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0351  */
    /* JADX WARN: Code duplicated, block: B:129:0x0357  */
    /* JADX WARN: Code duplicated, block: B:130:0x035a  */
    /* JADX WARN: Code duplicated, block: B:132:0x035e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0367  */
    /* JADX WARN: Code duplicated, block: B:135:0x036d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0387  */
    /* JADX WARN: Code duplicated, block: B:139:0x038b  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:142:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:146:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:150:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:152:0x03db  */
    /* JADX WARN: Code duplicated, block: B:155:0x03df  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:158:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:160:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:162:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:164:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:167:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:168:0x0402  */
    /* JADX WARN: Code duplicated, block: B:169:0x0406  */
    /* JADX WARN: Code duplicated, block: B:170:0x040a  */
    /* JADX WARN: Code duplicated, block: B:172:0x040e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0412  */
    /* JADX WARN: Code duplicated, block: B:175:0x0416  */
    /* JADX WARN: Code duplicated, block: B:177:0x0427  */
    /* JADX WARN: Code duplicated, block: B:180:0x042b  */
    /* JADX WARN: Code duplicated, block: B:181:0x0431  */
    /* JADX WARN: Code duplicated, block: B:183:0x0439  */
    /* JADX WARN: Code duplicated, block: B:185:0x043c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x043e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0441  */
    /* JADX WARN: Code duplicated, block: B:189:0x0445  */
    /* JADX WARN: Code duplicated, block: B:190:0x044b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0451  */
    /* JADX WARN: Code duplicated, block: B:192:0x0457  */
    /* JADX WARN: Code duplicated, block: B:195:0x0465  */
    /* JADX WARN: Code duplicated, block: B:196:0x0468  */
    /* JADX WARN: Code duplicated, block: B:199:0x047b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0493  */
    /* JADX WARN: Code duplicated, block: B:241:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:243:0x050e  */
    /* JADX WARN: Code duplicated, block: B:246:0x0523  */
    /* JADX WARN: Code duplicated, block: B:252:0x0554  */
    /* JADX WARN: Code duplicated, block: B:254:0x057d A[LOOP:6: B:253:0x057b->B:254:0x057d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:257:0x059d A[LOOP:7: B:256:0x059b->B:257:0x059d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:263:0x05de  */
    /* JADX WARN: Code duplicated, block: B:265:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:269:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:273:0x061a  */
    /* JADX WARN: Code duplicated, block: B:275:0x061d  */
    /* JADX WARN: Code duplicated, block: B:279:0x0624  */
    /* JADX WARN: Code duplicated, block: B:282:0x063f  */
    /* JADX WARN: Code duplicated, block: B:285:0x065a  */
    /* JADX WARN: Code duplicated, block: B:287:0x0665  */
    /* JADX WARN: Code duplicated, block: B:289:0x0668  */
    /* JADX WARN: Code duplicated, block: B:290:0x066b  */
    /* JADX WARN: Code duplicated, block: B:291:0x066e  */
    /* JADX WARN: Code duplicated, block: B:293:0x068c  */
    /* JADX WARN: Code duplicated, block: B:311:0x0530 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0172  */
    /* JADX WARN: Code duplicated, block: B:57:0x0185  */
    /* JADX WARN: Code duplicated, block: B:60:0x0192  */
    /* JADX WARN: Code duplicated, block: B:61:0x0197  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0207  */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x02a5, please report this as an issue */
    public final void c() {
        String strConcat;
        String str;
        String str2;
        int i11;
        float f5;
        String str3;
        Layout.Alignment alignment;
        String str4;
        int i12;
        int i13;
        Object obj;
        int i14;
        String str5;
        int i15;
        String str6;
        String str7;
        Object obj2;
        String str8;
        CharSequence charSequence;
        float f11;
        String str9;
        String str10;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i16;
        HashMap map;
        Iterator it;
        String str11;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i17;
        StringBuilder sb2;
        int i18;
        int i19;
        p pVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i21;
        int size2;
        int i22;
        Object obj3;
        boolean z11;
        boolean z12;
        int i23;
        i iVar;
        int i24;
        int i25;
        StringBuilder sb3;
        int i26;
        String str12;
        String strG;
        int i27;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size3;
        String str13;
        int spanStart;
        int spanEnd;
        e0 e0Var;
        e0 e0Var2;
        String str14;
        float f12;
        String str15;
        Layout.Alignment alignment2;
        int i28;
        String str16;
        String str17;
        String str18;
        boolean z13;
        WebViewSubtitleOutput webViewSubtitleOutput = this;
        StringBuilder sb4 = new StringBuilder();
        String strX = j3.X(webViewSubtitleOutput.f2300d.f32010a);
        int i29 = 0;
        String strB = webViewSubtitleOutput.b(0, webViewSubtitleOutput.f2301e);
        float f13 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        c cVar = webViewSubtitleOutput.f2300d;
        int i30 = cVar.f32013d;
        int i31 = cVar.f32014e;
        int i32 = 2;
        int i33 = 1;
        if (i30 == 1) {
            Object[] objArr = {j3.X(i31)};
            String str19 = f0.f3975a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr);
        } else if (i30 == 2) {
            String strX2 = j3.X(i31);
            String str20 = f0.f3975a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strX2);
        } else if (i30 == 3) {
            String strX3 = j3.X(i31);
            String str21 = f0.f3975a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strX3);
        } else if (i30 != 4) {
            strConcat = "unset";
        } else {
            String strX4 = j3.X(i31);
            String str22 = f0.f3975a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strX4);
        }
        Object[] objArr2 = {strX, strB, fValueOf, strConcat};
        String str23 = f0.f3975a;
        sb4.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr2));
        HashMap map2 = new HashMap();
        String strX5 = j3.X(webViewSubtitleOutput.f2300d.f32011b);
        String str24 = "background-color:";
        StringBuilder sb5 = new StringBuilder("background-color:");
        sb5.append(strX5);
        String str25 = ";";
        sb5.append(";");
        map2.put(".default_bg,.default_bg *", sb5.toString());
        int i34 = 0;
        while (i34 < webViewSubtitleOutput.f2299c.size()) {
            b bVar = (b) webViewSubtitleOutput.f2299c.get(i34);
            float f14 = bVar.f420h;
            int i35 = bVar.f419g;
            int i36 = bVar.f427p;
            float f15 = f14 != -3.4028235E38f ? f14 * 100.0f : 50.0f;
            float f16 = f13;
            int i37 = bVar.f421i;
            int i38 = -100;
            int i39 = i37 != i33 ? i37 != i32 ? i29 : -100 : -50;
            float f17 = bVar.f417e;
            if (f17 != -3.4028235E38f) {
                if (bVar.f418f != i33) {
                    str = String.format(Locale.US, "%.2f%%", Float.valueOf(f17 * 100.0f));
                    if (i36 == i33) {
                        i38 = -(i35 != i33 ? i35 != 2 ? 0 : -100 : -50);
                    } else {
                        i38 = i35 != i33 ? i35 != 2 ? 0 : -100 : -50;
                    }
                } else {
                    if (f17 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f17 * f16));
                        i11 = 0;
                    } else {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f17) - 1.0f) * f16));
                        i11 = i33;
                    }
                    i38 = 0;
                }
                f5 = bVar.f422j;
                if (f5 != -3.4028235E38f) {
                    str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f5 * 100.0f));
                } else {
                    str3 = "fit-content";
                }
                String str26 = str3;
                alignment = bVar.f414b;
                str4 = "end";
                if (alignment == null) {
                    i14 = i33;
                    obj = "center";
                    i13 = 2;
                } else {
                    i12 = n0.f32081a[alignment.ordinal()];
                    if (i12 != i33) {
                        i13 = 2;
                        if (i12 != 2) {
                            obj = "center";
                        } else {
                            obj = "end";
                        }
                    } else {
                        i13 = 2;
                        obj = "start";
                    }
                    i14 = 1;
                }
                if (i36 != i14) {
                    str5 = "vertical-rl";
                } else if (i36 != i13) {
                    str5 = "horizontal-tb";
                } else {
                    str5 = "vertical-lr";
                }
                String str27 = str5;
                String strB2 = webViewSubtitleOutput.b(bVar.f425n, bVar.f426o);
                if (bVar.f424l) {
                    i15 = bVar.m;
                } else {
                    i15 = webViewSubtitleOutput.f2300d.f32012c;
                }
                String strX6 = j3.X(i15);
                if (i36 != 1) {
                    if (i11 != 0) {
                        str6 = "left";
                    } else {
                        str6 = "right";
                    }
                    str7 = str6;
                    obj2 = "top";
                } else if (i36 != 2) {
                    str7 = i11 != 0 ? "bottom" : "top";
                    obj2 = "left";
                } else {
                    if (i11 != 0) {
                        str6 = "right";
                    } else {
                        str6 = "left";
                    }
                    str7 = str6;
                    obj2 = "top";
                }
                if (i36 != 2 || i36 == 1) {
                    str8 = "height";
                    int i40 = i38;
                    i38 = i39;
                    i39 = i40;
                } else {
                    str8 = "width";
                }
                String str28 = str8;
                charSequence = bVar.f413a;
                f11 = webViewSubtitleOutput.getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = h9.f0.f32032a;
                int i41 = i39;
                int i42 = i34;
                str9 = BuildConfig.VERSION_NAME;
                if (charSequence == null) {
                    str10 = "start";
                    pVar = new p(12, BuildConfig.VERSION_NAME, ImmutableMap.k());
                } else {
                    str10 = "start";
                    if (charSequence instanceof Spanned) {
                        str9 = BuildConfig.VERSION_NAME;
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i16 = 0;
                        while (i16 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i16].getBackgroundColor()));
                            i16++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strJ = nv.p.j(iIntValue, "bg_");
                            Iterator it2 = it;
                            String strH = a.h(".", strJ, ",.", strJ, ypOOxsaJG.BXZDWBdfg);
                            String strX7 = j3.X(iIntValue);
                            String str29 = f0.f3975a;
                            Locale locale4 = Locale.US;
                            map.put(strH, str24 + strX7 + str25);
                            it = it2;
                            str4 = str4;
                        }
                        str11 = str4;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        i17 = 0;
                        for (length2 = spans.length; i17 < length2; length2 = i23) {
                            String str30 = str25;
                            obj3 = spans[i17];
                            String str31 = str24;
                            z11 = obj3 instanceof StrikethroughSpan;
                            String str32 = null;
                            if (z11) {
                                z12 = z11;
                                strG = "<span style='text-decoration:line-through;'>";
                            } else {
                                z12 = z11;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    String strX8 = j3.X(((ForegroundColorSpan) obj3).getForegroundColor());
                                    String str33 = f0.f3975a;
                                    Locale locale5 = Locale.US;
                                    strG = a.g("<span style='color:", strX8, ";'>");
                                } else {
                                    spans = spans;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                        String str34 = f0.f3975a;
                                        Locale locale6 = Locale.US;
                                        i23 = length2;
                                        strG = p0.h(backgroundColor, "<span class='bg_", "'>");
                                    } else {
                                        i23 = length2;
                                        if (obj3 instanceof f) {
                                            strG = "<span style='text-combine-upright:all;'>";
                                        } else if (obj3 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                            if (absoluteSizeSpan.getDip()) {
                                                size3 = absoluteSizeSpan.getSize();
                                            } else {
                                                size3 = absoluteSizeSpan.getSize() / f11;
                                            }
                                            Object[] objArr3 = {Float.valueOf(size3)};
                                            String str35 = f0.f3975a;
                                            strG = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr3);
                                        } else if (obj3 instanceof RelativeSizeSpan) {
                                            Object[] objArr4 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                            String str36 = f0.f3975a;
                                            strG = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr4);
                                        } else if (obj3 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj3).getFamily();
                                            if (family != null) {
                                                String str37 = f0.f3975a;
                                                Locale locale7 = Locale.US;
                                                strG = a.g("<span style='font-family:\"", family, OYAvlbfUyD.DDTSkC);
                                            } else {
                                                strG = null;
                                            }
                                        } else if (obj3 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj3).getStyle();
                                            if (style != 1) {
                                                strG = "<b>";
                                            } else if (style != 2) {
                                                strG = "<i>";
                                            } else if (style != 3) {
                                                strG = null;
                                            } else {
                                                strG = "<b><i>";
                                            }
                                        } else if (obj3 instanceof h) {
                                            i27 = ((h) obj3).f442b;
                                            if (i27 != -1) {
                                                strG = "<ruby style='ruby-position:unset;'>";
                                            } else if (i27 != 1) {
                                                strG = "<ruby style='ruby-position:over;'>";
                                            } else if (i27 != 2) {
                                                strG = null;
                                            } else {
                                                strG = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strG = "<u>";
                                        } else if (obj3 instanceof i) {
                                            iVar = (i) obj3;
                                            i24 = iVar.f446a;
                                            i25 = iVar.f447b;
                                            sb3 = new StringBuilder();
                                            if (i25 != 1) {
                                                i26 = 2;
                                                if (i25 == 2) {
                                                    sb3.append("open ");
                                                }
                                            } else {
                                                i26 = 2;
                                                sb3.append("filled ");
                                            }
                                            if (i24 != 0) {
                                                sb3.append("none");
                                            } else if (i24 != 1) {
                                                sb3.append("circle");
                                            } else if (i24 != i26) {
                                                sb3.append("dot");
                                            } else if (i24 != 3) {
                                                sb3.append("unset");
                                            } else {
                                                sb3.append("sesame");
                                            }
                                            String string = sb3.toString();
                                            if (iVar.f448c != 2) {
                                                str12 = "over right";
                                            } else {
                                                str12 = "under left";
                                            }
                                            Object[] objArr5 = {string, str12};
                                            String str38 = f0.f3975a;
                                            strG = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr5);
                                        } else {
                                            strG = null;
                                        }
                                    }
                                }
                                if (z12 && !(obj3 instanceof ForegroundColorSpan) && !(obj3 instanceof BackgroundColorSpan) && !(obj3 instanceof f) && !(obj3 instanceof AbsoluteSizeSpan) && !(obj3 instanceof RelativeSizeSpan) && !(obj3 instanceof i)) {
                                    if (obj3 instanceof TypefaceSpan) {
                                        str13 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                    } else {
                                        if (obj3 instanceof StyleSpan) {
                                            int style2 = ((StyleSpan) obj3).getStyle();
                                            if (style2 == 1) {
                                                str32 = "</b>";
                                            } else if (style2 == 2) {
                                                str32 = "</i>";
                                            } else if (style2 == 3) {
                                                str32 = "</i></b>";
                                            }
                                        } else if (obj3 instanceof h) {
                                            str32 = "<rt>" + h9.f0.a(((h) obj3).f441a) + "</rt></ruby>";
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            str32 = "</u>";
                                        }
                                        str13 = str32;
                                    }
                                }
                                spanStart = spanned.getSpanStart(obj3);
                                spanEnd = spanned.getSpanEnd(obj3);
                                if (strG != null) {
                                    str13.getClass();
                                    d0 d0Var = new d0(strG, spanStart, spanEnd, str13);
                                    e0Var = (e0) sparseArray.get(spanStart);
                                    if (e0Var == null) {
                                        e0Var = new e0();
                                        sparseArray.put(spanStart, e0Var);
                                    }
                                    e0Var.f32030a.add(d0Var);
                                    e0Var2 = (e0) sparseArray.get(spanEnd);
                                    if (e0Var2 == null) {
                                        e0Var2 = new e0();
                                        sparseArray.put(spanEnd, e0Var2);
                                    }
                                    e0Var2.f32031b.add(d0Var);
                                }
                                i17++;
                                str25 = str30;
                                str24 = str31;
                                spans = spans;
                            }
                            i23 = length2;
                            str13 = z12 ? "</span>" : "</span>";
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strG != null) {
                                str13.getClass();
                                d0 d0Var2 = new d0(strG, spanStart, spanEnd, str13);
                                e0Var = (e0) sparseArray.get(spanStart);
                                if (e0Var == null) {
                                    e0Var = new e0();
                                    sparseArray.put(spanStart, e0Var);
                                }
                                e0Var.f32030a.add(d0Var2);
                                e0Var2 = (e0) sparseArray.get(spanEnd);
                                if (e0Var2 == null) {
                                    e0Var2 = new e0();
                                    sparseArray.put(spanEnd, e0Var2);
                                }
                                e0Var2.f32031b.add(d0Var2);
                            }
                            i17++;
                            str25 = str30;
                            str24 = str31;
                            spans = spans;
                        }
                        str25 = str25;
                        str24 = str24;
                        sb2 = new StringBuilder(spanned.length());
                        i18 = 0;
                        i19 = 0;
                        while (i19 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i19);
                            sb2.append(h9.f0.a(spanned.subSequence(i18, iKeyAt)));
                            e0 e0Var3 = (e0) sparseArray.get(iKeyAt);
                            ArrayList arrayList3 = e0Var3.f32031b;
                            arrayList = e0Var3.f32030a;
                            SparseArray sparseArray2 = sparseArray;
                            Collections.sort(arrayList3, d0.f32024f);
                            arrayList2 = e0Var3.f32031b;
                            size = arrayList2.size();
                            i21 = 0;
                            while (i21 < size) {
                                Object obj4 = arrayList2.get(i21);
                                i21++;
                                sb2.append(((d0) obj4).f32028d);
                                arrayList2 = arrayList2;
                            }
                            Collections.sort(arrayList, d0.f32023e);
                            size2 = arrayList.size();
                            i22 = 0;
                            while (i22 < size2) {
                                Object obj5 = arrayList.get(i22);
                                i22++;
                                sb2.append(((d0) obj5).f32027c);
                            }
                            i19++;
                            i18 = iKeyAt;
                            sparseArray = sparseArray2;
                        }
                        sb2.append(h9.f0.a(spanned.subSequence(i18, spanned.length())));
                        pVar = new p(12, sb2.toString(), map);
                    } else {
                        pVar = new p(12, h9.f0.a(charSequence), ImmutableMap.k());
                    }
                    str14 = (String) pVar.f3800b;
                    for (String str39 : map2.keySet()) {
                        str18 = (String) map2.put(str39, (String) map2.get(str39));
                        if (str18 != null || str18.equals(map2.get(str39))) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        b7.a.j(z13);
                    }
                    Integer numValueOf = Integer.valueOf(i42);
                    Float fValueOf2 = Float.valueOf(f15);
                    Integer numValueOf2 = Integer.valueOf(i41);
                    Integer numValueOf3 = Integer.valueOf(i38);
                    f12 = bVar.f428q;
                    if (f12 != CropImageView.DEFAULT_ASPECT_RATIO) {
                        if (i36 != 2 || i36 == 1) {
                            str17 = "skewY";
                        } else {
                            str17 = "skewX";
                        }
                        Object[] objArr6 = {str17, Float.valueOf(f12)};
                        String str40 = f0.f3975a;
                        str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr6);
                    } else {
                        str15 = str9;
                    }
                    sb4.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj2, fValueOf2, str7, str2, str28, str26, obj, str27, strB2, strX6, numValueOf2, numValueOf3, str15));
                    sb4.append("<span class='default_bg'>");
                    alignment2 = bVar.f415c;
                    if (alignment2 != null) {
                        i28 = n0.f32081a[alignment2.ordinal()];
                        if (i28 != 1) {
                            i32 = 2;
                            if (i28 != 2) {
                                str16 = "center";
                            } else {
                                str16 = str11;
                            }
                        } else {
                            i32 = 2;
                            str16 = str10;
                        }
                        sb4.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                        sb4.append(str14);
                        sb4.append("</span>");
                    } else {
                        i32 = 2;
                        sb4.append(str14);
                    }
                    sb4.append("</span></div>");
                    i34 = i42 + 1;
                    f13 = f16;
                    str25 = str25;
                    str24 = str24;
                    i29 = 0;
                    i33 = 1;
                    webViewSubtitleOutput = this;
                }
                str11 = "end";
                str14 = (String) pVar.f3800b;
                while (r3.hasNext()) {
                    str18 = (String) map2.put(str39, (String) map2.get(str39));
                    if (str18 != null) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    b7.a.j(z13);
                }
                Integer numValueOf4 = Integer.valueOf(i42);
                Float fValueOf3 = Float.valueOf(f15);
                Integer numValueOf5 = Integer.valueOf(i41);
                Integer numValueOf6 = Integer.valueOf(i38);
                f12 = bVar.f428q;
                if (f12 != CropImageView.DEFAULT_ASPECT_RATIO) {
                    if (i36 != 2) {
                        str17 = "skewY";
                    } else {
                        str17 = "skewY";
                    }
                    Object[] objArr7 = {str17, Float.valueOf(f12)};
                    String str41 = f0.f3975a;
                    str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                } else {
                    str15 = str9;
                }
                sb4.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj2, fValueOf3, str7, str2, str28, str26, obj, str27, strB2, strX6, numValueOf5, numValueOf6, str15));
                sb4.append("<span class='default_bg'>");
                alignment2 = bVar.f415c;
                if (alignment2 != null) {
                    i28 = n0.f32081a[alignment2.ordinal()];
                    if (i28 != 1) {
                        i32 = 2;
                        if (i28 != 2) {
                            str16 = "center";
                        } else {
                            str16 = str11;
                        }
                    } else {
                        i32 = 2;
                        str16 = str10;
                    }
                    sb4.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                    sb4.append(str14);
                    sb4.append("</span>");
                } else {
                    i32 = 2;
                    sb4.append(str14);
                }
                sb4.append("</span></div>");
                i34 = i42 + 1;
                f13 = f16;
                str25 = str25;
                str24 = str24;
                i29 = 0;
                i33 = 1;
                webViewSubtitleOutput = this;
            } else {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - webViewSubtitleOutput.f2302f) * 100.0f));
            }
            str2 = str;
            i11 = 0;
            f5 = bVar.f422j;
            if (f5 != -3.4028235E38f) {
                str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f5 * 100.0f));
            } else {
                str3 = "fit-content";
            }
            String str210 = str3;
            alignment = bVar.f414b;
            str4 = "end";
            if (alignment == null) {
                i14 = i33;
                obj = "center";
                i13 = 2;
            } else {
                i12 = n0.f32081a[alignment.ordinal()];
                if (i12 != i33) {
                    i13 = 2;
                    if (i12 != 2) {
                        obj = "center";
                    } else {
                        obj = "end";
                    }
                } else {
                    i13 = 2;
                    obj = "start";
                }
                i14 = 1;
            }
            if (i36 != i14) {
                str5 = "vertical-rl";
            } else if (i36 != i13) {
                str5 = "horizontal-tb";
            } else {
                str5 = "vertical-lr";
            }
            String str211 = str5;
            String strB3 = webViewSubtitleOutput.b(bVar.f425n, bVar.f426o);
            if (bVar.f424l) {
                i15 = bVar.m;
            } else {
                i15 = webViewSubtitleOutput.f2300d.f32012c;
            }
            String strX9 = j3.X(i15);
            if (i36 != 1) {
                if (i11 != 0) {
                    str6 = "left";
                } else {
                    str6 = "right";
                }
                str7 = str6;
                obj2 = "top";
            } else if (i36 != 2) {
                str7 = i11 != 0 ? "bottom" : "top";
                obj2 = "left";
            } else {
                if (i11 != 0) {
                    str6 = "right";
                } else {
                    str6 = "left";
                }
                str7 = str6;
                obj2 = "top";
            }
            if (i36 != 2) {
                str8 = "height";
                int i43 = i38;
                i38 = i39;
                i39 = i43;
            } else {
                str8 = "height";
                int i44 = i38;
                i38 = i39;
                i39 = i44;
            }
            String str212 = str8;
            charSequence = bVar.f413a;
            f11 = webViewSubtitleOutput.getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = h9.f0.f32032a;
            int i45 = i39;
            int i46 = i34;
            str9 = BuildConfig.VERSION_NAME;
            if (charSequence == null) {
                str10 = "start";
                pVar = new p(12, BuildConfig.VERSION_NAME, ImmutableMap.k());
            } else {
                str10 = "start";
                if (charSequence instanceof Spanned) {
                    pVar = new p(12, h9.f0.a(charSequence), ImmutableMap.k());
                } else {
                    str9 = BuildConfig.VERSION_NAME;
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i16 = 0;
                    while (i16 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i16].getBackgroundColor()));
                        i16++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strJ2 = nv.p.j(iIntValue2, "bg_");
                        Iterator it3 = it;
                        String strH2 = a.h(".", strJ2, ",.", strJ2, ypOOxsaJG.BXZDWBdfg);
                        String strX10 = j3.X(iIntValue2);
                        String str213 = f0.f3975a;
                        Locale locale8 = Locale.US;
                        map.put(strH2, str24 + strX10 + str25);
                        it = it3;
                        str4 = str4;
                    }
                    str11 = str4;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    i17 = 0;
                    while (i17 < length2) {
                        String str310 = str25;
                        obj3 = spans[i17];
                        String str311 = str24;
                        z11 = obj3 instanceof StrikethroughSpan;
                        String str312 = null;
                        if (z11) {
                            z12 = z11;
                            strG = "<span style='text-decoration:line-through;'>";
                        } else {
                            z12 = z11;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strX11 = j3.X(((ForegroundColorSpan) obj3).getForegroundColor());
                                String str313 = f0.f3975a;
                                Locale locale9 = Locale.US;
                                strG = a.g("<span style='color:", strX11, ";'>");
                            } else {
                                spans = spans;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    String str314 = f0.f3975a;
                                    Locale locale10 = Locale.US;
                                    i23 = length2;
                                    strG = p0.h(backgroundColor2, "<span class='bg_", "'>");
                                } else {
                                    i23 = length2;
                                    if (obj3 instanceof f) {
                                        strG = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size3 = absoluteSizeSpan.getSize();
                                        } else {
                                            size3 = absoluteSizeSpan.getSize() / f11;
                                        }
                                        Object[] objArr8 = {Float.valueOf(size3)};
                                        String str315 = f0.f3975a;
                                        strG = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr8);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr9 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        String str316 = f0.f3975a;
                                        strG = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr9);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            String str317 = f0.f3975a;
                                            Locale locale11 = Locale.US;
                                            strG = a.g("<span style='font-family:\"", family, OYAvlbfUyD.DDTSkC);
                                        } else {
                                            strG = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj3).getStyle();
                                        if (style != 1) {
                                            strG = "<b>";
                                        } else if (style != 2) {
                                            strG = "<i>";
                                        } else if (style != 3) {
                                            strG = null;
                                        } else {
                                            strG = "<b><i>";
                                        }
                                    } else if (obj3 instanceof h) {
                                        i27 = ((h) obj3).f442b;
                                        if (i27 != -1) {
                                            strG = "<ruby style='ruby-position:unset;'>";
                                        } else if (i27 != 1) {
                                            strG = "<ruby style='ruby-position:over;'>";
                                        } else if (i27 != 2) {
                                            strG = null;
                                        } else {
                                            strG = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strG = "<u>";
                                    } else if (obj3 instanceof i) {
                                        iVar = (i) obj3;
                                        i24 = iVar.f446a;
                                        i25 = iVar.f447b;
                                        sb3 = new StringBuilder();
                                        if (i25 != 1) {
                                            i26 = 2;
                                            if (i25 == 2) {
                                                sb3.append("open ");
                                            }
                                        } else {
                                            i26 = 2;
                                            sb3.append("filled ");
                                        }
                                        if (i24 != 0) {
                                            sb3.append("none");
                                        } else if (i24 != 1) {
                                            sb3.append("circle");
                                        } else if (i24 != i26) {
                                            sb3.append("dot");
                                        } else if (i24 != 3) {
                                            sb3.append("unset");
                                        } else {
                                            sb3.append("sesame");
                                        }
                                        String string2 = sb3.toString();
                                        if (iVar.f448c != 2) {
                                            str12 = "over right";
                                        } else {
                                            str12 = "under left";
                                        }
                                        Object[] objArr10 = {string2, str12};
                                        String str318 = f0.f3975a;
                                        strG = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr10);
                                    } else {
                                        strG = null;
                                    }
                                }
                            }
                            if (z12) {
                            }
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strG != null) {
                                str13.getClass();
                                d0 d0Var3 = new d0(strG, spanStart, spanEnd, str13);
                                e0Var = (e0) sparseArray.get(spanStart);
                                if (e0Var == null) {
                                    e0Var = new e0();
                                    sparseArray.put(spanStart, e0Var);
                                }
                                e0Var.f32030a.add(d0Var3);
                                e0Var2 = (e0) sparseArray.get(spanEnd);
                                if (e0Var2 == null) {
                                    e0Var2 = new e0();
                                    sparseArray.put(spanEnd, e0Var2);
                                }
                                e0Var2.f32031b.add(d0Var3);
                            }
                            i17++;
                            str25 = str310;
                            str24 = str311;
                            spans = spans;
                        }
                        i23 = length2;
                        if (z12) {
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strG != null) {
                            str13.getClass();
                            d0 d0Var4 = new d0(strG, spanStart, spanEnd, str13);
                            e0Var = (e0) sparseArray.get(spanStart);
                            if (e0Var == null) {
                                e0Var = new e0();
                                sparseArray.put(spanStart, e0Var);
                            }
                            e0Var.f32030a.add(d0Var4);
                            e0Var2 = (e0) sparseArray.get(spanEnd);
                            if (e0Var2 == null) {
                                e0Var2 = new e0();
                                sparseArray.put(spanEnd, e0Var2);
                            }
                            e0Var2.f32031b.add(d0Var4);
                        }
                        i17++;
                        str25 = str310;
                        str24 = str311;
                        spans = spans;
                    }
                    str25 = str25;
                    str24 = str24;
                    sb2 = new StringBuilder(spanned.length());
                    i18 = 0;
                    i19 = 0;
                    while (i19 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i19);
                        sb2.append(h9.f0.a(spanned.subSequence(i18, iKeyAt2)));
                        e0 e0Var4 = (e0) sparseArray.get(iKeyAt2);
                        ArrayList arrayList4 = e0Var4.f32031b;
                        arrayList = e0Var4.f32030a;
                        SparseArray sparseArray3 = sparseArray;
                        Collections.sort(arrayList4, d0.f32024f);
                        arrayList2 = e0Var4.f32031b;
                        size = arrayList2.size();
                        i21 = 0;
                        while (i21 < size) {
                            Object obj6 = arrayList2.get(i21);
                            i21++;
                            sb2.append(((d0) obj6).f32028d);
                            arrayList2 = arrayList2;
                        }
                        Collections.sort(arrayList, d0.f32023e);
                        size2 = arrayList.size();
                        i22 = 0;
                        while (i22 < size2) {
                            Object obj7 = arrayList.get(i22);
                            i22++;
                            sb2.append(((d0) obj7).f32027c);
                        }
                        i19++;
                        i18 = iKeyAt2;
                        sparseArray = sparseArray3;
                    }
                    sb2.append(h9.f0.a(spanned.subSequence(i18, spanned.length())));
                    pVar = new p(12, sb2.toString(), map);
                }
                str14 = (String) pVar.f3800b;
                while (r3.hasNext()) {
                    str18 = (String) map2.put(str39, (String) map2.get(str39));
                    if (str18 != null) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    b7.a.j(z13);
                }
                Integer numValueOf7 = Integer.valueOf(i46);
                Float fValueOf4 = Float.valueOf(f15);
                Integer numValueOf8 = Integer.valueOf(i45);
                Integer numValueOf9 = Integer.valueOf(i38);
                f12 = bVar.f428q;
                if (f12 != CropImageView.DEFAULT_ASPECT_RATIO) {
                    if (i36 != 2) {
                        str17 = "skewY";
                    } else {
                        str17 = "skewY";
                    }
                    Object[] objArr11 = {str17, Float.valueOf(f12)};
                    String str42 = f0.f3975a;
                    str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr11);
                } else {
                    str15 = str9;
                }
                sb4.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, obj2, fValueOf4, str7, str2, str212, str210, obj, str211, strB3, strX9, numValueOf8, numValueOf9, str15));
                sb4.append("<span class='default_bg'>");
                alignment2 = bVar.f415c;
                if (alignment2 != null) {
                    i28 = n0.f32081a[alignment2.ordinal()];
                    if (i28 != 1) {
                        i32 = 2;
                        if (i28 != 2) {
                            str16 = "center";
                        } else {
                            str16 = str11;
                        }
                    } else {
                        i32 = 2;
                        str16 = str10;
                    }
                    sb4.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                    sb4.append(str14);
                    sb4.append("</span>");
                } else {
                    i32 = 2;
                    sb4.append(str14);
                }
                sb4.append("</span></div>");
                i34 = i46 + 1;
                f13 = f16;
                str25 = str25;
                str24 = str24;
                i29 = 0;
                i33 = 1;
                webViewSubtitleOutput = this;
            }
            str11 = "end";
            str14 = (String) pVar.f3800b;
            while (r3.hasNext()) {
                str18 = (String) map2.put(str39, (String) map2.get(str39));
                if (str18 != null) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                b7.a.j(z13);
            }
            Integer numValueOf10 = Integer.valueOf(i46);
            Float fValueOf5 = Float.valueOf(f15);
            Integer numValueOf11 = Integer.valueOf(i45);
            Integer numValueOf12 = Integer.valueOf(i38);
            f12 = bVar.f428q;
            if (f12 != CropImageView.DEFAULT_ASPECT_RATIO) {
                if (i36 != 2) {
                    str17 = "skewY";
                } else {
                    str17 = "skewY";
                }
                Object[] objArr12 = {str17, Float.valueOf(f12)};
                String str43 = f0.f3975a;
                str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
            } else {
                str15 = str9;
            }
            sb4.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, obj2, fValueOf5, str7, str2, str212, str210, obj, str211, strB3, strX9, numValueOf11, numValueOf12, str15));
            sb4.append("<span class='default_bg'>");
            alignment2 = bVar.f415c;
            if (alignment2 != null) {
                i28 = n0.f32081a[alignment2.ordinal()];
                if (i28 != 1) {
                    i32 = 2;
                    if (i28 != 2) {
                        str16 = "center";
                    } else {
                        str16 = str11;
                    }
                } else {
                    i32 = 2;
                    str16 = str10;
                }
                sb4.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                sb4.append(str14);
                sb4.append("</span>");
            } else {
                i32 = 2;
                sb4.append(str14);
            }
            sb4.append("</span></div>");
            i34 = i46 + 1;
            f13 = f16;
            str25 = str25;
            str24 = str24;
            i29 = 0;
            i33 = 1;
            webViewSubtitleOutput = this;
        }
        sb4.append("</div></body></html>");
        StringBuilder sb6 = new StringBuilder();
        sb6.append("<html><head><style>");
        for (String str44 : map2.keySet()) {
            sb6.append(str44);
            sb6.append("{");
            sb6.append((String) map2.get(str44));
            sb6.append("}");
        }
        sb6.append("</style></head>");
        sb4.insert(0, (CharSequence) sb6);
        this.f2298b.loadData(Base64.encodeToString(sb4.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }
}

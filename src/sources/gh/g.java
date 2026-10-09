package gh;

import android.graphics.Typeface;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import com.lingo.lingoskill.object.PdLesson;
import com.lingodeer.data.model.characterstroke.CharacterStroke;
import fr.j3;
import g2.f0;
import g2.v0;
import g3.z;
import j3.c0;
import j3.p0;
import j3.r0;
import j3.s;
import j3.t;
import j3.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n3.p;
import n3.u;
import n3.v;
import oz.q;
import oz.x;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29202b;

    public /* synthetic */ g(String str, int i11) {
        this.f29201a = i11;
        this.f29202b = str;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0420  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.c
    public final Object invoke(Object obj) {
        Object obj2;
        String url;
        v vVar;
        n3.i iVar;
        u uVar;
        p0 p0Var;
        int i11 = this.f29201a;
        b0 b0Var = b0.f48488a;
        boolean z11 = false;
        int i12 = 1;
        String str = this.f29202b;
        switch (i11) {
            case 0:
                PdLesson it = (PdLesson) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return Boolean.valueOf(kotlin.jvm.internal.m.a(it.getId(), str));
            case 1:
                g3.b0 semantics = (g3.b0) obj;
                kotlin.jvm.internal.m.f(semantics, "$this$semantics");
                z.b(semantics, str);
                return b0Var;
            case 2:
                String it2 = (String) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                if (q.K0(it2)) {
                    return it2.length() < str.length() ? str : it2;
                }
                return defpackage.e.m(str, it2);
            case 3:
                j3.e withAnnotatedString = (j3.e) obj;
                kotlin.jvm.internal.m.f(withAnnotatedString, "$this$withAnnotatedString");
                int i13 = j3.h.f35698e;
                Spanned spannedFromHtml = Html.fromHtml("<ContentHandlerReplacementTag />".concat(str), 63, null, t.f35778a);
                j3.e eVar = new j3.e(spannedFromHtml.length());
                boolean z12 = spannedFromHtml instanceof j3.h;
                StringBuilder sb2 = eVar.f35683a;
                if (z12) {
                    eVar.c((j3.h) spannedFromHtml);
                } else {
                    sb2.append((CharSequence) spannedFromHtml);
                }
                Object[] spans = spannedFromHtml.getSpans(0, sb2.length(), Object.class);
                int length = spans.length;
                int i14 = 0;
                while (i14 < length) {
                    Object obj3 = spans[i14];
                    long jB = t.b(spannedFromHtml.getSpanStart(obj3), spannedFromHtml.getSpanEnd(obj3));
                    int i15 = x0.f35822c;
                    int i16 = length;
                    int i17 = (int) (jB >> 32);
                    int i18 = (int) (jB & 4294967295L);
                    if (obj3 instanceof AbsoluteSizeSpan) {
                        obj2 = null;
                    } else {
                        boolean z13 = obj3 instanceof AlignmentSpan;
                        ArrayList arrayList = eVar.f35685c;
                        int i19 = 3;
                        if (z13) {
                            Layout.Alignment alignment = ((AlignmentSpan) obj3).getAlignment();
                            int i21 = alignment == null ? -1 : s.f35775a[alignment.ordinal()];
                            if (i21 == i12) {
                                i19 = 5;
                            } else if (i21 != 2) {
                                i19 = i21 != 3 ? 0 : 6;
                            }
                            arrayList.add(new j3.d(i17, i18, 8, new c0(i19, null, 510), null));
                        } else if (obj3 instanceof j3.k) {
                            j3.k kVar = (j3.k) obj3;
                            arrayList.add(new j3.d(i17, i18, new r0(kVar.f35713b), kVar.f35712a));
                        } else if (obj3 instanceof BackgroundColorSpan) {
                            eVar.a(new p0(0L, 0L, (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, f0.c(((BackgroundColorSpan) obj3).getBackgroundColor()), (u3.l) null, (v0) null, 63487), i17, i18);
                        } else {
                            if (obj3 instanceof j3.n) {
                                long j11 = j3.m.f35716d;
                                j3.n nVar = (j3.n) obj3;
                                int i22 = nVar.f35724b;
                                j3.i(j11);
                                long jL = j3.L(j11 & 1095216660480L, v3.o.c(j11) * i22);
                                j3.m mVar = nVar.f35723a;
                                String str2 = null;
                                int i23 = 8;
                                arrayList.add(new j3.d(i17, i18, i23, new c0(0, new u3.q(jL, jL), 503), str2));
                                arrayList.add(new j3.d(i17, i18, i23, mVar, str2));
                            } else if (obj3 instanceof ForegroundColorSpan) {
                                eVar.a(new p0(f0.c(((ForegroundColorSpan) obj3).getForegroundColor()), 0L, (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65534), i17, i18);
                            } else if (obj3 instanceof RelativeSizeSpan) {
                                eVar.a(new p0(0L, j3.L(8589934592L, ((RelativeSizeSpan) obj3).getSizeChange()), (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65533), i17, i18);
                            } else if (obj3 instanceof StrikethroughSpan) {
                                eVar.a(new p0(0L, 0L, (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, u3.l.f52753d, (v0) null, 61439), i17, i18);
                            } else if (obj3 instanceof StyleSpan) {
                                int style = ((StyleSpan) obj3).getStyle();
                                if (style == 1) {
                                    i12 = 1;
                                    p0Var = new p0(0L, 0L, n3.s.L, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65531);
                                } else if (style == 2) {
                                    i12 = 1;
                                    p0Var = new p0(0L, 0L, (n3.s) null, new n3.o(1), (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65527);
                                } else if (style != 3) {
                                    i12 = 1;
                                    p0Var = null;
                                } else {
                                    p0Var = new p0(0L, 0L, n3.s.L, new n3.o(1), (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65523);
                                    i12 = 1;
                                }
                                if (p0Var != null) {
                                    eVar.a(p0Var, i17, i18);
                                }
                            } else {
                                i12 = 1;
                                if (obj3 instanceof SubscriptSpan) {
                                    eVar.a(new p0(0L, 0L, (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, new u3.a(-0.5f), (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65279), i17, i18);
                                } else if (obj3 instanceof SuperscriptSpan) {
                                    eVar.a(new p0(0L, 0L, (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, new u3.a(0.5f), (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65279), i17, i18);
                                } else if (obj3 instanceof TypefaceSpan) {
                                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj3;
                                    String family = typefaceSpan.getFamily();
                                    if (kotlin.jvm.internal.m.a(family, "cursive")) {
                                        uVar = n3.i.f43157e;
                                    } else if (kotlin.jvm.internal.m.a(family, "monospace")) {
                                        uVar = n3.i.f43156d;
                                    } else if (kotlin.jvm.internal.m.a(family, "sans-serif")) {
                                        uVar = n3.i.f43154b;
                                    } else {
                                        if (kotlin.jvm.internal.m.a(family, "serif")) {
                                            uVar = n3.i.f43155c;
                                        } else {
                                            String family2 = typefaceSpan.getFamily();
                                            if (family2 == null || family2.length() == 0) {
                                                vVar = null;
                                            } else {
                                                Typeface typefaceCreate = Typeface.create(family2, 0);
                                                Typeface typeface = Typeface.DEFAULT;
                                                if (kotlin.jvm.internal.m.a(typefaceCreate, typeface) || kotlin.jvm.internal.m.a(typefaceCreate, Typeface.create(typeface, 0))) {
                                                    typefaceCreate = null;
                                                }
                                                if (typefaceCreate != null) {
                                                    vVar = new v(new lf.x0(typefaceCreate, 26));
                                                } else {
                                                    vVar = null;
                                                }
                                            }
                                            iVar = vVar;
                                        }
                                        eVar.a(new p0(0L, 0L, (n3.s) null, (n3.o) null, (p) null, iVar, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65503), i17, i18);
                                    }
                                    iVar = uVar;
                                    eVar.a(new p0(0L, 0L, (n3.s) null, (n3.o) null, (p) null, iVar, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65503), i17, i18);
                                } else if (obj3 instanceof UnderlineSpan) {
                                    eVar.a(new p0(0L, 0L, (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, u3.l.f52752c, (v0) null, 61439), i17, i18);
                                } else if ((obj3 instanceof URLSpan) && (url = ((URLSpan) obj3).getURL()) != null) {
                                    obj2 = null;
                                    arrayList.add(new j3.d(i17, i18, 8, new j3.v(url, null), null));
                                }
                            }
                            i12 = 1;
                        }
                        obj2 = null;
                    }
                    i14++;
                    length = i16;
                }
                withAnnotatedString.c(eVar.j());
                return b0Var;
            case 4:
                g3.b0 b0Var2 = (g3.b0) obj;
                z.b(b0Var2, str);
                z.d(b0Var2, 5);
                return b0Var;
            case 5:
                CharacterStroke ch2 = (CharacterStroke) obj;
                kotlin.jvm.internal.m.f(ch2, "ch");
                List listC = zr.b.c(ch2.getZhuyin());
                ArrayList arrayList2 = new ArrayList(ry.n.W(listC, 10));
                Iterator it3 = listC.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(zr.b.b((String) it3.next()));
                }
                if (!arrayList2.isEmpty()) {
                    int size = arrayList2.size();
                    int i24 = 0;
                    while (i24 < size) {
                        Object obj4 = arrayList2.get(i24);
                        i24++;
                        if (kotlin.jvm.internal.m.a((String) obj4, str)) {
                            z11 = true;
                        }
                    }
                }
                return Boolean.valueOf(z11);
            default:
                CharacterStroke ch3 = (CharacterStroke) obj;
                kotlin.jvm.internal.m.f(ch3, "ch");
                List listC2 = zr.b.c(ch3.getZhuyin());
                ArrayList arrayList3 = new ArrayList(ry.n.W(listC2, 10));
                Iterator it4 = listC2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(zr.b.b((String) it4.next()));
                }
                if (!arrayList3.isEmpty()) {
                    int size2 = arrayList3.size();
                    int i25 = 0;
                    while (i25 < size2) {
                        Object obj5 = arrayList3.get(i25);
                        i25++;
                        if (x.s0((String) obj5, str, false)) {
                            z11 = true;
                        }
                    }
                }
                return Boolean.valueOf(z11);
        }
    }

    public /* synthetic */ g(zr.b bVar, String str, int i11) {
        this.f29201a = i11;
        this.f29202b = str;
    }
}

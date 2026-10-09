package j3;

import android.graphics.RectF;
import android.text.Layout;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f35797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f35798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f35800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f35801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f35802f;

    public u0(t0 t0Var, x xVar, long j11) {
        this.f35797a = t0Var;
        this.f35798b = xVar;
        this.f35799c = j11;
        ArrayList arrayList = xVar.f35820h;
        boolean zIsEmpty = arrayList.isEmpty();
        float fD = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f35800d = zIsEmpty ? 0.0f : ((z) arrayList.get(0)).f35830a.f35664d.d(0);
        if (!arrayList.isEmpty()) {
            z zVar = (z) ry.m.z0(arrayList);
            k3.r rVar = zVar.f35830a.f35664d;
            fD = rVar.d(rVar.f37895g - 1) + zVar.f35835f;
        }
        this.f35801e = fD;
        this.f35802f = xVar.f35819g;
    }

    public final u3.j a(int i11) {
        x xVar = this.f35798b;
        ArrayList arrayList = xVar.f35820h;
        xVar.l(i11);
        z zVar = (z) arrayList.get(i11 == ((h) xVar.f35813a.f517a).f35700b.length() ? ns.o.A(arrayList) : t.e(i11, arrayList));
        return zVar.f35830a.f35664d.f37894f.isRtlCharAt(zVar.d(i11)) ? u3.j.Rtl : u3.j.Ltr;
    }

    public final f2.c b(int i11) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        x xVar = this.f35798b;
        xVar.k(i11);
        ArrayList arrayList = xVar.f35820h;
        z zVar = (z) arrayList.get(t.e(i11, arrayList));
        b bVar = zVar.f35830a;
        int iD = zVar.d(i11);
        CharSequence charSequence = bVar.f35665e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbI = w4.c.i(iD, "offset(", ") is out of bounds [0,");
            sbI.append(charSequence.length());
            sbI.append(')');
            p3.a.a(sbI.toString());
        }
        k3.r rVar = bVar.f35664d;
        Layout layout = rVar.f37894f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = rVar.g(lineForOffset);
        float fE = rVar.e(lineForOffset);
        boolean z11 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z11 || zIsRtlCharAt) {
            if (z11 && zIsRtlCharAt) {
                fH = rVar.i(iD, false);
                fH2 = rVar.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = rVar.h(iD, false);
                fH2 = rVar.h(iD + 1, true);
            } else {
                fI = rVar.i(iD, false);
                fI2 = rVar.i(iD + 1, true);
            }
            float f5 = fH;
            fI = fH2;
            fI2 = f5;
        } else {
            fI = rVar.h(iD, false);
            fI2 = rVar.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return zVar.a(new f2.c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final f2.c c(int i11) {
        x xVar = this.f35798b;
        ArrayList arrayList = xVar.f35820h;
        xVar.l(i11);
        z zVar = (z) arrayList.get(i11 == ((h) xVar.f35813a.f517a).f35700b.length() ? ns.o.A(arrayList) : t.e(i11, arrayList));
        b bVar = zVar.f35830a;
        int iD = zVar.d(i11);
        CharSequence charSequence = bVar.f35665e;
        k3.r rVar = bVar.f35664d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbI = w4.c.i(iD, "offset(", ") is out of bounds [0,");
            sbI.append(charSequence.length());
            sbI.append(']');
            p3.a.a(sbI.toString());
        }
        float fH = rVar.h(iD, false);
        int lineForOffset = rVar.f37894f.getLineForOffset(iD);
        return zVar.a(new f2.c(fH, rVar.g(lineForOffset), fH, rVar.e(lineForOffset)));
    }

    public final boolean d() {
        long j11 = this.f35799c;
        float f5 = (int) (j11 >> 32);
        x xVar = this.f35798b;
        return f5 < xVar.f35816d || xVar.f35815c || ((float) ((int) (j11 & 4294967295L))) < xVar.f35817e;
    }

    public final float e(int i11) {
        x xVar = this.f35798b;
        xVar.m(i11);
        ArrayList arrayList = xVar.f35820h;
        z zVar = (z) arrayList.get(t.f(i11, arrayList));
        b bVar = zVar.f35830a;
        int i12 = i11 - zVar.f35833d;
        k3.r rVar = bVar.f35664d;
        return rVar.f37894f.getLineLeft(i12) + (i12 == rVar.f37895g + (-1) ? rVar.f37898j : CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return kotlin.jvm.internal.m.a(this.f35797a, u0Var.f35797a) && this.f35798b.equals(u0Var.f35798b) && v3.l.a(this.f35799c, u0Var.f35799c) && this.f35800d == u0Var.f35800d && this.f35801e == u0Var.f35801e && kotlin.jvm.internal.m.a(this.f35802f, u0Var.f35802f);
    }

    public final float f(int i11) {
        x xVar = this.f35798b;
        xVar.m(i11);
        ArrayList arrayList = xVar.f35820h;
        z zVar = (z) arrayList.get(t.f(i11, arrayList));
        b bVar = zVar.f35830a;
        int i12 = i11 - zVar.f35833d;
        k3.r rVar = bVar.f35664d;
        return rVar.f37894f.getLineRight(i12) + (i12 == rVar.f37895g + (-1) ? rVar.f37899k : CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public final int g(int i11) {
        x xVar = this.f35798b;
        xVar.m(i11);
        ArrayList arrayList = xVar.f35820h;
        z zVar = (z) arrayList.get(t.f(i11, arrayList));
        b bVar = zVar.f35830a;
        return bVar.f35664d.f37894f.getLineStart(i11 - zVar.f35833d) + zVar.f35831b;
    }

    public final u3.j h(int i11) {
        x xVar = this.f35798b;
        ArrayList arrayList = xVar.f35820h;
        xVar.l(i11);
        z zVar = (z) arrayList.get(i11 == ((h) xVar.f35813a.f517a).f35700b.length() ? ns.o.A(arrayList) : t.e(i11, arrayList));
        b bVar = zVar.f35830a;
        int iD = zVar.d(i11);
        k3.r rVar = bVar.f35664d;
        return rVar.f37894f.getParagraphDirection(rVar.f37894f.getLineForOffset(iD)) == 1 ? u3.j.Ltr : u3.j.Rtl;
    }

    public final int hashCode() {
        return this.f35802f.hashCode() + defpackage.e.a(defpackage.e.a(defpackage.e.f(this.f35799c, (this.f35798b.hashCode() + (this.f35797a.hashCode() * 31)) * 31, 31), this.f35800d, 31), this.f35801e, 31);
    }

    public final g2.k i(int i11, int i12) {
        x xVar = this.f35798b;
        h hVar = (h) xVar.f35813a.f517a;
        if (i11 < 0 || i11 > i12 || i12 > hVar.f35700b.length()) {
            StringBuilder sbK = w4.c.k("Start(", i11, ") or End(", i12, ") is out of range [0..");
            sbK.append(hVar.f35700b.length());
            sbK.append("), or start > end!");
            p3.a.a(sbK.toString());
        }
        if (i11 == i12) {
            return g2.o.a();
        }
        g2.k kVarA = g2.o.a();
        t.h(xVar.f35820h, t.b(i11, i12), new au.c0(kVarA, i11, i12));
        return kVarA;
    }

    public final long j(int i11) {
        int iQ;
        int iL;
        int iL2;
        x xVar = this.f35798b;
        ArrayList arrayList = xVar.f35820h;
        xVar.l(i11);
        z zVar = (z) arrayList.get(i11 == ((h) xVar.f35813a.f517a).f35700b.length() ? ns.o.A(arrayList) : t.e(i11, arrayList));
        b bVar = zVar.f35830a;
        int iD = zVar.d(i11);
        ar.f fVarJ = bVar.f35664d.j();
        if (fVarJ.k(fVarJ.q(iD))) {
            fVarJ.b(iD);
            iQ = iD;
            while (iQ != -1 && (!fVarJ.k(iQ) || fVarJ.g(iQ))) {
                iQ = fVarJ.q(iQ);
            }
        } else {
            fVarJ.b(iD);
            if (fVarJ.j(iD)) {
                iQ = (!fVarJ.h(iD) || fVarJ.f(iD)) ? fVarJ.q(iD) : iD;
            } else {
                iQ = fVarJ.f(iD) ? fVarJ.q(iD) : -1;
            }
        }
        if (iQ == -1) {
            iQ = iD;
        }
        if (fVarJ.g(fVarJ.l(iD))) {
            fVarJ.b(iD);
            iL = iD;
            while (iL != -1 && (fVarJ.k(iL) || !fVarJ.g(iL))) {
                iL = fVarJ.l(iL);
            }
        } else {
            fVarJ.b(iD);
            if (fVarJ.f(iD)) {
                if (!fVarJ.h(iD) || fVarJ.j(iD)) {
                    iL2 = fVarJ.l(iD);
                    iL = iL2;
                } else {
                    iL = iD;
                }
            } else if (fVarJ.j(iD)) {
                iL2 = fVarJ.l(iD);
                iL = iL2;
            } else {
                iL = -1;
            }
        }
        if (iL != -1) {
            iD = iL;
        }
        return zVar.b(t.b(iQ, iD), false);
    }

    public final boolean k(int i11) {
        x xVar = this.f35798b;
        xVar.m(i11);
        ArrayList arrayList = xVar.f35820h;
        Layout layout = ((z) arrayList.get(t.f(i11, arrayList))).f35830a.f35664d.f37894f;
        ThreadLocal threadLocal = k3.s.f37905a;
        return layout.getEllipsisCount(i11) > 0;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f35797a + ", multiParagraph=" + this.f35798b + ", size=" + ((Object) v3.l.b(this.f35799c)) + ", firstBaseline=" + this.f35800d + ", lastBaseline=" + this.f35801e + ", placeholderRects=" + this.f35802f + ')';
    }
}

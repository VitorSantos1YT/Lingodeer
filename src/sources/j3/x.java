package j3;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9.i f35813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f35815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f35816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f35817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f35818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f35819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f35820h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public x(a9.i iVar, long j11, int i11, int i12) {
        boolean z11;
        int i13;
        int iG;
        int i14;
        this.f35813a = iVar;
        this.f35814b = i11;
        if (v3.a.j(j11) != 0 || v3.a.i(j11) != 0) {
            p3.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) iVar.f521e;
        int size = arrayList2.size();
        float f5 = 0.0f;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i15 >= size) {
                z11 = false;
                break;
            }
            a0 a0Var = (a0) arrayList2.get(i15);
            r3.c cVar = a0Var.f35657a;
            int iH = v3.a.h(j11);
            if (v3.a.c(j11)) {
                i13 = i15;
                iG = v3.a.g(j11) - ((int) Math.ceil(f5));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i13 = i15;
                iG = v3.a.g(j11);
            }
            b bVar = new b(cVar, this.f35814b - i16, i12, v3.b.b(iH, iG, 5));
            float fB = bVar.b() + f5;
            k3.r rVar = bVar.f35664d;
            int i17 = i16 + rVar.f37895g;
            arrayList.add(new z(bVar, a0Var.f35658b, a0Var.f35659c, i16, i17, f5, fB));
            if (!rVar.f37892d) {
                if (i17 == this.f35814b) {
                    i14 = i13;
                    if (i14 != ns.o.A((ArrayList) this.f35813a.f521e)) {
                    }
                } else {
                    i14 = i13;
                }
                i15 = i14 + 1;
                i16 = i17;
                f5 = fB;
            }
            z11 = true;
            i16 = i17;
            f5 = fB;
            break;
        }
        this.f35817e = f5;
        this.f35818f = i16;
        this.f35815c = z11;
        this.f35820h = arrayList;
        this.f35816d = v3.a.h(j11);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i18 = 0; i18 < size2; i18++) {
            z zVar = (z) arrayList.get(i18);
            ?? r9 = zVar.f35830a.f35666f;
            ArrayList arrayList4 = new ArrayList(r9.size());
            int size3 = r9.size();
            for (int i19 = 0; i19 < size3; i19++) {
                f2.c cVar2 = (f2.c) r9.get(i19);
                arrayList4.add(cVar2 != null ? zVar.a(cVar2) : null);
            }
            ry.m.d0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f35813a.f518b).size()) {
            int size4 = ((List) this.f35813a.f518b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i21 = 0; i21 < size4; i21++) {
                arrayList5.add(null);
            }
            arrayList3 = ry.m.H0(arrayList3, arrayList5);
        }
        this.f35819g = arrayList3;
    }

    public static void i(x xVar, g2.v vVar, long j11, g2.v0 v0Var, u3.l lVar, i2.e eVar, int i11) {
        if ((i11 & 2) != 0) {
            j11 = g2.x.f28622i;
        }
        long j12 = j11;
        g2.v0 v0Var2 = (i11 & 4) != 0 ? null : v0Var;
        u3.l lVar2 = (i11 & 8) != 0 ? null : lVar;
        i2.e eVar2 = (i11 & 16) != 0 ? null : eVar;
        vVar.e();
        ArrayList arrayList = xVar.f35820h;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            z zVar = (z) arrayList.get(i12);
            g2.v vVar2 = vVar;
            zVar.f35830a.f(vVar2, j12, v0Var2, lVar2, eVar2, 3);
            vVar2.n(CropImageView.DEFAULT_ASPECT_RATIO, zVar.f35830a.b());
            i12++;
            vVar = vVar2;
        }
        vVar.p();
    }

    public static void j(x xVar, g2.v vVar, g2.t tVar, float f5, g2.v0 v0Var, u3.l lVar, i2.e eVar) {
        vVar.e();
        ArrayList arrayList = xVar.f35820h;
        if (arrayList.size() <= 1 || (tVar instanceof g2.y0)) {
            r3.i.b(xVar, vVar, tVar, f5, v0Var, lVar, eVar);
        } else {
            if (!(tVar instanceof g2.u0)) {
                throw new NoWhenBranchMatchedException();
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                z zVar = (z) arrayList.get(i11);
                fB += zVar.f35830a.b();
                fMax = Math.max(fMax, zVar.f35830a.d());
            }
            Shader shaderB = ((g2.u0) tVar).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                b bVar = ((z) arrayList.get(i12)).f35830a;
                bVar.g(vVar, new g2.u(shaderB), f5, v0Var, lVar, eVar);
                vVar.n(CropImageView.DEFAULT_ASPECT_RATIO, bVar.b());
                matrix.setTranslate(CropImageView.DEFAULT_ASPECT_RATIO, -bVar.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        vVar.p();
    }

    public final void a(long j11, float[] fArr) {
        k(x0.f(j11));
        l(x0.e(j11));
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        wVar.f38359a = 0;
        t.h(this.f35820h, j11, new d0.s(j11, fArr, wVar, new kotlin.jvm.internal.v()));
    }

    public final float b(int i11) {
        m(i11);
        ArrayList arrayList = this.f35820h;
        z zVar = (z) arrayList.get(t.f(i11, arrayList));
        b bVar = zVar.f35830a;
        return bVar.f35664d.e(i11 - zVar.f35833d) + zVar.f35835f;
    }

    public final int c(int i11, boolean z11) {
        int iF;
        m(i11);
        ArrayList arrayList = this.f35820h;
        z zVar = (z) arrayList.get(t.f(i11, arrayList));
        b bVar = zVar.f35830a;
        int i12 = i11 - zVar.f35833d;
        k3.r rVar = bVar.f35664d;
        if (z11) {
            Layout layout = rVar.f37894f;
            ThreadLocal threadLocal = k3.s.f37905a;
            if (layout.getEllipsisCount(i12) <= 0 || rVar.f37890b != TextUtils.TruncateAt.END) {
                a9.i iVarC = rVar.c();
                Layout layout2 = (Layout) iVarC.f517a;
                iF = iVarC.t(layout2.getLineEnd(i12), layout2.getLineStart(i12));
            } else {
                iF = layout.getEllipsisStart(i12) + layout.getLineStart(i12);
            }
        } else {
            iF = rVar.f(i12);
        }
        return iF + zVar.f35831b;
    }

    public final int d(int i11) {
        int iE;
        int length = ((h) this.f35813a.f517a).f35700b.length();
        ArrayList arrayList = this.f35820h;
        if (i11 >= length) {
            iE = ns.o.A(arrayList);
        } else {
            iE = i11 < 0 ? 0 : t.e(i11, arrayList);
        }
        z zVar = (z) arrayList.get(iE);
        return zVar.f35830a.f35664d.f37894f.getLineForOffset(zVar.d(i11)) + zVar.f35833d;
    }

    public final int e(float f5) {
        ArrayList arrayList = this.f35820h;
        z zVar = (z) arrayList.get(t.g(arrayList, f5));
        int i11 = zVar.f35832c - zVar.f35831b;
        int i12 = zVar.f35833d;
        if (i11 == 0) {
            return i12;
        }
        b bVar = zVar.f35830a;
        float f11 = f5 - zVar.f35835f;
        k3.r rVar = bVar.f35664d;
        return rVar.f37894f.getLineForVertical(((int) f11) - rVar.f37896h) + i12;
    }

    public final float f(int i11) {
        m(i11);
        ArrayList arrayList = this.f35820h;
        z zVar = (z) arrayList.get(t.f(i11, arrayList));
        b bVar = zVar.f35830a;
        return bVar.f35664d.g(i11 - zVar.f35833d) + zVar.f35835f;
    }

    public final int g(long j11) {
        int i11 = (int) (j11 & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        ArrayList arrayList = this.f35820h;
        z zVar = (z) arrayList.get(t.g(arrayList, fIntBitsToFloat));
        int i12 = zVar.f35832c;
        int i13 = zVar.f35831b;
        if (i12 - i13 == 0) {
            return i13;
        }
        b bVar = zVar.f35830a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i11) - zVar.f35835f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        k3.r rVar = bVar.f35664d;
        int lineForVertical = rVar.f37894f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - rVar.f37896h);
        return rVar.f37894f.getOffsetForHorizontal(lineForVertical, (rVar.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i13;
    }

    public final long h(f2.c cVar, int i11, h2.d dVar) {
        long jB;
        long j11;
        float f5 = cVar.f26573b;
        ArrayList arrayList = this.f35820h;
        int iG = t.g(arrayList, f5);
        float f11 = ((z) arrayList.get(iG)).f35836g;
        float f12 = cVar.f26575d;
        if (f11 >= f12 || iG == ns.o.A(arrayList)) {
            z zVar = (z) arrayList.get(iG);
            return zVar.b(zVar.f35830a.c(zVar.c(cVar), i11, dVar), true);
        }
        int iG2 = t.g(arrayList, f12);
        long jB2 = x0.f35821b;
        while (true) {
            jB = x0.f35821b;
            if (!x0.b(jB2, jB) || iG > iG2) {
                break;
            }
            z zVar2 = (z) arrayList.get(iG);
            jB2 = zVar2.b(zVar2.f35830a.c(zVar2.c(cVar), i11, dVar), true);
            iG++;
        }
        if (x0.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j11 = x0.f35821b;
            if (!x0.b(jB, j11) || iG > iG2) {
                break;
            }
            z zVar3 = (z) arrayList.get(iG2);
            jB = zVar3.b(zVar3.f35830a.c(zVar3.c(cVar), i11, dVar), true);
            iG2--;
        }
        return x0.b(jB, j11) ? jB2 : t.b((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void k(int i11) {
        boolean z11 = false;
        a9.i iVar = this.f35813a;
        if (i11 >= 0 && i11 < ((h) iVar.f517a).f35700b.length()) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        StringBuilder sbI = w4.c.i(i11, "offset(", ") is out of bounds [0, ");
        sbI.append(((h) iVar.f517a).f35700b.length());
        sbI.append(')');
        p3.a.a(sbI.toString());
    }

    public final void l(int i11) {
        boolean z11 = false;
        a9.i iVar = this.f35813a;
        if (i11 >= 0 && i11 <= ((h) iVar.f517a).f35700b.length()) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        StringBuilder sbI = w4.c.i(i11, "offset(", ") is out of bounds [0, ");
        sbI.append(((h) iVar.f517a).f35700b.length());
        sbI.append(']');
        p3.a.a(sbI.toString());
    }

    public final void m(int i11) {
        boolean z11 = false;
        int i12 = this.f35818f;
        if (i11 >= 0 && i11 < i12) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        p3.a.a("lineIndex(" + i11 + ") is out of bounds [0, " + i12 + ')');
    }
}

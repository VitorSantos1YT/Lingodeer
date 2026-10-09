package b1;

import android.graphics.PointF;
import android.view.inputmethod.ExtractedText;
import com.yalantis.ucrop.view.CropImageView;
import d1.z0;
import j3.u0;
import j3.x0;
import s0.o1;
import s0.s0;
import z2.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final int a(s0 s0Var, long j11, p2 p2Var) {
        long jM;
        int iG;
        o1 o1VarD = s0Var.d();
        if (o1VarD != null) {
            j3.x xVar = o1VarD.f51124a.f35798b;
            w2.x xVarC = s0Var.c();
            if (xVarC != null && (iG = g(xVar, (jM = xVarC.M(j11)), p2Var)) != -1) {
                return xVar.g(f2.b.a((xVar.b(iG) + xVar.f(iG)) / 2.0f, 1, jM));
            }
        }
        return -1;
    }

    public static final long b(s0 s0Var, f2.c cVar, f2.c cVar2, int i11) {
        long jH = h(s0Var, cVar, i11);
        if (x0.c(jH)) {
            return x0.f35821b;
        }
        long jH2 = h(s0Var, cVar2, i11);
        if (x0.c(jH2)) {
            return x0.f35821b;
        }
        int i12 = (int) (jH >> 32);
        int i13 = (int) (jH2 & 4294967295L);
        return j3.t.b(Math.min(i12, i12), Math.max(i13, i13));
    }

    public static final boolean c(u0 u0Var, int i11) {
        j3.x xVar = u0Var.f35798b;
        int iD = xVar.d(i11);
        return i11 == u0Var.g(iD) || i11 == xVar.c(iD, false) ? u0Var.h(i11) != u0Var.a(i11) : u0Var.a(i11) != u0Var.a(i11 - 1);
    }

    public static final ExtractedText d(o3.w wVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wVar.f44704a.f35700b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j11 = wVar.f44705b;
        extractedText.selectionStart = x0.f(j11);
        extractedText.selectionEnd = x0.e(j11);
        extractedText.flags = !oz.q.w0(wVar.f44704a.f35700b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final long e(PointF pointF) {
        float f5 = pointF.x;
        float f11 = pointF.y;
        return (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
    }

    public static final boolean f(f2.c cVar, float f5, float f11) {
        float f12 = cVar.f26572a;
        if (f5 > cVar.f26574c || f12 > f5) {
            return false;
        }
        return f11 <= cVar.f26575d && cVar.f26573b <= f11;
    }

    public static final int g(j3.x xVar, long j11, p2 p2Var) {
        float fH = p2Var != null ? p2Var.h() : CropImageView.DEFAULT_ASPECT_RATIO;
        int i11 = (int) (4294967295L & j11);
        int iE = xVar.e(Float.intBitsToFloat(i11));
        if (Float.intBitsToFloat(i11) < xVar.f(iE) - fH || Float.intBitsToFloat(i11) > xVar.b(iE) + fH) {
            return -1;
        }
        int i12 = (int) (j11 >> 32);
        if (Float.intBitsToFloat(i12) < (-fH) || Float.intBitsToFloat(i12) > xVar.f35816d + fH) {
            return -1;
        }
        return iE;
    }

    public static final long h(s0 s0Var, f2.c cVar, int i11) {
        o1 o1VarD = s0Var.d();
        j3.x xVar = o1VarD != null ? o1VarD.f51124a.f35798b : null;
        w2.x xVarC = s0Var.c();
        return (xVar == null || xVarC == null) ? x0.f35821b : xVar.h(cVar.i(xVarC.M(0L)), i11, j3.s0.f35777b);
    }

    public static final boolean i(int i11) {
        int type = Character.getType(i11);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean j(int i11) {
        return Character.isWhitespace(i11) || i11 == 160;
    }

    public static final boolean k(int i11) {
        int type;
        return (!j(i11) || (type = Character.getType(i11)) == 14 || type == 13 || i11 == 10) ? false : true;
    }

    public static final z1.r l(z1.r rVar, e eVar, s0 s0Var, z0 z0Var) {
        return rVar.i(new q(eVar, s0Var, z0Var));
    }
}

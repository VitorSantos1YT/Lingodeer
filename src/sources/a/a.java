package a;

import a0.b2;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.util.GlUtil$GlException;
import b7.v;
import b7.w;
import bp.u3;
import c4.i;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.android.billingclient.api.c0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e9.b0;
import e9.d0;
import e9.e0;
import e9.g;
import e9.r;
import e9.t;
import e9.u;
import e9.x;
import g2.f0;
import g2.j;
import j9.p;
import j9.q;
import j9.s;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l0.Eeqr.HOBXIlHxIkMBEA;
import nz.n;
import ob.m;
import rt.m5;
import ry.l;
import s20.b;
import s20.c;
import s20.d;
import s20.e;
import s20.f;
import x7.o;
import y.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class a implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9f;

    public /* synthetic */ a(int i11) {
        this.f4a = i11;
    }

    public static void g(int i11, int i12, String str) throws GlUtil$GlException {
        int iGlCreateShader = GLES20.glCreateShader(i12);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        b7.a.f(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i11, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        b7.a.e();
    }

    public static /* synthetic */ void u(a aVar, String str, int i11, String str2, int i12) {
        if ((i12 & 2) != 0) {
            i11 = aVar.f5b;
        }
        if ((i12 & 4) != 0) {
            str2 = BuildConfig.VERSION_NAME;
        }
        aVar.t(i11, str, str2);
        throw null;
    }

    public double A(double d5) {
        if (d5 <= 0.0d) {
            return 0.0d;
        }
        if (d5 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch((double[]) this.f7d, d5);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = (float[]) this.f6c;
        float f5 = fArr[iBinarySearch];
        int i11 = iBinarySearch - 1;
        float f11 = fArr[i11];
        double d11 = f5 - f11;
        double[] dArr = (double[]) this.f7d;
        double d12 = dArr[iBinarySearch];
        double d13 = dArr[i11];
        double d14 = d11 / (d12 - d13);
        return ((((d5 * d5) - (d13 * d13)) * d14) / 2.0d) + ((d5 - d13) * (((double) f11) - (d14 * d13))) + ((double[]) this.f8e)[i11];
    }

    public int B() {
        Paint.Cap strokeCap = ((Paint) this.f6c).getStrokeCap();
        int i11 = strokeCap == null ? -1 : j.f28570a[strokeCap.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 != 2) {
            return i11 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int C() {
        Paint.Join strokeJoin = ((Paint) this.f6c).getStrokeJoin();
        int i11 = strokeJoin == null ? -1 : j.f28571b[strokeJoin.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 != 2) {
            return i11 != 3 ? 0 : 1;
        }
        return 2;
    }

    public double D(double d5, double d11) {
        double dAbs;
        double dA = A(d5) + d11;
        switch (this.f5b) {
            case 1:
                return Math.signum(0.5d - (dA % 1.0d));
            case 2:
                dAbs = Math.abs((((dA * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dA * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dA * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d11 + dA) * 6.283185307179586d);
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dA * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return ((i) this.f9f).p(dA % 1.0d);
            default:
                return Math.sin(6.283185307179586d * dA);
        }
        return 1.0d - dAbs;
    }

    public void E() {
        e eVar = new e();
        eVar.f51381a = (String) this.f7d;
        ArrayList arrayList = (ArrayList) this.f9f;
        f fVar = (f) this.f8e;
        eVar.f51383c = fVar;
        eVar.f51382b = this.f5b;
        eVar.f51384d = new Handler(Looper.getMainLooper(), eVar);
        Context context = (Context) this.f6c;
        if (arrayList == null || (arrayList.size() == 0 && fVar != null)) {
            fVar.onError(new NullPointerException("image file cannot be null"));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AsyncTask.SERIAL_EXECUTOR.execute(new com.android.billingclient.api.b0(9, eVar, context, (b) it.next(), false));
            it.remove();
        }
    }

    public void F(List list) {
        ArrayList arrayList = (ArrayList) this.f9f;
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(new c((String) obj, 1));
            } else if (obj instanceof File) {
                arrayList.add(new c((File) obj, 0));
            } else {
                if (!(obj instanceof Uri)) {
                    throw new IllegalArgumentException("Incoming data type exception, it must be String, File, Uri or Bitmap");
                }
                arrayList.add(new d(this, (Uri) obj));
            }
        }
    }

    public p G(p pVar, m mVar, boolean z11, q qVar) {
        p pVarF;
        s sVar = (s) this.f6c;
        ArrayList arrayList = new ArrayList();
        Iterator it = sVar.iterator();
        while (true) {
            m9.i iVar = (m9.i) it;
            pVarF = null;
            if (!iVar.hasNext()) {
                break;
            }
            q qVar2 = (q) iVar.next();
            pVarF = kotlin.jvm.internal.m.a(qVar2, qVar) ? null : qVar2.e(mVar);
            if (pVarF != null) {
                arrayList.add(pVarF);
            }
        }
        p pVar2 = (p) ry.m.B0(arrayList);
        s sVar2 = sVar.f36243c;
        if (sVar2 != null && z11 && !sVar2.equals(qVar)) {
            pVarF = sVar2.f(mVar, sVar);
        }
        return (p) ry.m.B0(l.T(new p[]{pVar, pVar2, pVarF}));
    }

    public String H(String keyToMatch, boolean z11) {
        kotlin.jvm.internal.m.f(keyToMatch, "keyToMatch");
        int i11 = this.f5b;
        try {
            if (l() == 6 && kotlin.jvm.internal.m.a(J(z11), keyToMatch)) {
                this.f7d = null;
                if (l() == 5) {
                    return J(z11);
                }
            }
            return null;
        } finally {
            this.f5b = i11;
            this.f7d = null;
        }
    }

    public byte I() {
        String str = (String) this.f9f;
        int i11 = this.f5b;
        while (true) {
            int iK = K(i11);
            if (iK == -1) {
                this.f5b = iK;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iK);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f5b = iK;
                return i00.j.f(cCharAt);
            }
            i11 = iK + 1;
        }
    }

    public String J(boolean z11) {
        String strP;
        byte bI = I();
        if (z11) {
            if (bI != 1 && bI != 0) {
                return null;
            }
            strP = q();
        } else {
            if (bI != 1) {
                return null;
            }
            strP = p();
        }
        this.f7d = strP;
        return strP;
    }

    public int K(int i11) {
        if (i11 < ((String) this.f9f).length()) {
            return i11;
        }
        return -1;
    }

    public void L(float f5) {
        ((Paint) this.f6c).setAlpha((int) Math.rint(f5 * 255.0f));
    }

    public void M(int i11) {
        if (this.f5b == i11) {
            return;
        }
        this.f5b = i11;
        Paint paint = (Paint) this.f6c;
        if (Build.VERSION.SDK_INT >= 29) {
            g2.b.c(paint, i11);
        } else {
            paint.setXfermode(new PorterDuffXfermode(g2.b.e(i11)));
        }
    }

    public void N(long j11) {
        ((Paint) this.f6c).setColor(f0.E(j11));
    }

    public void O(g2.p pVar) {
        this.f8e = pVar;
        ((Paint) this.f6c).setColorFilter(pVar != null ? pVar.f28589a : null);
    }

    public void P(int i11) {
        ((Paint) this.f6c).setFilterBitmap(!(i11 == 0));
    }

    public void Q(g2.l lVar) {
        ((Paint) this.f6c).setPathEffect(lVar != null ? lVar.f28580a : null);
        this.f9f = lVar;
    }

    public void R(Shader shader) {
        this.f7d = shader;
        ((Paint) this.f6c).setShader(shader);
    }

    public void S(int i11) {
        Paint.Cap cap;
        Paint paint = (Paint) this.f6c;
        if (i11 == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i11 == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i11 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void T(int i11) {
        Paint.Join join;
        Paint paint = (Paint) this.f6c;
        if (i11 == 0) {
            join = Paint.Join.MITER;
        } else if (i11 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i11 == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void U(float f5) {
        ((Paint) this.f6c).setStrokeWidth(f5);
    }

    public void V(int i11) {
        ((Paint) this.f6c).setStyle(i11 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public int W() {
        char cCharAt;
        int i11 = this.f5b;
        if (i11 == -1) {
            return i11;
        }
        String str = (String) this.f9f;
        while (i11 < str.length() && ((cCharAt = str.charAt(i11)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i11++;
        }
        this.f5b = i11;
        return i11;
    }

    public boolean X() {
        int iW = W();
        String str = (String) this.f9f;
        if (iW >= str.length() || iW == -1 || str.charAt(iW) != ',') {
            return false;
        }
        this.f5b++;
        return true;
    }

    public boolean Y(boolean z11) {
        int iK = K(W());
        String str = (String) this.f9f;
        int length = str.length() - iK;
        if (length >= 4 && iK != -1) {
            for (int i11 = 0; i11 < 4; i11++) {
                if ("null".charAt(i11) == str.charAt(iK + i11)) {
                }
            }
            if (length <= 4 || i00.j.f(str.charAt(iK + 4)) != 0) {
                if (z11) {
                    this.f5b = iK + 4;
                }
                return true;
            }
        }
        return false;
    }

    public void Z(char c11) {
        String str = (String) this.f9f;
        int i11 = this.f5b;
        if (i11 > 0 && c11 == '\"') {
            try {
                this.f5b = i11 - 1;
                String strQ = q();
                this.f5b = i11;
                if (kotlin.jvm.internal.m.a(strQ, "null")) {
                    t(this.f5b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f5b = i11;
                throw th2;
            }
        }
        String strS = i00.j.s(i00.j.f(c11));
        int i12 = this.f5b;
        int i13 = i12 - 1;
        u(this, ep.a.h("Expected ", strS, ", but had '", (i12 == str.length() || i13 < 0) ? "EOF" : String.valueOf(str.charAt(i13)), "' instead"), i13, null, 4);
        throw null;
    }

    public void a(int i11) {
        while (true) {
            int i12 = this.f5b;
            if (i12 >= i11) {
                return;
            }
            ((c0[]) this.f7d)[i12] = new c0(3);
            ((c0[]) this.f8e)[this.f5b] = new c0(3);
            this.f5b++;
        }
    }

    @Override // e9.b0
    public void b(b7.b0 b0Var, o oVar, b10.b bVar) {
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0219  */
    /* JADX WARN: Code duplicated, block: B:107:0x0270  */
    /* JADX WARN: Code duplicated, block: B:116:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:99:0x0207  */
    @Override // e9.b0
    public void c(w wVar) {
        SparseArray sparseArray;
        v vVar;
        int i11;
        Object xVar;
        Object xVar2;
        int i12;
        SparseArray sparseArray2;
        SparseArray sparseArray3 = (SparseArray) this.f7d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f8e;
        v vVar2 = (v) this.f6c;
        d0 d0Var = (d0) this.f9f;
        SparseArray sparseArray4 = d0Var.f25186g;
        SparseBooleanArray sparseBooleanArray = d0Var.f25187h;
        if (wVar.w() != 2) {
            return;
        }
        int i13 = 0;
        b7.b0 b0Var = (b7.b0) d0Var.f25181b.get(0);
        if ((wVar.w() & 128) == 0) {
            return;
        }
        wVar.J(1);
        int iC = wVar.C();
        int i14 = 3;
        wVar.J(3);
        wVar.h(vVar2.f4032b, 0, 2);
        vVar2.q(0);
        vVar2.t(3);
        int i15 = 13;
        d0Var.f25195q = vVar2.i(13);
        wVar.h(vVar2.f4032b, 0, 2);
        vVar2.q(0);
        vVar2.t(4);
        wVar.J(vVar2.i(12));
        sparseArray3.clear();
        sparseIntArray.clear();
        int iA = wVar.a();
        while (iA > 0) {
            wVar.h(vVar2.f4032b, i13, 5);
            vVar2.q(i13);
            int i16 = vVar2.i(8);
            vVar2.t(i14);
            int i17 = vVar2.i(i15);
            vVar2.t(4);
            int i18 = vVar2.i(12);
            int i19 = wVar.f4040b;
            int i21 = i19 + i18;
            String strTrim = null;
            ArrayList arrayList = null;
            int i22 = -1;
            int iW = 0;
            while (true) {
                vVar = vVar2;
                if (wVar.f4040b < i21) {
                    int iW2 = wVar.w();
                    int iW3 = wVar.f4040b + wVar.w();
                    if (iW3 <= i21) {
                        int i23 = iA;
                        if (iW2 == 5) {
                            long jY = wVar.y();
                            if (jY == 1094921523) {
                                i22 = 129;
                            } else if (jY == 1161904947) {
                                i22 = 135;
                            } else if (jY == 1094921524) {
                                i22 = 172;
                            } else if (jY == 1212503619) {
                                i22 = 36;
                            }
                            i12 = iW3;
                            sparseArray2 = sparseArray4;
                        } else if (iW2 == 106) {
                            i12 = iW3;
                            sparseArray2 = sparseArray4;
                            i22 = 129;
                        } else if (iW2 == 122) {
                            sparseArray2 = sparseArray4;
                            i22 = 135;
                            i12 = iW3;
                        } else if (iW2 == 127) {
                            int iW4 = wVar.w();
                            if (iW4 == 21) {
                                i22 = 172;
                            } else if (iW4 == 14) {
                                i22 = 136;
                            } else if (iW4 == 33) {
                                i22 = 139;
                            }
                            i12 = iW3;
                            sparseArray2 = sparseArray4;
                        } else if (iW2 == 123) {
                            i12 = iW3;
                            sparseArray2 = sparseArray4;
                            i22 = 138;
                        } else if (iW2 == 10) {
                            strTrim = wVar.u(3, StandardCharsets.UTF_8).trim();
                            i12 = iW3;
                            sparseArray2 = sparseArray4;
                            iW = wVar.w();
                        } else {
                            int i24 = 3;
                            if (iW2 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (wVar.f4040b < iW3) {
                                    String strTrim2 = wVar.u(i24, StandardCharsets.UTF_8).trim();
                                    wVar.w();
                                    int i25 = iW3;
                                    byte[] bArr = new byte[4];
                                    wVar.h(bArr, 0, 4);
                                    arrayList2.add(new e0(bArr, strTrim2));
                                    iW3 = i25;
                                    sparseArray4 = sparseArray4;
                                    i24 = 3;
                                }
                                i12 = iW3;
                                sparseArray2 = sparseArray4;
                                arrayList = arrayList2;
                                i22 = 89;
                            } else {
                                i12 = iW3;
                                sparseArray2 = sparseArray4;
                                if (iW2 == 111) {
                                    i22 = 257;
                                }
                            }
                        }
                        wVar.J(i12 - wVar.f4040b);
                        vVar2 = vVar;
                        iA = i23;
                        sparseArray4 = sparseArray2;
                    }
                }
            }
            SparseArray sparseArray5 = sparseArray4;
            int i26 = iA;
            wVar.I(i21);
            ij.d dVar = new ij.d(i22, strTrim, iW, arrayList, Arrays.copyOfRange(wVar.f4039a, i19, i21));
            String str = strTrim;
            if (i16 == 6 || i16 == 5) {
                i16 = i22;
            }
            iA = i26 - (i18 + 5);
            if (sparseBooleanArray.get(i17)) {
                i11 = 3;
            } else {
                b2 b2Var = d0Var.f25184e;
                i11 = 3;
                if (i16 == 2) {
                    xVar = new x(new e9.j(new xq.c(b2Var.h(dVar)), "video/mp2t"));
                } else {
                    if (i16 == 3 || i16 == 4) {
                        xVar2 = new x(new t(str, dVar.t(), "video/mp2t"));
                    } else if (i16 == 21) {
                        xVar = new x(new g());
                    } else if (i16 == 27) {
                        xVar = new x(new e9.p(new m(b2Var.h(dVar)), false, false));
                    } else if (i16 == 36) {
                        xVar = new x(new r(new m(b2Var.h(dVar))));
                    } else if (i16 == 45) {
                        xVar = new x(new u());
                    } else if (i16 == 89) {
                        xVar = new x(new g((List) dVar.f34422c));
                    } else if (i16 == 172) {
                        xVar2 = new x(new e9.b(str, dVar.t(), 1, "video/mp2t"));
                    } else if (i16 == 257) {
                        xVar = new e9.c0(new xq.c("application/vnd.dvb.ait"));
                    } else if (i16 == 138) {
                        xVar2 = new x(new e9.f(str, dVar.t(), 4096));
                    } else if (i16 != 139) {
                        switch (i16) {
                            case 15:
                                xVar2 = new x(new e9.e(dVar.t(), str, "video/mp2t", false));
                                break;
                            case 16:
                                xVar = new x(new e9.m(new xq.c(b2Var.h(dVar))));
                                break;
                            case 17:
                                xVar2 = new x(new e9.s(str, dVar.t()));
                                break;
                            default:
                                switch (i16) {
                                    case 128:
                                        xVar = new x(new e9.j(new xq.c(b2Var.h(dVar)), "video/mp2t"));
                                        break;
                                    case 129:
                                        xVar2 = new x(new e9.b(str, dVar.t(), 0, "video/mp2t"));
                                        break;
                                    case 130:
                                        xVar = null;
                                        break;
                                    default:
                                        switch (i16) {
                                            case 134:
                                                xVar = new e9.c0(new xq.c("application/x-scte35"));
                                                break;
                                            case 135:
                                                xVar2 = new x(new e9.b(str, dVar.t(), 0, "video/mp2t"));
                                                break;
                                            case 136:
                                                xVar2 = new x(new e9.f(str, dVar.t(), 4096));
                                                break;
                                            default:
                                                xVar = null;
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        xVar2 = new x(new e9.f(str, dVar.t(), 5408));
                    }
                    xVar = xVar2;
                }
                sparseIntArray.put(i17, i17);
                sparseArray3.put(i17, xVar);
            }
            i14 = i11;
            vVar2 = vVar;
            sparseArray4 = sparseArray5;
            i13 = 0;
            i15 = 13;
        }
        SparseArray sparseArray6 = sparseArray4;
        int size = sparseIntArray.size();
        int i27 = 0;
        while (i27 < size) {
            int iKeyAt = sparseIntArray.keyAt(i27);
            int iValueAt = sparseIntArray.valueAt(i27);
            sparseBooleanArray.put(iKeyAt, true);
            d0Var.f25188i.put(iValueAt, true);
            e9.f0 f0Var = (e9.f0) sparseArray3.valueAt(i27);
            if (f0Var != null) {
                f0Var.b(b0Var, d0Var.f25191l, new b10.b(iC, iKeyAt, OSSConstants.DEFAULT_BUFFER_SIZE));
                sparseArray = sparseArray6;
                sparseArray.put(iValueAt, f0Var);
            } else {
                sparseArray = sparseArray6;
            }
            i27++;
            sparseArray6 = sparseArray;
        }
        sparseArray6.remove(this.f5b);
        d0Var.m = 0;
        d0Var.f25191l.o();
        d0Var.f25192n = true;
    }

    public int d(b.a aVar, int i11) {
        short[] sArr = (short[]) this.f6c;
        if (aVar.p(sArr, 0) == 0) {
            return ((c0[]) this.f7d)[i11].a(aVar);
        }
        return aVar.p(sArr, 1) == 0 ? ((c0[]) this.f8e)[i11].a(aVar) + 8 : ((c0) this.f9f).a(aVar) + 16;
    }

    public void e() {
        b.a.t((short[]) this.f6c);
        for (int i11 = 0; i11 < this.f5b; i11++) {
            b.a.t((short[]) ((c0[]) this.f7d)[i11].f7471c);
            b.a.t((short[]) ((c0[]) this.f8e)[i11].f7471c);
        }
        b.a.t((short[]) ((c0) this.f9f).f7471c);
    }

    public void f(double d5, float f5) {
        int length = ((float[]) this.f6c).length + 1;
        int iBinarySearch = Arrays.binarySearch((double[]) this.f7d, d5);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f7d = Arrays.copyOf((double[]) this.f7d, length);
        this.f6c = Arrays.copyOf((float[]) this.f6c, length);
        this.f8e = new double[length];
        double[] dArr = (double[]) this.f7d;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        ((double[]) this.f7d)[iBinarySearch] = d5;
        ((float[]) this.f6c)[iBinarySearch] = f5;
    }

    public int h(CharSequence charSequence, int i11) {
        int i12 = i11 + 4;
        if (i12 < charSequence.length()) {
            ((StringBuilder) this.f8e).append((char) (y(charSequence, i11 + 3) + (y(charSequence, i11) << 12) + (y(charSequence, i11 + 1) << 8) + (y(charSequence, i11 + 2) << 4)));
            return i12;
        }
        this.f5b = i11;
        if (i12 < charSequence.length()) {
            return h(charSequence, this.f5b);
        }
        u(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean i() {
        int i11 = this.f5b;
        if (i11 == -1) {
            return false;
        }
        String str = (String) this.f9f;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f5b = i11;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i11++;
        }
        this.f5b = i11;
        return false;
    }

    public String k() {
        StringBuilder sb2 = (StringBuilder) this.f8e;
        String str = (String) this.f9f;
        n('\"');
        int i11 = this.f5b;
        int iH0 = oz.q.H0(str, '\"', i11, 4);
        if (iH0 == -1) {
            q();
            int i12 = this.f5b;
            u(this, ep.a.g("Expected quotation mark '\"', but had '", (i12 == str.length() || i12 < 0) ? "EOF" : String.valueOf(str.charAt(i12)), "' instead"), i12, null, 4);
            throw null;
        }
        int i13 = i11;
        while (i13 < iH0) {
            if (str.charAt(i13) == '\\') {
                int iK = this.f5b;
                char cCharAt = str.charAt(i13);
                boolean z11 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb2.append((CharSequence) str, iK, i13);
                        int iK2 = K(i13 + 1);
                        if (iK2 == -1) {
                            u(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iH = iK2 + 1;
                        char cCharAt2 = str.charAt(iK2);
                        if (cCharAt2 == 'u') {
                            iH = h(str, iH);
                        } else {
                            char c11 = cCharAt2 < 'u' ? i00.e.f33901a[cCharAt2] : (char) 0;
                            if (c11 == 0) {
                                u(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb2.append(c11);
                        }
                        iK = K(iH);
                        if (iK == -1) {
                            u(this, "Unexpected EOF", iK, null, 4);
                            throw null;
                        }
                    } else {
                        i13++;
                        if (i13 >= str.length()) {
                            sb2.append((CharSequence) str, iK, i13);
                            iK = K(i13);
                            if (iK == -1) {
                                u(this, "Unexpected EOF", iK, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i13);
                    }
                    i13 = iK;
                    z11 = true;
                    cCharAt = str.charAt(i13);
                }
                String string = !z11 ? str.subSequence(iK, i13).toString() : s(iK, i13);
                this.f5b = i13 + 1;
                return string;
            }
            i13++;
        }
        this.f5b = iH0 + 1;
        String strSubstring = str.substring(i11, iH0);
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public byte l() {
        String str = (String) this.f9f;
        int i11 = this.f5b;
        while (i11 != -1 && i11 < str.length()) {
            int i12 = i11 + 1;
            char cCharAt = str.charAt(i11);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f5b = i12;
                return i00.j.f(cCharAt);
            }
            i11 = i12;
        }
        this.f5b = str.length();
        return (byte) 10;
    }

    public byte m(byte b3) {
        String str = (String) this.f9f;
        byte bL = l();
        if (bL == b3) {
            return bL;
        }
        String strS = i00.j.s(b3);
        int i11 = this.f5b;
        int i12 = i11 - 1;
        u(this, ep.a.h("Expected ", strS, ", but had '", (i11 == str.length() || i12 < 0) ? "EOF" : String.valueOf(str.charAt(i12)), "' instead"), i12, null, 4);
        throw null;
    }

    public void n(char c11) {
        int i11 = this.f5b;
        if (i11 == -1) {
            Z(c11);
            throw null;
        }
        String str = (String) this.f9f;
        while (i11 < str.length()) {
            int i12 = i11 + 1;
            char cCharAt = str.charAt(i11);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f5b = i12;
                if (cCharAt == c11) {
                    return;
                }
                Z(c11);
                throw null;
            }
            i11 = i12;
        }
        this.f5b = -1;
        Z(c11);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public long o() {
        boolean z11;
        boolean z12;
        long j11;
        double dPow;
        int iK = K(W());
        String str = (String) this.f9f;
        ?? r9 = 0;
        if (iK >= str.length() || iK == -1) {
            u(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iK) == '\"') {
            iK++;
            if (iK == str.length()) {
                u(this, "EOF", 0, null, 6);
                throw null;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = iK;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            if (i11 == str.length()) {
                z12 = z11;
                break;
            }
            char cCharAt = str.charAt(i11);
            if ((cCharAt != 'e' && cCharAt != 'E') || z14) {
                if (cCharAt == '-' && z14) {
                    if (i11 == iK) {
                        u(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i11++;
                    z13 = false;
                } else if (cCharAt != '+' || !z14) {
                    z12 = z11;
                    if (cCharAt != '-') {
                        if (i00.j.f(cCharAt) != 0) {
                            break;
                        }
                        i11++;
                        int i12 = cCharAt - '0';
                        if (i12 < 0 || i12 >= 10) {
                            u(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        if (z14) {
                            j12 = (j12 * ((long) 10)) + ((long) i12);
                        } else {
                            j13 = (j13 * ((long) 10)) - ((long) i12);
                            if (j13 > 0) {
                                u(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        z11 = z12;
                    } else {
                        if (i11 != iK) {
                            u(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i11++;
                        z11 = z12;
                        r9 = 0;
                        z15 = true;
                    }
                } else {
                    if (i11 == iK) {
                        u(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i11++;
                    r9 = 0;
                    z13 = true;
                }
                r9 = 0;
            } else {
                if (i11 == iK) {
                    u(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, r9, 6);
                    throw r9;
                }
                i11++;
                z13 = true;
                z14 = true;
            }
        }
        boolean z16 = i11 != iK;
        if (iK == i11 || (z15 && iK == i11 - 1)) {
            u(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z12) {
            if (!z16) {
                u(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i11) != '\"') {
                u(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i11++;
        }
        this.f5b = i11;
        long j14 = j13;
        if (z14) {
            double d5 = j14;
            if (!z13) {
                dPow = Math.pow(10.0d, -j12);
            } else {
                if (!z13) {
                    throw new NoWhenBranchMatchedException();
                }
                dPow = Math.pow(10.0d, j12);
            }
            double d11 = d5 * dPow;
            if (d11 > 9.223372036854776E18d || d11 < -9.223372036854776E18d) {
                u(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d11) != d11) {
                u(this, "Can't convert " + d11 + " to Long", 0, null, 6);
                throw null;
            }
            j11 = (long) d11;
        } else {
            j11 = j14;
        }
        if (z15) {
            return j11;
        }
        if (j11 != Long.MIN_VALUE) {
            return -j11;
        }
        u(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public String p() {
        String str = (String) this.f7d;
        if (str == null) {
            return k();
        }
        kotlin.jvm.internal.m.c(str);
        this.f7d = null;
        return str;
    }

    public String q() {
        String str = (String) this.f9f;
        String str2 = (String) this.f7d;
        if (str2 != null) {
            kotlin.jvm.internal.m.c(str2);
            this.f7d = null;
            return str2;
        }
        int iW = W();
        if (iW >= str.length() || iW == -1) {
            u(this, "EOF", iW, null, 4);
            throw null;
        }
        byte bF = i00.j.f(str.charAt(iW));
        if (bF == 1) {
            return p();
        }
        if (bF != 0) {
            u(this, "Expected beginning of the string, but got " + str.charAt(iW), 0, null, 6);
            throw null;
        }
        boolean z11 = false;
        while (i00.j.f(str.charAt(iW)) == 0) {
            iW++;
            if (iW >= str.length()) {
                ((StringBuilder) this.f8e).append((CharSequence) str, this.f5b, iW);
                int iK = K(iW);
                if (iK == -1) {
                    this.f5b = iW;
                    return s(0, 0);
                }
                iW = iK;
                z11 = true;
            }
        }
        String string = !z11 ? str.subSequence(this.f5b, iW).toString() : s(this.f5b, iW);
        this.f5b = iW;
        return string;
    }

    public String r() {
        String strQ = q();
        if (!kotlin.jvm.internal.m.a(strQ, "null") || ((String) this.f9f).charAt(this.f5b - 1) == '\"') {
            return strQ;
        }
        u(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public String s(int i11, int i12) {
        StringBuilder sb2 = (StringBuilder) this.f8e;
        sb2.append((CharSequence) this.f9f, i11, i12);
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        sb2.setLength(0);
        return string;
    }

    public void t(int i11, String message, String hint) {
        kotlin.jvm.internal.m.f(message, "message");
        kotlin.jvm.internal.m.f(hint, "hint");
        String strConcat = hint.length() == 0 ? BuildConfig.VERSION_NAME : "\n".concat(hint);
        StringBuilder sbR = defpackage.e.r(message, " at path: ");
        sbR.append(((ij.d) this.f6c).s());
        sbR.append(strConcat);
        throw i00.j.c(i11, (String) this.f9f, sbR.toString());
    }

    public String toString() {
        switch (this.f4a) {
            case 2:
                return "pos =" + Arrays.toString((double[]) this.f7d) + " period=" + Arrays.toString((float[]) this.f6c);
            case 5:
                StringBuilder sb2 = new StringBuilder("JsonReader(source='");
                sb2.append(this.f9f);
                sb2.append("', currentPosition=");
                return ep.a.j(sb2, this.f5b, ')');
            default:
                return super.toString();
        }
    }

    public q v(int i11) {
        return x(i11, (s) this.f6c, null, false);
    }

    public q w(String route, boolean z11) {
        Object next;
        s sVar;
        q qVar;
        kotlin.jvm.internal.m.f(route, "route");
        u0 u0Var = (u0) this.f7d;
        kotlin.jvm.internal.m.f(u0Var, "<this>");
        Iterator it = ((nz.a) n.P(new e00.i(u0Var, 7))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            qVar = (q) next;
            if (oz.x.l0((String) qVar.f36242b.f3962e, route, false)) {
                break;
            }
        } while (qVar.f36242b.c(route) == null);
        q qVar2 = (q) next;
        if (qVar2 != null) {
            return qVar2;
        }
        if (!z11 || (sVar = ((s) this.f6c).f36243c) == null) {
            return null;
        }
        a aVar = sVar.f36251f;
        aVar.getClass();
        if (oz.q.K0(route)) {
            return null;
        }
        return aVar.w(route, true);
    }

    public q x(int i11, q qVar, q qVar2, boolean z11) {
        s sVar = (s) this.f6c;
        u0 u0Var = (u0) this.f7d;
        q qVarX = (q) u0Var.d(i11);
        if (qVar2 != null) {
            if (kotlin.jvm.internal.m.a(qVarX, qVar2) && kotlin.jvm.internal.m.a(qVarX.f36243c, qVar2.f36243c)) {
                return qVarX;
            }
            qVarX = null;
        } else if (qVarX != null) {
            return qVarX;
        }
        if (z11) {
            Iterator it = ((nz.a) n.P(new e00.i(u0Var, 7))).iterator();
            do {
                if (!it.hasNext()) {
                    qVarX = null;
                    break;
                }
                q qVar3 = (q) it.next();
                qVarX = (!(qVar3 instanceof s) || qVar3.equals(qVar)) ? null : ((s) qVar3).f36251f.x(i11, sVar, qVar2, true);
            } while (qVarX == null);
        }
        if (qVarX != null) {
            return qVarX;
        }
        s sVar2 = sVar.f36243c;
        if (sVar2 == null || sVar2.equals(qVar)) {
            return null;
        }
        s sVar3 = sVar.f36243c;
        kotlin.jvm.internal.m.c(sVar3);
        return sVar3.f36251f.x(i11, sVar, qVar2, z11);
    }

    public int y(CharSequence charSequence, int i11) {
        char cCharAt = charSequence.charAt(i11);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        u(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public int z(String str) throws GlUtil$GlException {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f5b, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        b7.a.e();
        return iGlGetAttribLocation;
    }

    public a() {
        this.f4a = 0;
        this.f6c = new short[2];
        this.f7d = new c0[16];
        this.f8e = new c0[16];
        this.f9f = new c0(8);
        this.f5b = 0;
    }

    public void j(int i11, String str) {
        String str2 = (String) this.f9f;
        if (str2.length() - i11 < str.length()) {
            u(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            if (str.charAt(i12) != (str2.charAt(i11 + i12) | ' ')) {
                u(this, HOBXIlHxIkMBEA.OXZgh + q() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f5b = str.length() + i11;
    }

    public a(s sVar) {
        this.f4a = 6;
        this.f6c = sVar;
        this.f7d = new u0(0);
    }

    public a(Paint paint) {
        this.f4a = 4;
        this.f6c = paint;
        this.f5b = 3;
    }

    public a(String str, String str2) throws GlUtil$GlException {
        this.f4a = 1;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f5b = iGlCreateProgram;
        b7.a.e();
        g(iGlCreateProgram, 35633, str);
        g(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        b7.a.f("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f8e = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f6c = new p20.c[iArr2[0]];
        for (int i11 = 0; i11 < iArr2[0]; i11++) {
            int i12 = this.f5b;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i12, 35722, iArr3, 0);
            int i13 = iArr3[0];
            byte[] bArr = new byte[i13];
            GLES20.glGetActiveAttrib(i12, i11, i13, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            for (int i14 = 0; i14 < i13; i14++) {
                if (bArr[i14] == 0) {
                    i13 = i14;
                    break;
                }
            }
            String str3 = new String(bArr, 0, i13);
            GLES20.glGetAttribLocation(i12, str3);
            p20.c cVar = new p20.c(3);
            ((p20.c[]) this.f6c)[i11] = cVar;
            ((HashMap) this.f8e).put(str3, cVar);
        }
        this.f9f = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f5b, 35718, iArr4, 0);
        this.f7d = new tw.c[iArr4[0]];
        for (int i15 = 0; i15 < iArr4[0]; i15++) {
            int i16 = this.f5b;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i16, 35719, iArr5, 0);
            int i17 = iArr5[0];
            byte[] bArr2 = new byte[i17];
            GLES20.glGetActiveUniform(i16, i15, i17, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            for (int i18 = 0; i18 < i17; i18++) {
                if (bArr2[i18] == 0) {
                    i17 = i18;
                    break;
                }
            }
            String str4 = new String(bArr2, 0, i17);
            GLES20.glGetUniformLocation(i16, str4);
            tw.c cVar2 = new tw.c(3);
            ((tw.c[]) this.f7d)[i15] = cVar2;
            ((HashMap) this.f9f).put(str4, cVar2);
        }
        b7.a.e();
    }

    public a(String source) {
        this.f4a = 5;
        kotlin.jvm.internal.m.f(source, "source");
        ij.d dVar = new ij.d(8, false);
        dVar.f34422c = new Object[8];
        int[] iArr = new int[8];
        for (int i11 = 0; i11 < 8; i11++) {
            iArr[i11] = -1;
        }
        dVar.f34423d = iArr;
        dVar.f34421b = -1;
        this.f6c = dVar;
        this.f8e = new StringBuilder();
        this.f9f = source;
    }

    public a(x7.w wVar, m5 m5Var, byte[] bArr, u3[] u3VarArr, int i11) {
        this.f4a = 8;
        this.f6c = wVar;
        this.f7d = m5Var;
        this.f8e = bArr;
        this.f9f = u3VarArr;
        this.f5b = i11;
    }

    public a(d0 d0Var, int i11) {
        this.f4a = 3;
        this.f9f = d0Var;
        this.f6c = new v(new byte[5], 5);
        this.f7d = new SparseArray();
        this.f8e = new SparseIntArray();
        this.f5b = i11;
    }
}

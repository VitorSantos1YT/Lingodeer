package nw;

import com.android.billingclient.api.d0;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import fr.p3;
import hh.p0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lw.a1;
import lw.c1;
import lw.h0;
import lw.i0;
import lw.q1;
import lw.x0;
import mw.e4;
import mw.f4;
import mw.i2;
import mw.k1;
import mw.k3;
import mw.n5;
import mw.o1;
import mw.p5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends o1 implements y {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public final d E;
    public final d0 F;
    public final p G;
    public boolean H;
    public final tw.c I;
    public z J;
    public int K;
    public final /* synthetic */ m L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f44228v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f44229w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f44230x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m00.i f44231y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f44232z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, int i11, n5 n5Var, Object obj, d dVar, d0 d0Var, p pVar, int i12) {
        super(i11, n5Var, mVar.f42366c);
        this.L = mVar;
        this.f42596s = Charsets.f16353b;
        this.f44231y = new m00.i();
        this.f44232z = false;
        this.A = false;
        this.B = false;
        this.H = true;
        this.K = -1;
        Preconditions.k(obj, "lock");
        this.f44229w = obj;
        this.E = dVar;
        this.F = d0Var;
        this.G = pVar;
        this.C = i12;
        this.D = i12;
        this.f44228v = i12;
        tw.b.f52660a.getClass();
        this.I = tw.a.f52658a;
    }

    public static void j(l lVar, c1 c1Var, String str) throws Throwable {
        m mVar = lVar.L;
        String str2 = mVar.O;
        String str3 = mVar.M;
        boolean z11 = mVar.S;
        p pVar = lVar.G;
        boolean z12 = pVar.B == null;
        ow.b bVar = e.f44200a;
        Preconditions.k(c1Var, "headers");
        Preconditions.k(str, "defaultPath");
        Preconditions.k(str2, "authority");
        c1Var.a(k1.f42495i);
        c1Var.a(k1.f42496j);
        x0 x0Var = k1.f42497k;
        c1Var.a(x0Var);
        ArrayList arrayList = new ArrayList(c1Var.f40365b + 7);
        if (z12) {
            arrayList.add(e.f44201b);
        } else {
            arrayList.add(e.f44200a);
        }
        if (z11) {
            arrayList.add(e.f44203d);
        } else {
            arrayList.add(e.f44202c);
        }
        arrayList.add(new ow.b(ow.b.f46095h, str2));
        arrayList.add(new ow.b(ow.b.f46093f, str));
        arrayList.add(new ow.b(x0Var.f40494a, str3));
        arrayList.add(e.f44204e);
        arrayList.add(e.f44205f);
        Logger logger = p5.f42623a;
        Charset charset = h0.f40391a;
        int i11 = c1Var.f40365b * 2;
        byte[][] bArr = new byte[i11][];
        Object[] objArr = c1Var.f40364a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i11);
        } else {
            for (int i12 = 0; i12 < c1Var.f40365b; i12++) {
                int i13 = i12 * 2;
                Object[] objArr2 = c1Var.f40364a;
                bArr[i13] = (byte[]) objArr2[i13];
                int i14 = i13 + 1;
                Object obj = objArr2[i14];
                if (!(obj instanceof byte[])) {
                    p0.z(obj);
                    throw null;
                }
                bArr[i14] = (byte[]) obj;
            }
        }
        int i15 = 0;
        for (int i16 = 0; i16 < i11; i16 += 2) {
            byte[] bArr2 = bArr[i16];
            byte[] bArr3 = bArr[i16 + 1];
            if (p5.a(bArr2, p5.f42624b)) {
                bArr[i15] = bArr2;
                BaseEncoding baseEncoding = h0.f40392b;
                baseEncoding.getClass();
                bArr[i15 + 1] = baseEncoding.c(bArr3, bArr3.length).getBytes(Charsets.f16352a);
            } else {
                int length = bArr3.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        bArr[i15] = bArr2;
                        bArr[i15 + 1] = bArr3;
                    } else {
                        byte b3 = bArr3[i17];
                        if (b3 < 32 || b3 > 126) {
                            String str4 = new String(bArr2, Charsets.f16352a);
                            Logger logger2 = p5.f42623a;
                            StringBuilder sbQ = p0.q("Metadata key=", str4, ", value=");
                            sbQ.append(Arrays.toString(bArr3));
                            sbQ.append(" contains invalid ASCII characters");
                            logger2.warning(sbQ.toString());
                        } else {
                            i17++;
                        }
                    }
                }
            }
            i15 += 2;
        }
        if (i15 != i11) {
            bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i15);
        }
        for (int i18 = 0; i18 < bArr.length; i18 += 2) {
            byte[] bArr4 = bArr[i18];
            m00.l lVar2 = m00.l.f40723d;
            m00.l lVarU = p3.u(bArr4);
            byte[] bArr5 = lVarU.f40724a;
            if (bArr5.length != 0 && bArr5[0] != 58) {
                arrayList.add(new ow.b(lVarU, p3.u(bArr[i18 + 1])));
            }
        }
        lVar.f44230x = arrayList;
        q1 q1Var = pVar.f44257v;
        if (q1Var != null) {
            mVar.P.f(q1Var, mw.x.MISCARRIED, true, new c1());
            return;
        }
        if (pVar.f44249n.size() < pVar.C) {
            pVar.t(mVar);
            return;
        }
        pVar.D.add(mVar);
        if (!pVar.f44261z) {
            pVar.f44261z = true;
            i2 i2Var = pVar.F;
            if (i2Var != null) {
                i2Var.b();
            }
        }
        if (mVar.f42368e) {
            pVar.M.r0(mVar, true);
        }
    }

    public static void k(l lVar, m00.i iVar, boolean z11, boolean z12) {
        if (lVar.B) {
            return;
        }
        if (!lVar.H) {
            Preconditions.p("streamId should be set", lVar.K != -1);
            lVar.F.a(z11, lVar.J, iVar, z12);
        } else {
            lVar.f44231y.K0(iVar, (int) iVar.f40718b);
            lVar.f44232z |= z11;
            lVar.A |= z12;
        }
    }

    @Override // mw.b
    public final void a(int i11) {
        int i12 = this.D - i11;
        this.D = i12;
        float f5 = i12;
        int i13 = this.f44228v;
        if (f5 <= i13 * 0.5f) {
            int i14 = i13 - i12;
            this.C += i14;
            this.D = i12 + i14;
            this.E.f(this.K, i14);
        }
    }

    @Override // mw.b
    public final void c(boolean z11) throws Throwable {
        if (this.f42354n) {
            this.G.h(this.K, null, mw.x.PROCESSED, false, null, null);
        } else {
            this.G.h(this.K, null, mw.x.PROCESSED, false, ow.a.CANCEL, null);
        }
        Preconditions.p("status should have been reported on deframer closed", this.f42355o);
        this.f42353l = true;
        if (this.f42356p && z11) {
            g(q1.f40441l.h("Encountered end-of-stream mid-frame"), true, new c1());
        }
        mw.a aVar = this.m;
        if (aVar != null) {
            aVar.run();
            this.m = null;
        }
    }

    public final void l(q1 q1Var, boolean z11, c1 c1Var) throws Throwable {
        if (this.B) {
            return;
        }
        this.B = true;
        if (!this.H) {
            this.G.h(this.K, q1Var, mw.x.PROCESSED, z11, ow.a.CANCEL, c1Var);
            return;
        }
        p pVar = this.G;
        LinkedList linkedList = pVar.D;
        m mVar = this.L;
        linkedList.remove(mVar);
        pVar.m(mVar);
        this.f44230x = null;
        this.f44231y.a();
        this.H = false;
        if (c1Var == null) {
            c1Var = new c1();
        }
        g(q1Var, true, c1Var);
    }

    public final void m(Throwable th2) {
        l(q1.e(th2), true, new c1());
    }

    public final void n(int i11, m00.i iVar, boolean z11) throws Throwable {
        Throwable th2;
        long j11 = iVar.f40718b;
        int i12 = this.C - (((int) j11) + i11);
        this.C = i12;
        this.D -= i11;
        if (i12 < 0) {
            this.E.e(this.K, ow.a.FLOW_CONTROL_ERROR);
            this.G.h(this.K, q1.f40441l.h("Received data size exceeded our receiving window size"), mw.x.PROCESSED, false, null, null);
            return;
        }
        u uVar = new u(iVar);
        q1 q1Var = this.f42594q;
        boolean z12 = false;
        if (q1Var != null) {
            Charset charset = this.f42596s;
            e4 e4Var = f4.f42422a;
            Preconditions.k(charset, "charset");
            int i13 = (int) iVar.f40718b;
            byte[] bArr = new byte[i13];
            uVar.h(bArr, 0, i13);
            this.f42594q = q1Var.b("DATA-----------------------------\n".concat(new String(bArr, charset)));
            uVar.close();
            if (this.f42594q.f40445b.length() > 1000 || z11) {
                l(this.f42594q, false, this.f42595r);
                return;
            }
            return;
        }
        if (!this.f42597t) {
            l(q1.f40441l.h("headers not received before payload"), false, new c1());
            return;
        }
        int i14 = (int) j11;
        boolean z13 = true;
        try {
            if (this.f42355o) {
                mw.c.K.log(Level.INFO, "Received data on closed stream");
                uVar.close();
            } else {
                try {
                    k3 k3Var = this.f42342a;
                    k3Var.getClass();
                    try {
                        if (k3Var.isClosed() || k3Var.S) {
                            uVar.close();
                        } else {
                            k3Var.N.v(uVar);
                            try {
                                k3Var.a();
                            } catch (Throwable th3) {
                                th = th3;
                                z13 = false;
                                if (z13) {
                                    uVar.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    try {
                        m(th5);
                    } catch (Throwable th6) {
                        th2 = th6;
                        if (!z12) {
                            throw th2;
                        }
                        uVar.close();
                        throw th2;
                    }
                }
            }
            if (z11) {
                if (i14 > 0) {
                    this.f42594q = q1.f40441l.h("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f42594q = q1.f40441l.h("Received unexpected EOS on empty DATA frame from server");
                }
                c1 c1Var = new c1();
                this.f42595r = c1Var;
                g(this.f42594q, false, c1Var);
            }
        } catch (Throwable th7) {
            th2 = th7;
            z12 = true;
        }
    }

    public final void o(ArrayList arrayList, boolean z11) throws Throwable {
        q1 q1VarB;
        a1 a1Var = o1.f42593u;
        if (z11) {
            byte[][] bArrA = a0.a(arrayList);
            int length = bArrA.length / 2;
            c1 c1Var = new c1();
            c1Var.f40365b = length;
            c1Var.f40364a = bArrA;
            if (this.f42594q == null && !this.f42597t) {
                q1 q1VarI = o1.i(c1Var);
                this.f42594q = q1VarI;
                if (q1VarI != null) {
                    this.f42595r = c1Var;
                }
            }
            q1 q1Var = this.f42594q;
            if (q1Var != null) {
                q1 q1VarB2 = q1Var.b("trailers: " + c1Var);
                this.f42594q = q1VarB2;
                l(q1VarB2, false, this.f42595r);
                return;
            }
            a1 a1Var2 = i0.f40400b;
            q1 q1Var2 = (q1) c1Var.c(a1Var2);
            if (q1Var2 != null) {
                q1VarB = q1Var2.h((String) c1Var.c(i0.f40399a));
            } else if (this.f42597t) {
                q1VarB = q1.f40436g.h("missing GRPC status in response");
            } else {
                Integer num = (Integer) c1Var.c(a1Var);
                q1VarB = (num != null ? k1.g(num.intValue()) : q1.f40441l.h("missing HTTP status code")).b("missing GRPC status, inferred error from HTTP status code");
            }
            c1Var.a(a1Var);
            c1Var.a(a1Var2);
            c1Var.a(i0.f40399a);
            if (this.f42355o) {
                mw.c.K.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{q1VarB, c1Var});
                return;
            }
            for (lw.j jVar : this.f42349h.f42589a) {
                jVar.e(c1Var);
            }
            g(q1VarB, false, c1Var);
            return;
        }
        byte[][] bArrA2 = a0.a(arrayList);
        int length2 = bArrA2.length / 2;
        c1 c1Var2 = new c1();
        c1Var2.f40365b = length2;
        c1Var2.f40364a = bArrA2;
        q1 q1Var3 = this.f42594q;
        if (q1Var3 != null) {
            this.f42594q = q1Var3.b("headers: " + c1Var2);
            return;
        }
        try {
            if (this.f42597t) {
                q1 q1VarH = q1.f40441l.h("Received headers twice");
                this.f42594q = q1VarH;
                this.f42594q = q1VarH.b("headers: " + c1Var2);
                this.f42595r = c1Var2;
                this.f42596s = o1.h(c1Var2);
                return;
            }
            Integer num2 = (Integer) c1Var2.c(a1Var);
            if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                q1 q1Var4 = this.f42594q;
                if (q1Var4 != null) {
                    this.f42594q = q1Var4.b("headers: " + c1Var2);
                    this.f42595r = c1Var2;
                    this.f42596s = o1.h(c1Var2);
                    return;
                }
                return;
            }
            this.f42597t = true;
            q1 q1VarI2 = o1.i(c1Var2);
            this.f42594q = q1VarI2;
            if (q1VarI2 != null) {
                this.f42594q = q1VarI2.b("headers: " + c1Var2);
                this.f42595r = c1Var2;
                this.f42596s = o1.h(c1Var2);
                return;
            }
            c1Var2.a(a1Var);
            c1Var2.a(i0.f40400b);
            c1Var2.a(i0.f40399a);
            d(c1Var2);
            q1 q1Var5 = this.f42594q;
            if (q1Var5 != null) {
                this.f42594q = q1Var5.b("headers: " + c1Var2);
                this.f42595r = c1Var2;
                this.f42596s = o1.h(c1Var2);
            }
        } catch (Throwable th2) {
            q1 q1Var6 = this.f42594q;
            if (q1Var6 != null) {
                this.f42594q = q1Var6.b("headers: " + c1Var2);
                this.f42595r = c1Var2;
                this.f42596s = o1.h(c1Var2);
            }
            throw th2;
        }
    }
}

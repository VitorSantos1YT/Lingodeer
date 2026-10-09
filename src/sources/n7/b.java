package n7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b7.f0;
import b7.n;
import com.google.firebase.database.android.d;
import f7.a0;
import f7.e;
import f7.x;
import java.util.ArrayList;
import y6.b0;
import y6.c0;
import y6.p;
import y6.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Handler.Callback {
    public final a U;
    public final x V;
    public final Handler W;
    public final g8.a X;
    public android.support.v4.media.session.a Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f43461a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f43462b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public c0 f43463c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f43464d0;

    public b(x xVar, Looper looper) {
        super(5);
        this.V = xVar;
        this.W = looper == null ? null : new Handler(looper, this);
        this.U = a.f43460a;
        this.X = new g8.a(1);
        this.f43464d0 = -9223372036854775807L;
    }

    @Override // f7.e
    public final int B(p pVar) {
        if (this.U.b(pVar)) {
            return e.a(pVar.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return e.a(0, 0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public final void D(c0 c0Var, ArrayList arrayList) {
        int i11 = 0;
        while (true) {
            b0[] b0VarArr = c0Var.f57178a;
            if (i11 >= b0VarArr.length) {
                return;
            }
            p pVarA = b0VarArr[i11].a();
            if (pVarA != null) {
                a aVar = this.U;
                if (aVar.b(pVarA)) {
                    android.support.v4.media.session.a aVarA = aVar.a(pVarA);
                    byte[] bArrC = b0VarArr[i11].c();
                    bArrC.getClass();
                    g8.a aVar2 = this.X;
                    aVar2.n();
                    aVar2.q(bArrC.length);
                    aVar2.f25115e.put(bArrC);
                    aVar2.r();
                    c0 c0VarJ = aVarA.j(aVar2);
                    if (c0VarJ != null) {
                        D(c0VarJ, arrayList);
                    }
                } else {
                    arrayList.add(b0VarArr[i11]);
                }
            } else {
                arrayList.add(b0VarArr[i11]);
            }
            i11++;
        }
    }

    public final long E(long j11) {
        b7.a.j(j11 != -9223372036854775807L);
        b7.a.j(this.f43464d0 != -9223372036854775807L);
        return j11 - this.f43464d0;
    }

    public final void F(c0 c0Var) {
        x xVar = this.V;
        a0 a0Var = xVar.f26935a;
        y6.a0 a0Var2 = a0Var.M0;
        n nVar = a0Var.P;
        z zVarA = a0Var2.a();
        int i11 = 0;
        while (true) {
            b0[] b0VarArr = c0Var.f57178a;
            if (i11 >= b0VarArr.length) {
                break;
            }
            b0VarArr[i11].b(zVarA);
            i11++;
        }
        a0Var.M0 = new y6.a0(zVarA);
        y6.a0 a0VarS0 = a0Var.s0();
        if (!a0VarS0.equals(a0Var.f26658v0)) {
            a0Var.f26658v0 = a0VarS0;
            nVar.c(14, new d(xVar, 15));
        }
        nVar.c(28, new d(c0Var, 16));
        nVar.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        F((c0) message.obj);
        return true;
    }

    @Override // f7.e
    public final String k() {
        return "MetadataRenderer";
    }

    @Override // f7.e
    public final boolean m() {
        return this.f43461a0;
    }

    @Override // f7.e
    public final boolean o() {
        return true;
    }

    @Override // f7.e
    public final void p() {
        this.f43463c0 = null;
        this.Y = null;
        this.f43464d0 = -9223372036854775807L;
    }

    @Override // f7.e
    public final void r(long j11, boolean z11) {
        this.f43463c0 = null;
        this.Z = false;
        this.f43461a0 = false;
    }

    @Override // f7.e
    public final void w(p[] pVarArr, long j11, long j12, p7.b0 b0Var) {
        this.Y = this.U.a(pVarArr[0]);
        c0 c0Var = this.f43463c0;
        if (c0Var != null) {
            long j13 = c0Var.f57179b;
            long j14 = (this.f43464d0 + j13) - j12;
            if (j13 != j14) {
                c0Var = new c0(j14, c0Var.f57178a);
            }
            this.f43463c0 = c0Var;
        }
        this.f43464d0 = j12;
    }

    @Override // f7.e
    public final void y(long j11, long j12) {
        boolean z11 = true;
        while (z11) {
            if (!this.Z && this.f43463c0 == null) {
                g8.a aVar = this.X;
                aVar.n();
                ob.e eVar = this.f26701c;
                eVar.f();
                int iX = x(eVar, aVar, 0);
                if (iX == -4) {
                    if (aVar.e(4)) {
                        this.Z = true;
                    } else if (aVar.f25117t >= this.N) {
                        aVar.L = this.f43462b0;
                        aVar.r();
                        android.support.v4.media.session.a aVar2 = this.Y;
                        String str = f0.f3975a;
                        c0 c0VarJ = aVar2.j(aVar);
                        if (c0VarJ != null) {
                            ArrayList arrayList = new ArrayList(c0VarJ.f57178a.length);
                            D(c0VarJ, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f43463c0 = new c0(E(aVar.f25117t), (b0[]) arrayList.toArray(new b0[0]));
                            }
                        }
                    }
                } else if (iX == -5) {
                    p pVar = (p) eVar.f44805c;
                    pVar.getClass();
                    this.f43462b0 = pVar.f57296s;
                }
            }
            c0 c0Var = this.f43463c0;
            if (c0Var == null || c0Var.f57179b > E(j11)) {
                z11 = false;
            } else {
                c0 c0Var2 = this.f43463c0;
                Handler handler = this.W;
                if (handler != null) {
                    handler.obtainMessage(1, c0Var2).sendToTarget();
                } else {
                    F(c0Var2);
                }
                this.f43463c0 = null;
                z11 = true;
            }
            if (this.Z && this.f43463c0 == null) {
                this.f43461a0 = true;
            }
        }
    }
}

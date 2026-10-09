package re;

import android.content.Context;
import android.os.SystemClock;
import au.a1;
import com.lingodeer.database.ChineseToneDatabase;
import com.yalantis.ucrop.view.CropImageView;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.io.File;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements t7.l, u8.i, tx.d, tx.c, x7.o, xd.a, vy.h, zc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49193a;

    public /* synthetic */ q(int i11) {
        this.f49193a = i11;
    }

    public static ChineseToneDatabase m(Context context, File file) {
        if (!file.exists()) {
            throw new IllegalStateException(ep.a.e("Pre-generated database file missing: ", file.getAbsolutePath()).toString());
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.m.e(applicationContext, "getApplicationContext(...)");
        w9.q qVarN = gb.r.n(applicationContext, ChineseToneDatabase.class, "cn_tone.db");
        qVarN.f54848r = file;
        return (ChineseToneDatabase) qVarN.b();
    }

    public static x1.f n() {
        return (x1.f) x1.l.f55690b.e();
    }

    public static x1.f r(x1.f fVar) {
        if (fVar instanceof x1.c0) {
            x1.c0 c0Var = (x1.c0) fVar;
            if (c0Var.f55659t == t1.e.c()) {
                c0Var.f55657r = null;
                return fVar;
            }
        }
        if (fVar instanceof x1.d0) {
            x1.d0 d0Var = (x1.d0) fVar;
            if (d0Var.f55666i == t1.e.c()) {
                d0Var.f55665h = null;
                return fVar;
            }
        }
        x1.f fVarG = x1.l.g(fVar, null, false);
        fVarG.j();
        return fVarG;
    }

    public static Object s(a1 a1Var, fz.a aVar) {
        x1.f c0Var;
        x1.f fVar = (x1.f) x1.l.f55690b.e();
        if (fVar instanceof x1.c0) {
            x1.c0 c0Var2 = (x1.c0) fVar;
            if (c0Var2.f55659t == t1.e.c()) {
                fz.c cVar = c0Var2.f55657r;
                fz.c cVar2 = c0Var2.f55658s;
                try {
                    ((x1.c0) fVar).f55657r = x1.l.k(a1Var, cVar, true);
                    ((x1.c0) fVar).f55658s = cVar2;
                    return aVar.invoke();
                } finally {
                    c0Var2.f55657r = cVar;
                    c0Var2.f55658s = cVar2;
                }
            }
        }
        if (fVar == null || (fVar instanceof x1.b)) {
            c0Var = new x1.c0(fVar instanceof x1.b ? (x1.b) fVar : null, a1Var, null, true, false);
        } else {
            c0Var = fVar.u(a1Var);
        }
        try {
            x1.f fVarJ = c0Var.j();
            try {
                Object objInvoke = aVar.invoke();
                x1.f.q(fVarJ);
                c0Var.c();
                return objInvoke;
            } catch (Throwable th2) {
                x1.f.q(fVarJ);
                throw th2;
            }
        } catch (Throwable th3) {
            c0Var.c();
            throw th3;
        }
    }

    public static void t(x1.f fVar, x1.f fVar2, fz.c cVar) {
        if (fVar != fVar2) {
            fVar2.getClass();
            x1.f.q(fVar);
            fVar2.c();
        } else if (fVar instanceof x1.c0) {
            ((x1.c0) fVar).f55657r = cVar;
        } else if (fVar instanceof x1.d0) {
            ((x1.d0) fVar).f55665h = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + fVar).toString());
        }
    }

    @Override // zc.b
    public boolean a(float f5) {
        throw new IllegalStateException("not implemented");
    }

    @Override // tx.c
    public void accept(Object obj) {
        Throwable nullPointerException = (Throwable) obj;
        String str = "The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + nullPointerException;
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException();
        }
        qx.p.u(new OnErrorNotImplementedException(str, nullPointerException));
    }

    @Override // u8.i
    public int b(y6.p pVar) {
        return 1;
    }

    @Override // zc.b
    public ld.a c() {
        throw new IllegalStateException("not implemented");
    }

    @Override // zc.b
    public boolean d(float f5) {
        return false;
    }

    @Override // t7.l
    public void e() {
        synchronized (u7.b.f52814a) {
            Object obj = u7.b.f52815b;
            synchronized (obj) {
                if (u7.b.f52816c) {
                    return;
                }
                long jA = u7.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    u7.b.f52817d = jA;
                    u7.b.f52816c = true;
                }
            }
        }
    }

    @Override // zc.b
    public float f() {
        return 1.0f;
    }

    @Override // zc.b
    public float g() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // u8.i
    public u8.k h(y6.p pVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // zc.b
    public boolean isEmpty() {
        return true;
    }

    @Override // xd.a
    public File j(td.g gVar) {
        return null;
    }

    @Override // u8.i
    public boolean l(y6.p pVar) {
        return false;
    }

    @Override // x7.o
    public void o() {
        throw new UnsupportedOperationException();
    }

    public synchronized lf.r p() {
        lf.e0 e0VarB = lf.h0.b(s.b());
        if (e0VarB == null) {
            return lf.r.f40109d.m();
        }
        return e0VarB.f40004h;
    }

    @Override // x7.o
    public void q(x7.y yVar) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        switch (this.f49193a) {
            case 9:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }

    @Override // x7.o
    public x7.e0 v(int i11, int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // xd.a
    public void clear() {
    }

    @Override // t7.l
    public void k() {
    }

    @Override // tx.d
    public Object apply(Object obj) {
        return obj;
    }

    @Override // xd.a
    public void i(td.g gVar, m4 m4Var) {
    }
}

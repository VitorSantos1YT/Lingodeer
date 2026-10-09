package nw;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import lw.q1;
import mw.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob.e f44233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ow.g f44234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f44236d;

    public o(p pVar, ow.g gVar) {
        this.f44236d = pVar;
        Level level = Level.FINE;
        this.f44233a = new ob.e(23);
        this.f44235c = true;
        this.f44234b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q1 q1VarH;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (this.f44234b.a(this)) {
            try {
                i2 i2Var = this.f44236d.F;
                if (i2Var != null) {
                    i2Var.a();
                }
            } catch (Throwable th2) {
                try {
                    p pVar = this.f44236d;
                    ow.a aVar = ow.a.PROTOCOL_ERROR;
                    q1 q1VarG = q1.f40441l.h("error in frame handler").g(th2);
                    Map map = p.P;
                    pVar.r(0, aVar, q1VarG);
                    try {
                        this.f44234b.close();
                    } catch (IOException e8) {
                        e = e8;
                        p.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                    } catch (RuntimeException e10) {
                        if (!"bio == null".equals(e10.getMessage())) {
                            throw e10;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        this.f44234b.close();
                    } catch (IOException e11) {
                        p.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e11);
                    } catch (RuntimeException e12) {
                        if (!"bio == null".equals(e12.getMessage())) {
                            throw e12;
                        }
                    }
                    this.f44236d.f44244h.j();
                    Thread.currentThread().setName(name);
                    throw th3;
                }
            }
        }
        synchronized (this.f44236d.f44247k) {
            q1VarH = this.f44236d.f44257v;
        }
        if (q1VarH == null) {
            q1VarH = q1.m.h("End of stream or IOException");
        }
        this.f44236d.r(0, ow.a.INTERNAL_ERROR, q1VarH);
        try {
            this.f44234b.close();
        } catch (IOException e13) {
            e = e13;
            p.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
        } catch (RuntimeException e14) {
            if (!"bio == null".equals(e14.getMessage())) {
                throw e14;
            }
        }
        this.f44236d.f44244h.j();
        Thread.currentThread().setName(name);
    }
}

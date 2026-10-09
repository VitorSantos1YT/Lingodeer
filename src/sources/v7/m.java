package v7;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import b7.f0;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import lf.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImmutableList f53651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y6.p f53652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f53653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f53654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Executor f53655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f53656f;

    public m(q qVar, Context context) {
        this.f53656f = qVar;
        f0.I(context);
        this.f53651a = ImmutableList.s();
        this.f53654d = -9223372036854775807L;
        this.f53655e = q.f53659p;
    }

    @Override // v7.d0
    public final boolean a() {
        return false;
    }

    @Override // v7.d0
    public final void b(y6.p pVar, long j11, int i11, List list) {
        b7.a.j(false);
        this.f53651a = ImmutableList.n(list);
        this.f53652b = pVar;
        this.f53656f.f53672n = false;
        y6.o oVarA = pVar.a();
        y6.g gVar = pVar.D;
        if (gVar == null || !gVar.d()) {
            gVar = y6.g.f57194h;
        }
        oVarA.C = gVar;
        oVarA.a();
        throw null;
    }

    @Override // v7.d0
    public final boolean c() {
        return false;
    }

    @Override // v7.d0
    public final void d(Surface surface, b7.x xVar) {
        q qVar = this.f53656f;
        Pair pair = qVar.f53669j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((b7.x) qVar.f53669j.second).equals(xVar)) {
            return;
        }
        qVar.f53669j = Pair.create(surface, xVar);
        int i11 = xVar.f4043a;
    }

    @Override // v7.d0
    public final Surface e() {
        b7.a.j(false);
        throw null;
    }

    @Override // v7.d0
    public final boolean f(long j11, g gVar) {
        b7.a.j(false);
        int i11 = this.f53656f.f53673o;
        if (i11 == -1 || i11 != 0) {
            return false;
        }
        throw null;
    }

    @Override // v7.d0
    public final void g() {
        q qVar = this.f53656f;
        if (qVar.f53663d) {
            qVar.f53664e.g();
        }
    }

    @Override // v7.d0
    public final void h() {
        q qVar = this.f53656f;
        if (qVar.f53663d) {
            qVar.f53664e.h();
        }
    }

    @Override // v7.d0
    public final void i(t tVar) {
        this.f53656f.f53664e.f53594i = tVar;
    }

    @Override // v7.d0
    public final void j(long j11) {
        this.f53653c = j11;
    }

    @Override // v7.d0
    public final void k() {
        long j11 = this.f53654d;
        q qVar = this.f53656f;
        if (qVar.m >= j11) {
            qVar.f53664e.k();
            qVar.f53672n = true;
        }
    }

    @Override // v7.d0
    public final void l(f fVar, Executor executor) {
        this.f53655e = executor;
    }

    @Override // v7.d0
    public final void m(int i11) {
        this.f53656f.f53664e.m(i11);
    }

    @Override // v7.d0
    public final void n(float f5) {
        this.f53656f.f53664e.n(f5);
    }

    @Override // v7.d0
    public final void o() {
        int i11 = b7.x.f4042c.f4043a;
        this.f53656f.f53669j = null;
    }

    @Override // v7.d0
    public final void p(boolean z11) {
        this.f53654d = -9223372036854775807L;
        q qVar = this.f53656f;
        c cVar = qVar.f53664e;
        if (qVar.f53671l == 1) {
            qVar.f53670k++;
            cVar.p(z11);
            while (qVar.f53667h.t() > 1) {
                qVar.f53667h.n();
            }
            if (qVar.f53667h.t() == 1) {
                ((p) qVar.f53667h.n()).getClass();
                throw null;
            }
            qVar.m = -9223372036854775807L;
            qVar.f53672n = false;
            b7.a0 a0Var = qVar.f53668i;
            b7.a.k(a0Var);
            a0Var.c(new i0(qVar, 19));
        }
    }

    @Override // v7.d0
    public final void q(List list) {
        if (this.f53651a.equals(list)) {
            return;
        }
        this.f53651a = ImmutableList.n(list);
        y6.p pVar = this.f53652b;
        if (pVar == null) {
            return;
        }
        y6.o oVarA = pVar.a();
        y6.g gVar = pVar.D;
        if (gVar == null || !gVar.d()) {
            gVar = y6.g.f57194h;
        }
        oVarA.C = gVar;
        oVarA.a();
        throw null;
    }

    @Override // v7.d0
    public final void r(long j11, long j12) throws VideoSink$VideoSinkException {
        this.f53656f.f53664e.r(j11 + this.f53653c, j12);
    }

    @Override // v7.d0
    public final void release() {
        q qVar = this.f53656f;
        if (qVar.f53671l == 2) {
            return;
        }
        b7.a0 a0Var = qVar.f53668i;
        if (a0Var != null) {
            a0Var.f3950a.removeCallbacksAndMessages(null);
        }
        qVar.f53669j = null;
        qVar.f53671l = 2;
    }

    @Override // v7.d0
    public final void s(boolean z11) {
        q qVar = this.f53656f;
        if (qVar.f53663d) {
            qVar.f53664e.s(z11);
        }
    }

    @Override // v7.d0
    public final boolean t(boolean z11) {
        return this.f53656f.f53664e.f53586a.b(false);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042 A[Catch: GlUtil$GlException -> 0x003d, TryCatch #1 {GlUtil$GlException -> 0x003d, blocks: (B:14:0x002b, B:17:0x0033, B:20:0x003a, B:25:0x0042, B:27:0x0046, B:34:0x0059, B:36:0x005f, B:32:0x0051), top: B:48:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0051 A[Catch: GlUtil$GlException -> 0x003d, TryCatch #1 {GlUtil$GlException -> 0x003d, blocks: (B:14:0x002b, B:17:0x0033, B:20:0x003a, B:25:0x0042, B:27:0x0046, B:34:0x0059, B:36:0x005f, B:32:0x0051), top: B:48:0x002b }] */
    @Override // v7.d0
    public final boolean v(y6.p pVar) throws VideoSink$VideoSinkException {
        boolean zW = true;
        b7.a.j(!false);
        q qVar = this.f53656f;
        b7.a.j(qVar.f53671l == 0);
        y6.g gVar = pVar.D;
        if (gVar == null || !gVar.d()) {
            gVar = y6.g.f57194h;
        }
        int i11 = gVar.f57197c;
        if (i11 == 7) {
            try {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 34 || i12 < 33 || !b7.a.w("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    if (i11 == 6) {
                        if (Build.VERSION.SDK_INT >= 33 || !b7.a.w("EGL_EXT_gl_colorspace_bt2020_pq")) {
                            zW = false;
                        }
                    } else if (i11 == 7) {
                        zW = b7.a.w("EGL_EXT_gl_colorspace_bt2020_hlg");
                    }
                    if (!zW && Build.VERSION.SDK_INT >= 29) {
                        Locale locale = Locale.US;
                        b7.a.B("Color transfer " + i11 + " is not supported. Falling back to OpenGl tone mapping.");
                        y6.g gVar2 = y6.g.f57194h;
                    }
                }
            } catch (GlUtil$GlException e8) {
                throw new VideoSink$VideoSinkException(e8, pVar);
            }
        } else {
            if (i11 == 6) {
                if (Build.VERSION.SDK_INT >= 33) {
                    zW = false;
                } else {
                    zW = false;
                }
            } else if (i11 == 7) {
                zW = b7.a.w("EGL_EXT_gl_colorspace_bt2020_hlg");
            }
            if (!zW) {
                Locale locale2 = Locale.US;
                b7.a.B("Color transfer " + i11 + " is not supported. Falling back to OpenGl tone mapping.");
                y6.g gVar3 = y6.g.f57194h;
            }
        }
        b7.y yVar = qVar.f53665f;
        Looper looperMyLooper = Looper.myLooper();
        b7.a.k(looperMyLooper);
        qVar.f53668i = yVar.a(looperMyLooper, null);
        try {
            qVar.f53661b.a();
            throw null;
        } catch (VideoFrameProcessingException e10) {
            throw new VideoSink$VideoSinkException(e10, pVar);
        }
    }

    @Override // v7.d0
    public final void w() {
        q qVar = this.f53656f;
        if (qVar.f53667h.t() == 0) {
            qVar.f53664e.w();
            return;
        }
        ar.f fVar = new ar.f(1, (byte) 0);
        if (qVar.f53667h.t() <= 0) {
            qVar.f53667h = fVar;
        } else {
            ((p) qVar.f53667h.n()).getClass();
            throw null;
        }
    }

    @Override // v7.d0
    public final void u() {
    }
}

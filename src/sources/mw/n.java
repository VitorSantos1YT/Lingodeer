package mw;

import com.google.common.base.Preconditions;
import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends lw.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f42553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n3 f42554e;

    public n(q qVar, n3 n3Var) {
        this.f42553d = qVar;
        Preconditions.k(n3Var, "time");
        this.f42554e = n3Var;
    }

    public static Level s(lw.e eVar) {
        int i11 = m.f42528a[eVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return Level.FINE;
        }
        return i11 != 3 ? Level.FINEST : Level.FINER;
    }

    @Override // lw.f
    public final void h(lw.e eVar, String str) {
        lw.a0 a0Var;
        q qVar = this.f42553d;
        lw.f0 f0Var = qVar.f42627b;
        Level levelS = s(eVar);
        if (q.f42625c.isLoggable(levelS)) {
            q.a(f0Var, levelS, str);
        }
        if (!r(eVar) || eVar == lw.e.DEBUG) {
            return;
        }
        int i11 = m.f42528a[eVar.ordinal()];
        if (i11 != 1) {
            a0Var = i11 != 2 ? lw.a0.CT_INFO : lw.a0.CT_WARNING;
        } else {
            a0Var = lw.a0.CT_ERROR;
        }
        lw.a0 a0Var2 = a0Var;
        long jT = this.f42554e.t();
        Preconditions.k(str, "description");
        Preconditions.k(a0Var2, "severity");
        new lw.b0(str, a0Var2, jT, null);
        synchronized (qVar.f42626a) {
        }
    }

    @Override // lw.f
    public final void i(lw.e eVar, String str, Object... objArr) {
        h(eVar, (r(eVar) || q.f42625c.isLoggable(s(eVar))) ? MessageFormat.format(str, objArr) : null);
    }

    public final boolean r(lw.e eVar) {
        if (eVar == lw.e.DEBUG) {
            return false;
        }
        synchronized (this.f42553d.f42626a) {
        }
        return false;
    }
}

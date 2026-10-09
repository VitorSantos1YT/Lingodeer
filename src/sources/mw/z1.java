package mw;

import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z1 extends lw.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lw.f0 f42852d;

    @Override // lw.f
    public final void h(lw.e eVar, String str) {
        lw.f0 f0Var = this.f42852d;
        Level levelS = n.s(eVar);
        if (q.f42625c.isLoggable(levelS)) {
            q.a(f0Var, levelS, str);
        }
    }

    @Override // lw.f
    public final void i(lw.e eVar, String str, Object... objArr) {
        lw.f0 f0Var = this.f42852d;
        Level levelS = n.s(eVar);
        if (q.f42625c.isLoggable(levelS)) {
            q.a(f0Var, levelS, MessageFormat.format(str, objArr));
        }
    }
}

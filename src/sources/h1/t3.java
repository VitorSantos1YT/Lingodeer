package h1;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lz.g f31097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1.x f31098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.k1 f31099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.k1 f31100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1.k1 f31101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l1.k1 f31102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l1.k1 f31103g;

    public t3(Long l9, Long l11, Long l12, lz.g gVar, int i11, t7 t7Var, Locale locale) {
        i1.z zVarG;
        this.f31097a = gVar;
        i1.x yVar = Build.VERSION.SDK_INT >= 26 ? new i1.y(locale) : new i1.j0(locale);
        this.f31098b = yVar;
        this.f31099c = l1.t.B(t7Var);
        if (l12 != null) {
            zVarG = yVar.f(l12.longValue());
            int i12 = zVarG.f34106a;
            if (!gVar.b(i12)) {
                throw new IllegalArgumentException(("The initial display month's year (" + i12 + ") is out of the years range of " + gVar + '.').toString());
            }
        } else {
            zVarG = yVar.g(yVar.h());
        }
        this.f31100d = l1.t.B(zVarG);
        this.f31101e = l1.t.B(null);
        this.f31102f = l1.t.B(null);
        e(l9, l11);
        this.f31103g = l1.t.B(new x3(i11));
    }

    public final int a() {
        return ((x3) this.f31103g.getValue()).f31299a;
    }

    public final Long b() {
        i1.w wVar = (i1.w) this.f31102f.getValue();
        if (wVar != null) {
            return Long.valueOf(wVar.f34087d);
        }
        return null;
    }

    public final Long c() {
        i1.w wVar = (i1.w) this.f31101e.getValue();
        if (wVar != null) {
            return Long.valueOf(wVar.f34087d);
        }
        return null;
    }

    public final void d(long j11) {
        i1.z zVarF = this.f31098b.f(j11);
        int i11 = zVarF.f34106a;
        lz.g gVar = this.f31097a;
        if (gVar.b(i11)) {
            this.f31100d.setValue(zVarF);
            return;
        }
        throw new IllegalArgumentException(("The display month's year (" + i11 + ") is out of the years range of " + gVar + '.').toString());
    }

    public final void e(Long l9, Long l11) {
        i1.x xVar = this.f31098b;
        i1.w wVarB = l9 != null ? xVar.b(l9.longValue()) : null;
        i1.w wVarB2 = l11 != null ? xVar.b(l11.longValue()) : null;
        lz.g gVar = this.f31097a;
        if (wVarB != null) {
            int i11 = wVarB.f34084a;
            if (!gVar.b(i11)) {
                throw new IllegalArgumentException(("The provided start date year (" + i11 + ") is out of the years range of " + gVar + '.').toString());
            }
        }
        if (wVarB2 != null) {
            int i12 = wVarB2.f34084a;
            if (!gVar.b(i12)) {
                throw new IllegalArgumentException(("The provided end date year (" + i12 + ") is out of the years range of " + gVar + '.').toString());
            }
        }
        if (wVarB2 != null) {
            if (wVarB == null) {
                throw new IllegalArgumentException("An end date was provided without a start date.");
            }
            if (wVarB.f34087d > wVarB2.f34087d) {
                throw new IllegalArgumentException("The provided end date appears before the start date.");
            }
        }
        this.f31101e.setValue(wVarB);
        this.f31102f.setValue(wVarB2);
    }
}

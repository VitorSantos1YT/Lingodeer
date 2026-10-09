package fd;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f27198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ed.a f27200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ed.a f27201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27202f;

    public q(String str, boolean z11, Path.FillType fillType, ed.a aVar, ed.a aVar2, boolean z12) {
        this.f27199c = str;
        this.f27197a = z11;
        this.f27198b = fillType;
        this.f27200d = aVar;
        this.f27201e = aVar2;
        this.f27202f = z12;
    }

    @Override // fd.b
    public final yc.c a(wc.v vVar, wc.h hVar, gd.c cVar) {
        return new yc.g(vVar, cVar, this);
    }

    public final String toString() {
        return ep.a.l(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f27197a, '}');
    }
}

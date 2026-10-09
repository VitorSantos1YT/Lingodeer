package fd;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f27150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f27151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ed.a f27152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ed.a f27153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ed.a f27154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ed.a f27155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f27157h;

    public d(String str, f fVar, Path.FillType fillType, ed.a aVar, ed.a aVar2, ed.a aVar3, ed.a aVar4, boolean z11) {
        this.f27150a = fVar;
        this.f27151b = fillType;
        this.f27152c = aVar;
        this.f27153d = aVar2;
        this.f27154e = aVar3;
        this.f27155f = aVar4;
        this.f27156g = str;
        this.f27157h = z11;
    }

    @Override // fd.b
    public final yc.c a(wc.v vVar, wc.h hVar, gd.c cVar) {
        return new yc.h(vVar, hVar, cVar, this);
    }
}

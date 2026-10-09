package yc;

import android.graphics.Path;
import fd.w;
import java.util.ArrayList;
import java.util.List;
import wc.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements n, zc.a, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f57718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wc.v f57719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zc.l f57720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f57721f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f57716a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ke.f f57722g = new ke.f(1);

    public t(wc.v vVar, gd.c cVar, fd.s sVar) {
        this.f57717b = sVar.f27206a;
        this.f57718c = sVar.f27209d;
        this.f57719d = vVar;
        zc.l lVar = new zc.l((List) sVar.f27208c.f3561b);
        this.f57720e = lVar;
        cVar.g(lVar);
        lVar.a(this);
    }

    @Override // yc.n
    public final Path a() {
        boolean z11 = this.f57721f;
        zc.l lVar = this.f57720e;
        Path path = this.f57716a;
        if (z11 && lVar.f59097e == null) {
            return path;
        }
        path.reset();
        if (this.f57718c) {
            this.f57721f = true;
            return path;
        }
        Path path2 = (Path) lVar.f();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f57722g.a(path);
        this.f57721f = true;
        return path;
    }

    @Override // zc.a
    public final void b() {
        this.f57721f = false;
        this.f57719d.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e A[SYNTHETIC] */
    @Override // yc.c
    public final void c(List list, List list2) {
        ArrayList arrayList = null;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i11 >= arrayList2.size()) {
                this.f57720e.m = arrayList;
                return;
            }
            c cVar = (c) arrayList2.get(i11);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.f57730c == w.SIMULTANEOUSLY) {
                    this.f57722g.f38141a.add(vVar);
                    vVar.f(this);
                } else if (!(cVar instanceof s)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    s sVar = (s) cVar;
                    sVar.f57714b.a(this);
                    arrayList.add(sVar);
                }
            } else if (!(cVar instanceof s)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                s sVar2 = (s) cVar;
                sVar2.f57714b.a(this);
                arrayList.add(sVar2);
            }
            i11++;
        }
    }

    @Override // dd.g
    public final void f(Object obj, ob.u uVar) {
        if (obj == z.K) {
            this.f57720e.k(uVar);
        }
    }

    @Override // yc.c
    public final String getName() {
        return this.f57717b;
    }

    @Override // dd.g
    public final void h(dd.f fVar, int i11, ArrayList arrayList, dd.f fVar2) {
        kd.h.g(fVar, i11, arrayList, fVar2, this);
    }
}

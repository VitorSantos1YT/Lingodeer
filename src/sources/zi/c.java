package zi;

import java.util.ArrayList;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends lp.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mp.b f59230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f59231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final xi.c f59232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f59233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f59234k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ui.h hVar, ArrayList arrayList, xi.c lesson, int i11) {
        super(hVar);
        m.f(lesson, "lesson");
        this.f59230g = hVar;
        this.f59231h = arrayList;
        this.f59232i = lesson;
        this.f59233j = i11;
        this.f59234k = new ArrayList();
    }

    public static xi.b m(ArrayList arrayList, xi.b bVar) {
        double dRandom = Math.random();
        int size = arrayList.size();
        while (true) {
            int i11 = (int) (dRandom * ((double) size));
            if (!((g) arrayList.get(i11)).f59223b.equals(bVar)) {
                return ((g) arrayList.get(i11)).f59223b;
            }
            dRandom = Math.random();
            size = arrayList.size();
        }
    }

    @Override // lp.a
    public final a5.f d() {
        return new a5.f(24, false);
    }

    @Override // lp.a
    public final mp.b e() {
        return this.f59230g;
    }

    @Override // lp.a
    public final oi.c f() {
        return new oi.c(2);
    }

    @Override // lp.a
    public final hi.a g(qi.a m) {
        m.f(m, "m");
        return null;
    }

    @Override // lp.a
    public final void j(mp.b bVar) {
        m.f(bVar, "<set-?>");
        this.f59230g = bVar;
    }
}

package p20;

import ay.k0;
import ay.l0;
import ay.w;
import java.lang.reflect.Type;
import java.util.Objects;
import o20.b0;
import o20.g;
import qx.h;
import zx.l;
import zx.n;
import zx.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f46292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46297f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f46298t;

    public d(Type type, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f46292a = type;
        this.f46293b = z11;
        this.f46294c = z12;
        this.f46295d = z13;
        this.f46296e = z14;
        this.f46297f = z15;
        this.f46298t = z16;
    }

    @Override // o20.g
    public final Type k() {
        return this.f46292a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:38:0x007d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[RETURN] */
    @Override // o20.g
    public final Object o(b0 b0Var) {
        a aVar;
        h hVar;
        zx.d dVar;
        int i11;
        w wVar = new w(b0Var, 4);
        if (!this.f46293b) {
            if (this.f46294c) {
                hVar = wVar;
                aVar = new a(wVar, 0);
            }
            hVar = wVar;
            if (this.f46295d) {
                if (this.f46296e) {
                    return new l0(hVar, 0);
                }
                if (this.f46297f) {
                    return new k0(0);
                }
                if (this.f46298t) {
                    return new ay.b0(hVar);
                }
                return hVar;
            }
            qx.a aVar2 = qx.a.MISSING;
            Objects.requireNonNull(aVar2, "strategy is null");
            dVar = new zx.d(hVar);
            i11 = qx.g.f48469a[aVar2.ordinal()];
            if (i11 != 1) {
                return new n(dVar);
            }
            if (i11 != 2) {
                return new p(dVar, 1);
            }
            if (i11 != 3) {
                return dVar;
            }
            if (i11 != 4) {
                return new p(dVar, 0);
            }
            int i12 = qx.d.f48466a;
            vx.b.a(i12, "capacity");
            return new l(dVar, i12);
        }
        aVar = new a(wVar, 1);
        hVar = aVar;
        hVar = wVar;
        if (this.f46295d) {
            if (this.f46296e) {
                return new l0(hVar, 0);
            }
            if (this.f46297f) {
                return new k0(0);
            }
            if (this.f46298t) {
                return new ay.b0(hVar);
            }
            return hVar;
        }
        qx.a aVar3 = qx.a.MISSING;
        Objects.requireNonNull(aVar3, "strategy is null");
        dVar = new zx.d(hVar);
        i11 = qx.g.f48469a[aVar3.ordinal()];
        if (i11 != 1) {
            return new n(dVar);
        }
        if (i11 != 2) {
            return new p(dVar, 1);
        }
        if (i11 != 3) {
            return dVar;
        }
        if (i11 != 4) {
            return new p(dVar, 0);
        }
        int i13 = qx.d.f48466a;
        vx.b.a(i13, "capacity");
        return new l(dVar, i13);
    }
}

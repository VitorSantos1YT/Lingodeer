package oz;

import java.util.Iterator;
import java.util.regex.Matcher;
import ot.e2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends ry.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f46168b;

    public /* synthetic */ k(Object obj, int i11) {
        this.f46167a = i11;
        this.f46168b = obj;
    }

    @Override // ry.a
    public final int b() {
        switch (this.f46167a) {
            case 0:
                return ((l) this.f46168b).f46169a.groupCount() + 1;
            default:
                q1.c cVar = (q1.c) this.f46168b;
                cVar.getClass();
                return cVar.f47362b;
        }
    }

    @Override // ry.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f46167a) {
            case 0:
                if (obj == null ? true : obj instanceof i) {
                    return super.contains((i) obj);
                }
                return false;
            default:
                return ((q1.c) this.f46168b).containsValue(obj);
        }
    }

    public i d(int i11) {
        Matcher matcher = ((l) this.f46168b).f46169a;
        lz.g gVarU = hz.b.U(matcher.start(i11), matcher.end(i11));
        if (gVarU.f40532a < 0) {
            return null;
        }
        String strGroup = matcher.group(i11);
        kotlin.jvm.internal.m.e(strGroup, "group(...)");
        return new i(strGroup, gVarU);
    }

    @Override // ry.a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f46167a) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f46167a) {
            case 0:
                return new nz.s(nz.n.W(ry.m.g0(ns.o.y(this)), new e2(this, 1)));
            default:
                q1.l lVar = ((q1.c) this.f46168b).f47361a;
                q1.m[] mVarArr = new q1.m[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    mVarArr[i11] = new q1.n(2);
                }
                return new q1.k(lVar, mVarArr);
        }
    }
}

package q1;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ry.i implements o1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f47381b;

    public /* synthetic */ j(c cVar, int i11) {
        this.f47380a = i11;
        this.f47381b = cVar;
    }

    @Override // ry.a
    public final int b() {
        switch (this.f47380a) {
            case 0:
                c cVar = this.f47381b;
                cVar.getClass();
                return cVar.f47362b;
            default:
                c cVar2 = this.f47381b;
                cVar2.getClass();
                return cVar2.f47362b;
        }
    }

    @Override // ry.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f47380a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                c cVar = this.f47381b;
                Object obj2 = cVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f47381b.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f47380a) {
            case 0:
                l lVar = this.f47381b.f47361a;
                m[] mVarArr = new m[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    mVarArr[i11] = new n(0);
                }
                return new k(lVar, mVarArr);
            default:
                l lVar2 = this.f47381b.f47361a;
                m[] mVarArr2 = new m[8];
                for (int i12 = 0; i12 < 8; i12++) {
                    mVarArr2[i12] = new n(1);
                }
                return new k(lVar2, mVarArr2);
        }
    }
}

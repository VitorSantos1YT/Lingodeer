package q1;

import java.util.Iterator;
import java.util.Map;
import l2.f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ry.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f47377b;

    public /* synthetic */ g(int i11, e eVar) {
        this.f47376a = i11;
        this.f47377b = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f47376a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // ry.h
    public final int b() {
        switch (this.f47376a) {
            case 0:
                e eVar = this.f47377b;
                eVar.getClass();
                return eVar.f47371f;
            default:
                e eVar2 = this.f47377b;
                eVar2.getClass();
                return eVar2.f47371f;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f47376a) {
            case 0:
                this.f47377b.clear();
                break;
            default:
                this.f47377b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f47376a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                e eVar = this.f47377b;
                Object obj2 = eVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && eVar.containsKey(entry.getKey());
            default:
                return this.f47377b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f47376a) {
            case 0:
                return new f0(this.f47377b);
            default:
                m[] mVarArr = new m[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    mVarArr[i11] = new n(1);
                }
                return new h(this.f47377b, mVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f47376a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f47377b.remove(entry.getKey(), entry.getValue());
            default:
                e eVar = this.f47377b;
                if (!eVar.containsKey(obj)) {
                    return false;
                }
                eVar.remove(obj);
                return true;
        }
    }
}

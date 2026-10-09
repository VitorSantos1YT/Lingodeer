package q1;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractCollection implements Collection, gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f47379b;

    public /* synthetic */ i(Object obj, int i11) {
        this.f47378a = i11;
        this.f47379b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f47378a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        switch (this.f47378a) {
            case 1:
                kotlin.jvm.internal.m.f(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f47378a) {
            case 0:
                ((e) this.f47379b).clear();
                break;
            default:
                ((sy.g) this.f47379b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f47378a) {
            case 0:
                return ((e) this.f47379b).containsValue(obj);
            default:
                return ((sy.g) this.f47379b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f47378a) {
            case 1:
                return ((sy.g) this.f47379b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f47378a) {
            case 0:
                e eVar = (e) this.f47379b;
                m[] mVarArr = new m[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    mVarArr[i11] = new n(2);
                }
                return new h(eVar, mVarArr);
            default:
                sy.g gVar = (sy.g) this.f47379b;
                gVar.getClass();
                return new sy.d(gVar, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f47378a) {
            case 1:
                sy.g gVar = (sy.g) this.f47379b;
                gVar.c();
                int i11 = gVar.i(obj);
                if (i11 < 0) {
                    return false;
                }
                gVar.l(i11);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        switch (this.f47378a) {
            case 1:
                kotlin.jvm.internal.m.f(elements, "elements");
                ((sy.g) this.f47379b).c();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        switch (this.f47378a) {
            case 1:
                kotlin.jvm.internal.m.f(elements, "elements");
                ((sy.g) this.f47379b).c();
                break;
        }
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f47378a) {
            case 0:
                e eVar = (e) this.f47379b;
                eVar.getClass();
                return eVar.f47371f;
            default:
                return ((sy.g) this.f47379b).K;
        }
    }
}

package sy;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends ry.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f51952b;

    public /* synthetic */ h(g gVar, int i11) {
        this.f51951a = i11;
        this.f51952b = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f51951a) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                m.f(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f51951a) {
            case 0:
                m.f(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                m.f(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // ry.h
    public final int b() {
        switch (this.f51951a) {
            case 0:
                break;
        }
        return this.f51952b.K;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f51951a) {
            case 0:
                this.f51952b.clear();
                break;
            default:
                this.f51952b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f51951a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f51952b.f((Map.Entry) obj);
            default:
                return this.f51952b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f51951a) {
            case 0:
                m.f(elements, "elements");
                return this.f51952b.e(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f51951a) {
            case 0:
                break;
        }
        return this.f51952b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f51951a) {
            case 0:
                g gVar = this.f51952b;
                gVar.getClass();
                return new d(gVar, 0);
            default:
                g gVar2 = this.f51952b;
                gVar2.getClass();
                return new d(gVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f51951a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                g gVar = this.f51952b;
                gVar.getClass();
                gVar.c();
                int iH = gVar.h(entry.getKey());
                if (iH < 0) {
                    return false;
                }
                Object[] objArr = gVar.f51945b;
                m.c(objArr);
                if (!m.a(objArr[iH], entry.getValue())) {
                    return false;
                }
                gVar.l(iH);
                return true;
            default:
                g gVar2 = this.f51952b;
                gVar2.c();
                int iH2 = gVar2.h(obj);
                if (iH2 < 0) {
                    return false;
                }
                gVar2.l(iH2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f51951a) {
            case 0:
                m.f(elements, "elements");
                this.f51952b.c();
                break;
            default:
                m.f(elements, "elements");
                this.f51952b.c();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f51951a) {
            case 0:
                m.f(elements, "elements");
                this.f51952b.c();
                break;
            default:
                m.f(elements, "elements");
                this.f51952b.c();
                break;
        }
        return super.retainAll(elements);
    }
}

package n1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.m;
import y.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements List, gz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43108d;

    public /* synthetic */ c(List list, int i11, int i12, int i13) {
        this.f43105a = i13;
        this.f43106b = list;
        this.f43107c = i11;
        this.f43108d = i12;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f43105a) {
            case 0:
                int i11 = this.f43108d;
                this.f43108d = i11 + 1;
                this.f43106b.add(i11, obj);
                break;
            default:
                int i12 = this.f43108d;
                this.f43108d = i12 + 1;
                this.f43106b.add(i12, obj);
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i11, Collection elements) {
        switch (this.f43105a) {
            case 0:
                this.f43106b.addAll(i11 + this.f43107c, elements);
                int size = elements.size();
                this.f43108d += size;
                return size > 0;
            default:
                m.f(elements, "elements");
                this.f43106b.addAll(i11 + this.f43107c, elements);
                this.f43108d = elements.size() + this.f43108d;
                return elements.size() > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f43105a) {
            case 0:
                int i11 = this.f43108d - 1;
                int i12 = this.f43107c;
                if (i12 <= i11) {
                    while (true) {
                        this.f43106b.remove(i11);
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                }
                this.f43108d = i12;
                break;
            default:
                int i13 = this.f43108d - 1;
                int i14 = this.f43107c;
                if (i14 <= i13) {
                    while (true) {
                        this.f43106b.remove(i13);
                        if (i13 != i14) {
                            i13--;
                        }
                    }
                }
                this.f43108d = i14;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f43105a) {
            case 0:
                int i11 = this.f43108d;
                for (int i12 = this.f43107c; i12 < i11; i12++) {
                    if (m.a(this.f43106b.get(i12), obj)) {
                        return true;
                    }
                }
                return false;
            default:
                int i13 = this.f43108d;
                for (int i14 = this.f43107c; i14 < i13; i14++) {
                    if (m.a(this.f43106b.get(i14), obj)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.f43105a) {
            case 0:
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                m.f(elements, "elements");
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i11) {
        switch (this.f43105a) {
            case 0:
                f.a(i11, this);
                return this.f43106b.get(i11 + this.f43107c);
            default:
                o0.a(i11, this);
                return this.f43106b.get(i11 + this.f43107c);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f43105a) {
            case 0:
                int i11 = this.f43108d;
                int i12 = this.f43107c;
                for (int i13 = i12; i13 < i11; i13++) {
                    if (m.a(this.f43106b.get(i13), obj)) {
                        return i13 - i12;
                    }
                }
                return -1;
            default:
                int i14 = this.f43108d;
                int i15 = this.f43107c;
                for (int i16 = i15; i16 < i14; i16++) {
                    if (m.a(this.f43106b.get(i16), obj)) {
                        return i16 - i15;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f43105a) {
            case 0:
                return this.f43108d == this.f43107c;
            default:
                return this.f43108d == this.f43107c;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f43105a) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f43105a) {
            case 0:
                int i11 = this.f43108d - 1;
                int i12 = this.f43107c;
                if (i12 <= i11) {
                    while (!m.a(this.f43106b.get(i11), obj)) {
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                    return i11 - i12;
                }
                return -1;
            default:
                int i13 = this.f43108d - 1;
                int i14 = this.f43107c;
                if (i14 <= i13) {
                    while (!m.a(this.f43106b.get(i13), obj)) {
                        if (i13 != i14) {
                            i13--;
                        }
                    }
                    return i13 - i14;
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f43105a) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f43105a) {
            case 0:
                int i11 = this.f43108d;
                for (int i12 = this.f43107c; i12 < i11; i12++) {
                    ?? r9 = this.f43106b;
                    if (m.a(r9.get(i12), obj)) {
                        r9.remove(i12);
                        this.f43108d--;
                        return true;
                    }
                }
                return false;
            default:
                int i13 = this.f43108d;
                for (int i14 = this.f43107c; i14 < i13; i14++) {
                    ?? r11 = this.f43106b;
                    if (m.a(r11.get(i14), obj)) {
                        r11.remove(i14);
                        this.f43108d--;
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection elements) {
        switch (this.f43105a) {
            case 0:
                int i11 = this.f43108d;
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i11 != this.f43108d;
            default:
                m.f(elements, "elements");
                int i12 = this.f43108d;
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i12 != this.f43108d;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection elements) {
        switch (this.f43105a) {
            case 0:
                int i11 = this.f43108d;
                int i12 = i11 - 1;
                int i13 = this.f43107c;
                if (i13 <= i12) {
                    while (true) {
                        ?? r9 = this.f43106b;
                        if (!elements.contains(r9.get(i12))) {
                            r9.remove(i12);
                            this.f43108d--;
                        }
                        if (i12 != i13) {
                            i12--;
                        }
                    }
                }
                return i11 != this.f43108d;
            default:
                m.f(elements, "elements");
                int i14 = this.f43108d;
                int i15 = i14 - 1;
                int i16 = this.f43107c;
                if (i16 <= i15) {
                    while (true) {
                        ?? r11 = this.f43106b;
                        if (!elements.contains(r11.get(i15))) {
                            r11.remove(i15);
                            this.f43108d--;
                        }
                        if (i15 != i16) {
                            i15--;
                        }
                    }
                }
                return i14 != this.f43108d;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        switch (this.f43105a) {
            case 0:
                f.a(i11, this);
                return this.f43106b.set(i11 + this.f43107c, obj);
            default:
                o0.a(i11, this);
                return this.f43106b.set(i11 + this.f43107c, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i11;
        int i12;
        switch (this.f43105a) {
            case 0:
                i11 = this.f43108d;
                i12 = this.f43107c;
                break;
            default:
                i11 = this.f43108d;
                i12 = this.f43107c;
                break;
        }
        return i11 - i12;
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        switch (this.f43105a) {
            case 0:
                f.b(i11, i12, this);
                return new c(this, i11, i12, 0);
            default:
                o0.b(i11, i12, this);
                return new c(this, i11, i12, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f43105a) {
            case 0:
                break;
        }
        return k.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i11, Object obj) {
        switch (this.f43105a) {
            case 0:
                this.f43106b.add(i11 + this.f43107c, obj);
                this.f43108d++;
                break;
            default:
                this.f43106b.add(i11 + this.f43107c, obj);
                this.f43108d++;
                break;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        switch (this.f43105a) {
            case 0:
                return new d(i11, 0, this);
            default:
                return new d(i11, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.f43105a) {
            case 0:
                break;
            default:
                m.f(array, "array");
                break;
        }
        return k.b(this, array);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection elements) {
        switch (this.f43105a) {
            case 0:
                this.f43106b.addAll(this.f43108d, elements);
                int size = elements.size();
                this.f43108d += size;
                return size > 0;
            default:
                m.f(elements, "elements");
                this.f43106b.addAll(this.f43108d, elements);
                this.f43108d = elements.size() + this.f43108d;
                return elements.size() > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i11) {
        switch (this.f43105a) {
            case 0:
                f.a(i11, this);
                Object objRemove = this.f43106b.remove(i11 + this.f43107c);
                this.f43108d--;
                return objRemove;
            default:
                o0.a(i11, this);
                Object objRemove2 = this.f43106b.remove(i11 + this.f43107c);
                this.f43108d--;
                return objRemove2;
        }
    }
}

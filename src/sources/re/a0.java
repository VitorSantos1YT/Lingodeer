package re;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends AbstractList {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f49110e = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f49111a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f49113c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49112b = String.valueOf(Integer.valueOf(f49110e.incrementAndGet()));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f49114d = new ArrayList();

    public a0(List list) {
        this.f49113c = new ArrayList(list);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        y element = (y) obj;
        kotlin.jvm.internal.m.f(element, "element");
        this.f49113c.add(i11, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f49113c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof y) {
            return super.contains((y) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return (y) this.f49113c.get(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof y) {
            return super.indexOf((y) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof y) {
            return super.lastIndexOf((y) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof y) {
            return super.remove((y) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        y element = (y) obj;
        kotlin.jvm.internal.m.f(element, "element");
        return (y) this.f49113c.set(i11, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49113c.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        return (y) this.f49113c.remove(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        y element = (y) obj;
        kotlin.jvm.internal.m.f(element, "element");
        return this.f49113c.add(element);
    }

    public a0(y... yVarArr) {
        this.f49113c = new ArrayList(ry.l.A(yVarArr));
    }
}

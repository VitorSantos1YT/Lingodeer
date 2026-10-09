package app.rive.runtime.kotlin.core;

import dt.Xk.wuoM;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import pt.ImS.aYZzTH;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelListProperty extends ViewModelProperty<b0> {
    public static final int $stable = 8;
    private Map<Long, CacheEntry> cachedItems;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CacheEntry {
        private int count;
        private final ViewModelInstance instance;

        public CacheEntry(ViewModelInstance instance, int i11) {
            m.f(instance, "instance");
            this.instance = instance;
            this.count = i11;
        }

        public static /* synthetic */ CacheEntry copy$default(CacheEntry cacheEntry, ViewModelInstance viewModelInstance, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                viewModelInstance = cacheEntry.instance;
            }
            if ((i12 & 2) != 0) {
                i11 = cacheEntry.count;
            }
            return cacheEntry.copy(viewModelInstance, i11);
        }

        public final ViewModelInstance component1() {
            return this.instance;
        }

        public final int component2() {
            return this.count;
        }

        public final CacheEntry copy(ViewModelInstance instance, int i11) {
            m.f(instance, "instance");
            return new CacheEntry(instance, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CacheEntry)) {
                return false;
            }
            CacheEntry cacheEntry = (CacheEntry) obj;
            return m.a(this.instance, cacheEntry.instance) && this.count == cacheEntry.count;
        }

        public final int getCount() {
            return this.count;
        }

        public final ViewModelInstance getInstance() {
            return this.instance;
        }

        public int hashCode() {
            return Integer.hashCode(this.count) + (this.instance.hashCode() * 31);
        }

        public final void setCount(int i11) {
            this.count = i11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("CacheEntry(instance=");
            sb2.append(this.instance);
            sb2.append(", count=");
            return ep.a.j(sb2, this.count, ')');
        }
    }

    public ViewModelListProperty(long j11) {
        super(j11);
        this.cachedItems = new LinkedHashMap();
    }

    private final void boundsCheck(int i11) {
        if (i11 < 0 || i11 >= getSize()) {
            throw new IndexOutOfBoundsException("Index out of bounds for ViewModelListProperty.");
        }
    }

    private final native void cppAdd(long j11, long j12);

    private final native void cppAddAt(long j11, int i11, long j12);

    private final native long cppElementAt(long j11, int i11);

    private final native void cppRemove(long j11, long j12);

    private final native void cppRemoveAt(long j11, int i11);

    private final native int cppSize(long j11);

    private final native void cppSwap(long j11, int i11, int i12);

    public final void add(ViewModelInstance viewModelInstance) {
        m.f(viewModelInstance, aYZzTH.WOaRXajkgU);
        if (!viewModelInstance.getHasCppObject()) {
            throw new IllegalArgumentException("Cannot add a disposed ViewModelProperty to ViewModelListProperty.");
        }
        Map<Long, CacheEntry> map = this.cachedItems;
        Long lValueOf = Long.valueOf(viewModelInstance.getCppPointer());
        CacheEntry cacheEntry = map.get(lValueOf);
        if (cacheEntry == null) {
            viewModelInstance.acquire();
            cacheEntry = new CacheEntry(viewModelInstance, 0);
            map.put(lValueOf, cacheEntry);
        }
        CacheEntry cacheEntry2 = cacheEntry;
        cacheEntry2.setCount(cacheEntry2.getCount() + 1);
        cppAdd(getCppPointer(), viewModelInstance.getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public void cppDelete(long j11) {
        super.cppDelete(j11);
        Iterator<T> it = this.cachedItems.values().iterator();
        while (it.hasNext()) {
            ((CacheEntry) it.next()).getInstance().release();
        }
        this.cachedItems.clear();
    }

    public final ViewModelInstance elementAt(int i11) {
        ViewModelInstance cacheEntry;
        boundsCheck(i11);
        long jCppElementAt = cppElementAt(getCppPointer(), i11);
        CacheEntry cacheEntry2 = this.cachedItems.get(Long.valueOf(jCppElementAt));
        if (cacheEntry2 != null && (cacheEntry = cacheEntry2.getInstance()) != null) {
            return cacheEntry;
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppElementAt);
        this.cachedItems.put(Long.valueOf(jCppElementAt), new CacheEntry(viewModelInstance, 1));
        return viewModelInstance;
    }

    public final ViewModelInstance get(int i11) {
        return elementAt(i11);
    }

    public final int getSize() {
        return cppSize(getCppPointer());
    }

    /* JADX INFO: renamed from: nativeGetValue, reason: avoid collision after fix types in other method */
    public void nativeGetValue2() {
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(b0 value) {
        m.f(value, "value");
    }

    public final void remove(ViewModelInstance item) {
        m.f(item, "item");
        if (!item.getHasCppObject()) {
            throw new IllegalArgumentException("Cannot remove a disposed ViewModelProperty from ViewModelListProperty.");
        }
        CacheEntry cacheEntryRemove = this.cachedItems.remove(Long.valueOf(item.getCppPointer()));
        if (cacheEntryRemove != null) {
            cacheEntryRemove.getInstance().release();
        }
        cppRemove(getCppPointer(), item.getCppPointer());
    }

    public final void removeAt(int i11) {
        CacheEntry cacheEntryRemove;
        boundsCheck(i11);
        long jCppElementAt = cppElementAt(getCppPointer(), i11);
        CacheEntry cacheEntry = this.cachedItems.get(Long.valueOf(jCppElementAt));
        if (cacheEntry != null) {
            cacheEntry.setCount(cacheEntry.getCount() - 1);
            if (cacheEntry.getCount() == 0 && (cacheEntryRemove = this.cachedItems.remove(Long.valueOf(jCppElementAt))) != null) {
                cacheEntryRemove.getInstance().release();
            }
        }
        cppRemoveAt(getCppPointer(), i11);
    }

    public final void swap(int i11, int i12) {
        boundsCheck(i11);
        boundsCheck(i12);
        if (i11 == i12) {
            return;
        }
        cppSwap(getCppPointer(), i11, i12);
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ b0 nativeGetValue() {
        nativeGetValue2();
        return b0.f48488a;
    }

    public final void add(int i11, ViewModelInstance viewModelInstance) {
        m.f(viewModelInstance, wuoM.BeKufNl);
        boundsCheck(i11);
        if (viewModelInstance.getHasCppObject()) {
            Map<Long, CacheEntry> map = this.cachedItems;
            Long lValueOf = Long.valueOf(viewModelInstance.getCppPointer());
            CacheEntry cacheEntry = map.get(lValueOf);
            if (cacheEntry == null) {
                viewModelInstance.acquire();
                cacheEntry = new CacheEntry(viewModelInstance, 0);
                map.put(lValueOf, cacheEntry);
            }
            CacheEntry cacheEntry2 = cacheEntry;
            cacheEntry2.setCount(cacheEntry2.getCount() + 1);
            cppAddAt(getCppPointer(), i11, viewModelInstance.getCppPointer());
            return;
        }
        throw new IllegalArgumentException("Cannot add a disposed ViewModelProperty to ViewModelListProperty.");
    }
}

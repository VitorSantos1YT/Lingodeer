package com.google.android.gms.internal.fido;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbg extends zzbh implements NavigableMap {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzbg f9656e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient zzbu f9657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient zzaz f9658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient zzbg f9659d;

    static {
        zzbu zzbuVarT = zzbi.t(zzbp.f9664a);
        zzcc zzccVar = zzaz.f9651b;
        f9656e = new zzbg(zzbuVarT, zzbs.f9665e, null);
    }

    public zzbg(zzbu zzbuVar, zzaz zzazVar, zzbg zzbgVar) {
        this.f9657b = zzbuVar;
        this.f9658c = zzazVar;
        this.f9659d = zzbgVar;
    }

    @Override // com.google.android.gms.internal.fido.zzba
    /* JADX INFO: renamed from: a */
    public final zzav values() {
        return this.f9658c;
    }

    @Override // com.google.android.gms.internal.fido.zzba
    public final zzbc b() {
        return isEmpty() ? zzbt.K : new zzbf(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f9657b.f9660c;
    }

    @Override // com.google.android.gms.internal.fido.zzba
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzbc keySet() {
        return this.f9657b;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        zzbu zzbuVar = this.f9657b;
        zzbi zzbiVar = zzbuVar.f9661d;
        if (zzbiVar != null) {
            return zzbiVar;
        }
        zzbi zzbiVarN = zzbuVar.n();
        zzbuVar.f9661d = zzbiVarN;
        zzbiVarN.f9661d = zzbuVar;
        return zzbiVarN;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        zzbg zzbgVar = this.f9659d;
        if (zzbgVar == null) {
            boolean zIsEmpty = isEmpty();
            zzbu zzbuVar = this.f9657b;
            if (zIsEmpty) {
                Comparator comparator = zzbuVar.f9660c;
                zzbr zzbrVarA = (comparator instanceof zzbr ? (zzbr) comparator : new zzat(comparator)).a();
                if (zzbp.f9664a.equals(zzbrVarA)) {
                    return f9656e;
                }
                zzbu zzbuVarT = zzbi.t(zzbrVarA);
                zzcc zzccVar = zzaz.f9651b;
                return new zzbg(zzbuVarT, zzbs.f9665e, null);
            }
            zzbi zzbiVarN = zzbuVar.f9661d;
            if (zzbiVarN == null) {
                zzbiVarN = zzbuVar.n();
                zzbuVar.f9661d = zzbiVarN;
                zzbiVarN.f9661d = zzbuVar;
            }
            zzbgVar = new zzbg((zzbu) zzbiVarN, this.f9658c.h(), this);
        }
        return zzbgVar;
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final zzbg headMap(Object obj, boolean z11) {
        obj.getClass();
        return h(0, this.f9657b.v(obj, z11));
    }

    @Override // com.google.android.gms.internal.fido.zzba, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final zzbg subMap(Object obj, boolean z11, Object obj2, boolean z12) {
        obj.getClass();
        obj2.getClass();
        if (this.f9657b.f9660c.compare(obj, obj2) <= 0) {
            return headMap(obj2, z12).tailMap(obj, z11);
        }
        throw new IllegalArgumentException(zzaq.a("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().l().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f9657b.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final zzbg tailMap(Object obj, boolean z11) {
        obj.getClass();
        return h(this.f9657b.w(obj, z11), this.f9658c.size());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005  */
    @Override // com.google.android.gms.internal.fido.zzba, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        zzbu zzbuVar = this.f9657b;
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(zzbuVar.f9674e, obj, zzbuVar.f9660c);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f9658c.get(iBinarySearch);
    }

    public final zzbg h(int i11, int i12) {
        zzaz zzazVar = this.f9658c;
        if (i11 == 0) {
            if (i12 == zzazVar.size()) {
                return this;
            }
            i11 = 0;
        }
        zzbu zzbuVar = this.f9657b;
        if (i11 != i12) {
            return new zzbg(zzbuVar.x(i11, i12), zzazVar.subList(i11, i12), null);
        }
        Comparator comparator = zzbuVar.f9660c;
        if (zzbp.f9664a.equals(comparator)) {
            return f9656e;
        }
        zzbu zzbuVarT = zzbi.t(comparator);
        zzcc zzccVar = zzaz.f9651b;
        return new zzbg(zzbuVarT, zzbs.f9665e, null);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override // com.google.android.gms.internal.fido.zzba, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.f9657b;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().l().get(this.f9658c.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f9657b.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f9657b;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9658c.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // com.google.android.gms.internal.fido.zzba, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.f9658c;
    }
}

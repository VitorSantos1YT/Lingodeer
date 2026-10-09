package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    public static final RegularImmutableBiMap K = new RegularImmutableBiMap();
    public final transient RegularImmutableBiMap H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f17143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f17144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f17145f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient int f17146t;

    private RegularImmutableBiMap() {
        this.f17143d = null;
        this.f17144e = new Object[0];
        this.f17145f = 0;
        this.f17146t = 0;
        this.H = this;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.BiMap
    public final BiMap Z() {
        return this.H;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet c() {
        return new RegularImmutableMap.EntrySet(this, this.f17144e, this.f17145f, this.f17146t);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet d() {
        return new RegularImmutableMap.KeySet(this, new RegularImmutableMap.KeysOrValuesAsList(this.f17145f, this.f17146t, this.f17144e));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object obj) {
        Object objR = RegularImmutableMap.r(this.f17143d, this.f17144e, this.f17146t, this.f17145f, obj);
        if (objR == null) {
            return null;
        }
        return objR;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean h() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableBiMap
    /* JADX INFO: renamed from: p */
    public final ImmutableBiMap Z() {
        return this.H;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f17146t;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return super.writeReplace();
    }

    public RegularImmutableBiMap(int i11, Object[] objArr) {
        this.f17144e = objArr;
        this.f17146t = i11;
        this.f17145f = 0;
        int iK = i11 >= 2 ? ImmutableSet.k(i11) : 0;
        Object objQ = RegularImmutableMap.q(objArr, i11, iK, 0);
        if (!(objQ instanceof Object[])) {
            this.f17143d = objQ;
            Object objQ2 = RegularImmutableMap.q(objArr, i11, iK, 1);
            if (!(objQ2 instanceof Object[])) {
                this.H = new RegularImmutableBiMap(objQ2, objArr, i11, this);
                return;
            }
            throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) objQ2)[2]).a();
        }
        throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) objQ)[2]).a();
    }

    public RegularImmutableBiMap(Object obj, Object[] objArr, int i11, RegularImmutableBiMap regularImmutableBiMap) {
        this.f17143d = obj;
        this.f17144e = objArr;
        this.f17145f = 1;
        this.f17146t = i11;
        this.H = regularImmutableBiMap;
    }
}

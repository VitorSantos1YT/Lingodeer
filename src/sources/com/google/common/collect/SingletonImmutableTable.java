package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17200e;

    public SingletonImmutableTable(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        this.f17198c = obj;
        obj2.getClass();
        this.f17199d = obj2;
        obj3.getClass();
        this.f17200e = obj3;
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap k() {
        Object obj = this.f17198c;
        Object obj2 = this.f17200e;
        CollectPreconditions.a(obj, obj2);
        RegularImmutableMap regularImmutableMapP = RegularImmutableMap.p(1, new Object[]{obj, obj2}, null);
        Object obj3 = this.f17199d;
        CollectPreconditions.a(obj3, regularImmutableMapP);
        return RegularImmutableMap.p(1, new Object[]{obj3, regularImmutableMapP}, null);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet d() {
        Table.Cell cellI = ImmutableTable.i(this.f17198c, this.f17199d, this.f17200e);
        int i11 = ImmutableSet.f16842c;
        return new SingletonImmutableSet(cellI);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final ImmutableCollection e() {
        int i11 = ImmutableSet.f16842c;
        return new SingletonImmutableSet(this.f17200e);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final ImmutableMap f() {
        Object obj = this.f17199d;
        Object obj2 = this.f17200e;
        CollectPreconditions.a(obj, obj2);
        RegularImmutableMap regularImmutableMapP = RegularImmutableMap.p(1, new Object[]{obj, obj2}, null);
        Object obj3 = this.f17198c;
        CollectPreconditions.a(obj3, regularImmutableMapP);
        return RegularImmutableMap.p(1, new Object[]{obj3, regularImmutableMapP}, null);
    }

    @Override // com.google.common.collect.Table
    public final int size() {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableTable
    public Object writeReplace() {
        return ImmutableTable.SerializedForm.a(this, new int[]{0}, new int[]{0});
    }
}

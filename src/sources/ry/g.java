package ry;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends AbstractList implements List, gz.c {
    public abstract int b();

    public abstract Object d(int i11);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i11) {
        return d(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}

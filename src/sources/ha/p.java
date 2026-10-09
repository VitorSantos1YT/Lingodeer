package ha;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c00.a f32154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e00.g f32155b;

    public p(c00.a elementSerializer) {
        kotlin.jvm.internal.m.f(elementSerializer, "elementSerializer");
        c00.a aVarSerializer = o.Companion.serializer(elementSerializer);
        this.f32154a = aVarSerializer;
        this.f32155b = aVarSerializer.getDescriptor();
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        o oVar = (o) cVar.x(this.f32154a);
        List list = oVar.f32152a;
        int size = list.size();
        List list2 = oVar.f32153b;
        if (size != list2.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SparseArray sparseArray = new SparseArray(list.size());
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            sparseArray.append(((Number) list.get(i11)).intValue(), list2.get(i11));
        }
        return sparseArray;
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return this.f32155b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        SparseArray value = (SparseArray) obj;
        kotlin.jvm.internal.m.f(value, "value");
        int size = value.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(Integer.valueOf(value.keyAt(i11)));
        }
        int size2 = value.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList2.add(value.valueAt(i12));
        }
        dVar.y(this.f32154a, new o(arrayList, arrayList2));
    }
}

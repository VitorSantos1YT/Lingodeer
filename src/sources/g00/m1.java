package g00;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m1 extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mz.c f28436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f28437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(mz.c cVar, c00.a eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.m.f(eSerializer, "eSerializer");
        this.f28436b = cVar;
        e00.g elementDesc = eSerializer.getDescriptor();
        kotlin.jvm.internal.m.f(elementDesc, "elementDesc");
        this.f28437c = new c(elementDesc, 0);
    }

    @Override // g00.a
    public final Object a() {
        return new ArrayList();
    }

    @Override // g00.a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.m.f(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // g00.a
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        kotlin.jvm.internal.m.f(objArr, "<this>");
        return kotlin.jvm.internal.l.a(objArr);
    }

    @Override // g00.a
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        kotlin.jvm.internal.m.f(objArr, "<this>");
        return objArr.length;
    }

    @Override // g00.a
    public final Object g(Object obj) {
        kotlin.jvm.internal.m.f(null, "<this>");
        ry.l.A(null);
        throw null;
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return this.f28437c;
    }

    @Override // g00.a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.m.f(arrayList, "<this>");
        mz.c eClass = this.f28436b;
        kotlin.jvm.internal.m.f(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) qx.b.p(eClass), arrayList.size());
        kotlin.jvm.internal.m.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        kotlin.jvm.internal.m.e(array, "toArray(...)");
        return array;
    }

    @Override // g00.s
    public final void i(int i11, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.m.f(arrayList, SemtNwfPgIhi.yygmCpbQr);
        arrayList.add(i11, obj2);
    }
}

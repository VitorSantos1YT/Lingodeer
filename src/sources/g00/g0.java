package g00;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c00.a f28403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c00.a f28404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f28406d;

    public g0(c00.a aVar, c00.a aVar2, byte b3) {
        this.f28403a = aVar;
        this.f28404b = aVar2;
    }

    @Override // g00.a
    public final Object a() {
        switch (this.f28405c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // g00.a
    public final int b(Object obj) {
        int size;
        switch (this.f28405c) {
            case 0:
                HashMap map = (HashMap) obj;
                kotlin.jvm.internal.m.f(map, "<this>");
                size = map.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                kotlin.jvm.internal.m.f(linkedHashMap, "<this>");
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // g00.a
    public final Iterator c(Object obj) {
        switch (this.f28405c) {
            case 0:
                Map map = (Map) obj;
                kotlin.jvm.internal.m.f(map, "<this>");
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                kotlin.jvm.internal.m.f(map2, "<this>");
                return map2.entrySet().iterator();
        }
    }

    @Override // g00.a
    public final int d(Object obj) {
        switch (this.f28405c) {
            case 0:
                Map map = (Map) obj;
                kotlin.jvm.internal.m.f(map, "<this>");
                return map.size();
            default:
                Map map2 = (Map) obj;
                kotlin.jvm.internal.m.f(map2, "<this>");
                return map2.size();
        }
    }

    @Override // g00.a
    public final void f(f00.a aVar, int i11, Object obj) {
        Map builder = (Map) obj;
        kotlin.jvm.internal.m.f(builder, "builder");
        Object objT = aVar.t(getDescriptor(), i11, this.f28403a, null);
        int iN = aVar.n(getDescriptor());
        if (iN != i11 + 1) {
            throw new IllegalArgumentException(nv.p.p("Value must follow key in a map, index for key: ", i11, iN, ", returned index for value: ").toString());
        }
        boolean zContainsKey = builder.containsKey(objT);
        c00.a aVar2 = this.f28404b;
        builder.put(objT, (!zContainsKey || (aVar2.getDescriptor().e() instanceof e00.f)) ? aVar.t(getDescriptor(), iN, aVar2, null) : aVar.t(getDescriptor(), iN, aVar2, ry.x.U(objT, builder)));
    }

    @Override // g00.a
    public final Object g(Object obj) {
        switch (this.f28405c) {
            case 0:
                kotlin.jvm.internal.m.f(null, "<this>");
                return new HashMap((Map) null);
            default:
                kotlin.jvm.internal.m.f(null, "<this>");
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        switch (this.f28405c) {
            case 0:
                break;
        }
        return this.f28406d;
    }

    @Override // g00.a
    public final Object h(Object obj) {
        switch (this.f28405c) {
            case 0:
                HashMap map = (HashMap) obj;
                kotlin.jvm.internal.m.f(map, "<this>");
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                kotlin.jvm.internal.m.f(linkedHashMap, "<this>");
                return linkedHashMap;
        }
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        int iD = d(obj);
        e00.g descriptor = getDescriptor();
        f00.b bVarD = dVar.D(descriptor, iD);
        Iterator itC = c(obj);
        int i11 = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i12 = i11 + 1;
            bVarD.A(getDescriptor(), i11, this.f28403a, key);
            i11 += 2;
            bVarD.A(getDescriptor(), i12, this.f28404b, value);
        }
        bVarD.c(descriptor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(c00.a kSerializer, c00.a vSerializer, int i11) {
        this(kSerializer, vSerializer, (byte) 0);
        this.f28405c = i11;
        switch (i11) {
            case 1:
                kotlin.jvm.internal.m.f(kSerializer, "kSerializer");
                kotlin.jvm.internal.m.f(vSerializer, "vSerializer");
                this(kSerializer, vSerializer, (byte) 0);
                e00.g keyDesc = kSerializer.getDescriptor();
                e00.g valueDesc = vSerializer.getDescriptor();
                kotlin.jvm.internal.m.f(keyDesc, "keyDesc");
                kotlin.jvm.internal.m.f(valueDesc, "valueDesc");
                this.f28406d = new f0("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
                break;
            default:
                kotlin.jvm.internal.m.f(kSerializer, "kSerializer");
                kotlin.jvm.internal.m.f(vSerializer, "vSerializer");
                e00.g keyDesc2 = kSerializer.getDescriptor();
                e00.g valueDesc2 = vSerializer.getDescriptor();
                kotlin.jvm.internal.m.f(keyDesc2, "keyDesc");
                kotlin.jvm.internal.m.f(valueDesc2, "valueDesc");
                this.f28406d = new f0("kotlin.collections.HashMap", keyDesc2, valueDesc2);
                break;
        }
    }
}

package g00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f28371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c00.a eSerializer, int i11) {
        super(eSerializer);
        this.f28370b = i11;
        switch (i11) {
            case 1:
                kotlin.jvm.internal.m.f(eSerializer, "eSerializer");
                super(eSerializer);
                e00.g elementDesc = eSerializer.getDescriptor();
                kotlin.jvm.internal.m.f(elementDesc, "elementDesc");
                this.f28371c = new c(elementDesc, 2);
                break;
            case 2:
                kotlin.jvm.internal.m.f(eSerializer, "eSerializer");
                super(eSerializer);
                e00.g elementDesc2 = eSerializer.getDescriptor();
                kotlin.jvm.internal.m.f(elementDesc2, "elementDesc");
                this.f28371c = new c(elementDesc2, 3);
                break;
            default:
                kotlin.jvm.internal.m.f(eSerializer, "element");
                e00.g elementDesc3 = eSerializer.getDescriptor();
                kotlin.jvm.internal.m.f(elementDesc3, "elementDesc");
                this.f28371c = new c(elementDesc3, 1);
                break;
        }
    }

    @Override // g00.a
    public final Object a() {
        switch (this.f28370b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // g00.a
    public final int b(Object obj) {
        switch (this.f28370b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                kotlin.jvm.internal.m.f(arrayList, "<this>");
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                kotlin.jvm.internal.m.f(hashSet, "<this>");
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                kotlin.jvm.internal.m.f(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // g00.a
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.m.f(collection, "<this>");
        return collection.iterator();
    }

    @Override // g00.a
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.m.f(collection, "<this>");
        return collection.size();
    }

    @Override // g00.a
    public final Object g(Object obj) {
        switch (this.f28370b) {
            case 0:
                kotlin.jvm.internal.m.f(null, "<this>");
                return new ArrayList((Collection) null);
            case 1:
                kotlin.jvm.internal.m.f(null, "<this>");
                return new HashSet((Collection) null);
            default:
                kotlin.jvm.internal.m.f(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        switch (this.f28370b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (c) this.f28371c;
    }

    @Override // g00.a
    public final Object h(Object obj) {
        switch (this.f28370b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                kotlin.jvm.internal.m.f(arrayList, "<this>");
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                kotlin.jvm.internal.m.f(hashSet, "<this>");
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                kotlin.jvm.internal.m.f(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // g00.s
    public final void i(int i11, Object obj, Object obj2) {
        switch (this.f28370b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                kotlin.jvm.internal.m.f(arrayList, "<this>");
                arrayList.add(i11, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                kotlin.jvm.internal.m.f(hashSet, "<this>");
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                kotlin.jvm.internal.m.f(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                break;
        }
    }
}

package androidx.lifecycle.viewmodel;

import java.util.Map;
import ko.Zea.ealNNtLp;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class MutableCreationExtras extends CreationExtras {
    /* JADX WARN: Multi-variable type inference failed */
    public MutableCreationExtras() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public <T> T get(CreationExtras.Key<T> key) {
        m.f(key, "key");
        return (T) getExtras$lifecycle_viewmodel_release().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void set(CreationExtras.Key<T> key, T t6) {
        m.f(key, "key");
        getExtras$lifecycle_viewmodel_release().put(key, t6);
    }

    public MutableCreationExtras(Map<CreationExtras.Key<?>, ? extends Object> map) {
        m.f(map, ealNNtLp.JZNLOZaP);
        getExtras$lifecycle_viewmodel_release().putAll(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MutableCreationExtras(CreationExtras initialExtras) {
        this((Map<CreationExtras.Key<?>, ? extends Object>) initialExtras.getExtras$lifecycle_viewmodel_release());
        m.f(initialExtras, "initialExtras");
    }

    public /* synthetic */ MutableCreationExtras(CreationExtras creationExtras, int i11, f fVar) {
        this((i11 & 1) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }
}

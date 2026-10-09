package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import mz.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    private final c clazz;
    private final fz.c initializer;

    public ViewModelInitializer(c clazz, fz.c initializer) {
        m.f(clazz, "clazz");
        m.f(initializer, "initializer");
        this.clazz = clazz;
        this.initializer = initializer;
    }

    public final c getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    public final fz.c getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelInitializer(Class<T> clazz, fz.c initializer) {
        this(z.a(clazz), initializer);
        m.f(clazz, "clazz");
        m.f(initializer, "initializer");
    }
}

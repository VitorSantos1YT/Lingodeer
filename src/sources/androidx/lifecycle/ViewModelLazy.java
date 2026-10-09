package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelLazy<VM extends ViewModel> implements qy.h {
    private VM cached;
    private final fz.a extrasProducer;
    private final fz.a factoryProducer;
    private final fz.a storeProducer;
    private final mz.c viewModelClass;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(mz.c viewModelClass, fz.a storeProducer, fz.a factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        m.f(viewModelClass, "viewModelClass");
        m.f(storeProducer, "storeProducer");
        m.f(factoryProducer, "factoryProducer");
    }

    public boolean isInitialized() {
        return this.cached != null;
    }

    public ViewModelLazy(mz.c viewModelClass, fz.a storeProducer, fz.a factoryProducer, fz.a extrasProducer) {
        m.f(viewModelClass, "viewModelClass");
        m.f(storeProducer, "storeProducer");
        m.f(factoryProducer, "factoryProducer");
        m.f(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // qy.h
    public VM getValue() {
        VM vm2 = this.cached;
        if (vm2 != null) {
            return vm2;
        }
        VM vm3 = (VM) ViewModelProvider.Companion.create((ViewModelStore) this.storeProducer.invoke(), (ViewModelProvider.Factory) this.factoryProducer.invoke(), (CreationExtras) this.extrasProducer.invoke()).get(this.viewModelClass);
        this.cached = vm3;
        return vm3;
    }

    public /* synthetic */ ViewModelLazy(mz.c cVar, fz.a aVar, fz.a aVar2, fz.a aVar3, int i11, kotlin.jvm.internal.f fVar) {
        this(cVar, aVar, aVar2, (i11 & 8) != 0 ? new j(0) : aVar3);
    }
}

package j20;

import a9.i;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import b0.h2;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.m;
import org.koin.core.error.ScopeAlreadyCreatedException;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f35650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e20.a f35651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b20.a f35652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz.a f35653d;

    public b(e eVar, e20.a scope, b20.a aVar, fz.a aVar2) {
        m.f(scope, "scope");
        this.f35650a = eVar;
        this.f35651b = scope;
        this.f35652c = aVar;
        this.f35653d = aVar2;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(mz.c modelClass, CreationExtras extras) throws ScopeAlreadyCreatedException {
        m.f(modelClass, "modelClass");
        m.f(extras, "extras");
        a aVar = new a(this.f35653d, extras);
        e20.a aVar2 = this.f35651b;
        i iVar = aVar2.f24769e;
        c20.a aVar3 = (c20.a) iVar.f521e;
        m.f(aVar3, "<this>");
        z10.a op2 = z10.a.VIEWMODEL_SCOPE_FACTORY;
        m.f(op2, "op");
        Object obj = aVar3.f6510b.get(op2);
        if (obj == null) {
            obj = null;
        }
        boolean zA = m.a(obj, Boolean.TRUE);
        b20.a aVar4 = this.f35652c;
        e eVar = this.f35650a;
        if (!zA) {
            return (ViewModel) aVar2.a(aVar, aVar4, eVar);
        }
        String scopeId = ((e) modelClass).g() + '-' + ew.a.l();
        b20.c cVar = new b20.c(modelClass);
        b20.c cVar2 = k20.a.f37869a;
        m.f(scopeId, "scopeId");
        c20.b bVar = (c20.b) iVar.f519c;
        ConcurrentHashMap concurrentHashMap = bVar.f6514c;
        i iVar2 = bVar.f6512a;
        ((h2) iVar2.f517a).V("| (+) Scope - id:'" + scopeId + "' q:'" + cVar + '\'');
        Set set = bVar.f6513b;
        if (!set.contains(cVar)) {
            ((h2) iVar2.f517a).V("| Scope '" + cVar + "' not defined. Creating it ...");
            set.add(cVar);
        }
        if (concurrentHashMap.containsKey(scopeId)) {
            String s3 = "Scope with id '" + scopeId + "' is already created";
            m.f(s3, "s");
            throw new ScopeAlreadyCreatedException(s3);
        }
        e20.a aVar5 = new e20.a(cVar, scopeId, cVar2, iVar2, 4);
        e20.a[] aVarArr = {bVar.f6515d};
        if (aVar5.f24767c) {
            throw new IllegalStateException("Can't add scope link to a root scope");
        }
        aVar5.f24770f.addAll(0, l.k0(aVarArr));
        concurrentHashMap.put(scopeId, aVar5);
        ViewModel viewModel = (ViewModel) aVar5.a(aVar, aVar4, eVar);
        viewModel.addCloseable(new c(scopeId, iVar));
        return viewModel;
    }
}

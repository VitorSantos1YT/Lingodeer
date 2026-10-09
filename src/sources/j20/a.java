package j20;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.z;
import ry.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends a20.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreationExtras f35649c;

    public a(fz.a aVar, CreationExtras creationExtras) {
        a20.a aVar2;
        List list;
        super(2, (aVar == null || (aVar2 = (a20.a) aVar.invoke()) == null || (list = aVar2.f320a) == null) ? new ArrayList() : m.c1(list));
        this.f35649c = creationExtras;
    }

    @Override // a20.a
    public final Object a(e eVar) {
        return eVar.equals(z.a(SavedStateHandle.class)) ? SavedStateHandleSupport.createSavedStateHandle(this.f35649c) : super.a(eVar);
    }

    @Override // a20.a
    public final Object b(e eVar) {
        return eVar.equals(z.a(SavedStateHandle.class)) ? SavedStateHandleSupport.createSavedStateHandle(this.f35649c) : super.b(eVar);
    }
}

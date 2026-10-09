package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.m;
import mz.c;
import qx.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelProviderImpl_androidKt {
    public static final <VM extends ViewModel> VM createViewModel(ViewModelProvider.Factory factory, c modelClass, CreationExtras extras) {
        m.f(factory, "factory");
        m.f(modelClass, "modelClass");
        m.f(extras, "extras");
        try {
            try {
                return (VM) factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(b.p(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(b.p(modelClass), extras);
        }
    }
}

package androidx.lifecycle.serialization;

import androidx.lifecycle.SavedStateHandle;
import fa.EQx.nuRcCS;
import ga.d;
import iz.c;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleDelegateKt {
    public static final <T> c saved(SavedStateHandle savedStateHandle, c00.a serializer, String str, d configuration, fz.a aVar) {
        m.f(savedStateHandle, "<this>");
        m.f(serializer, "serializer");
        m.f(configuration, "configuration");
        m.f(aVar, nuRcCS.wJllP);
        return new SavedStateHandleDelegate(savedStateHandle, serializer, str, configuration, aVar);
    }

    public static c saved$default(SavedStateHandle savedStateHandle, String str, d configuration, fz.a init, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            configuration = d.f28880c;
        }
        m.f(savedStateHandle, "<this>");
        m.f(configuration, "configuration");
        m.f(init, "init");
        m.m();
        throw null;
    }

    public static final <T> c saved(SavedStateHandle savedStateHandle, String str, d configuration, fz.a init) {
        m.f(savedStateHandle, "<this>");
        m.f(configuration, "configuration");
        m.f(init, "init");
        m.m();
        throw null;
    }

    public static /* synthetic */ c saved$default(SavedStateHandle savedStateHandle, c00.a aVar, String str, d dVar, fz.a aVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            dVar = d.f28880c;
        }
        return saved(savedStateHandle, aVar, str, dVar, aVar2);
    }
}

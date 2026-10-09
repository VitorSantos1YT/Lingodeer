package androidx.lifecycle.viewmodel.compose;

import androidx.lifecycle.SavedStateHandle;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import qy.e;
import w1.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class SavedStateHandleSaverKt$saveable$1$1$1 implements k, g {
    final /* synthetic */ SavedStateHandle.Companion $tmp0;

    public SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.Companion companion) {
        this.$tmp0 = companion;
    }

    @Override // w1.k
    public final boolean canBeSaved(Object obj) {
        return this.$tmp0.validateValue(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof k) && (obj instanceof g)) {
            return m.a(getFunctionDelegate(), ((g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.g
    public final e getFunctionDelegate() {
        return new j(1, 0, SavedStateHandle.Companion.class, this.$tmp0, "validateValue", "validateValue(Ljava/lang/Object;)Z");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}

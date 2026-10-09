package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import com.tbruyelle.rxpermissions3.BuildConfig;
import da.d;
import jh.h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.k1;
import l1.v2;
import qp.o2;
import qy.l;
import w1.i;
import w1.j;
import w1.k;
import x1.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleSaverKt {
    private static final <T> i mutableStateSaver(final i iVar) {
        m.d(iVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return new o2(6, new a(iVar, 0), new fz.c() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$2
            @Override // fz.c
            public final b1 invoke(b1 b1Var) {
                Object objA;
                if (!(b1Var instanceof n)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                n nVar = (n) b1Var;
                if (nVar.getValue() != null) {
                    i iVar2 = iVar;
                    Object value = nVar.getValue();
                    m.c(value);
                    objA = iVar2.a(value);
                } else {
                    objA = null;
                }
                v2 v2VarE = nVar.e();
                m.d(v2VarE, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver?>");
                return new k1(objA, v2VarE);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b1 mutableStateSaver$lambda$7$lambda$6(i iVar, k kVar, b1 b1Var) {
        if (!(b1Var instanceof n)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
        n nVar = (n) b1Var;
        Object objM = iVar.m(kVar, nVar.getValue());
        v2 v2VarE = nVar.e();
        m.d(v2VarE, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
        return new k1(objM, v2VarE);
    }

    public static final <T> T saveable(SavedStateHandle savedStateHandle, String str, final i iVar, fz.a aVar) {
        T t6;
        Object obj;
        m.d(iVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.saveable, kotlin.Any>");
        Bundle bundle = (Bundle) savedStateHandle.get(str);
        if (bundle == null || (obj = bundle.get("value")) == null || (t6 = (T) iVar.a(obj)) == null) {
            t6 = (T) aVar.invoke();
        }
        final T t8 = t6;
        savedStateHandle.setSavedStateProvider(str, new d() { // from class: androidx.lifecycle.viewmodel.compose.b
            @Override // da.d
            public final Bundle saveState() {
                return SavedStateHandleSaverKt.saveable$lambda$1(iVar, t8);
            }
        });
        return t6;
    }

    public static /* synthetic */ Object saveable$default(SavedStateHandle savedStateHandle, String str, i iVar, fz.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            iVar = j.f54469a;
        }
        return saveable(savedStateHandle, str, iVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle saveable$lambda$1(i iVar, Object obj) {
        return h.b(new l("value", iVar.m(new SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.Companion), obj)));
    }

    private static final iz.b saveable$lambda$3(SavedStateHandle savedStateHandle, i iVar, fz.a aVar, Object obj, mz.j jVar) {
        String str;
        if (obj != null) {
            str = z.a(obj.getClass()).f() + '.';
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        StringBuilder sbN = ep.a.n(str);
        sbN.append(jVar.getName());
        return new c(saveable(savedStateHandle, sbN.toString(), iVar, aVar));
    }

    private static final iz.c saveable$lambda$4(SavedStateHandle savedStateHandle, i iVar, fz.a aVar, Object obj, mz.j jVar) {
        String str;
        if (obj != null) {
            str = z.a(obj.getClass()).f() + '.';
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        StringBuilder sbN = ep.a.n(str);
        sbN.append(jVar.getName());
        final b1 b1VarM9saveable = m9saveable(savedStateHandle, sbN.toString(), iVar, aVar);
        return new iz.c() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$3$1
            /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
            public T getValue(Object obj2, mz.j jVar2) {
                return b1VarM9saveable.getValue();
            }

            public void setValue(Object obj2, mz.j jVar2, T t6) {
                b1VarM9saveable.setValue(t6);
            }
        };
    }

    public static final <T, M extends b1> iz.a saveableMutableState(SavedStateHandle savedStateHandle, i iVar, fz.a aVar) {
        return new a10.b(15);
    }

    public static /* synthetic */ iz.a saveableMutableState$default(SavedStateHandle savedStateHandle, i iVar, fz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = j.f54469a;
        }
        return saveableMutableState(savedStateHandle, iVar, aVar);
    }

    public static /* synthetic */ iz.a saveable$default(SavedStateHandle savedStateHandle, i iVar, fz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = j.f54469a;
        }
        return saveable(savedStateHandle, iVar, aVar);
    }

    /* JADX INFO: renamed from: saveable, reason: collision with other method in class */
    public static final <T> b1 m9saveable(SavedStateHandle savedStateHandle, String str, i iVar, fz.a aVar) {
        return (b1) saveable(savedStateHandle, str, mutableStateSaver(iVar), aVar);
    }

    public static final <T> iz.a saveable(SavedStateHandle savedStateHandle, i iVar, fz.a aVar) {
        return new a10.b(15);
    }

    private static final Object saveable$lambda$3$lambda$2(Object obj, Object obj2, mz.j jVar) {
        return obj;
    }
}

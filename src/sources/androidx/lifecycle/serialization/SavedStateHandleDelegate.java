package androidx.lifecycle.serialization;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.internal.CanonicalName_jvmKt;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ga.d;
import ga.f;
import ga.g;
import iz.c;
import java.util.Arrays;
import jh.h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import mz.j;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class SavedStateHandleDelegate<T> implements c {
    private final d configuration;
    private final fz.a init;
    private final String key;
    private final SavedStateHandle savedStateHandle;
    private final c00.a serializer;
    private T value;

    private final String createDefaultKey(Object obj, j jVar) {
        String str;
        if (obj != null) {
            str = CanonicalName_jvmKt.getCanonicalName(z.a(obj.getClass())) + '.';
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        StringBuilder sbN = ep.a.n(str);
        sbN.append(jVar.getName());
        return sbN.toString();
    }

    private final T loadValue(String str) {
        Bundle bundle = (Bundle) this.savedStateHandle.get(str);
        if (bundle == null) {
            return null;
        }
        c00.a deserializer = this.serializer;
        d configuration = this.configuration;
        m.f(deserializer, "deserializer");
        m.f(configuration, "configuration");
        return (T) new f(bundle, configuration).x(deserializer);
    }

    private final void registerSave(String str) {
        this.savedStateHandle.setSavedStateProvider(str, new da.d() { // from class: androidx.lifecycle.serialization.a
            @Override // da.d
            public final Bundle saveState() {
                return SavedStateHandleDelegate.registerSave$lambda$1(this.f2096a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle registerSave$lambda$1(SavedStateHandleDelegate savedStateHandleDelegate) {
        c00.a serializer = savedStateHandleDelegate.serializer;
        T t6 = savedStateHandleDelegate.value;
        if (t6 == null) {
            m.n("value");
            throw null;
        }
        d configuration = savedStateHandleDelegate.configuration;
        m.f(serializer, "serializer");
        m.f(configuration, "configuration");
        Bundle bundleB = h.b((l[]) Arrays.copyOf(new l[0], 0));
        new g(bundleB, configuration).y(serializer, t6);
        return bundleB;
    }

    public T getValue(Object obj, j property) {
        m.f(property, "property");
        if (this.value == null) {
            String strCreateDefaultKey = this.key;
            if (strCreateDefaultKey == null) {
                strCreateDefaultKey = createDefaultKey(obj, property);
            }
            registerSave(strCreateDefaultKey);
            T tLoadValue = loadValue(strCreateDefaultKey);
            if (tLoadValue == null) {
                tLoadValue = (T) this.init.invoke();
            }
            this.value = tLoadValue;
        }
        T t6 = this.value;
        if (t6 != null) {
            return t6;
        }
        m.n("value");
        throw null;
    }

    public void setValue(Object obj, j property, T value) {
        m.f(property, "property");
        m.f(value, "value");
        if (this.value == null) {
            String strCreateDefaultKey = this.key;
            if (strCreateDefaultKey == null) {
                strCreateDefaultKey = createDefaultKey(obj, property);
            }
            registerSave(strCreateDefaultKey);
        }
        this.value = value;
    }

    public SavedStateHandleDelegate(SavedStateHandle savedStateHandle, c00.a serializer, String str, d configuration, fz.a aVar) {
        m.f(savedStateHandle, "savedStateHandle");
        m.f(serializer, "serializer");
        m.f(configuration, "configuration");
        m.f(aVar, scqhIrGXy.guasiVyjBPQUEkV);
        this.savedStateHandle = savedStateHandle;
        this.serializer = serializer;
        this.key = str;
        this.configuration = configuration;
        this.init = aVar;
    }
}

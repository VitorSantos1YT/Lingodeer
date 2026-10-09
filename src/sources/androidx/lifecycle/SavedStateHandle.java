package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.lifecycle.internal.SavedStateHandleImpl_androidKt;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import uz.g1;
import uz.p0;
import uz.r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandle {
    public static final Companion Companion = new Companion(null);
    private SavedStateHandleImpl impl;
    private final Map<String, SavingStateLiveData<?>> liveDatas;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new SavedStateHandle();
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            m.c(classLoader);
            bundle.setClassLoader(classLoader);
            sy.g gVar = new sy.g(bundle.size());
            for (String str : bundle.keySet()) {
                m.c(str);
                gVar.put(str, bundle.get(str));
            }
            return new SavedStateHandle(gVar.b());
        }

        public final boolean validateValue(Object obj) {
            return SavedStateHandleImpl_androidKt.isAcceptableType(obj);
        }

        private Companion() {
        }
    }

    public SavedStateHandle(Map<String, ? extends Object> initialState) {
        m.f(initialState, "initialState");
        this.liveDatas = new LinkedHashMap();
        this.impl = new SavedStateHandleImpl(initialState);
    }

    public static final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z11, T t6) {
        SavingStateLiveData<?> savingStateLiveData;
        if (this.impl.getMutableFlows().containsKey(str)) {
            throw new IllegalArgumentException(SavedStateHandle_androidKt.createMutuallyExclusiveErrorMessage(str).toString());
        }
        Map<String, SavingStateLiveData<?>> map = this.liveDatas;
        SavingStateLiveData<?> savingStateLiveData2 = map.get(str);
        if (savingStateLiveData2 == null) {
            if (this.impl.getRegular().containsKey(str)) {
                savingStateLiveData = new SavingStateLiveData<>(this, str, this.impl.getRegular().get(str));
            } else if (z11) {
                this.impl.getRegular().put(str, t6);
                savingStateLiveData = new SavingStateLiveData<>(this, str, t6);
            } else {
                savingStateLiveData = new SavingStateLiveData<>(this, str);
            }
            savingStateLiveData2 = savingStateLiveData;
            map.put(str, savingStateLiveData2);
        }
        return savingStateLiveData2;
    }

    public final void clearSavedStateProvider(String key) {
        m.f(key, "key");
        this.impl.clearSavedStateProvider(key);
    }

    public final boolean contains(String key) {
        m.f(key, "key");
        return this.impl.contains(key);
    }

    public final <T> T get(String key) {
        m.f(key, "key");
        return (T) this.impl.get(key);
    }

    public final <T> MutableLiveData<T> getLiveData(String key) {
        m.f(key, "key");
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(key, false, null);
        m.d(liveDataInternal, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return liveDataInternal;
    }

    public final <T> p0 getMutableStateFlow(String key, T t6) {
        m.f(key, "key");
        if (this.liveDatas.containsKey(key)) {
            throw new IllegalArgumentException(SavedStateHandle_androidKt.createMutuallyExclusiveErrorMessage(key).toString());
        }
        return this.impl.getMutableStateFlow(key, t6);
    }

    public final <T> g1 getStateFlow(String key, T t6) {
        m.f(key, "key");
        return this.impl.getMutableFlows().containsKey(key) ? new r0(this.impl.getMutableStateFlow(key, t6)) : this.impl.getStateFlow(key, t6);
    }

    public final Set<String> keys() {
        return qx.b.D(this.impl.keys(), this.liveDatas.keySet());
    }

    public final <T> T remove(String key) {
        m.f(key, "key");
        T t6 = (T) this.impl.remove(key);
        SavingStateLiveData<?> savingStateLiveDataRemove = this.liveDatas.remove(key);
        if (savingStateLiveDataRemove != null) {
            savingStateLiveDataRemove.detach();
        }
        return t6;
    }

    public final da.d savedStateProvider() {
        return this.impl.getSavedStateProvider();
    }

    public final <T> void set(String key, T t6) {
        m.f(key, "key");
        if (!Companion.validateValue(t6)) {
            StringBuilder sb2 = new StringBuilder("Can't put value with type ");
            m.c(t6);
            sb2.append(t6.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        SavingStateLiveData<?> savingStateLiveData = this.liveDatas.get(key);
        SavingStateLiveData<?> savingStateLiveData2 = savingStateLiveData instanceof MutableLiveData ? savingStateLiveData : null;
        if (savingStateLiveData2 != null) {
            savingStateLiveData2.setValue(t6);
        }
        this.impl.set(key, t6);
    }

    public final void setSavedStateProvider(String key, da.d provider) {
        m.f(key, "key");
        m.f(provider, "provider");
        this.impl.setSavedStateProvider(key, provider);
    }

    public final <T> MutableLiveData<T> getLiveData(String key, T t6) {
        m.f(key, "key");
        return getLiveDataInternal(key, true, t6);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle handle;
        private String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(SavedStateHandle savedStateHandle, String key, T t6) {
            super(t6);
            m.f(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }

        public final void detach() {
            this.handle = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t6) {
            SavedStateHandleImpl savedStateHandleImpl;
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null && (savedStateHandleImpl = savedStateHandle.impl) != null) {
                savedStateHandleImpl.set(this.key, t6);
            }
            super.setValue(t6);
        }

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String str) {
            m.f(str, kHfjNGauVgdF.clyApeWG);
            this.key = str;
            this.handle = savedStateHandle;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandle() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new SavedStateHandleImpl(null, 1, 0 == true ? 1 : 0);
    }
}

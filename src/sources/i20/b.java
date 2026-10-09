package i20;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final ViewModel a(e eVar, ViewModelStore viewModelStore, String str, CreationExtras extras, b20.a aVar, e20.a scope, fz.a aVar2) {
        String strConcat;
        m.f(viewModelStore, "viewModelStore");
        m.f(extras, "extras");
        m.f(scope, "scope");
        ViewModelProvider viewModelProviderCreate = ViewModelProvider.Companion.create(viewModelStore, new j20.b(eVar, scope, aVar, aVar2), extras);
        String strF = eVar.f();
        if (str == null) {
            if (aVar != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aVar.getValue());
                if (strF == null || (strConcat = "_".concat(strF)) == null) {
                    strConcat = BuildConfig.VERSION_NAME;
                }
                sb2.append(strConcat);
                str = sb2.toString();
            } else {
                str = null;
            }
        }
        return str != null ? viewModelProviderCreate.get(str, eVar) : viewModelProviderCreate.get(eVar);
    }
}

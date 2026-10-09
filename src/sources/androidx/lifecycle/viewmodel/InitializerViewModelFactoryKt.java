package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import fz.c;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class InitializerViewModelFactoryKt {
    public static final <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, c initializer) {
        m.f(initializerViewModelFactoryBuilder, "<this>");
        m.f(initializer, "initializer");
        m.m();
        throw null;
    }

    public static final ViewModelProvider.Factory viewModelFactory(c cVar) {
        m.f(cVar, xTCJ.QJxPtVKdccda);
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        cVar.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}

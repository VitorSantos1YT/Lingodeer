package j9;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import j3.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewModelProvider.Factory f36211a;

    static {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(kotlin.jvm.internal.z.a(j.class), new i0(27));
        f36211a = initializerViewModelFactoryBuilder.build();
    }
}

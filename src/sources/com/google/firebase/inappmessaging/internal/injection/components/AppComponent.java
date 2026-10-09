package com.google.firebase.inappmessaging.internal.injection.components;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.dagger.Component;
import com.google.firebase.inappmessaging.internal.AbtIntegrationHelper;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcClientModule;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Component
public interface AppComponent {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Component.Builder
    public interface Builder {
        Builder a(AbtIntegrationHelper abtIntegrationHelper);

        Builder b(UniversalComponent universalComponent);

        AppComponent build();

        Builder c(TransportFactory transportFactory);

        Builder d(GrpcClientModule grpcClientModule);

        Builder e(ApiClientModule apiClientModule);
    }

    FirebaseInAppMessaging a();
}

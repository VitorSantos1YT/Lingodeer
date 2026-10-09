package com.google.firebase.inappmessaging.display;

import android.app.Application;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.database.android.d;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.display.internal.injection.components.DaggerAppComponent;
import com.google.firebase.inappmessaging.display.internal.injection.components.DaggerUniversalComponent;
import com.google.firebase.inappmessaging.display.internal.injection.components.UniversalComponent;
import com.google.firebase.inappmessaging.display.internal.injection.modules.ApplicationModule;
import com.google.firebase.inappmessaging.display.internal.injection.modules.HeadlessInAppMessagingModule;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseInAppMessagingDisplayRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiamd";

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseInAppMessagingDisplay buildFirebaseInAppMessagingUI(ComponentContainer componentContainer) {
        FirebaseApp firebaseApp = (FirebaseApp) componentContainer.a(FirebaseApp.class);
        FirebaseInAppMessaging firebaseInAppMessaging = (FirebaseInAppMessaging) componentContainer.a(FirebaseInAppMessaging.class);
        firebaseApp.b();
        Application application = (Application) firebaseApp.f17714a;
        int i11 = 0;
        DaggerUniversalComponent.Builder builder = new DaggerUniversalComponent.Builder(i11);
        builder.f19880a = new ApplicationModule(application);
        UniversalComponent universalComponentA = builder.a();
        DaggerAppComponent.Builder builder2 = new DaggerAppComponent.Builder(i11);
        builder2.f19871c = universalComponentA;
        builder2.f19869a = new HeadlessInAppMessagingModule(firebaseInAppMessaging);
        FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplayA = builder2.a().a();
        application.registerActivityLifecycleCallbacks(firebaseInAppMessagingDisplayA);
        return firebaseInAppMessagingDisplayA;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component.Builder builderB = Component.b(FirebaseInAppMessagingDisplay.class);
        builderB.f18091a = LIBRARY_NAME;
        builderB.a(Dependency.d(FirebaseApp.class));
        builderB.a(Dependency.d(FirebaseInAppMessaging.class));
        builderB.f18096f = new d(this, 3);
        builderB.c(2);
        return Arrays.asList(builderB.b(), LibraryVersionComponent.a(LIBRARY_NAME, "22.0.3"));
    }
}

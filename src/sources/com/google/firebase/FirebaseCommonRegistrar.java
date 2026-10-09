package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatConsumer;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import dt.Xk.wuoM;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import qy.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.b());
        final Qualified qualified = new Qualified(Background.class, Executor.class);
        Component.Builder builder = new Component.Builder(DefaultHeartBeatController.class, new Class[]{HeartBeatController.class, HeartBeatInfo.class});
        builder.a(Dependency.d(Context.class));
        builder.a(Dependency.d(FirebaseApp.class));
        builder.a(new Dependency(2, 0, HeartBeatConsumer.class));
        builder.a(new Dependency(1, 1, UserAgentPublisher.class));
        builder.a(new Dependency(qualified, 1, 0));
        builder.f18096f = new ComponentFactory() { // from class: com.google.firebase.heartbeatinfo.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object d(ComponentContainer componentContainer) {
                return new DefaultHeartBeatController((Context) componentContainer.a(Context.class), ((FirebaseApp) componentContainer.a(FirebaseApp.class)).g(), componentContainer.g(HeartBeatConsumer.class), componentContainer.c(UserAgentPublisher.class), (Executor) componentContainer.f(qualified));
            }
        };
        arrayList.add(builder.b());
        arrayList.add(LibraryVersionComponent.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.a("fire-core", "22.0.1"));
        arrayList.add(LibraryVersionComponent.a("device-name", a(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.a(gkbGsXmgaxRjJ.FTUKNMKXJd, a(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.a("device-brand", a(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.b("android-target-sdk", new c3.a(15)));
        arrayList.add(LibraryVersionComponent.b("android-min-sdk", new c3.a(16)));
        arrayList.add(LibraryVersionComponent.b("android-platform", new c3.a(17)));
        arrayList.add(LibraryVersionComponent.b("android-installer", new c3.a(18)));
        try {
            g.f48492b.getClass();
            str = wuoM.csIeac;
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(LibraryVersionComponent.a("kotlin", str));
        }
        return arrayList;
    }
}

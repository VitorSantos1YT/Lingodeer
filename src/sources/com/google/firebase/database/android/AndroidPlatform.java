package com.google.firebase.database.android;

import android.content.Context;
import android.os.Handler;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.connection.ConnectionContext;
import com.google.firebase.database.connection.HostInfo;
import com.google.firebase.database.connection.PersistentConnection;
import com.google.firebase.database.connection.PersistentConnectionImpl;
import com.google.firebase.database.core.Platform;
import com.google.firebase.database.core.RunLoop;
import com.google.firebase.database.core.utilities.DefaultRunLoop;
import com.google.firebase.database.logging.LogWrapper;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AndroidPlatform implements Platform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseApp f19007b;

    public AndroidPlatform(FirebaseApp firebaseApp) {
        new HashSet();
        this.f19007b = firebaseApp;
        if (firebaseApp == null) {
            throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
        }
        firebaseApp.b();
        this.f19006a = firebaseApp.f17714a;
    }

    public final PersistentConnectionImpl a(ConnectionContext connectionContext, HostInfo hostInfo, PersistentConnection.Delegate delegate) {
        final PersistentConnectionImpl persistentConnectionImpl = new PersistentConnectionImpl(connectionContext, hostInfo, delegate);
        this.f19007b.a(new FirebaseApp.BackgroundStateChangeListener() { // from class: com.google.firebase.database.android.AndroidPlatform.2
            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            public final void a(boolean z11) {
                PersistentConnectionImpl persistentConnectionImpl2 = persistentConnectionImpl;
                if (z11) {
                    persistentConnectionImpl2.h("app_in_background");
                } else {
                    persistentConnectionImpl2.n("app_in_background");
                }
            }
        });
        return persistentConnectionImpl;
    }

    public final RunLoop b(com.google.firebase.database.core.Context context) {
        final LogWrapper logWrapperB = context.b("RunLoop");
        return new DefaultRunLoop() { // from class: com.google.firebase.database.android.AndroidPlatform.1
            @Override // com.google.firebase.database.core.utilities.DefaultRunLoop
            public final void c(final Throwable th2) {
                final String str;
                if (th2 instanceof OutOfMemoryError) {
                    str = "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
                } else if (th2 instanceof NoClassDefFoundError) {
                    str = "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk";
                } else {
                    str = th2 instanceof DatabaseException ? BuildConfig.VERSION_NAME : "Uncaught exception in Firebase Database runloop (22.0.1). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk";
                }
                logWrapperB.b(str, th2);
                new Handler(AndroidPlatform.this.f19006a.getMainLooper()).post(new Runnable() { // from class: com.google.firebase.database.android.AndroidPlatform.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        throw new RuntimeException(str, th2);
                    }
                });
                this.f19411a.shutdownNow();
            }
        };
    }
}

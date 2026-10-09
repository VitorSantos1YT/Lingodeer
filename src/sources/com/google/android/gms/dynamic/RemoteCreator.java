package com.google.android.gms.dynamic;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class RemoteCreator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9193a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class RemoteCreatorException extends Exception {
    }

    public abstract zap a(IBinder iBinder);

    public final Object b(Context context) throws RemoteCreatorException {
        Context contextCreatePackageContext;
        if (this.f9193a == null) {
            Preconditions.g(context);
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f8650a;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.f9193a = a((IBinder) contextCreatePackageContext.getClassLoader().loadClass("com.google.android.gms.common.ui.SignInButtonCreatorImpl").newInstance());
            } catch (ClassNotFoundException e8) {
                throw new RemoteCreatorException("Could not load creator class.", e8);
            } catch (IllegalAccessException e10) {
                throw new RemoteCreatorException("Could not access creator.", e10);
            } catch (InstantiationException e11) {
                throw new RemoteCreatorException("Could not instantiate creator.", e11);
            }
        }
        return this.f9193a;
    }
}

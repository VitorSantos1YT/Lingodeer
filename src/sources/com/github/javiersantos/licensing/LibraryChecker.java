package com.github.javiersantos.licensing;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.vending.licensing.ILicensingService;
import java.security.SecureRandom;
import od.a;
import od.b;
import od.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class LibraryChecker implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f7745b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ILicensingService f7746a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class ResultListener extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LibraryValidator f7747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f7748b;

        /* JADX INFO: renamed from: com.github.javiersantos.licensing.LibraryChecker$ResultListener$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public ResultListener(LibraryValidator libraryValidator) {
            attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
            this.f7747a = libraryValidator;
            this.f7748b = new Runnable() { // from class: com.github.javiersantos.licensing.LibraryChecker.ResultListener.1
                @Override // java.lang.Runnable
                public final void run() {
                    ResultListener resultListener = ResultListener.this;
                    LibraryChecker libraryChecker = LibraryChecker.this;
                    LibraryValidator libraryValidator2 = resultListener.f7747a;
                    int i11 = LibraryChecker.f7745b;
                    synchronized (libraryChecker) {
                        throw null;
                    }
                }
            };
            throw null;
        }
    }

    static {
        new SecureRandom();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ILicensingService iLicensingService;
        int i11 = c.f44900a;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILicensingService)) {
                b bVar = new b();
                bVar.f44899a = iBinder;
                iLicensingService = bVar;
            } else {
                iLicensingService = (ILicensingService) iInterfaceQueryLocalInterface;
            }
        } else {
            iLicensingService = null;
        }
        this.f7746a = iLicensingService;
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        this.f7746a = null;
    }
}

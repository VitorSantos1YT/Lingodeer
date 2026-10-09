package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f20377b;

    public /* synthetic */ b(FirebaseInstallations firebaseInstallations, int i11) {
        this.f20376a = i11;
        this.f20377b = firebaseInstallations;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PersistedInstallationEntry persistedInstallationEntryC;
        PersistedInstallationEntry persistedInstallationEntryF;
        switch (this.f20376a) {
            case 0:
                FirebaseInstallations firebaseInstallations = this.f20377b;
                Object obj = FirebaseInstallations.m;
                synchronized (obj) {
                    try {
                        FirebaseApp firebaseApp = firebaseInstallations.f20351a;
                        firebaseApp.b();
                        CrossProcessLock crossProcessLockA = CrossProcessLock.a(firebaseApp.f17714a);
                        try {
                            persistedInstallationEntryC = firebaseInstallations.f20353c.c();
                            if (crossProcessLockA != null) {
                                crossProcessLockA.b();
                            }
                        } catch (Throwable th2) {
                            if (crossProcessLockA != null) {
                                crossProcessLockA.b();
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                try {
                    if (persistedInstallationEntryC.f() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
                        persistedInstallationEntryF = firebaseInstallations.f(persistedInstallationEntryC);
                    } else {
                        if (persistedInstallationEntryC.f() == PersistedInstallation.RegistrationStatus.UNREGISTERED) {
                            persistedInstallationEntryF = firebaseInstallations.f(persistedInstallationEntryC);
                        } else if (!firebaseInstallations.f20354d.a(persistedInstallationEntryC)) {
                            return;
                        } else {
                            persistedInstallationEntryF = firebaseInstallations.c(persistedInstallationEntryC);
                        }
                    }
                    synchronized (obj) {
                        try {
                            FirebaseApp firebaseApp2 = firebaseInstallations.f20351a;
                            firebaseApp2.b();
                            CrossProcessLock crossProcessLockA2 = CrossProcessLock.a(firebaseApp2.f17714a);
                            try {
                                firebaseInstallations.f20353c.b(persistedInstallationEntryF);
                                if (crossProcessLockA2 != null) {
                                    crossProcessLockA2.b();
                                }
                            } catch (Throwable th4) {
                                if (crossProcessLockA2 != null) {
                                    crossProcessLockA2.b();
                                }
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    synchronized (firebaseInstallations) {
                        if (firebaseInstallations.f20361k.size() != 0 && !TextUtils.equals(persistedInstallationEntryC.c(), persistedInstallationEntryF.c())) {
                            Iterator it = firebaseInstallations.f20361k.iterator();
                            while (it.hasNext()) {
                                ((FidListener) it.next()).a();
                            }
                        }
                    }
                    if (persistedInstallationEntryF.f() == PersistedInstallation.RegistrationStatus.REGISTERED) {
                        String strC = persistedInstallationEntryF.c();
                        synchronized (firebaseInstallations) {
                            firebaseInstallations.f20360j = strC;
                        }
                    }
                    if (persistedInstallationEntryF.f() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
                        firebaseInstallations.g(new FirebaseInstallationsException());
                        return;
                    } else if (persistedInstallationEntryF.f() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || persistedInstallationEntryF.f() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                        firebaseInstallations.g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        firebaseInstallations.h(persistedInstallationEntryF);
                        return;
                    }
                } catch (FirebaseInstallationsException e8) {
                    firebaseInstallations.g(e8);
                    return;
                }
            case 1:
                FirebaseInstallations firebaseInstallations2 = this.f20377b;
                Object obj2 = FirebaseInstallations.m;
                firebaseInstallations2.b();
                return;
            default:
                FirebaseInstallations firebaseInstallations3 = this.f20377b;
                Object obj3 = FirebaseInstallations.m;
                firebaseInstallations3.b();
                return;
        }
    }
}

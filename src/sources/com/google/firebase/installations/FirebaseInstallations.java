package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.time.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import ko.Zea.ealNNtLp;
import org.json.JSONException;
import org.json.JSONObject;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseInstallations implements FirebaseInstallationsApi {
    public static final Object m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f20351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseInstallationServiceClient f20352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PersistedInstallation f20353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Utils f20354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f20355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RandomFidGenerator f20356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f20357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f20358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f20359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f20360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f20361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f20362l;

    /* JADX INFO: renamed from: com.google.firebase.installations.FirebaseInstallations$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 implements FidListenerHandle {
    }

    /* JADX INFO: renamed from: com.google.firebase.installations.FirebaseInstallations$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f20365b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            f20365b = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20365b[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20365b[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f20364a = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20364a[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new ThreadFactory() { // from class: com.google.firebase.installations.FirebaseInstallations.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AtomicInteger f20363a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f20363a.getAndIncrement())));
            }
        };
    }

    public FirebaseInstallations(final FirebaseApp firebaseApp, Provider provider, ExecutorService executorService, Executor executor) {
        firebaseApp.b();
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = new FirebaseInstallationServiceClient(firebaseApp.f17714a, provider);
        PersistedInstallation persistedInstallation = new PersistedInstallation(firebaseApp);
        Pattern pattern = Utils.f20372c;
        SystemClock systemClockB = SystemClock.b();
        if (Utils.f20373d == null) {
            Utils.f20373d = new Utils(systemClockB);
        }
        Utils utils = Utils.f20373d;
        Lazy lazy = new Lazy(new Provider() { // from class: com.google.firebase.installations.a
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                Object obj = FirebaseInstallations.m;
                return new IidStore(firebaseApp);
            }
        });
        RandomFidGenerator randomFidGenerator = new RandomFidGenerator();
        this.f20357g = new Object();
        this.f20361k = new HashSet();
        this.f20362l = new ArrayList();
        this.f20351a = firebaseApp;
        this.f20352b = firebaseInstallationServiceClient;
        this.f20353c = persistedInstallation;
        this.f20354d = utils;
        this.f20355e = lazy;
        this.f20356f = randomFidGenerator;
        this.f20358h = executorService;
        this.f20359i = executor;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public final Task a() {
        d();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GetAuthTokenListener getAuthTokenListener = new GetAuthTokenListener(this.f20354d, taskCompletionSource);
        synchronized (this.f20357g) {
            this.f20362l.add(getAuthTokenListener);
        }
        Task task = taskCompletionSource.getTask();
        this.f20358h.execute(new b(this, 2));
        return task;
    }

    public final void b() {
        PersistedInstallationEntry persistedInstallationEntryC;
        synchronized (m) {
            try {
                FirebaseApp firebaseApp = this.f20351a;
                firebaseApp.b();
                CrossProcessLock crossProcessLockA = CrossProcessLock.a(firebaseApp.f17714a);
                try {
                    persistedInstallationEntryC = this.f20353c.c();
                    if (persistedInstallationEntryC.f() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || persistedInstallationEntryC.f() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                        String strE = e(persistedInstallationEntryC);
                        PersistedInstallation persistedInstallation = this.f20353c;
                        PersistedInstallationEntry.Builder builderH = persistedInstallationEntryC.h();
                        builderH.d(strE);
                        builderH.f(PersistedInstallation.RegistrationStatus.UNREGISTERED);
                        persistedInstallationEntryC = builderH.a();
                        persistedInstallation.b(persistedInstallationEntryC);
                    }
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
        h(persistedInstallationEntryC);
        this.f20359i.execute(new b(this, 0));
    }

    public final PersistedInstallationEntry c(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = this.f20352b;
        FirebaseApp firebaseApp = this.f20351a;
        firebaseApp.b();
        String str = firebaseApp.f17716c.f17731a;
        String strC = persistedInstallationEntry.c();
        FirebaseApp firebaseApp2 = this.f20351a;
        firebaseApp2.b();
        TokenResult tokenResultB = firebaseInstallationServiceClient.b(str, strC, firebaseApp2.f17716c.f17737g, persistedInstallationEntry.e());
        int i11 = AnonymousClass3.f20365b[tokenResultB.a().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return persistedInstallationEntry.i();
            }
            if (i11 != 3) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.f20360j = null;
            }
            PersistedInstallationEntry.Builder builderH = persistedInstallationEntry.h();
            builderH.f(PersistedInstallation.RegistrationStatus.NOT_GENERATED);
            return builderH.a();
        }
        String strB = tokenResultB.b();
        long jC = tokenResultB.c();
        Utils utils = this.f20354d;
        utils.getClass();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(utils.f20374a.a());
        PersistedInstallationEntry.Builder builderH2 = persistedInstallationEntry.h();
        builderH2.b(strB);
        builderH2.c(jC);
        builderH2.g(seconds);
        return builderH2.a();
    }

    public final void d() {
        FirebaseApp firebaseApp = this.f20351a;
        firebaseApp.b();
        Preconditions.e(firebaseApp.f17716c.f17732b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.b();
        Preconditions.e(firebaseApp.f17716c.f17737g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.b();
        Preconditions.e(firebaseApp.f17716c.f17731a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.b();
        String str = firebaseApp.f17716c.f17732b;
        Pattern pattern = Utils.f20372c;
        Preconditions.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        firebaseApp.b();
        Preconditions.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", Utils.f20372c.matcher(firebaseApp.f17716c.f17731a).matches());
    }

    public final void g(Exception exc) {
        synchronized (this.f20357g) {
            try {
                Iterator it = this.f20362l.iterator();
                while (it.hasNext()) {
                    if (((StateListener) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public final Task getId() {
        String str;
        d();
        synchronized (this) {
            str = this.f20360j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GetIdListener getIdListener = new GetIdListener(taskCompletionSource);
        synchronized (this.f20357g) {
            this.f20362l.add(getIdListener);
        }
        Task task = taskCompletionSource.getTask();
        this.f20358h.execute(new b(this, 1));
        return task;
    }

    public final void h(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.f20357g) {
            try {
                Iterator it = this.f20362l.iterator();
                while (it.hasNext()) {
                    if (((StateListener) it.next()).b(persistedInstallationEntry)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[Catch: all -> 0x0043, DONT_GENERATE, TRY_ENTER, TryCatch #0 {all -> 0x0043, blocks: (B:10:0x0032, B:11:0x0034, B:15:0x0041, B:19:0x0045, B:20:0x0049, B:28:0x005d, B:12:0x0035, B:13:0x003e), top: B:33:0x0032, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0045 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:10:0x0032, B:11:0x0034, B:15:0x0041, B:19:0x0045, B:20:0x0049, B:28:0x005d, B:12:0x0035, B:13:0x003e), top: B:33:0x0032, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    public final String e(PersistedInstallationEntry persistedInstallationEntry) {
        IidStore iidStore;
        String string;
        FirebaseApp firebaseApp = this.f20351a;
        firebaseApp.b();
        if (!firebaseApp.f17715b.equals("CHIME_ANDROID_SDK")) {
            FirebaseApp firebaseApp2 = this.f20351a;
            String str = ealNNtLp.qnydZxpJRPEF;
            firebaseApp2.b();
            if (str.equals(firebaseApp2.f17715b)) {
                if (persistedInstallationEntry.f() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                    iidStore = (IidStore) this.f20355e.get();
                    synchronized (iidStore.f20394a) {
                        try {
                            synchronized (iidStore.f20394a) {
                                string = iidStore.f20394a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = iidStore.a();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f20356f.getClass();
                    return RandomFidGenerator.a();
                }
            }
        } else if (persistedInstallationEntry.f() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
            iidStore = (IidStore) this.f20355e.get();
            synchronized (iidStore.f20394a) {
                synchronized (iidStore.f20394a) {
                    string = iidStore.f20394a.getString("|S|id", null);
                    if (string != null) {
                        string = iidStore.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f20356f.getClass();
                    return RandomFidGenerator.a();
                }
            }
        }
        this.f20356f.getClass();
        return RandomFidGenerator.a();
    }

    public final PersistedInstallationEntry f(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        String string = null;
        if (persistedInstallationEntry.c() != null && persistedInstallationEntry.c().length() == 11) {
            IidStore iidStore = (IidStore) this.f20355e.get();
            synchronized (iidStore.f20394a) {
                try {
                    String[] strArr = IidStore.f20393c;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= 4) {
                            break;
                        }
                        String str = strArr[i11];
                        String string2 = iidStore.f20394a.getString("|T|" + iidStore.f20395b + "|" + str, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith(iFLeRCXvYCGdPW.IFMyirFDEFwgDJ)) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i11++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        String str2 = string;
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = this.f20352b;
        FirebaseApp firebaseApp = this.f20351a;
        firebaseApp.b();
        String str3 = firebaseApp.f17716c.f17731a;
        String strC = persistedInstallationEntry.c();
        FirebaseApp firebaseApp2 = this.f20351a;
        firebaseApp2.b();
        String str4 = firebaseApp2.f17716c.f17737g;
        FirebaseApp firebaseApp3 = this.f20351a;
        firebaseApp3.b();
        InstallationResponse installationResponseA = firebaseInstallationServiceClient.a(str3, strC, str4, firebaseApp3.f17716c.f17732b, str2);
        int i12 = AnonymousClass3.f20364a[installationResponseA.d().ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return persistedInstallationEntry.i();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        String strB = installationResponseA.b();
        String strC2 = installationResponseA.c();
        Utils utils = this.f20354d;
        utils.getClass();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(utils.f20374a.a());
        String strB2 = installationResponseA.a().b();
        long jC = installationResponseA.a().c();
        PersistedInstallationEntry.Builder builderH = persistedInstallationEntry.h();
        builderH.d(strB);
        builderH.f(PersistedInstallation.RegistrationStatus.REGISTERED);
        builderH.b(strB2);
        builderH.e(strC2);
        builderH.c(jC);
        builderH.g(seconds);
        return builderH.a();
    }
}

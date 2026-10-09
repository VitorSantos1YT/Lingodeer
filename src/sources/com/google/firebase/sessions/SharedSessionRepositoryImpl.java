package com.google.firebase.sessions;

import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.yalantis.ucrop.UCrop;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import n5.f;
import n9.n1;
import pz.c;
import qy.b0;
import rz.e0;
import uz.j;
import vy.d;
import vy.i;
import xy.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedSessionRepositoryImpl implements SharedSessionRepository {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SessionsSettings f20982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SessionGenerator f20983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SessionFirelogPublisher f20984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeProvider f20985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f20986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProcessDataManager f20987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f20988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SessionData f20989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f20992l;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", f = "SharedSessionRepository.kt", l = {UCrop.RESULT_ERROR}, m = "invokeSuspend")
    final class AnonymousClass1 extends xy.i implements fz.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20993a;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        @e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", f = "SharedSessionRepository.kt", l = {94}, m = "invokeSuspend")
        final class C00381 extends xy.i implements fz.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f20995a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ j f20996b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Throwable f20997c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ SharedSessionRepositoryImpl f20998d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00381(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, d dVar) {
                super(3, dVar);
                this.f20998d = sharedSessionRepositoryImpl;
            }

            @Override // fz.f
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                C00381 c00381 = new C00381(this.f20998d, (d) obj3);
                c00381.f20996b = (j) obj;
                c00381.f20997c = (Throwable) obj2;
                return c00381.invokeSuspend(b0.f48488a);
            }

            @Override // xy.a
            public final Object invokeSuspend(Object obj) {
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f20995a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    j jVar = this.f20996b;
                    Throwable th2 = this.f20997c;
                    SessionData sessionData = new SessionData(this.f20998d.f20983c.a(null), null, null);
                    th2.getMessage();
                    this.f20996b = null;
                    this.f20995a = 1;
                    if (jVar.emit(sessionData, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0.f48488a;
            }
        }

        public AnonymousClass1(d dVar) {
            super(2, dVar);
        }

        @Override // xy.a
        public final d create(Object obj, d dVar) {
            return SharedSessionRepositoryImpl.this.new AnonymousClass1(dVar);
        }

        @Override // fz.e
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((rz.b0) obj, (d) obj2)).invokeSuspend(b0.f48488a);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            int i11 = this.f20993a;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                final SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                n1 n1Var = new n1(sharedSessionRepositoryImpl.f20986f.getData(), new C00381(sharedSessionRepositoryImpl, null));
                j jVar = new j() { // from class: com.google.firebase.sessions.SharedSessionRepositoryImpl.1.2
                    @Override // uz.j
                    public final Object emit(Object obj2, d dVar) {
                        SessionData sessionData = (SessionData) obj2;
                        m.f(sessionData, "<set-?>");
                        SharedSessionRepositoryImpl sharedSessionRepositoryImpl2 = sharedSessionRepositoryImpl;
                        sharedSessionRepositoryImpl2.f20989i = sessionData;
                        if (sharedSessionRepositoryImpl2.f20991k) {
                            sharedSessionRepositoryImpl2.f20991k = false;
                            sharedSessionRepositoryImpl2.c();
                        }
                        Object objD = SharedSessionRepositoryImpl.d(sharedSessionRepositoryImpl2, sessionData.f20929a.f20935a, NotificationType.GENERAL, dVar);
                        return objD == wy.a.COROUTINE_SUSPENDED ? objD : b0.f48488a;
                    }
                };
                this.f20993a = 1;
                if (n1Var.collect(jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            return b0.f48488a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class NotificationType {
        private static final /* synthetic */ yy.a $ENTRIES;
        private static final /* synthetic */ NotificationType[] $VALUES;
        public static final NotificationType FALLBACK;
        public static final NotificationType GENERAL;

        static {
            NotificationType notificationType = new NotificationType("GENERAL", 0);
            GENERAL = notificationType;
            NotificationType notificationType2 = new NotificationType("FALLBACK", 1);
            FALLBACK = notificationType2;
            NotificationType[] notificationTypeArr = {notificationType, notificationType2};
            $VALUES = notificationTypeArr;
            $ENTRIES = ub.a.U(notificationTypeArr);
        }

        public static NotificationType valueOf(String str) {
            return (NotificationType) Enum.valueOf(NotificationType.class, str);
        }

        public static NotificationType[] values() {
            return (NotificationType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21000a;

        static {
            int[] iArr = new int[NotificationType.values().length];
            try {
                iArr[NotificationType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationType.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21000a = iArr;
        }
    }

    public SharedSessionRepositoryImpl(SessionsSettings sessionsSettings, SessionGenerator sessionGenerator, SessionFirelogPublisher sessionFirelogPublisher, TimeProvider timeProvider, f sessionDataStore, ProcessDataManager processDataManager, i backgroundDispatcher) {
        m.f(sessionsSettings, "sessionsSettings");
        m.f(sessionGenerator, "sessionGenerator");
        m.f(sessionFirelogPublisher, "sessionFirelogPublisher");
        m.f(timeProvider, "timeProvider");
        m.f(sessionDataStore, "sessionDataStore");
        m.f(processDataManager, "processDataManager");
        m.f(backgroundDispatcher, "backgroundDispatcher");
        this.f20982b = sessionsSettings;
        this.f20983c = sessionGenerator;
        this.f20984d = sessionFirelogPublisher;
        this.f20985e = timeProvider;
        this.f20986f = sessionDataStore;
        this.f20987g = processDataManager;
        this.f20988h = backgroundDispatcher;
        NotificationType notificationType = NotificationType.GENERAL;
        this.f20992l = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        e0.B(e0.c(backgroundDispatcher), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, String str, NotificationType notificationType, d dVar) {
        SharedSessionRepositoryImpl$notifySubscribers$1 sharedSessionRepositoryImpl$notifySubscribers$1;
        if (dVar instanceof SharedSessionRepositoryImpl$notifySubscribers$1) {
            sharedSessionRepositoryImpl$notifySubscribers$1 = (SharedSessionRepositoryImpl$notifySubscribers$1) dVar;
            int i11 = sharedSessionRepositoryImpl$notifySubscribers$1.f21014e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sharedSessionRepositoryImpl$notifySubscribers$1.f21014e = i11 - Integer.MIN_VALUE;
            } else {
                sharedSessionRepositoryImpl$notifySubscribers$1 = new SharedSessionRepositoryImpl$notifySubscribers$1(sharedSessionRepositoryImpl, dVar);
            }
        } else {
            sharedSessionRepositoryImpl$notifySubscribers$1 = new SharedSessionRepositoryImpl$notifySubscribers$1(sharedSessionRepositoryImpl, dVar);
        }
        Object objC = sharedSessionRepositoryImpl$notifySubscribers$1.f21012c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = sharedSessionRepositoryImpl$notifySubscribers$1.f21014e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objC);
            if (!m.a(sharedSessionRepositoryImpl.f20992l, str)) {
                sharedSessionRepositoryImpl.f20992l = str;
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.f21032a;
                sharedSessionRepositoryImpl$notifySubscribers$1.f21010a = str;
                sharedSessionRepositoryImpl$notifySubscribers$1.f21011b = notificationType;
                sharedSessionRepositoryImpl$notifySubscribers$1.f21014e = 1;
                objC = firebaseSessionsDependencies.c(sharedSessionRepositoryImpl$notifySubscribers$1);
                if (objC == aVar) {
                    return aVar;
                }
            }
            return b0.f48488a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        notificationType = sharedSessionRepositoryImpl$notifySubscribers$1.f21011b;
        str = sharedSessionRepositoryImpl$notifySubscribers$1.f21010a;
        com.bumptech.glide.e.F(objC);
        for (SessionSubscriber sessionSubscriber : ((Map) objC).values()) {
            sessionSubscriber.c(new SessionSubscriber.SessionDetails(str));
            int i13 = WhenMappings.f21000a[notificationType.ordinal()];
            if (i13 == 1) {
                Objects.toString(sessionSubscriber.b());
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Objects.toString(sessionSubscriber.b());
            }
        }
        return b0.f48488a;
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public final boolean a() {
        return this.f20990j;
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public final void b() {
        this.f20990j = false;
        if (this.f20989i == null) {
            return;
        }
        this.f20987g.c();
        e0.B(e0.c(this.f20988h), null, null, new SharedSessionRepositoryImpl$appBackground$1(this, null), 3);
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public final void c() {
        boolean zD = true;
        this.f20990j = true;
        SessionData sessionData = this.f20989i;
        if (sessionData == null) {
            this.f20991k = true;
            return;
        }
        if (sessionData == null) {
            m.n("localSessionData");
            throw null;
        }
        ProcessDataManager processDataManager = this.f20987g;
        processDataManager.c();
        if (!e(sessionData)) {
            Map map = sessionData.f20931c;
            if (map == null || (zD = processDataManager.d(map))) {
                processDataManager.c();
            }
            if (!zD) {
                return;
            }
        }
        e0.B(e0.c(this.f20988h), null, null, new SharedSessionRepositoryImpl$appForeground$1(this, sessionData, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    public final boolean e(SessionData sessionData) {
        pz.a aVarB;
        long jP;
        Time time = sessionData.f20930b;
        SessionDetails sessionDetails = sessionData.f20929a;
        if (time == null) {
            String str = sessionDetails.f20935a;
            return false;
        }
        Time timeA = this.f20985e.a();
        int i11 = pz.a.f47220d;
        long jQ = pz.f.q(timeA.f21022a - time.f21022a, c.MILLISECONDS);
        SessionsSettings sessionsSettings = this.f20982b;
        pz.a aVarB2 = sessionsSettings.f21092a.b();
        if (aVarB2 != null) {
            jP = aVarB2.f47221a;
            if (jP <= 0 || pz.a.g(jP)) {
                aVarB = sessionsSettings.f21093b.b();
                if (aVarB != null) {
                    jP = aVarB.f47221a;
                    if (jP > 0 || pz.a.g(jP)) {
                        jP = pz.f.p(30, c.MINUTES);
                    }
                } else {
                    jP = pz.f.p(30, c.MINUTES);
                }
            }
        } else {
            aVarB = sessionsSettings.f21093b.b();
            if (aVarB != null) {
                jP = aVarB.f47221a;
                if (jP > 0) {
                    jP = pz.f.p(30, c.MINUTES);
                } else {
                    jP = pz.f.p(30, c.MINUTES);
                }
            } else {
                jP = pz.f.p(30, c.MINUTES);
            }
        }
        boolean z11 = pz.a.c(jQ, jP) > 0;
        if (z11) {
            String str2 = sessionDetails.f20935a;
        }
        return z11;
    }
}

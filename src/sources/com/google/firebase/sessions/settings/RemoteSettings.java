package com.google.firebase.sessions.settings;

import a00.e;
import android.os.Build;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.InstallationId;
import com.google.firebase.sessions.TimeProvider;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Map;
import kotlin.jvm.internal.m;
import oz.o;
import pz.a;
import pz.c;
import pz.f;
import qy.b0;
import qy.l;
import ry.x;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RemoteSettings implements SettingsProvider {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Companion f21053g = new Companion(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f21054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o f21055i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeProvider f21056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseInstallationsApi f21057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f21058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CrashlyticsSettingsFetcher f21059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SettingsCache f21060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f21061f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    static {
        int i11 = a.f47220d;
        f21054h = (int) a.j(f.p(24, c.HOURS), c.SECONDS);
        f21055i = new o("com/google/firebase/sessions//");
    }

    public RemoteSettings(TimeProvider timeProvider, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo appInfo, CrashlyticsSettingsFetcher configsFetcher, SettingsCache settingsCache) {
        m.f(timeProvider, "timeProvider");
        m.f(firebaseInstallationsApi, "firebaseInstallationsApi");
        m.f(appInfo, "appInfo");
        m.f(configsFetcher, "configsFetcher");
        m.f(settingsCache, "settingsCache");
        this.f21056a = timeProvider;
        this.f21057b = firebaseInstallationsApi;
        this.f21058c = appInfo;
        this.f21059d = configsFetcher;
        this.f21060e = settingsCache;
        this.f21061f = new e();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Boolean a() {
        return this.f21060e.e();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final a b() {
        Integer numB = this.f21060e.b();
        if (numB == null) {
            return null;
        }
        int i11 = a.f47220d;
        return new a(f.p(numB.intValue(), c.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Double c() {
        return this.f21060e.a();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e A[Catch: all -> 0x004a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004a, blocks: (B:21:0x0046, B:42:0x0090, B:46:0x009e), top: B:58:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x009e, please report this as an issue */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Object d(d dVar) throws Throwable {
        RemoteSettings$updateSettings$1 remoteSettings$updateSettings$1;
        a00.a aVar;
        a00.a aVar2;
        Throwable th2;
        a00.a aVar3;
        String str;
        Map mapY;
        CrashlyticsSettingsFetcher crashlyticsSettingsFetcher;
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1;
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2;
        a00.a aVar4;
        if (dVar instanceof RemoteSettings$updateSettings$1) {
            remoteSettings$updateSettings$1 = (RemoteSettings$updateSettings$1) dVar;
            int i11 = remoteSettings$updateSettings$1.f21065d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                remoteSettings$updateSettings$1.f21065d = i11 - Integer.MIN_VALUE;
            } else {
                remoteSettings$updateSettings$1 = new RemoteSettings$updateSettings$1(this, (xy.c) dVar);
            }
        } else {
            remoteSettings$updateSettings$1 = new RemoteSettings$updateSettings$1(this, (xy.c) dVar);
        }
        Object obj = remoteSettings$updateSettings$1.f21063b;
        wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
        int i12 = remoteSettings$updateSettings$1.f21065d;
        SettingsCache settingsCache = this.f21060e;
        b0 b0Var = b0.f48488a;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                e eVar = this.f21061f;
                if (!eVar.f() && !settingsCache.c()) {
                    return b0Var;
                }
                remoteSettings$updateSettings$1.f21062a = eVar;
                remoteSettings$updateSettings$1.f21065d = 1;
                Object objB = eVar.b(remoteSettings$updateSettings$1);
                aVar = eVar;
                if (objB != aVar5) {
                }
                return aVar5;
            }
            if (i12 != 1) {
                if (i12 == 2) {
                    aVar3 = remoteSettings$updateSettings$1.f21062a;
                    try {
                        com.bumptech.glide.e.F(obj);
                        aVar3 = aVar3;
                        str = ((InstallationId) obj).f20906a;
                        if (str.equals(BuildConfig.VERSION_NAME)) {
                            aVar3.a(null);
                            return b0Var;
                        }
                        l lVar = new l("X-Crashlytics-Installation-ID", str);
                        String str2 = Build.MANUFACTURER + Build.MODEL;
                        o oVar = f21055i;
                        l lVar2 = new l("X-Crashlytics-Device-Model", oVar.g(str2));
                        String INCREMENTAL = Build.VERSION.INCREMENTAL;
                        m.e(INCREMENTAL, "INCREMENTAL");
                        l lVar3 = new l("X-Crashlytics-OS-Build-Version", oVar.g(INCREMENTAL));
                        String RELEASE = Build.VERSION.RELEASE;
                        m.e(RELEASE, "RELEASE");
                        l lVar4 = new l("X-Crashlytics-OS-Display-Version", oVar.g(RELEASE));
                        this.f21058c.getClass();
                        mapY = x.Y(lVar, lVar2, lVar3, lVar4, new l("X-Crashlytics-API-Client-Version", "3.0.6"));
                        crashlyticsSettingsFetcher = this.f21059d;
                        remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this, null);
                        remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(2, null);
                        remoteSettings$updateSettings$1.f21062a = aVar3;
                        remoteSettings$updateSettings$1.f21065d = 3;
                        if (crashlyticsSettingsFetcher.a(mapY, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, remoteSettings$updateSettings$1) != aVar5) {
                            aVar4 = aVar3;
                        }
                        return aVar5;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2 = aVar3;
                        aVar2.a(null);
                        throw th2;
                    }
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = remoteSettings$updateSettings$1.f21062a;
                try {
                    com.bumptech.glide.e.F(obj);
                    aVar4 = aVar2;
                } catch (Throwable th4) {
                    th2 = th4;
                    aVar2.a(null);
                    throw th2;
                }
                aVar4.a(null);
                return b0Var;
            }
            a00.a aVar6 = remoteSettings$updateSettings$1.f21062a;
            com.bumptech.glide.e.F(obj);
            aVar = aVar6;
            if (!settingsCache.c()) {
                aVar.a(null);
                return b0Var;
            }
            InstallationId.Companion companion = InstallationId.f20905c;
            FirebaseInstallationsApi firebaseInstallationsApi = this.f21057b;
            remoteSettings$updateSettings$1.f21062a = aVar;
            remoteSettings$updateSettings$1.f21065d = 2;
            Object objA = companion.a(firebaseInstallationsApi, remoteSettings$updateSettings$1);
            if (objA != aVar5) {
                aVar3 = aVar;
                obj = objA;
                str = ((InstallationId) obj).f20906a;
                if (str.equals(BuildConfig.VERSION_NAME)) {
                    aVar3.a(null);
                    return b0Var;
                }
                l lVar5 = new l("X-Crashlytics-Installation-ID", str);
                String str3 = Build.MANUFACTURER + Build.MODEL;
                o oVar2 = f21055i;
                l lVar6 = new l("X-Crashlytics-Device-Model", oVar2.g(str3));
                String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
                m.e(INCREMENTAL2, "INCREMENTAL");
                l lVar7 = new l("X-Crashlytics-OS-Build-Version", oVar2.g(INCREMENTAL2));
                String RELEASE2 = Build.VERSION.RELEASE;
                m.e(RELEASE2, "RELEASE");
                l lVar8 = new l("X-Crashlytics-OS-Display-Version", oVar2.g(RELEASE2));
                this.f21058c.getClass();
                mapY = x.Y(lVar5, lVar6, lVar7, lVar8, new l("X-Crashlytics-API-Client-Version", "3.0.6"));
                crashlyticsSettingsFetcher = this.f21059d;
                remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this, null);
                remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(2, null);
                remoteSettings$updateSettings$1.f21062a = aVar3;
                remoteSettings$updateSettings$1.f21065d = 3;
                if (crashlyticsSettingsFetcher.a(mapY, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, remoteSettings$updateSettings$1) != aVar5) {
                    aVar4 = aVar3;
                    aVar4.a(null);
                    return b0Var;
                }
            }
            return aVar5;
        } catch (Throwable th5) {
            aVar2 = aVar;
            th2 = th5;
            aVar2.a(null);
            throw th2;
        }
    }
}

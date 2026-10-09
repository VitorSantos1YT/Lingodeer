package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.TimeProvider;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import n5.f;
import qy.b0;
import rz.e0;
import uz.j;
import vy.d;
import wy.a;
import xy.c;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SettingsCacheImpl implements SettingsCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeProvider f21099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f21100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f21101c;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @e(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", f = "SettingsCache.kt", l = {73}, m = "invokeSuspend")
    final class AnonymousClass1 extends i implements fz.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21102a;

        /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        final /* synthetic */ class C00391 implements j, g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AtomicReference f21104a;

            public C00391(AtomicReference atomicReference) {
                this.f21104a = atomicReference;
            }

            @Override // uz.j
            public final Object emit(Object obj, d dVar) {
                this.f21104a.set((SessionConfigs) obj);
                a aVar = a.COROUTINE_SUSPENDED;
                return b0.f48488a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof j) && (obj instanceof g)) {
                    return getFunctionDelegate().equals(((g) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.g
            public final qy.e getFunctionDelegate() {
                return new kotlin.jvm.internal.a(2, 4, AtomicReference.class, this.f21104a, "set", "set(Ljava/lang/Object;)V");
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public AnonymousClass1(d dVar) {
            super(2, dVar);
        }

        @Override // xy.a
        public final d create(Object obj, d dVar) {
            return SettingsCacheImpl.this.new AnonymousClass1(dVar);
        }

        @Override // fz.e
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((rz.b0) obj, (d) obj2)).invokeSuspend(b0.f48488a);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.f21102a;
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                SettingsCacheImpl settingsCacheImpl = SettingsCacheImpl.this;
                uz.i data = settingsCacheImpl.f21100b.getData();
                C00391 c00391 = new C00391(settingsCacheImpl.f21101c);
                this.f21102a = 1;
                if (data.collect(c00391, this) == aVar) {
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

    public SettingsCacheImpl(vy.i backgroundDispatcher, TimeProvider timeProvider, f sessionConfigsDataStore) {
        m.f(backgroundDispatcher, "backgroundDispatcher");
        m.f(timeProvider, "timeProvider");
        m.f(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f21099a = timeProvider;
        this.f21100b = sessionConfigsDataStore;
        this.f21101c = new AtomicReference();
        e0.B(e0.c(backgroundDispatcher), null, null, new AnonymousClass1(null), 3);
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public final Double a() {
        return f().f21085b;
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public final Integer b() {
        return f().f21086c;
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public final boolean c() {
        Long l9 = f().f21088e;
        Integer num = f().f21087d;
        return l9 == null || num == null || this.f21099a.a().f21024c - l9.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.firebase.sessions.settings.SettingsCache
    public final Object d(SessionConfigs sessionConfigs, c cVar) {
        SettingsCacheImpl$updateConfigs$1 settingsCacheImpl$updateConfigs$1;
        if (cVar instanceof SettingsCacheImpl$updateConfigs$1) {
            settingsCacheImpl$updateConfigs$1 = (SettingsCacheImpl$updateConfigs$1) cVar;
            int i11 = settingsCacheImpl$updateConfigs$1.f21111c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                settingsCacheImpl$updateConfigs$1.f21111c = i11 - Integer.MIN_VALUE;
            } else {
                settingsCacheImpl$updateConfigs$1 = new SettingsCacheImpl$updateConfigs$1(this, cVar);
            }
        } else {
            settingsCacheImpl$updateConfigs$1 = new SettingsCacheImpl$updateConfigs$1(this, cVar);
        }
        Object obj = settingsCacheImpl$updateConfigs$1.f21109a;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = settingsCacheImpl$updateConfigs$1.f21111c;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                f fVar = this.f21100b;
                SettingsCacheImpl$updateConfigs$2 settingsCacheImpl$updateConfigs$2 = new SettingsCacheImpl$updateConfigs$2(sessionConfigs, null);
                settingsCacheImpl$updateConfigs$1.f21111c = 1;
                if (fVar.a(settingsCacheImpl$updateConfigs$2, settingsCacheImpl$updateConfigs$1) == aVar) {
                    return aVar;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
        } catch (IOException e8) {
            e8.toString();
        }
        return b0.f48488a;
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public final Boolean e() {
        return f().f21084a;
    }

    public final SessionConfigs f() throws Throwable {
        AtomicReference atomicReference = this.f21101c;
        if (atomicReference.get() == null) {
            Object objF = e0.F(vy.j.f54321a, new SettingsCacheImpl$sessionConfigs$1(this, null));
            while (!atomicReference.compareAndSet(null, objF) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        m.e(obj, "get(...)");
        return (SessionConfigs) obj;
    }
}

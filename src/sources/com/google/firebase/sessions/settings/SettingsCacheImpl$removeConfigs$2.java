package com.google.firebase.sessions.settings;

import qy.b0;
import vy.d;
import wy.a;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
final class SettingsCacheImpl$removeConfigs$2 extends i implements fz.e {
    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new SettingsCacheImpl$removeConfigs$2(2, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsCacheImpl$removeConfigs$2) create((SessionConfigs) obj, (d) obj2)).invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        SessionConfigsSerializer.f21090a.getClass();
        return SessionConfigsSerializer.f21091b;
    }
}

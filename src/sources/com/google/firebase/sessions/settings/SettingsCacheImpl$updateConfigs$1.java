package com.google.firebase.sessions.settings;

import xy.c;
import xy.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.sessions.settings.SettingsCacheImpl", f = "SettingsCache.kt", l = {98}, m = "updateConfigs")
final class SettingsCacheImpl$updateConfigs$1 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SettingsCacheImpl f21110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCacheImpl$updateConfigs$1(SettingsCacheImpl settingsCacheImpl, c cVar) {
        super(cVar);
        this.f21110b = settingsCacheImpl;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f21109a = obj;
        this.f21111c |= Integer.MIN_VALUE;
        return this.f21110b.d(null, this);
    }
}

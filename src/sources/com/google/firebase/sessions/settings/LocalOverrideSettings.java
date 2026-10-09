package com.google.firebase.sessions.settings;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.m;
import pz.a;
import pz.c;
import pz.f;
import qy.b0;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocalOverrideSettings implements SettingsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f21051a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public LocalOverrideSettings(Context appContext) {
        m.f(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f21051a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Boolean a() {
        Bundle bundle = this.f21051a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final a b() {
        Bundle bundle = this.f21051a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new a(f.p(bundle.getInt("firebase_sessions_sessions_restart_timeout"), c.SECONDS));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Double c() {
        Bundle bundle = this.f21051a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Object d(d dVar) {
        return b0.f48488a;
    }
}

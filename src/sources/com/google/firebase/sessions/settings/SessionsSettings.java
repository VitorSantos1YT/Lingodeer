package com.google.firebase.sessions.settings;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionsSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SettingsProvider f21092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SettingsProvider f21093b;

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

    public SessionsSettings(SettingsProvider localOverrideSettings, SettingsProvider remoteSettings) {
        m.f(localOverrideSettings, "localOverrideSettings");
        m.f(remoteSettings, "remoteSettings");
        this.f21092a = localOverrideSettings;
        this.f21093b = remoteSettings;
    }

    public final double a() {
        Double dC = this.f21092a.c();
        if (dC != null) {
            double dDoubleValue = dC.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dC2 = this.f21093b.c();
        if (dC2 != null) {
            double dDoubleValue2 = dC2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r5.f21093b.d(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xy.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1) r0
            int r1 = r0.f21096c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21096c = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f21094a
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f21096c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.bumptech.glide.e.F(r6)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            com.bumptech.glide.e.F(r6)
            goto L44
        L36:
            com.bumptech.glide.e.F(r6)
            r0.f21096c = r4
            com.google.firebase.sessions.settings.SettingsProvider r6 = r5.f21092a
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L44
            goto L4e
        L44:
            r0.f21096c = r3
            com.google.firebase.sessions.settings.SettingsProvider r6 = r5.f21093b
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            qy.b0 r6 = qy.b0.f48488a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.b(xy.c):java.lang.Object");
    }
}

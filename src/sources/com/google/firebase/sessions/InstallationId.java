package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class InstallationId {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f20905c = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20907b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
        
            if (r9 == r1) goto L29;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.installations.FirebaseInstallationsApi, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v3, types: [com.google.firebase.installations.FirebaseInstallationsApi] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(com.google.firebase.installations.FirebaseInstallationsApi r8, xy.c r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.google.firebase.sessions.InstallationId$Companion$create$1
                if (r0 == 0) goto L13
                r0 = r9
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = (com.google.firebase.sessions.InstallationId$Companion$create$1) r0
                int r1 = r0.f20911d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f20911d = r1
                goto L18
            L13:
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = new com.google.firebase.sessions.InstallationId$Companion$create$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f20909b
                wy.a r1 = wy.a.COROUTINE_SUSPENDED
                int r2 = r0.f20911d
                r3 = 2
                r4 = 1
                java.lang.String r5 = ""
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f20908a
                java.lang.String r8 = (java.lang.String) r8
                com.bumptech.glide.e.F(r9)     // Catch: java.lang.Exception -> L80
                goto L7a
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f20908a
                com.google.firebase.installations.FirebaseInstallationsApi r8 = (com.google.firebase.installations.FirebaseInstallationsApi) r8
                com.bumptech.glide.e.F(r9)     // Catch: java.lang.Exception -> L64
                goto L57
            L40:
                com.bumptech.glide.e.F(r9)
                com.google.android.gms.tasks.Task r9 = r8.a()     // Catch: java.lang.Exception -> L64
                java.lang.String r2 = "getToken(...)"
                kotlin.jvm.internal.m.e(r9, r2)     // Catch: java.lang.Exception -> L64
                r0.f20908a = r8     // Catch: java.lang.Exception -> L64
                r0.f20911d = r4     // Catch: java.lang.Exception -> L64
                java.lang.Object r9 = se.p.M(r9, r0)     // Catch: java.lang.Exception -> L64
                if (r9 != r1) goto L57
                goto L79
            L57:
                com.google.firebase.installations.InstallationTokenResult r9 = (com.google.firebase.installations.InstallationTokenResult) r9     // Catch: java.lang.Exception -> L64
                java.lang.String r9 = r9.a()     // Catch: java.lang.Exception -> L64
                kotlin.jvm.internal.m.c(r9)     // Catch: java.lang.Exception -> L64
                r6 = r9
                r9 = r8
                r8 = r6
                goto L66
            L64:
                r9 = r8
                r8 = r5
            L66:
                com.google.android.gms.tasks.Task r9 = r9.getId()     // Catch: java.lang.Exception -> L80
                java.lang.String r2 = "getId(...)"
                kotlin.jvm.internal.m.e(r9, r2)     // Catch: java.lang.Exception -> L80
                r0.f20908a = r8     // Catch: java.lang.Exception -> L80
                r0.f20911d = r3     // Catch: java.lang.Exception -> L80
                java.lang.Object r9 = se.p.M(r9, r0)     // Catch: java.lang.Exception -> L80
                if (r9 != r1) goto L7a
            L79:
                return r1
            L7a:
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L80
                if (r9 != 0) goto L7f
                goto L80
            L7f:
                r5 = r9
            L80:
                com.google.firebase.sessions.InstallationId r9 = new com.google.firebase.sessions.InstallationId
                r9.<init>(r5, r8)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.InstallationId.Companion.a(com.google.firebase.installations.FirebaseInstallationsApi, xy.c):java.lang.Object");
        }

        private Companion() {
        }
    }

    public InstallationId(String str, String str2) {
        this.f20906a = str;
        this.f20907b = str2;
    }
}

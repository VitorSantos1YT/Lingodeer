package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzfp implements zzgj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzfn f9510b = new zzfn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzfo f9511a;

    public zzfp() {
        zzfv zzfvVar;
        try {
            zzfvVar = (zzfv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzfvVar = f9510b;
        }
        zzfo zzfoVar = new zzfo(zzes.f9496a, zzfvVar);
        Charset charset = zzfa.f9501a;
        this.f9511a = zzfoVar;
    }
}

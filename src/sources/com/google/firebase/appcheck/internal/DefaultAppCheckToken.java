package com.google.firebase.appcheck.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.internal.util.TokenParser;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DefaultAppCheckToken extends AppCheckToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17803c;

    public DefaultAppCheckToken(String str, long j11, long j12) {
        Preconditions.d(str);
        this.f17801a = str;
        this.f17803c = j11;
        this.f17802b = j12;
    }

    public static DefaultAppCheckToken c(String str) {
        Preconditions.g(str);
        Map mapA = TokenParser.a(str);
        long jD = d("iat", mapA);
        return new DefaultAppCheckToken(str, (d("exp", mapA) - jD) * 1000, jD * 1000);
    }

    public static long d(String str, Map map) {
        Preconditions.g(map);
        Preconditions.d(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @Override // com.google.firebase.appcheck.AppCheckToken
    public final long a() {
        return this.f17802b + this.f17803c;
    }

    @Override // com.google.firebase.appcheck.AppCheckToken
    public final String b() {
        return this.f17801a;
    }
}

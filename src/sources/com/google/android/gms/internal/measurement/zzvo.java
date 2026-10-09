package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableList;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzvo extends zzwv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImmutableList f12080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImmutableList f12081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public UUID f12082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f12084e;

    public final zzww a() {
        ImmutableList immutableList;
        ImmutableList immutableList2;
        UUID uuid;
        if (this.f12084e == 1 && (immutableList = this.f12080a) != null && (immutableList2 = this.f12081b) != null && (uuid = this.f12082c) != null) {
            return new zzvp(immutableList, immutableList2, uuid, this.f12083d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f12080a == null) {
            sb2.append(" spansNames");
        }
        if (this.f12081b == null) {
            sb2.append(" extras");
        }
        if (this.f12082c == null) {
            sb2.append(" rootTraceId");
        }
        if (this.f12084e == 0) {
            sb2.append(" rootDurationMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}

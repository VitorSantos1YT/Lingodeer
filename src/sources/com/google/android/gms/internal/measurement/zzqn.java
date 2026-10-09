package com.google.android.gms.internal.measurement;

import b7.e0;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzacr f11864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f11867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f11868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f11870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f11871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zznf f11872k;

    public zzqn(boolean z11, ImmutableList enabledBackings, zzacr secret, String dirPath, String gmsCoreDirPath, ImmutableList includeStaticConfigPackages, ImmutableList excludeStaticConfigPackages, boolean z12, boolean z13, boolean z14, zznf clientFlags) {
        m.f(enabledBackings, "enabledBackings");
        m.f(secret, "secret");
        m.f(dirPath, "dirPath");
        m.f(gmsCoreDirPath, "gmsCoreDirPath");
        m.f(includeStaticConfigPackages, "includeStaticConfigPackages");
        m.f(excludeStaticConfigPackages, "excludeStaticConfigPackages");
        m.f(clientFlags, "clientFlags");
        this.f11862a = z11;
        this.f11863b = enabledBackings;
        this.f11864c = secret;
        this.f11865d = dirPath;
        this.f11866e = gmsCoreDirPath;
        this.f11867f = includeStaticConfigPackages;
        this.f11868g = excludeStaticConfigPackages;
        this.f11869h = z12;
        this.f11870i = z13;
        this.f11871j = z14;
        this.f11872k = clientFlags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqn)) {
            return false;
        }
        zzqn zzqnVar = (zzqn) obj;
        return this.f11862a == zzqnVar.f11862a && m.a(this.f11863b, zzqnVar.f11863b) && m.a(this.f11864c, zzqnVar.f11864c) && m.a(this.f11865d, zzqnVar.f11865d) && m.a(this.f11866e, zzqnVar.f11866e) && m.a(this.f11867f, zzqnVar.f11867f) && m.a(this.f11868g, zzqnVar.f11868g) && this.f11869h == zzqnVar.f11869h && this.f11870i == zzqnVar.f11870i && this.f11871j == zzqnVar.f11871j && m.a(this.f11872k, zzqnVar.f11872k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f11862a), this.f11863b, this.f11864c, this.f11865d, this.f11866e, this.f11867f, this.f11868g, Boolean.valueOf(this.f11869h), Boolean.valueOf(this.f11870i), Boolean.valueOf(this.f11871j));
    }

    public final String toString() {
        boolean z11 = this.f11862a;
        int length = String.valueOf(z11).length();
        List list = this.f11863b;
        int length2 = String.valueOf(list).length();
        zzacr zzacrVar = this.f11864c;
        int length3 = String.valueOf(zzacrVar).length();
        String str = this.f11865d;
        int length4 = String.valueOf(str).length();
        String str2 = this.f11866e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f11867f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.f11868g;
        int length7 = String.valueOf(list3).length();
        boolean z12 = this.f11869h;
        int length8 = String.valueOf(z12).length();
        boolean z13 = this.f11870i;
        int length9 = String.valueOf(z13).length();
        boolean z14 = this.f11871j;
        int length10 = String.valueOf(z14).length();
        zznf zznfVar = this.f11872k;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(zznfVar).length() + 1);
        sb2.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb2.append(z11);
        sb2.append(", enabledBackings=");
        sb2.append(list);
        sb2.append(", secret=");
        sb2.append(zzacrVar);
        sb2.append(", dirPath=");
        sb2.append(str);
        sb2.append(", gmsCoreDirPath=");
        sb2.append(str2);
        sb2.append(", includeStaticConfigPackages=");
        sb2.append(list2);
        sb2.append(", excludeStaticConfigPackages=");
        sb2.append(list3);
        sb2.append(", hasStorageInfoFromGms=");
        sb2.append(z12);
        e0.z(", allowEmptySnapshotToken=", ", enableCommitV2Api=", sb2, z13, z14);
        sb2.append(", clientFlags=");
        sb2.append(zznfVar);
        sb2.append(")");
        return sb2.toString();
    }
}

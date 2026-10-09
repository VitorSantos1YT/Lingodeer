package com.google.android.gms.internal.measurement;

import com.google.common.base.Preconditions;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzwk extends zzwl {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzwl f12111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzwl f12112f;

    static {
        zzwl zzwlVarB = new zzwk(null, new t0(0)).b();
        f12111e = zzwlVarB;
        zzwk zzwkVar = new zzwk(zzwlVarB, new t0(0));
        boolean z11 = !zzwkVar.f12116c;
        Boolean bool = Boolean.TRUE;
        Preconditions.p("Can't mutate after handing to trace", z11);
        zzwj zzwjVar = zzwl.f12113d;
        Preconditions.p("Key already present", !zzwkVar.c(zzwjVar));
        zzwkVar.f12115b.put(zzwjVar, bool);
        f12112f = zzwkVar.b();
    }
}

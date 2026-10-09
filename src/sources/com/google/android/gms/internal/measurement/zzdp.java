package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import lt.AJC.PQgum;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdp extends zzeo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f11521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f11522f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzez f11523t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzez zzezVar, Context context, Bundle bundle) {
        super(zzezVar, true);
        this.f11521e = context;
        this.f11522f = bundle;
        this.f11523t = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        Boolean boolValueOf;
        try {
            Context context = this.f11521e;
            Preconditions.g(context);
            String strA = com.google.android.gms.measurement.internal.zzhu.a(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strA)) {
                strA = com.google.android.gms.measurement.internal.zzhu.a(context);
            }
            int identifier = resources.getIdentifier("google_analytics_force_disable_updates", anrPHlQ.lsfc, strA);
            zzcp zzcpVarAsInterface = null;
            if (identifier == 0) {
                boolValueOf = null;
            } else {
                try {
                    boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                } catch (Resources.NotFoundException unused) {
                    boolValueOf = null;
                }
            }
            zzez zzezVar = this.f11523t;
            boolean z11 = boolValueOf == null || !boolValueOf.booleanValue();
            zzezVar.getClass();
            String str = PQgum.NDhYktg;
            try {
                zzcpVarAsInterface = zzco.asInterface(DynamiteModule.c(context, z11 ? DynamiteModule.f9196c : DynamiteModule.f9195b, str).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.LoadingException e8) {
                zzezVar.g(e8, true, false);
            }
            zzezVar.f11589g = zzcpVarAsInterface;
            if (zzezVar.f11589g == null) {
                return;
            }
            int iA = DynamiteModule.a(context, str);
            int iD = DynamiteModule.d(context, str, false);
            int iMax = Math.max(iA, iD);
            boolean z12 = Boolean.TRUE.equals(boolValueOf) || iD < iA;
            long j11 = iMax;
            zzezVar.f11590h = j11;
            zzdb zzdbVar = new zzdb(161000L, j11, z12, this.f11522f, com.google.android.gms.measurement.internal.zzhu.a(context));
            if (zzezVar.f11590h >= 169) {
                zzcp zzcpVar = zzezVar.f11589g;
                Preconditions.g(zzcpVar);
                zzcpVar.initializeWithElapsedTime(new ObjectWrapper(context), zzdbVar, this.f11560a, this.f11561b);
            } else {
                zzcp zzcpVar2 = zzezVar.f11589g;
                Preconditions.g(zzcpVar2);
                zzcpVar2.initialize(new ObjectWrapper(context), zzdbVar, this.f11560a);
            }
        } catch (Exception e10) {
            this.f11523t.g(e10, true, false);
        }
    }
}

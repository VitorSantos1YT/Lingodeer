package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkx implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f13300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzky f13303e;

    public zzkx(zzky zzkyVar, boolean z11, Uri uri, String str, String str2) {
        this.f13299a = z11;
        this.f13300b = uri;
        this.f13301c = str;
        this.f13302d = str2;
        this.f13303e = zzkyVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a9 A[Catch: RuntimeException -> 0x0085, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0085, blocks: (B:35:0x00a9, B:37:0x00b4, B:40:0x00c1, B:42:0x00c7, B:44:0x00e1, B:46:0x00ea, B:48:0x00f0, B:51:0x0109, B:53:0x0118, B:52:0x0110, B:55:0x012b, B:57:0x0131, B:59:0x0137, B:61:0x013d, B:63:0x0143, B:65:0x014b, B:67:0x0153, B:69:0x0159, B:71:0x016b, B:8:0x0036, B:10:0x003c, B:12:0x0046, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:20:0x0060, B:22:0x0068, B:24:0x0070, B:26:0x0078, B:30:0x008c, B:32:0x009a), top: B:77:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[Catch: RuntimeException -> 0x0085, TryCatch #0 {RuntimeException -> 0x0085, blocks: (B:35:0x00a9, B:37:0x00b4, B:40:0x00c1, B:42:0x00c7, B:44:0x00e1, B:46:0x00ea, B:48:0x00f0, B:51:0x0109, B:53:0x0118, B:52:0x0110, B:55:0x012b, B:57:0x0131, B:59:0x0137, B:61:0x013d, B:63:0x0143, B:65:0x014b, B:67:0x0153, B:69:0x0159, B:71:0x016b, B:8:0x0036, B:10:0x003c, B:12:0x0046, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:20:0x0060, B:22:0x0068, B:24:0x0070, B:26:0x0078, B:30:0x008c, B:32:0x009a), top: B:77:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0 A[Catch: RuntimeException -> 0x0085, TryCatch #0 {RuntimeException -> 0x0085, blocks: (B:35:0x00a9, B:37:0x00b4, B:40:0x00c1, B:42:0x00c7, B:44:0x00e1, B:46:0x00ea, B:48:0x00f0, B:51:0x0109, B:53:0x0118, B:52:0x0110, B:55:0x012b, B:57:0x0131, B:59:0x0137, B:61:0x013d, B:63:0x0143, B:65:0x014b, B:67:0x0153, B:69:0x0159, B:71:0x016b, B:8:0x0036, B:10:0x003c, B:12:0x0046, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:20:0x0060, B:22:0x0068, B:24:0x0070, B:26:0x0078, B:30:0x008c, B:32:0x009a), top: B:77:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0109 A[Catch: RuntimeException -> 0x0085, TryCatch #0 {RuntimeException -> 0x0085, blocks: (B:35:0x00a9, B:37:0x00b4, B:40:0x00c1, B:42:0x00c7, B:44:0x00e1, B:46:0x00ea, B:48:0x00f0, B:51:0x0109, B:53:0x0118, B:52:0x0110, B:55:0x012b, B:57:0x0131, B:59:0x0137, B:61:0x013d, B:63:0x0143, B:65:0x014b, B:67:0x0153, B:69:0x0159, B:71:0x016b, B:8:0x0036, B:10:0x003c, B:12:0x0046, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:20:0x0060, B:22:0x0068, B:24:0x0070, B:26:0x0078, B:30:0x008c, B:32:0x009a), top: B:77:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0110 A[Catch: RuntimeException -> 0x0085, TryCatch #0 {RuntimeException -> 0x0085, blocks: (B:35:0x00a9, B:37:0x00b4, B:40:0x00c1, B:42:0x00c7, B:44:0x00e1, B:46:0x00ea, B:48:0x00f0, B:51:0x0109, B:53:0x0118, B:52:0x0110, B:55:0x012b, B:57:0x0131, B:59:0x0137, B:61:0x013d, B:63:0x0143, B:65:0x014b, B:67:0x0153, B:69:0x0159, B:71:0x016b, B:8:0x0036, B:10:0x003c, B:12:0x0046, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:20:0x0060, B:22:0x0068, B:24:0x0070, B:26:0x0078, B:30:0x008c, B:32:0x009a), top: B:77:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x012b A[Catch: RuntimeException -> 0x0085, TryCatch #0 {RuntimeException -> 0x0085, blocks: (B:35:0x00a9, B:37:0x00b4, B:40:0x00c1, B:42:0x00c7, B:44:0x00e1, B:46:0x00ea, B:48:0x00f0, B:51:0x0109, B:53:0x0118, B:52:0x0110, B:55:0x012b, B:57:0x0131, B:59:0x0137, B:61:0x013d, B:63:0x0143, B:65:0x014b, B:67:0x0153, B:69:0x0159, B:71:0x016b, B:8:0x0036, B:10:0x003c, B:12:0x0046, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:20:0x0060, B:22:0x0068, B:24:0x0070, B:26:0x0078, B:30:0x008c, B:32:0x009a), top: B:77:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0131 A[Catch: RuntimeException -> 0x0085, TryCatch #0 {RuntimeException -> 0x0085, blocks: (B:35:0x00a9, B:37:0x00b4, B:40:0x00c1, B:42:0x00c7, B:44:0x00e1, B:46:0x00ea, B:48:0x00f0, B:51:0x0109, B:53:0x0118, B:52:0x0110, B:55:0x012b, B:57:0x0131, B:59:0x0137, B:61:0x013d, B:63:0x0143, B:65:0x014b, B:67:0x0153, B:69:0x0159, B:71:0x016b, B:8:0x0036, B:10:0x003c, B:12:0x0046, B:14:0x004c, B:16:0x0052, B:18:0x0058, B:20:0x0060, B:22:0x0068, B:24:0x0070, B:26:0x0078, B:30:0x008c, B:32:0x009a), top: B:77:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        zzgu zzguVar;
        Bundle bundleI0;
        boolean z11;
        String str;
        zzgu zzguVar2;
        zzgs zzgsVar;
        Bundle bundleI1;
        zzky zzkyVar = this.f13303e;
        zzlj zzljVar = zzkyVar.f13304a;
        zzljVar.g();
        zzic zzicVar = zzljVar.f13202a;
        zzx zzxVar = zzljVar.f13337q;
        String str2 = this.f13302d;
        Uri uri = this.f13300b;
        try {
            zzpp zzppVar = zzicVar.f13102i;
            zzgu zzguVar3 = zzicVar.f13099f;
            zzic.k(zzppVar);
            String str3 = "Activity created with data 'referrer' without required params";
            if (!TextUtils.isEmpty(str2)) {
                try {
                    if (!str2.contains("gclid")) {
                        zzguVar = zzguVar3;
                        if (!str2.contains("gbraid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid") && !str2.contains("sfmc_id")) {
                            zzgu zzguVar4 = zzppVar.f13202a.f13099f;
                            zzic.m(zzguVar4);
                            zzguVar4.m.a("Activity created with data 'referrer' without required params");
                        }
                        z11 = this.f13299a;
                        str = this.f13301c;
                        if (z11) {
                            zzpp zzppVar2 = zzicVar.f13102i;
                            zzic.k(zzppVar2);
                            bundleI1 = zzppVar2.i0(uri);
                            if (bundleI1 != null) {
                                bundleI1.putString("_cis", "intent");
                                if (bundleI1.containsKey("gclid") && bundleI0 != null && bundleI0.containsKey("gclid")) {
                                    bundleI1.putString("_cer", "gclid=" + bundleI0.getString("gclid"));
                                }
                                zzljVar.n(str, "_cmp", bundleI1);
                                zzxVar.a(str, bundleI1);
                            } else {
                                str3 = "Activity created with data 'referrer' without required params";
                            }
                        } else {
                            str3 = "Activity created with data 'referrer' without required params";
                        }
                        if (TextUtils.isEmpty(str2)) {
                        }
                        zzic.m(zzguVar);
                        zzguVar2 = zzguVar;
                        zzgsVar = zzguVar2.m;
                        zzgsVar.b(str2, "Activity created with referrer");
                        if (zzicVar.f13097d.r(null, zzfy.G0)) {
                            if (bundleI0 != null) {
                                zzljVar.n(str, "_cmp", bundleI0);
                                zzxVar.a(str, bundleI0);
                            } else {
                                zzic.m(zzguVar2);
                                zzgsVar.b(str2, "Referrer does not contain valid parameters");
                            }
                            zzicVar.f13104k.getClass();
                            zzljVar.q("auto", "_ldl", null, true, System.currentTimeMillis());
                        }
                        if (str2.contains("gclid") || !(str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_term") || str2.contains("utm_content"))) {
                            zzic.m(zzguVar2);
                            zzgsVar.a(str3);
                            return;
                        } else {
                            if (TextUtils.isEmpty(str2)) {
                                return;
                            }
                            zzicVar.f13104k.getClass();
                            zzljVar.q("auto", "_ldl", str2, true, System.currentTimeMillis());
                            return;
                        }
                    }
                    zzguVar = zzguVar3;
                    bundleI0 = zzppVar.i0(Uri.parse("https://google.com/search?".concat(str2)));
                    if (bundleI0 != null) {
                        bundleI0.putString("_cis", Constants.REFERRER);
                    }
                    z11 = this.f13299a;
                    str = this.f13301c;
                    if (z11) {
                        zzpp zzppVar3 = zzicVar.f13102i;
                        zzic.k(zzppVar3);
                        bundleI1 = zzppVar3.i0(uri);
                        if (bundleI1 != null) {
                            bundleI1.putString("_cis", "intent");
                            if (bundleI1.containsKey("gclid")) {
                            }
                            zzljVar.n(str, "_cmp", bundleI1);
                            zzxVar.a(str, bundleI1);
                        } else {
                            str3 = "Activity created with data 'referrer' without required params";
                        }
                    } else {
                        str3 = "Activity created with data 'referrer' without required params";
                    }
                    if (TextUtils.isEmpty(str2)) {
                        zzic.m(zzguVar);
                        zzguVar2 = zzguVar;
                        zzgsVar = zzguVar2.m;
                        zzgsVar.b(str2, "Activity created with referrer");
                        if (zzicVar.f13097d.r(null, zzfy.G0)) {
                            if (str2.contains("gclid")) {
                            }
                            zzic.m(zzguVar2);
                            zzgsVar.a(str3);
                            return;
                        }
                        if (bundleI0 != null) {
                            zzljVar.n(str, "_cmp", bundleI0);
                            zzxVar.a(str, bundleI0);
                        } else {
                            zzic.m(zzguVar2);
                            zzgsVar.b(str2, "Referrer does not contain valid parameters");
                        }
                        zzicVar.f13104k.getClass();
                        zzljVar.q("auto", "_ldl", null, true, System.currentTimeMillis());
                    }
                } catch (RuntimeException e8) {
                    e = e8;
                    zzgu zzguVar5 = zzkyVar.f13304a.f13202a.f13099f;
                    zzic.m(zzguVar5);
                    zzguVar5.f12942f.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
            }
            zzguVar = zzguVar3;
            bundleI0 = null;
            z11 = this.f13299a;
            str = this.f13301c;
            if (z11) {
                zzpp zzppVar4 = zzicVar.f13102i;
                zzic.k(zzppVar4);
                bundleI1 = zzppVar4.i0(uri);
                if (bundleI1 != null) {
                    bundleI1.putString("_cis", "intent");
                    if (bundleI1.containsKey("gclid")) {
                    }
                    zzljVar.n(str, "_cmp", bundleI1);
                    zzxVar.a(str, bundleI1);
                } else {
                    str3 = "Activity created with data 'referrer' without required params";
                }
            } else {
                str3 = "Activity created with data 'referrer' without required params";
            }
            if (TextUtils.isEmpty(str2)) {
                zzic.m(zzguVar);
                zzguVar2 = zzguVar;
                zzgsVar = zzguVar2.m;
                zzgsVar.b(str2, "Activity created with referrer");
                if (zzicVar.f13097d.r(null, zzfy.G0)) {
                    if (str2.contains("gclid")) {
                    }
                    zzic.m(zzguVar2);
                    zzgsVar.a(str3);
                    return;
                }
                if (bundleI0 != null) {
                    zzljVar.n(str, "_cmp", bundleI0);
                    zzxVar.a(str, bundleI0);
                } else {
                    zzic.m(zzguVar2);
                    zzgsVar.b(str2, "Referrer does not contain valid parameters");
                }
                zzicVar.f13104k.getClass();
                zzljVar.q("auto", "_ldl", null, true, System.currentTimeMillis());
            }
        } catch (RuntimeException e10) {
            e = e10;
        }
    }
}

package com.google.android.gms.measurement.internal;

import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzox implements zzgw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzpj f13572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzpg f13573c;

    public zzox(zzpg zzpgVar, String str, zzpj zzpjVar) {
        this.f13571a = str;
        this.f13572b = zzpjVar;
        this.f13573c = zzpgVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026 A[Catch: all -> 0x0016, TRY_ENTER, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0013, B:20:0x005f, B:23:0x0083, B:14:0x0026, B:16:0x004c, B:18:0x0057, B:19:0x005b), top: B:28:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x004c A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0013, B:20:0x005f, B:23:0x0083, B:14:0x0026, B:16:0x004c, B:18:0x0057, B:19:0x005b), top: B:28:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0013, B:20:0x005f, B:23:0x0083, B:14:0x0026, B:16:0x004c, B:18:0x0057, B:19:0x005b), top: B:28:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x005b A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0013, B:20:0x005f, B:23:0x0083, B:14:0x0026, B:16:0x004c, B:18:0x0057, B:19:0x005b), top: B:28:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[Catch: all -> 0x0016, PHI: r7
      0x005f: PHI (r7v8 int) = (r7v2 int), (r7v0 int) binds: [B:13:0x0024, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0013, B:20:0x005f, B:23:0x0083, B:14:0x0026, B:16:0x004c, B:18:0x0057, B:19:0x005b), top: B:28:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.measurement.internal.zzgw
    public final void a(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        zzgz zzgzVar;
        zzaw zzawVar;
        String strSubstring;
        Object obj;
        long j11 = this.f13572b.f13622a;
        zzpg zzpgVar = this.f13573c;
        zzpgVar.e().g();
        zzpgVar.m0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                zzpgVar.f13614u = false;
                zzpgVar.O();
            }
        }
        String str2 = this.f13571a;
        if (i11 == 200) {
            if (th2 == null) {
                zzaw zzawVar2 = zzpgVar.f13597c;
                zzpg.U(zzawVar2);
                zzawVar2.n(Long.valueOf(j11));
                zzpgVar.b().f12949n.c(str2, Integer.valueOf(i11), "Successfully uploaded batch from upload queue. appId, status");
                zzgzVar = zzpgVar.f13596b;
                zzpg.U(zzgzVar);
                if (zzgzVar.k()) {
                    zzawVar = zzpgVar.f13597c;
                    zzpg.U(zzawVar);
                    if (zzawVar.m(str2)) {
                        zzpgVar.t(str2);
                    } else {
                        zzpgVar.N();
                    }
                } else {
                    zzpgVar.N();
                }
            } else {
                String str3 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str3.substring(0, Math.min(32, str3.length()));
                zzgs zzgsVar = zzpgVar.b().f12947k;
                Integer numValueOf = Integer.valueOf(i11);
                obj = th2;
                if (th2 == null) {
                    obj = strSubstring;
                }
                zzgsVar.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                zzaw zzawVar3 = zzpgVar.f13597c;
                zzpg.U(zzawVar3);
                zzawVar3.s(Long.valueOf(j11));
                zzpgVar.N();
            }
        } else if (i11 == 204) {
            i11 = 204;
            if (th2 == null) {
                zzaw zzawVar4 = zzpgVar.f13597c;
                zzpg.U(zzawVar4);
                zzawVar4.n(Long.valueOf(j11));
                zzpgVar.b().f12949n.c(str2, Integer.valueOf(i11), "Successfully uploaded batch from upload queue. appId, status");
                zzgzVar = zzpgVar.f13596b;
                zzpg.U(zzgzVar);
                if (zzgzVar.k()) {
                    zzawVar = zzpgVar.f13597c;
                    zzpg.U(zzawVar);
                    if (zzawVar.m(str2)) {
                        zzpgVar.t(str2);
                    } else {
                        zzpgVar.N();
                    }
                } else {
                    zzpgVar.N();
                }
            } else {
                String str4 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str4.substring(0, Math.min(32, str4.length()));
                zzgs zzgsVar2 = zzpgVar.b().f12947k;
                Integer numValueOf2 = Integer.valueOf(i11);
                obj = th2;
                if (th2 == null) {
                    obj = strSubstring;
                }
                zzgsVar2.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                zzaw zzawVar5 = zzpgVar.f13597c;
                zzpg.U(zzawVar5);
                zzawVar5.s(Long.valueOf(j11));
                zzpgVar.N();
            }
        } else {
            String str5 = new String(bArr, StandardCharsets.UTF_8);
            strSubstring = str5.substring(0, Math.min(32, str5.length()));
            zzgs zzgsVar3 = zzpgVar.b().f12947k;
            Integer numValueOf3 = Integer.valueOf(i11);
            obj = th2;
            if (th2 == null) {
                obj = strSubstring;
            }
            zzgsVar3.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
            zzaw zzawVar6 = zzpgVar.f13597c;
            zzpg.U(zzawVar6);
            zzawVar6.s(Long.valueOf(j11));
            zzpgVar.N();
        }
    }
}

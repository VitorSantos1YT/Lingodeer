package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzanh extends zzanf<zzani, zzani> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final /* synthetic */ int a(Object obj) {
        return ((zzani) obj).a();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final /* synthetic */ zzani b() {
        return zzani.e();
    }

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
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final zzani c(Object obj, Object obj2) {
        zzani zzaniVar = (zzani) obj;
        zzani zzaniVar2 = (zzani) obj2;
        zzani zzaniVar3 = zzani.f10217f;
        if (zzaniVar3.equals(zzaniVar2)) {
            return zzaniVar;
        }
        if (zzaniVar3.equals(zzaniVar)) {
            int i11 = zzaniVar.f10218a + zzaniVar2.f10218a;
            int[] iArrCopyOf = Arrays.copyOf(zzaniVar.f10219b, i11);
            System.arraycopy(zzaniVar2.f10219b, 0, iArrCopyOf, zzaniVar.f10218a, zzaniVar2.f10218a);
            Object[] objArrCopyOf = Arrays.copyOf(zzaniVar.f10220c, i11);
            System.arraycopy(zzaniVar2.f10220c, 0, objArrCopyOf, zzaniVar.f10218a, zzaniVar2.f10218a);
            return new zzani(i11, iArrCopyOf, objArrCopyOf, true);
        }
        zzaniVar.getClass();
        if (zzaniVar2.equals(zzaniVar3)) {
            return zzaniVar;
        }
        if (!zzaniVar.f10222e) {
            throw new UnsupportedOperationException();
        }
        int i12 = zzaniVar.f10218a + zzaniVar2.f10218a;
        zzaniVar.b(i12);
        System.arraycopy(zzaniVar2.f10219b, 0, zzaniVar.f10219b, zzaniVar.f10218a, zzaniVar2.f10218a);
        System.arraycopy(zzaniVar2.f10220c, 0, zzaniVar.f10220c, zzaniVar.f10218a, zzaniVar2.f10218a);
        zzaniVar.f10218a = i12;
        return zzaniVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final /* synthetic */ void d(int i11, int i12, Object obj) {
        ((zzani) obj).c((i11 << 3) | 5, Integer.valueOf(i12));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final /* synthetic */ void e(long j11, Object obj, int i11) {
        ((zzani) obj).c((i11 << 3) | 1, Long.valueOf(j11));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final /* synthetic */ void f(Object obj, int i11, zzaje zzajeVar) {
        ((zzani) obj).c((i11 << 3) | 2, zzajeVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final /* synthetic */ void g(Object obj, int i11, Object obj2) {
        ((zzani) obj).c((i11 << 3) | 3, (zzani) obj2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void h(Object obj, zzake zzakeVar) {
        zzani zzaniVar = (zzani) obj;
        zzaniVar.getClass();
        for (int i11 = 0; i11 < zzaniVar.f10218a; i11++) {
            int i12 = zzaniVar.f10219b[i11] >>> 3;
            Object obj2 = zzaniVar.f10220c[i11];
            zzakb zzakbVar = zzakeVar.f10111a;
            if (obj2 instanceof zzaje) {
                zzakbVar.o(i12, (zzaje) obj2);
            } else {
                zzakbVar.h(i12, (zzaly) obj2);
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final int j(Object obj) {
        zzani zzaniVar = (zzani) obj;
        int i11 = zzaniVar.f10221d;
        if (i11 != -1) {
            return i11;
        }
        int iQ = 0;
        for (int i12 = 0; i12 < zzaniVar.f10218a; i12++) {
            int i13 = zzaniVar.f10219b[i12] >>> 3;
            iQ += zzakb.q(3, (zzaje) zzaniVar.f10220c[i12]) + zzakb.v(2, i13) + (zzakb.x(8) << 1);
        }
        zzaniVar.f10221d = iQ;
        return iQ;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final /* synthetic */ void k(long j11, Object obj, int i11) {
        ((zzani) obj).c(i11 << 3, Long.valueOf(j11));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final /* synthetic */ void l(Object obj, zzake zzakeVar) {
        ((zzani) obj).d(zzakeVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void m(Object obj, Object obj2) {
        ((zzaku) obj).zzb = (zzani) obj2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final zzani n(Object obj) {
        zzaku zzakuVar = (zzaku) obj;
        zzani zzaniVar = zzakuVar.zzb;
        if (zzaniVar != zzani.f10217f) {
            return zzaniVar;
        }
        zzani zzaniVarE = zzani.e();
        zzakuVar.zzb = zzaniVarE;
        return zzaniVarE;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void o(Object obj, Object obj2) {
        ((zzaku) obj).zzb = (zzani) obj2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final /* synthetic */ zzani p(Object obj) {
        return ((zzaku) obj).zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final zzani q(Object obj) {
        zzani zzaniVar = (zzani) obj;
        if (zzaniVar.f10222e) {
            zzaniVar.f10222e = false;
        }
        return zzaniVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void r(Object obj) {
        zzani zzaniVar = ((zzaku) obj).zzb;
        if (zzaniVar.f10222e) {
            zzaniVar.f10222e = false;
        }
    }
}

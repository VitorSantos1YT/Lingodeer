package com.google.firebase.auth;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaby;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.zzbq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzab extends zzbq<AuthResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f18048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f18049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f18050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f18051f;

    public zzab(FirebaseAuth firebaseAuth, String str, boolean z11, FirebaseUser firebaseUser, String str2, String str3) {
        this.f18046a = str;
        this.f18047b = z11;
        this.f18048c = firebaseUser;
        this.f18049d = str2;
        this.f18050e = str3;
        this.f18051f = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzch] */
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
    @Override // com.google.firebase.auth.internal.zzbq
    public final Task b(String str) {
        TextUtils.isEmpty(str);
        boolean z11 = this.f18047b;
        FirebaseAuth firebaseAuth = this.f18051f;
        if (!z11) {
            return firebaseAuth.f17882e.m(firebaseAuth.f17878a, this.f18046a, this.f18049d, this.f18050e, str, new FirebaseAuth.zzb(firebaseAuth));
        }
        zzaby zzabyVar = firebaseAuth.f17882e;
        FirebaseApp firebaseApp = firebaseAuth.f17878a;
        FirebaseUser firebaseUser = this.f18048c;
        Preconditions.g(firebaseUser);
        return zzabyVar.l(firebaseApp, firebaseUser, this.f18046a, this.f18049d, this.f18050e, str, new FirebaseAuth.zza(firebaseAuth));
    }
}

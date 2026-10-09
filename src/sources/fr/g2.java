package fr;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3 f27534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f27535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f27536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f27537f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f27538t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(String str, i3 i3Var, kotlin.jvm.internal.u uVar, List list, String str2, ArrayList arrayList, vy.d dVar) {
        super(2, dVar);
        this.f27533b = str;
        this.f27534c = i3Var;
        this.f27535d = uVar;
        this.f27536e = list;
        this.f27537f = str2;
        this.f27538t = arrayList;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        g2 g2Var = new g2(this.f27533b, this.f27534c, this.f27535d, this.f27536e, this.f27537f, this.f27538t, dVar);
        g2Var.f27532a = obj;
        return g2Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        rz.b0 b0Var = (rz.b0) this.f27532a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        String str = this.f27533b;
        i3 i3Var = this.f27534c;
        kotlin.jvm.internal.u uVar = this.f27535d;
        rz.e0.B(b0Var, null, null, new b0.f(str, i3Var, uVar, this.f27536e, (vy.d) null, 20), 3);
        rz.e0.B(b0Var, null, null, new c((Object) i3Var, (Object) uVar, false, (vy.d) null, 3), 3);
        return rz.e0.B(b0Var, null, null, new b0.f(this.f27537f, i3Var, uVar, this.f27538t, (vy.d) null, 21), 3);
    }
}

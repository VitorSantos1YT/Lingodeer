package fr;

import com.lingodeer.data.model.KnowledgeNote;
import com.lingodeer.data.model.KnowledgeNoteKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f27788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f27789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(x0 x0Var, List list, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27786a = i11;
        this.f27788c = x0Var;
        this.f27789d = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27786a) {
            case 0:
                return new q0(this.f27788c, this.f27789d, dVar, 0);
            case 1:
                return new q0(this.f27788c, this.f27789d, dVar, 1);
            default:
                return new q0(this.f27788c, this.f27789d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27786a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((q0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27786a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27787b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.o0 o0Var = this.f27788c.f27960a;
                    this.f27787b = 1;
                    StringBuilder sbN = ep.a.n("UPDATE knowledge_note SET pending_update = 0 WHERE id IN (");
                    List list = this.f27789d;
                    ew.a.i(list.size(), sbN);
                    sbN.append(")");
                    String string = sbN.toString();
                    kotlin.jvm.internal.m.e(string, "toString(...)");
                    Object objC = cf.x.C(this, o0Var.f3055a, false, true, new au.n(1, string, list));
                    if (objC != aVar) {
                        objC = b0Var;
                    }
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27787b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.o0 o0Var2 = this.f27788c.f27960a;
                    this.f27787b = 1;
                    StringBuilder sbN2 = ep.a.n(tcppUUQxZjFdy.xjOOmcUCybg);
                    List list2 = this.f27789d;
                    ew.a.i(list2.size(), sbN2);
                    sbN2.append(") AND is_deleted = 1");
                    String string2 = sbN2.toString();
                    kotlin.jvm.internal.m.e(string2, "toString(...)");
                    Object objC2 = cf.x.C(this, o0Var2.f3055a, false, true, new au.n(2, string2, list2));
                    if (objC2 != aVar2) {
                        objC2 = b0Var2;
                    }
                    if (objC2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var2;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f27787b;
                qy.b0 b0Var3 = qy.b0.f48488a;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.o0 o0Var3 = this.f27788c.f27960a;
                    List list3 = this.f27789d;
                    ArrayList arrayList = new ArrayList(ry.n.W(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(KnowledgeNoteKt.asEntityModel((KnowledgeNote) it.next()));
                    }
                    this.f27787b = 1;
                    Object objC3 = cf.x.C(this, o0Var3.f3055a, false, true, new au.b(15, o0Var3, arrayList));
                    if (objC3 != wy.a.COROUTINE_SUSPENDED) {
                        objC3 = b0Var3;
                    }
                    if (objC3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var3;
        }
    }
}

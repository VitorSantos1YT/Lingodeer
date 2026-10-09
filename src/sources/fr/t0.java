package fr;

import com.lingodeer.data.model.KnowledgeNoteKt;
import com.lingodeer.database.model.KnowledgeNoteEntity;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f27847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27848d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(x0 x0Var, String str, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27845a = i11;
        this.f27847c = x0Var;
        this.f27848d = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27845a) {
            case 0:
                return new t0(this.f27847c, this.f27848d, dVar, 0);
            default:
                return new t0(this.f27847c, this.f27848d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27845a) {
            case 0:
                break;
        }
        return ((t0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [wy.a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27845a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27846b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.o0 o0Var = this.f27847c.f27960a;
                    this.f27846b = 1;
                    obj = cf.x.C(this, o0Var.f3055a, true, false, new au.f(this.f27848d, 12));
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                KnowledgeNoteEntity knowledgeNoteEntity = (KnowledgeNoteEntity) obj;
                if (knowledgeNoteEntity != null) {
                    return KnowledgeNoteKt.asExternalModel(knowledgeNoteEntity);
                }
                return null;
            default:
                Object arrayList = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27846b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.o0 o0Var2 = this.f27847c.f27960a;
                    this.f27846b = 1;
                    obj = cf.x.C(this, o0Var2.f3055a, true, false, new au.f(this.f27848d, 11));
                    if (obj != arrayList) {
                    }
                    return arrayList;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                Iterable iterable = (Iterable) obj;
                arrayList = new ArrayList(ry.n.W(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(KnowledgeNoteKt.asExternalModel((KnowledgeNoteEntity) it.next()));
                }
                return arrayList;
        }
    }
}

package fr;

import com.lingodeer.database.model.KnowledgeNoteEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements vt.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au.o0 f27960a;

    public x0(au.o0 o0Var) {
        this.f27960a = o0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(x0 x0Var, String str, xy.c cVar) {
        v0 v0Var;
        long j11;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i11 = v0Var.f27909d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                v0Var.f27909d = i11 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(x0Var, cVar);
            }
        } else {
            v0Var = new v0(x0Var, cVar);
        }
        Object objC = v0Var.f27907b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = v0Var.f27909d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objC);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            au.o0 o0Var = x0Var.f27960a;
            v0Var.f27906a = jCurrentTimeMillis;
            v0Var.f27909d = 1;
            objC = cf.x.C(v0Var, o0Var.f3055a, true, false, new au.f(str, 12));
            if (objC == aVar) {
                return aVar;
            }
            j11 = jCurrentTimeMillis;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = v0Var.f27906a;
            com.bumptech.glide.e.F(objC);
        }
        KnowledgeNoteEntity knowledgeNoteEntity = (KnowledgeNoteEntity) objC;
        return new Long(Math.max(j11, (knowledgeNoteEntity != null ? knowledgeNoteEntity.getUpdatedAt() : 0L) + 1));
    }

    public final bh.i0 b(String languageCode) {
        kotlin.jvm.internal.m.f(languageCode, "languageCode");
        return new bh.i0(qx.p.l(this.f27960a.f3055a, new String[]{"knowledge_note"}, new au.f(languageCode, 10)), 7);
    }

    public final bh.i0 c(String id2) {
        kotlin.jvm.internal.m.f(id2, "id");
        return new bh.i0(qx.p.l(this.f27960a.f3055a, new String[]{"knowledge_note"}, new au.f(id2, 9)), 8);
    }

    public final Object d(String str, String str2, long j11, String str3, xy.i iVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new w0(str3, str, str2, j11, this, null), iVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }
}

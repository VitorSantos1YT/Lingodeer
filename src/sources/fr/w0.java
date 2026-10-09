package fr;

import com.lingodeer.data.model.KnowledgeNote;
import com.lingodeer.data.model.KnowledgeNoteKt;
import com.lingodeer.database.model.KnowledgeNoteEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends xy.i implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27934a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f27937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f27938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27939f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f27940t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(long j11, b0.d dVar, b0.d dVar2, b0.d dVar3, ys.l3 l3Var, l1.b1 b1Var, vy.d dVar4) {
        super(2, dVar4);
        this.f27936c = j11;
        this.f27938e = dVar;
        this.f27939f = dVar2;
        this.f27940t = dVar3;
        this.H = l3Var;
        this.K = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27934a) {
            case 0:
                return new w0((String) this.f27939f, (String) this.f27940t, (String) this.H, this.f27936c, (x0) this.K, dVar);
            default:
                w0 w0Var = new w0(this.f27936c, (b0.d) this.f27938e, (b0.d) this.f27939f, (b0.d) this.f27940t, (ys.l3) this.H, (l1.b1) this.K, dVar);
                w0Var.f27937d = obj;
                return w0Var;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27934a) {
            case 0:
                break;
        }
        return ((w0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        String str;
        String str2;
        switch (this.f27934a) {
            case 0:
                String str3 = (String) this.f27940t;
                x0 x0Var = (x0) this.K;
                au.o0 o0Var = x0Var.f27960a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27935b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        String str4 = (String) this.f27938e;
                        String str5 = (String) this.f27937d;
                        com.bumptech.glide.e.F(obj);
                        str = str5;
                        str2 = str4;
                        objA = obj;
                    } else {
                        if (i11 != 2 && i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                String string = oz.q.i1((String) this.f27939f).toString();
                String strH = com.bumptech.glide.g.h(this.f27936c, str3, (String) this.H);
                this.f27937d = string;
                this.f27938e = strH;
                this.f27935b = 1;
                objA = x0.a(x0Var, strH, this);
                if (objA == aVar) {
                    return aVar;
                }
                str = string;
                str2 = strH;
                long jLongValue = ((Number) objA).longValue();
                if (oz.q.K0(str)) {
                    KnowledgeNoteEntity knowledgeNoteEntityAsEntityModel = KnowledgeNoteKt.asEntityModel(new KnowledgeNote(str2, str3, (String) this.H, this.f27936c, BuildConfig.VERSION_NAME, jLongValue, true, true));
                    this.f27937d = null;
                    this.f27938e = null;
                    this.f27935b = 2;
                    Object objC = cf.x.C(this, o0Var.f3055a, false, true, new au.b(16, o0Var, knowledgeNoteEntityAsEntityModel));
                    if (objC != aVar) {
                        objC = b0Var;
                    }
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    KnowledgeNoteEntity knowledgeNoteEntityAsEntityModel2 = KnowledgeNoteKt.asEntityModel(new KnowledgeNote(str2, str3, (String) this.H, this.f27936c, str, jLongValue, false, true));
                    this.f27937d = null;
                    this.f27938e = null;
                    this.f27935b = 3;
                    Object objC2 = cf.x.C(this, o0Var.f3055a, false, true, new au.b(16, o0Var, knowledgeNoteEntityAsEntityModel2));
                    if (objC2 != aVar) {
                        objC2 = b0Var;
                    }
                    if (objC2 == aVar) {
                        return aVar;
                    }
                }
                return b0Var;
            default:
                rz.b0 b0Var2 = (rz.b0) this.f27937d;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27935b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f27937d = b0Var2;
                    this.f27935b = 1;
                    if (rz.e0.m(this.f27936c, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                vy.d dVar = null;
                rz.e0.B(b0Var2, null, null, new bt.f0((b0.d) this.f27938e, dVar, 4), 3);
                rz.e0.B(b0Var2, null, null, new bt.f0((b0.d) this.f27939f, dVar, 5), 3);
                rz.e0.B(b0Var2, null, null, new xg.b(5, (b0.d) this.f27940t, (ys.l3) this.H, dVar), 3);
                ((l1.b1) this.K).setValue(Boolean.TRUE);
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(String str, String str2, String str3, long j11, x0 x0Var, vy.d dVar) {
        super(2, dVar);
        this.f27939f = str;
        this.f27940t = str2;
        this.H = str3;
        this.f27936c = j11;
        this.K = x0Var;
    }
}

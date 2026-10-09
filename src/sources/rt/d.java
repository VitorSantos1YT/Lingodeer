package rt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f49597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t7 f49598d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(j jVar, t7 t7Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f49595a = i11;
        this.f49597c = jVar;
        this.f49598d = t7Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f49595a) {
            case 0:
                return new d(this.f49598d, this.f49597c, dVar);
            case 1:
                return new d(this.f49597c, this.f49598d, dVar, 1);
            case 2:
                return new d(this.f49597c, this.f49598d, dVar, 2);
            case 3:
                return new d(this.f49597c, this.f49598d, dVar, 3);
            default:
                return new d(this.f49597c, this.f49598d, dVar, 4);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f49595a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((d) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        String str;
        d dVar;
        Object objD;
        vt.y yVar;
        Object obj2;
        switch (this.f49595a) {
            case 0:
                j jVar = this.f49597c;
                uz.i1 i1Var = jVar.U;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f49596b;
                t7 t7Var = this.f49598d;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    uz.i1 i1Var2 = jVar.T;
                    i1Var2.getClass();
                    i1Var2.l(null, j0.f49902a);
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                Long lC = w8.c(((f7) t7Var).f49740a);
                if (!((Set) i1Var.getValue()).contains(lC)) {
                    do {
                        value = i1Var.getValue();
                    } while (!i1Var.j(value, qx.b.E((Set) value, lC)));
                    long jLongValue = lC.longValue();
                    this.f49596b = 1;
                    if (jVar.h(jLongValue, true, this) == aVar) {
                        return aVar;
                    }
                }
                vt.h hVar = jVar.f49901t;
                if (hVar != null) {
                    f7 f7Var = (f7) t7Var;
                    String str2 = f7Var.f49741b;
                    List listD = jVar.d(ns.o.K(f7Var.f49740a));
                    this.f49596b = 2;
                    if (((vt.r) hVar).c(str2, listD, this) == aVar) {
                        return aVar;
                    }
                }
                uz.i1 i1Var3 = jVar.T;
                i1Var3.getClass();
                i1Var3.l(null, j0.f49902a);
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f49596b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    jr.i0 i0Var = this.f49597c.M;
                    WordSentenceCharacterType wordSentenceCharacterType = ((k7) this.f49598d).f49976a;
                    this.f49596b = 1;
                    if (i0Var.invoke(wordSentenceCharacterType, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f49596b;
                qy.b0 b0Var = qy.b0.f48488a;
                j jVar2 = this.f49597c;
                if (i13 != 0) {
                    if (i13 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                WordSentenceCharacterType wordSentenceCharacterType2 = ((s7) this.f49598d).f50379a;
                this.f49596b = 1;
                obj = j.a(jVar2, wordSentenceCharacterType2, this);
                if (obj == aVar3) {
                    return aVar3;
                }
                if (((Boolean) obj).booleanValue()) {
                    vt.c cVar = jVar2.f49896c;
                    this.f49596b = 2;
                    ((vt.d) cVar).j(this);
                    if (b0Var == aVar3) {
                        return aVar3;
                    }
                }
                return b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f49596b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                j jVar3 = this.f49597c;
                if (i14 != 0) {
                    if (i14 == 1) {
                        com.bumptech.glide.e.F(obj);
                        dVar = this;
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj);
                n7 n7Var = (n7) this.f49598d;
                WordSentenceCharacterType wordSentenceCharacterType3 = n7Var.f50133a;
                String str3 = n7Var.f50134b;
                this.f49596b = 1;
                vt.p0 p0Var = jVar3.H;
                if (p0Var == null || (str = jVar3.L) == null) {
                    dVar = this;
                } else {
                    dVar = this;
                    objD = ((fr.x0) p0Var).d(xt.d.k(((fr.o0) jVar3.f49899e).f27733a.keyLanguage), str, w8.c(wordSentenceCharacterType3).longValue(), str3, dVar);
                    if (objD != aVar4) {
                    }
                    if (objD == aVar4) {
                        return aVar4;
                    }
                }
                objD = b0Var2;
                if (objD == aVar4) {
                    return aVar4;
                }
                vt.c cVar2 = jVar3.f49896c;
                dVar.f49596b = 2;
                ((vt.d) cVar2).j(this);
                if (b0Var2 == aVar4) {
                    return aVar4;
                }
                return b0Var2;
            default:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f49596b;
                vt.w wVar = vt.w.f54292a;
                j jVar4 = this.f49597c;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.h hVar2 = jVar4.f49901t;
                    if (hVar2 != null) {
                        String str4 = jVar4.f49893a0;
                        String str5 = jVar4.K;
                        if (str5 == null) {
                            str5 = BuildConfig.VERSION_NAME;
                        }
                        String str6 = ((d7) this.f49598d).f49625a;
                        this.f49596b = 1;
                        obj = ((vt.r) hVar2).b(str4, str5, str6, this);
                        if (obj == aVar5) {
                            return aVar5;
                        }
                    } else {
                        yVar = wVar;
                    }
                    uz.i1 i1Var4 = jVar4.T;
                    if (yVar instanceof vt.x) {
                        obj2 = j0.f49902a;
                    } else if (yVar.equals(vt.u.f54290a)) {
                        obj2 = g0.f49771a;
                    } else if (yVar.equals(vt.v.f54291a)) {
                        obj2 = h0.f49807a;
                    } else if (yVar.equals(vt.t.f54286a)) {
                        obj2 = f0.f49708a;
                    } else {
                        if (yVar.equals(wVar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = i0.f49858a;
                    }
                    i1Var4.getClass();
                    i1Var4.l(null, obj2);
                    return qy.b0.f48488a;
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                yVar = (vt.y) obj;
                if (yVar == null) {
                    yVar = wVar;
                }
                uz.i1 i1Var5 = jVar4.T;
                if (yVar instanceof vt.x) {
                    obj2 = j0.f49902a;
                } else if (yVar.equals(vt.u.f54290a)) {
                    obj2 = g0.f49771a;
                } else if (yVar.equals(vt.v.f54291a)) {
                    obj2 = h0.f49807a;
                } else if (yVar.equals(vt.t.f54286a)) {
                    obj2 = f0.f49708a;
                } else {
                    if (yVar.equals(wVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = i0.f49858a;
                }
                i1Var5.getClass();
                i1Var5.l(null, obj2);
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t7 t7Var, j jVar, vy.d dVar) {
        super(2, dVar);
        this.f49595a = 0;
        this.f49598d = t7Var;
        this.f49597c = jVar;
    }
}

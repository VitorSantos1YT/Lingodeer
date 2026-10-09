package bh;

import b0.k2;
import com.lingo.lingoskill.object.ConvertUtilsKt;
import com.lingo.lingoskill.object.Word;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f4165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f4166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(s1 s1Var, Set set, vy.d dVar) {
        super(2, dVar);
        this.f4163a = 0;
        this.f4166d = s1Var;
        this.f4165c = set;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4163a) {
            case 0:
                return new b1(this.f4166d, this.f4165c, dVar);
            case 1:
                return new b1(this.f4165c, this.f4166d, dVar, 1);
            default:
                return new b1(this.f4165c, this.f4166d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4163a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((b1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [wy.a] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Collection, java.util.LinkedHashSet] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        qy.l lVar;
        switch (this.f4163a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f4164b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.bumptech.glide.e.F(obj);
                        return (Map) obj;
                    }
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return (Map) obj;
                }
                com.bumptech.glide.e.F(obj);
                s1 s1Var = this.f4166d;
                boolean zD = ry.l.D(new Integer[]{11, 0}, Integer.valueOf(((fr.o0) s1Var.f4362c).f27733a.keyLanguage));
                Set set = this.f4165c;
                if (zD) {
                    this.f4164b = 1;
                    obj = s1.a(s1Var, set, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    return (Map) obj;
                }
                this.f4164b = 2;
                obj = s1.b(s1Var, set, this);
                if (obj == aVar) {
                    return aVar;
                }
                return (Map) obj;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f4164b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Set set2 = this.f4165c;
                    n1 n1Var = new n1(this.f4166d, null);
                    this.f4164b = 1;
                    obj = vc.a.t(set2, n1Var, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Word word : (Iterable) obj) {
                    try {
                        lVar = new qy.l(new Long(word.getWordId()), ConvertUtilsKt.toWordItem(word));
                    } catch (CancellationException e8) {
                        throw e8;
                    } catch (Exception unused) {
                        lVar = null;
                    }
                    if (lVar != null) {
                        arrayList.add(lVar);
                    }
                    break;
                }
                return ry.x.g0(arrayList);
            default:
                Object linkedHashSet = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f4164b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Set set3 = this.f4165c;
                    r1 r1Var = new r1(this.f4166d, null);
                    this.f4164b = 1;
                    obj = vc.a.t(set3, r1Var, this);
                    if (obj != linkedHashSet) {
                    }
                    return linkedHashSet;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                nz.i iVarR = nz.n.R(ry.m.g0((Iterable) obj), new k2(19));
                linkedHashSet = new LinkedHashSet();
                nz.g gVar = new nz.g(iVarR);
                while (gVar.hasNext()) {
                    linkedHashSet.add(new Long(((Word) gVar.next()).getWordId()));
                }
                return linkedHashSet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Set set, s1 s1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4163a = i11;
        this.f4165c = set;
        this.f4166d = s1Var;
    }
}

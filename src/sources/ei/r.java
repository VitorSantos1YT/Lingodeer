package ei;

import android.content.Context;
import com.lingo.lingoskill.object.ARChar;
import e6.k1;
import java.util.Iterator;
import java.util.List;
import l1.a2;
import l1.b1;
import l1.b3;
import l1.d2;
import rz.b0;
import rz.e0;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends xy.i implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25653a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f25655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25658f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f25659t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e6.l lVar, d2 d2Var, kotlin.jvm.internal.x xVar, i1 i1Var, Context context, k1 k1Var, m6.w wVar, m6.u uVar, b0 b0Var, vy.d dVar) {
        super(2, dVar);
        this.f25656d = lVar;
        this.f25657e = d2Var;
        this.f25658f = xVar;
        this.f25659t = i1Var;
        this.H = context;
        this.K = k1Var;
        this.L = wVar;
        this.M = uVar;
        this.N = b0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f25653a) {
            case 0:
                return new r((o0.b) this.f25656d, (dn.d) this.f25657e, (b1) this.f25658f, (b3) this.M, (b1) this.f25659t, (b1) this.H, (b1) this.K, (b1) this.L, (gi.d) this.N, dVar);
            default:
                r rVar = new r((e6.l) this.f25656d, (d2) this.f25657e, (kotlin.jvm.internal.x) this.f25658f, (i1) this.f25659t, (Context) this.H, (k1) this.K, (m6.w) this.L, (m6.u) this.M, (b0) this.N, dVar);
                rVar.f25655c = obj;
                return rVar;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25653a) {
            case 0:
                return ((r) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((r) create((a2) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i11;
        qy.b0 b0Var;
        int i12;
        ARChar aRChar;
        Object objB;
        switch (this.f25653a) {
            case 0:
                b1 b1Var = (b1) this.L;
                b1 b1Var2 = (b1) this.K;
                b1 b1Var3 = (b1) this.H;
                b1 b1Var4 = (b1) this.f25659t;
                dn.d dVar = (dn.d) this.f25657e;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f25654b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                int i14 = 1;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (((o0.b) this.f25656d).k() == 0) {
                        List list = (List) ((b1) this.f25658f).getValue();
                        ARChar aRChar2 = ((gi.a) ((b3) this.M).getValue()).f29243a;
                        if (list != null && !list.isEmpty() && aRChar2 != null) {
                            Iterator it = list.iterator();
                            int i15 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    ARChar aRChar3 = (ARChar) it.next();
                                    i11 = i14;
                                    if (!kotlin.jvm.internal.m.a(aRChar3.getCharacter(), aRChar2.getCharacter()) || !kotlin.jvm.internal.m.a(aRChar3.getZhuyin(), aRChar2.getZhuyin())) {
                                        i15++;
                                        i14 = i11;
                                    }
                                } else {
                                    i11 = i14;
                                    i15 = -1;
                                }
                            }
                            if (i15 >= 0) {
                                if (dVar != null) {
                                    int iF = dVar.f();
                                    int i16 = i11;
                                    while (true) {
                                        if (i16 < iF) {
                                            int iA = dVar.a();
                                            int i17 = i11;
                                            while (true) {
                                                if (i17 < iA) {
                                                    ARChar aRChar4 = (ARChar) dVar.d(i16, i17);
                                                    b0Var = b0Var2;
                                                    if (kotlin.jvm.internal.m.a(aRChar4.getCharacter(), aRChar2.getCharacter()) && kotlin.jvm.internal.m.a(aRChar4.getZhuyin(), aRChar2.getZhuyin())) {
                                                        b1Var4.setValue(new Integer(i16));
                                                        b1Var3.setValue(new Integer(i17));
                                                        b1Var2.setValue(null);
                                                        b1Var.setValue(null);
                                                        b1Var2.setValue(new Integer(i16));
                                                        b1Var.setValue(new Integer(i17));
                                                    } else {
                                                        i17++;
                                                        b0Var2 = b0Var;
                                                    }
                                                } else {
                                                    i16++;
                                                }
                                            }
                                        } else {
                                            b0Var = b0Var2;
                                        }
                                    }
                                } else {
                                    b0Var = b0Var2;
                                }
                                ARChar aRChar5 = (ARChar) list.get((i15 + 1) % list.size());
                                this.f25655c = aRChar5;
                                i12 = i11;
                                this.f25654b = i12;
                                if (e0.m(1500L, this) == aVar) {
                                    return aVar;
                                }
                                aRChar = aRChar5;
                            }
                            return b0Var;
                        }
                    }
                    b0Var = b0Var2;
                    return b0Var;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aRChar = (ARChar) this.f25655c;
                com.bumptech.glide.e.F(obj);
                b0Var = b0Var2;
                i12 = 1;
                if (dVar != null) {
                    gi.d dVar2 = (gi.d) this.N;
                    int iF2 = dVar.f();
                    for (int i18 = i12; i18 < iF2; i18++) {
                        int iA2 = dVar.a();
                        for (int i19 = i12; i19 < iA2; i19++) {
                            ARChar aRChar6 = (ARChar) dVar.d(i18, i19);
                            if (kotlin.jvm.internal.m.a(aRChar6.getCharacter(), aRChar.getCharacter()) && kotlin.jvm.internal.m.a(aRChar6.getZhuyin(), aRChar.getZhuyin())) {
                                b1Var4.setValue(new Integer(i18));
                                b1Var3.setValue(new Integer(i19));
                                b1Var2.setValue(null);
                                b1Var.setValue(null);
                                b1Var2.setValue(new Integer(i18));
                                b1Var.setValue(new Integer(i19));
                                dVar2.b(i18, i19, aRChar);
                            }
                        }
                    }
                }
                return b0Var;
            default:
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.f25658f;
                d2 d2Var = (d2) this.f25657e;
                i1 i1Var = (i1) this.f25659t;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f25654b;
                qy.b0 b0Var3 = qy.b0.f48488a;
                if (i21 != 0) {
                    if (i21 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objB = obj;
                    } else {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    ((m6.w) this.L).b(((m6.u) this.M).f40927a);
                    xVar.f38360a = d2Var.f39256a;
                    return b0Var3;
                }
                com.bumptech.glide.e.F(obj);
                int i22 = m6.s.f40925a[((a2) this.f25655c).ordinal()];
                if (i22 == 1) {
                    if (d2Var.f39256a > xVar.f38360a || !((Boolean) i1Var.getValue()).booleanValue()) {
                        e6.l lVar = (e6.l) this.f25656d;
                        Context context = (Context) this.H;
                        c6.i iVar = (c6.i) ((k1) this.K).a();
                        this.f25654b = 1;
                        objB = lVar.b(context, iVar, this);
                        if (objB == aVar2) {
                            return aVar2;
                        }
                    }
                    xVar.f38360a = d2Var.f39256a;
                } else if (i22 == 2) {
                    e0.i((b0) this.N, null);
                }
                return b0Var3;
                boolean zBooleanValue = ((Boolean) objB).booleanValue();
                if (!((Boolean) i1Var.getValue()).booleanValue() && zBooleanValue) {
                    Boolean bool = Boolean.TRUE;
                    this.f25654b = 2;
                    i1Var.emit(bool, this);
                    if (b0Var3 == aVar2) {
                        return aVar2;
                    }
                    ((m6.w) this.L).b(((m6.u) this.M).f40927a);
                }
                xVar.f38360a = d2Var.f39256a;
                return b0Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(o0.b bVar, dn.d dVar, b1 b1Var, b3 b3Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, b1 b1Var5, gi.d dVar2, vy.d dVar3) {
        super(2, dVar3);
        this.f25656d = bVar;
        this.f25657e = dVar;
        this.f25658f = b1Var;
        this.M = b3Var;
        this.f25659t = b1Var2;
        this.H = b1Var3;
        this.K = b1Var4;
        this.L = b1Var5;
        this.N = dVar2;
    }
}

package bh;

import com.lingo.lingoskill.object.Ack;
import com.lingo.lingoskill.object.ConvertUtilsKt;
import com.lingo.lingoskill.object.Level;
import com.lingo.lingoskill.object.LevelDao;
import com.lingodeer.data.model.CourseACK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f4141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(t tVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4138a = i11;
        this.f4141d = tVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4138a) {
            case 0:
                a aVar = new a(this.f4141d, dVar, 0);
                aVar.f4140c = obj;
                return aVar;
            case 1:
                a aVar2 = new a(this.f4141d, dVar, 1);
                aVar2.f4140c = obj;
                return aVar2;
            default:
                a aVar3 = new a(this.f4141d, dVar, 2);
                aVar3.f4140c = obj;
                return aVar3;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4138a) {
            case 0:
                return ((a) create((tz.t) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((a) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((a) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        long j11;
        switch (this.f4138a) {
            case 0:
                tz.t tVar = (tz.t) this.f4140c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f4139b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                dh.a aVar2 = this.f4141d.f4373i;
                this.f4140c = tVar;
                this.f4139b = 1;
                aVar2.f23426c = null;
                aVar2.f23427d.evictAll();
                tz.s sVar = (tz.s) tVar;
                sVar.i(Boolean.TRUE);
                sVar.a0(null);
                if (b0Var == aVar) {
                    return aVar;
                }
                this.f4140c = null;
                this.f4139b = 2;
                if (se.k.i(tVar, new ju.d(25), this) == aVar) {
                    return aVar;
                }
                return b0Var;
            case 1:
                uz.j jVar = (uz.j) this.f4140c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f4139b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    t tVar2 = this.f4141d;
                    List<Object> listLoadAll = tVar2.f4371g.loadAll();
                    kotlin.jvm.internal.m.e(listLoadAll, "loadAll(...)");
                    ArrayList arrayList = new ArrayList(ry.n.W(listLoadAll, 10));
                    Iterator<T> it = listLoadAll.iterator();
                    while (it.hasNext()) {
                        Ack ack = (Ack) it.next();
                        long unitId = (((fr.o0) tVar2.f4372h).f27733a.keyLanguage == 1 && ack.getUnitId() == 1) ? 150L : ack.getUnitId();
                        kotlin.jvm.internal.m.c(ack);
                        CourseACK aCKItem = ConvertUtilsKt.toACKItem(ack);
                        arrayList.add(aCKItem.copy((1727 & 1) != 0 ? aCKItem.ackId : 0L, (1727 & 2) != 0 ? aCKItem.grammarACK : null, (1727 & 4) != 0 ? aCKItem.translation : null, (1727 & 8) != 0 ? aCKItem.explanation : null, (1727 & 16) != 0 ? aCKItem.unitId : unitId, (1727 & 32) != 0 ? aCKItem.examples : null, (1727 & 64) != 0 ? aCKItem.unitSortIndex : 0, (1727 & 128) != 0 ? aCKItem.canAccess : false, (1727 & 256) != 0 ? aCKItem.bookmarkId : null, (1727 & 512) != 0 ? aCKItem.isFav : false, (1727 & 1024) != 0 ? aCKItem.note : null, (1727 & 2048) != 0 ? aCKItem.unitName : null, (1727 & 4096) != 0 ? aCKItem.exampleSentences : null));
                    }
                    this.f4140c = null;
                    this.f4139b = 1;
                    if (jVar.emit(arrayList, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                t tVar3 = this.f4141d;
                vt.n0 n0Var = tVar3.f4372h;
                uz.j jVar2 = (uz.j) this.f4140c;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f4139b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    LevelDao levelDao = tVar3.f4365a;
                    int i14 = ((fr.o0) n0Var).f27733a.keyLanguage;
                    if (i14 != 22 && i14 != 40 && i14 != 48 && i14 != 54 && i14 != 55) {
                        switch (i14) {
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                                j11 = 2;
                                break;
                            default:
                                j11 = 1;
                                break;
                        }
                    } else {
                        j11 = 2;
                    }
                    String unitList = ((Level) levelDao.load(new Long(j11))).getUnitList();
                    kotlin.jvm.internal.m.e(unitList, "getUnitList(...)");
                    ArrayList arrayListC1 = ry.m.c1(ks.b.n(unitList));
                    if (((fr.o0) n0Var).f27733a.keyLanguage == 1) {
                        arrayListC1.remove(new Long(150L));
                        arrayListC1.remove(new Long(1L));
                        arrayListC1.add(0, new Long(150L));
                    }
                    this.f4140c = null;
                    this.f4139b = 1;
                    if (jVar2.emit(arrayListC1, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}

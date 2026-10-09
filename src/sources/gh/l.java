package gh;

import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.object.PdLessonDao;
import fr.o0;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import n9.u1;
import ry.r;
import rz.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f29219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f29223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i11, int i12, o oVar, vy.d dVar) {
        super(2, dVar);
        this.f29221c = i11;
        this.f29222d = i12;
        this.f29223e = oVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new l(this.f29221c, this.f29222d, this.f29223e, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:40:0x012f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0136  */
    /* JADX WARN: Code duplicated, block: B:43:0x0139  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        List listB;
        List list;
        Object objM;
        List listH;
        int i11;
        int i12;
        int i13;
        List listSubList;
        List list2;
        Integer num;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i14 = this.f29220b;
        Object[] objArr = 0;
        int i15 = 0;
        int i16 = this.f29221c;
        if (i14 == 0) {
            com.bumptech.glide.e.F(obj);
            o oVar = this.f29223e;
            if (((Set) oVar.f29240g.getValue()).isEmpty() && ((Set) oVar.f29241h.getValue()).isEmpty() && ((Set) oVar.f29242i.getValue()).isEmpty()) {
                k10.g gVarQueryBuilder = PdLessonDbHelper.INSTANCE.pdLessonDao().queryBuilder();
                gVarQueryBuilder.f(PdLessonDao.Properties.Lan.b(xt.d.k(((o0) xt.b.c()).f27733a.keyLanguage)), new k10.h[0]);
                gVarQueryBuilder.e(" DESC", PdLessonDao.Properties.PublishDate);
                listB = gVarQueryBuilder.d();
            } else {
                k10.g gVarQueryBuilder2 = PdLessonDbHelper.INSTANCE.pdLessonDao().queryBuilder();
                gVarQueryBuilder2.f(PdLessonDao.Properties.Lan.b(xt.d.k(((o0) xt.b.c()).f27733a.keyLanguage)), new k10.h[0]);
                List listD = gVarQueryBuilder2.d();
                kotlin.jvm.internal.m.c(listD);
                listB = oVar.b(listD);
            }
            boolean z11 = oVar.f29239f;
            if (!z11 && i16 == 1) {
                kotlin.jvm.internal.m.c(listB);
                this.f29219a = listB;
                this.f29220b = 1;
                yz.f fVar = rz.o0.f50940a;
                objM = e0.M(yz.e.f58387a, new n(oVar, listB, objArr == true ? 1 : 0, i15), this);
                if (objM == aVar) {
                    return aVar;
                }
                list = listB;
            } else if (z11 || i16 <= 1) {
                list = listB;
            } else {
                kotlin.jvm.internal.m.c(listB);
                List list3 = listB;
                listB = o.c(listB);
                list = list3;
            }
            Objects.toString(listB);
            kotlin.jvm.internal.m.c(listB);
            listH = o.h(listB);
            i11 = i16 - 1;
            i12 = this.f29222d;
            i13 = i11 * i12;
            if (i13 >= listH.size()) {
                listSubList = r.f50854a;
            } else {
                listSubList = listH.subList(i13, Math.min(i13 + i12, listH.size()));
            }
            list2 = listSubList;
            if (list2.size() + i13 < listH.size() && list2.size() == i12) {
                i15 = 1;
            }
            list.size();
            listB.size();
            listH.size();
            list2.size();
            if (i16 > 1) {
                num = new Integer(i11);
            } else {
                num = null;
            }
            return new u1(list2, num, i15 != 0 ? new Integer(i16 + 1) : null, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = this.f29219a;
        com.bumptech.glide.e.F(obj);
        objM = obj;
        listB = (List) objM;
        Objects.toString(listB);
        kotlin.jvm.internal.m.c(listB);
        listH = o.h(listB);
        i11 = i16 - 1;
        i12 = this.f29222d;
        i13 = i11 * i12;
        if (i13 >= listH.size()) {
            listSubList = r.f50854a;
        } else {
            listSubList = listH.subList(i13, Math.min(i13 + i12, listH.size()));
        }
        list2 = listSubList;
        if (list2.size() + i13 < listH.size()) {
            i15 = 1;
        }
        list.size();
        listB.size();
        listH.size();
        list2.size();
        if (i16 > 1) {
            num = new Integer(i11);
        } else {
            num = null;
        }
        return new u1(list2, num, i15 != 0 ? new Integer(i16 + 1) : null, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}

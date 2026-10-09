package bp;

import android.content.Intent;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import com.lingo.lingoskill.ui.handwrite.HandWriteGroupActivity;
import com.lingo.lingoskill.ui.review.BaseReviewEmptyActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.Bookmark;
import com.lingodeer.data.model.CourseCharacterGroup;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.characterstroke.CharacterStroke;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y4 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4919a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b5 f4922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(b5 b5Var, String str, vy.d dVar) {
        super(2, dVar);
        this.f4922d = b5Var;
        this.f4920b = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4919a) {
            case 0:
                return new y4(this.f4922d, this.f4920b, dVar);
            default:
                return new y4(this.f4922d, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4919a) {
            case 0:
                break;
        }
        return ((y4) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(b5 b5Var, vy.d dVar) {
        super(2, dVar);
        this.f4922d = b5Var;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0151 A[LOOP:0: B:46:0x014b->B:48:0x0151, LOOP_END] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Iterator it;
        String str;
        int i11 = this.f4919a;
        b5 b5Var = this.f4922d;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f4921c;
                if (i12 != 0) {
                    if (i12 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    Iterable iterable = (Iterable) obj;
                    arrayList = new ArrayList(ry.n.W(iterable, 10));
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((CharacterStroke) it.next()).getCharacter());
                    }
                    String strY0 = ry.m.y0(arrayList, ";", null, null, null, 62);
                    String str2 = this.f4920b;
                    return new CourseCharacterGroup(-1L, -1, strY0, str2, strY0, str2);
                }
                com.bumptech.glide.e.F(obj);
                bh.r rVarB = ((fr.r) ((vt.e) b5Var.U.getValue())).b(xt.d.k(((fr.o0) b5Var.s()).f27733a.keyLanguage), "kanji");
                this.f4921c = 1;
                obj = uz.x0.u(rVarB, this);
                if (obj == aVar) {
                    return aVar;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (((Bookmark) obj2).isFav() == 1) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj3 = arrayList2.get(i13);
                    i13++;
                    Long lU0 = oz.x.u0(oz.q.c1(((Bookmark) obj3).getId()));
                    if (lU0 != null) {
                        arrayList3.add(lU0);
                    }
                }
                vt.d0 d0Var = (vt.d0) b5Var.V.getValue();
                int i14 = ((fr.o0) b5Var.s()).f27733a.keyLanguage;
                this.f4921c = 2;
                d0Var.getClass();
                obj = d0Var.b(i14, ry.r.f50854a, new n5.d(arrayList3, null, 1), this);
                if (obj == aVar) {
                    return aVar;
                }
                Iterable iterable2 = (Iterable) obj;
                arrayList = new ArrayList(ry.n.W(iterable2, 10));
                it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CharacterStroke) it.next()).getCharacter());
                }
                String strY1 = ry.m.y0(arrayList, ";", null, null, null, 62);
                String str3 = this.f4920b;
                return new CourseCharacterGroup(-1L, -1, strY1, str3, strY1, str3);
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f4921c;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    String string = b5Var.getString(R.string.favorite);
                    kotlin.jvm.internal.m.e(string, DytezVyM.tmbFVbsdyOoMEO);
                    yz.f fVar = rz.o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    y4 y4Var = new y4(b5Var, string, null);
                    this.f4920b = string;
                    this.f4921c = 1;
                    Object objM = rz.e0.M(eVar, y4Var, this);
                    if (objM == aVar2) {
                        return aVar2;
                    }
                    str = string;
                    obj = objM;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = this.f4920b;
                    com.bumptech.glide.e.F(obj);
                }
                CourseCharacterGroup courseCharacterGroup = (CourseCharacterGroup) obj;
                int length = courseCharacterGroup.getGroupList().length();
                qy.b0 b0Var = qy.b0.f48488a;
                if (length == 0) {
                    int i16 = BaseReviewEmptyActivity.H;
                    l.m mVar = b5Var.f36398d;
                    kotlin.jvm.internal.m.c(mVar);
                    b5Var.startActivity(o00.a.E(mVar, str));
                } else {
                    b7.e0.A(b5Var.t(), "jxz_cr_review_click_fav");
                    int i17 = HandWriteGroupActivity.f22048t;
                    androidx.fragment.app.p0 p0VarRequireActivity = b5Var.requireActivity();
                    kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
                    Intent intent = new Intent(p0VarRequireActivity, (Class<?>) HandWriteGroupActivity.class);
                    intent.putExtra(INTENTS.EXTRA_OBJECT, courseCharacterGroup);
                    b5Var.startActivity(intent);
                }
                return b0Var;
        }
    }
}

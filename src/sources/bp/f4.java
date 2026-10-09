package bp;

import android.view.View;
import android.widget.ImageView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f4 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4575c;

    public /* synthetic */ f4(int i11, fz.a aVar) {
        this.f4573a = 4;
        this.f4574b = i11;
        this.f4575c = aVar;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f4573a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj = this.f4575c;
        int i12 = this.f4574b;
        switch (i11) {
            case 0:
                i4 i4Var = (i4) obj;
                ta.a aVar = i4Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                int width = ((hj.y3) aVar).f33619d.getWidth();
                ta.a aVar2 = i4Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                float width2 = (i12 / 100.0f) * (width - ((hj.y3) aVar2).f33618c.getWidth());
                ta.a aVar3 = i4Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ImageView imageView = ((hj.y3) aVar3).f33618c;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().locateLanguage == 51) {
                    width2 = -width2;
                }
                imageView.setTranslationX(width2);
                return b0Var;
            case 1:
                return Integer.valueOf(((j3.u0) ((d1.t) obj).f22994e).f35798b.d(i12));
            case 2:
                ((js.w) obj).c(i12);
                return b0Var;
            case 3:
                jp.i iVar = (jp.i) obj;
                ta.a aVar4 = iVar.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                androidx.recyclerview.widget.m1 layoutManager = ((hj.a) aVar4).f32324g.getLayoutManager();
                if (layoutManager != null) {
                    AbsDialogModelAdapter absDialogModelAdapter = iVar.f36486p;
                    if (absDialogModelAdapter == null) {
                        kotlin.jvm.internal.m.n("mAdapter");
                        throw null;
                    }
                    View viewFindViewByPosition = layoutManager.findViewByPosition(absDialogModelAdapter.getHeaderLayoutCount() + i12);
                    if (viewFindViewByPosition != null) {
                        Object obj2 = iVar.f36485o.get(i12);
                        kotlin.jvm.internal.m.e(obj2, "get(...)");
                        Sentence sentence = (Sentence) obj2;
                        AbsDialogModelAdapter absDialogModelAdapter2 = iVar.f36486p;
                        if (absDialogModelAdapter2 == null) {
                            kotlin.jvm.internal.m.n("mAdapter");
                            throw null;
                        }
                        absDialogModelAdapter2.l(viewFindViewByPosition, sentence);
                        iVar.f36489s = true;
                        if (sentence.getItemType() == 1) {
                            iVar.x(1);
                            th.j.a(qx.h.m(400L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new hd.b(iVar, 22), vx.b.f54316e), iVar.f47887g);
                        }
                    }
                }
                return b0Var;
            default:
                return new o0.b(i12, CropImageView.DEFAULT_ASPECT_RATIO, (fz.a) obj);
        }
    }

    public /* synthetic */ f4(Object obj, int i11, int i12) {
        this.f4573a = i12;
        this.f4575c = obj;
        this.f4574b = i11;
    }
}

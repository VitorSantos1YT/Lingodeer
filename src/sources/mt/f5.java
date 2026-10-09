package mt;

import android.view.ViewGroup;
import androidx.media3.ui.PlayerView;
import com.lingo.lingoskill.LingoSkillApplication;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f5 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f41415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41416c;

    public /* synthetic */ f5(Object obj, float f5, int i11) {
        this.f41414a = i11;
        this.f41416c = obj;
        this.f41415b = f5;
    }

    @Override // fz.a
    public final Object invoke() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        switch (this.f41414a) {
            case 0:
                ((fz.c) this.f41416c).invoke(Float.valueOf(this.f41415b));
                break;
            case 1:
                qp.p3 p3Var = (qp.p3) this.f41416c;
                ta.a aVar = p3Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                PlayerView playerView = (PlayerView) ((hj.i2) aVar).f32691e.f33677e;
                if (playerView != null && (layoutParams = playerView.getLayoutParams()) != null) {
                    float f5 = b7.e0.f(LingoSkillApplication.f21665b).widthPixels;
                    float f11 = this.f41415b * 2.0f;
                    layoutParams.width = (int) (f5 - f11);
                    layoutParams.height = (int) ((b7.e0.f(LingoSkillApplication.f21665b).widthPixels - f11) * 0.9160305f);
                    ta.a aVar2 = p3Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    PlayerView playerView2 = (PlayerView) ((hj.i2) aVar2).f32691e.f33677e;
                    if (playerView2 != null) {
                        playerView2.setLayoutParams(layoutParams);
                    }
                }
                break;
            default:
                qp.i0 i0Var = (qp.i0) this.f41416c;
                ta.a aVar3 = i0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                PlayerView playerView3 = (PlayerView) ((hj.x2) aVar3).f33567b.f33677e;
                if (playerView3 != null && (layoutParams2 = playerView3.getLayoutParams()) != null) {
                    float f12 = b7.e0.f(LingoSkillApplication.f21665b).widthPixels;
                    float f13 = this.f41415b * 2.0f;
                    layoutParams2.width = (int) (f12 - f13);
                    layoutParams2.height = (int) ((b7.e0.f(LingoSkillApplication.f21665b).widthPixels - f13) * 0.9160305f);
                    ta.a aVar4 = i0Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar4);
                    ((PlayerView) ((hj.x2) aVar4).f33567b.f33677e).setLayoutParams(layoutParams2);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}

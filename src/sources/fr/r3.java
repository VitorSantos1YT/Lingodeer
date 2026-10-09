package fr;

import android.view.MotionEvent;
import android.view.View;
import app.rive.runtime.kotlin.RiveAnimationView;
import app.rive.runtime.kotlin.core.Direction;
import app.rive.runtime.kotlin.core.Loop;
import com.lingodeer.data.model.UserInfo;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r3 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27816b;

    public /* synthetic */ r3(int i11, int i12) {
        this.f27815a = i12;
        this.f27816b = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f27815a) {
            case 0:
                UserInfo userInfo = (UserInfo) obj;
                UserInfo userInfoCopy$default = UserInfo.copy$default(userInfo, null, 0, 0, 0, 0, userInfo.getTotalTime() + this.f27816b, 0L, 0, 0L, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null, null, 33554399, null);
                Objects.toString(userInfoCopy$default);
                return userInfoCopy$default;
            case 1:
                UserInfo userInfo2 = (UserInfo) obj;
                int totalXP = userInfo2.getTotalXP();
                int i11 = this.f27816b;
                UserInfo userInfoCopy$default2 = UserInfo.copy$default(userInfo2, null, totalXP + i11, 0, 0, 0, 0, 0L, 0, 0L, null, null, null, null, null, null, null, null, userInfo2.getTodayXP() + i11, userInfo2.getWeeklyXP() + i11, 0, 0, 0, 0, null, null, 33161213, null);
                Objects.toString(userInfoCopy$default2);
                return userInfoCopy$default2;
            case 2:
                final RiveAnimationView riveView = (RiveAnimationView) obj;
                kotlin.jvm.internal.m.f(riveView, "riveView");
                final int i12 = this.f27816b;
                riveView.setOnTouchListener(new View.OnTouchListener() { // from class: gs.n
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        String str;
                        int i13 = i12;
                        if (i13 == 1) {
                            str = "一声";
                        } else if (i13 == 2) {
                            str = "二声";
                        } else if (i13 != 3) {
                            str = i13 != 4 ? "轻声" : "四声";
                        } else {
                            str = "三声";
                        }
                        RiveAnimationView.play$default(riveView, str, (Loop) null, (Direction) null, false, false, 30, (Object) null);
                        return true;
                    }
                });
                return qy.b0.f48488a;
            case 3:
                kv.j0 it = (kv.j0) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return Boolean.valueOf(it.f38761b < this.f27816b);
            case 4:
                n0.j0 j0Var = (n0.j0) obj;
                x1.f fVarN = re.q.n();
                re.q.t(fVarN, re.q.r(fVarN), fVarN != null ? fVarN.e() : null);
                int i13 = j0Var.f42961a;
                if (i13 == -1) {
                    i13 = 2;
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    j0Var.a(this.f27816b + i14);
                }
                return qy.b0.f48488a;
            case 5:
                rt.x4 it2 = (rt.x4) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                int i15 = this.f27816b;
                return rt.x4.a(it2, null, i15, i15, CropImageView.DEFAULT_ASPECT_RATIO, null, false, null, false, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 4089);
            case 6:
                rt.x4 it3 = (rt.x4) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                return rt.x4.a(it3, null, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, false, null, false, CropImageView.DEFAULT_ASPECT_RATIO, hz.b.l(this.f27816b, 1, 5), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 3583);
            case 7:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(nv.p.o("Collection doesn't contain element at index ", this.f27816b, '.'));
            default:
                return xt.d.q(((Long) obj).longValue(), 0, this.f27816b);
        }
    }

    public /* synthetic */ r3(l0.w wVar, int i11) {
        this.f27815a = 4;
        this.f27816b = i11;
    }
}

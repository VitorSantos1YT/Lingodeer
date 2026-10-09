package lp;

import android.view.View;
import android.widget.Switch;
import com.lingodeer.data.env.Env;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dm.c f40192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Switch f40193c;

    public /* synthetic */ f(dm.c cVar, Switch r9, int i11) {
        this.f40191a = i11;
        this.f40192b = cVar;
        this.f40193c = r9;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        View it = (View) obj;
        switch (this.f40191a) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                dm.c cVar = this.f40192b;
                Env env = (Env) cVar.f23491c;
                env.ignoreSpace = !env.ignoreSpace;
                env.updateEntry("ignoreSpace");
                this.f40193c.setChecked(((Env) cVar.f23491c).ignoreSpace);
                break;
            case 1:
                kotlin.jvm.internal.m.f(it, "it");
                dm.c cVar2 = this.f40192b;
                Env env2 = (Env) cVar2.f23491c;
                env2.showAnim = !env2.showAnim;
                env2.updateEntry("showAnim");
                this.f40193c.setChecked(((Env) cVar2.f23491c).showAnim);
                break;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                dm.c cVar3 = this.f40192b;
                Env env3 = (Env) cVar3.f23491c;
                env3.allowSoundEffect = !env3.allowSoundEffect;
                env3.updateEntry("allowSoundEffect");
                this.f40193c.setChecked(((Env) cVar3.f23491c).allowSoundEffect);
                break;
        }
        return b0.f48488a;
    }
}

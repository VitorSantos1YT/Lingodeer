package si;

import android.os.Bundle;
import android.view.View;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingodeer.course.stroke_order_view_new.HwViewNew;
import com.lingodeer.data.model.INTENTS;
import hj.u1;
import jp.p0;
import kotlin.jvm.internal.m;
import pi.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f51701b;

    public /* synthetic */ a(d dVar, int i11) {
        this.f51700a = i11;
        this.f51701b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f51700a) {
            case 0:
                this.f51701b.s();
                return;
            case 1:
                this.f51701b.r();
                return;
            case 2:
                d dVar = this.f51701b;
                HwCharacter hwCharacter = dVar.f51707i;
                if (hwCharacter == null) {
                    m.n("mCurChar");
                    throw null;
                }
                long charId = hwCharacter.getCharId();
                Bundle bundle = new Bundle();
                bundle.putLong(INTENTS.EXTRA_LONG, charId);
                bundle.putBoolean(INTENTS.EXTRA_BOOLEAN, false);
                h hVar = new h();
                hVar.setArguments(bundle);
                p0 p0Var = (p0) dVar.f47881a;
                p0Var.getClass();
                hVar.u(p0Var.getChildFragmentManager(), "CharacterAnimationFragment");
                return;
            default:
                d dVar2 = this.f51701b;
                ta.a aVar = dVar2.f47886f;
                m.c(aVar);
                HwViewNew hwViewNew = ((u1) aVar).f33380i;
                ta.a aVar2 = dVar2.f47886f;
                m.c(aVar2);
                hwViewNew.setShowBijiWhenWriting2(!((u1) aVar2).f33380i.R);
                dVar2.t();
                return;
        }
    }
}
